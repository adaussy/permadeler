/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;

public class ImportKnowledgeFromOtherProjectAction extends AbstractModelAction {

	private KnowledgeBase knowledgeBase;

	private List<Plant> dupplicatedLatinNames = new ArrayList<Plant>();

	public ImportKnowledgeFromOtherProjectAction(Session session, KnowledgeBase knowledgeBase) {
		super("Importer une base de connaissance depuis un autre projet",
				RcpPlugin.imageDescriptorFromPlugin(RcpPlugin.PLUGIN_ID, "/icons/permadeler.png"), session);
		this.knowledgeBase = knowledgeBase;
	}

	@Override
	public void runWithEvent(Event event) {
		Shell activeShell = event.display.getActiveShell();
		FileDialog dialog = new FileDialog(activeShell);
		dialog.setFilterExtensions(new String[] {"*.permadeler" });
		dialog.setText("Selectionner un autre projet permadeler");
		String path = dialog.open();

		if (path != null) {
			ResourceSet resourceSet = EMFUtils.buildStandaloneResourceSet();
			Resource loadedresource = resourceSet.getResource(URI.createFileURI(path), true);
			if (loadedresource.getErrors().isEmpty()) {
				EList<EObject> content = loadedresource.getContents();
				if (!content.isEmpty() && content.get(0) instanceof Root root) {
					KnowledgeBase importedBase = root.getKnowledgeBase();

					modifyModel(() -> doImport(importedBase));
				}

				if (!dupplicatedLatinNames.isEmpty()) {
					MessageDialog.openWarning(activeShell, "Attention",
							"Plusiuers plantes on des nom latin identiques :\n" + dupplicatedLatinNames
									.stream().map(e -> e.getName() + "<" + e.getFullLatinName() + ">")
									.collect(joining("\n")));
				}

			} else {
				MessageDialog.openError(activeShell, "Erreur",
						"Une erreur est survenue durant le chargement");
			}
		}
	}

	private void doImport(KnowledgeBase importedBase) {

		Map<String, Species> nameToSpecies = EMFUtils.allContainedObjectOfType(knowledgeBase, Species.class)
				.filter(s -> s.getFullLatinName() != null)//
				.collect(toMap(e -> e.getFullLatinName(), e -> e,
						(v1, v2) -> logDupplicatedLatingName(v1, v2)));

		List<Species> speciesToAdd = new ArrayList<Species>();
		for (Species species : importedBase.getSpecies()) {

			Species existingSpecies = nameToSpecies.get(species.getFullLatinName());

			if (existingSpecies == null) {
				speciesToAdd.add(species);
			} else {
				Map<String, Variety> nameToVariety = EMFUtils
						.allContainedObjectOfType(existingSpecies, Variety.class)
						.filter(s -> s.getFullLatinName() != null)//
						.collect(toMap(e -> e.getFullLatinName(), e -> e,
								(v1, v2) -> logDupplicatedLatingName(v1, v2)));
				List<Variety> varietyToAdd = new ArrayList<Variety>();
				for (Variety variety : species.getVarieties()) {
					Variety exisingVariety = nameToVariety.get(variety.getFullLatinName());
					if (exisingVariety == null) {
						varietyToAdd.add(variety);
					}
				}
				existingSpecies.getVarieties().addAll(varietyToAdd);
				ECollections.sort(existingSpecies.getVarieties(), Comparators.buildComparator());
			}

		}

		knowledgeBase.getSpecies().addAll(speciesToAdd);
		ECollections.sort(knowledgeBase.getSpecies(), Comparators.buildComparator());

	}

	private <T extends Plant> T logDupplicatedLatingName(T v1, T v2) {
		dupplicatedLatinNames.add(v1);
		dupplicatedLatinNames.add(v1);
		return v1;
	}
}
