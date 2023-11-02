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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;

import fr.adaussy.permadeler.common.BotanicNameHelper;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.internal.imports.CSVPlantImporterConfiguration;
import fr.adaussy.permadeler.rcp.internal.imports.CSVSheetImporter;

public class ImportSpeciesFromCSVAction extends AbstractModelAction {

	private KnowledgeBase knowledgeBase;

	public ImportSpeciesFromCSVAction(Session session, KnowledgeBase knowledgeBase) {
		super("Importer des variete depuis un CSV", session);
		this.knowledgeBase = knowledgeBase;
	}

	@Override
	public void runWithEvent(Event event) {
		// Select the file
		FileDialog dialog = new FileDialog(event.display.getActiveShell());

		String path = dialog.open();
		if (path != null) {
			CSVPlantImporterConfiguration config = new CSVPlantImporterConfiguration(
					new AlveolBDLatingNameExtractor());
			config.addAttributeSetter((plant, celss) -> setCommonName(plant, celss));
			modifyModel(() -> {
				try {
					new CSVSheetImporter(knowledgeBase, config).importPlantFromCSV(path, ";");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

		}

		// Import the plant
		super.runWithEvent(event);
	}

	private IStatus setCommonName(Plant plant, List<String> celss) {
		if (celss.size() > 1) {
			plant.setName(celss.get(1));
		}
		return Status.OK_STATUS;
	}

	private static class AlveolBDLatingNameExtractor implements Function<List<String>, String> {

		@Override
		public String apply(List<String> t) {
			if (t.size() > 2) {
				Matcher matcher = BotanicNameHelper.LATIN_NAME.matcher(t.get(2));
				if (matcher.matches()) {
					return t.get(2);
				}
			}

			return null;
		}

	}

}
