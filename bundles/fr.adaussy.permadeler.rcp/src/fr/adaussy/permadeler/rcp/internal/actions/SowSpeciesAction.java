/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import static java.util.stream.Collectors.toList;

import java.util.Date;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.dialogs.SowSpeciesDialog;

/**
 * Action that sow the selection species in a {@link Tray} selected by the user
 * 
 * @author Arthur Daussy
 */
public class SowSpeciesAction extends AbstractModelAction {

	private final Species species;

	public SowSpeciesAction(Session session, Species species) {
		super("Sow", session);
		this.species = species;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor
				.createFromImage(ImageProvider.INSTANCE.getImage("icons/custo/commons/planting.png"));
	}

	@Override
	public void runWithEvent(Event event) {
		SowSpeciesDialog dialog = new SowSpeciesDialog(event.display.getActiveShell(), new Date(),
				species.eResource().getContents().get(0));
		if (dialog.open() == Dialog.OK) {
			List<Tray> selection = dialog.getSelection();
			List<Cell> emptyCelss = selection.stream().flatMap(s -> s.getEmptyCells().stream())
					.collect(toList());
			int nbOfSow = dialog.getNbOfSow();

			modifyModel(() -> {
				for (int i = 0; i < nbOfSow; i++) {
					if (emptyCelss.size() > i) {
						Cell cell = emptyCelss.get(i);
						cell.setSpecies(species);
						cell.setDate(dialog.getDate().toInstant());
					}
				}
			});

		}
	}

}
