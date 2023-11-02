/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.imports.LesAlveoleSpeciesImporter;

public class LesAlveoleDataBaseImportAction extends AbstractModelAction {

	private static final String WEB_SITE = "https://plantes.universite-alveoles.fr"; //$NON-NLS-1$

	private static final String WEB_SITE_PLANTS = WEB_SITE + "/plant/index"; //$NON-NLS-1$

	private KnowledgeBase knowledgeBase;

	private final Map<String, Species> existingPlants = new HashMap<String, Species>();

	public LesAlveoleDataBaseImportAction(Session session, KnowledgeBase knowledgeBase) {
		super("Les Alvéole BDD",
				RcpPlugin.imageDescriptorFromPlugin(RcpPlugin.PLUGIN_ID, "/icons/LesAlveolesIcon.png"), //$NON-NLS-1$
				session);
		this.knowledgeBase = knowledgeBase;

		EMFUtils.allContainedObjectOfType(knowledgeBase, Species.class).forEach(plant -> {
			existingPlants.put(plant.getFullLatinName(), plant);
		});
	}

	@Override
	public void runWithEvent(Event event) {
		modifyModel(() -> {
			try {
				fillFromAlveoleDataBase();
				ECollections.sort(knowledgeBase.getSpecies(), Comparators.buildComparator());
			} catch (IOException e) {
				RcpPlugin.logError("Erreur lors de l'importation ", e);
			}
		});
	}

	private void fillFromAlveoleDataBase() throws IOException {
		Document doc = Jsoup.connect(WEB_SITE_PLANTS).get();
		org.jsoup.select.Elements lines = doc.select("tr");
		for (Element line : lines) {
			Elements as = line.select("td");

			if (as.size() == 5) {

				String nomCommun = as.get(0).select("td div span a").text();
				Elements mainNode = as.get(0).select("td div span a");
				String url = WEB_SITE + mainNode.attr("href");
				String latinName = as.get(1).select("td div a").text();
				String port = as.get(2).select("td div span").text();
				String strate = as.get(3).select("td span").text();

				if (existingPlants.containsKey(latinName)) {
					RcpPlugin.logInfo("Existing plant " + latinName);
				} else {

					Species species = new LesAlveoleSpeciesImporter()//
							.commonName(nomCommun)//
							.latinName(latinName)//
							.port(port)//
							.reference(url)//
							.strate(strate)//
							.build();
					knowledgeBase.getSpecies().add(species);

				}
			}
		}
	}

}
