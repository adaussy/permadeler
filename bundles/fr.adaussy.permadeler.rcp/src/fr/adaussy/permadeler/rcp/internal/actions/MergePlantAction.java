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

import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.provider.ModelLabelProvider;
import fr.adaussy.permadeler.rcp.internal.utils.PlantMerger;

/**
 * Action that merge all selected plant into on plant
 * 
 * @author Arthur Daussy
 * @param <T>
 */
public class MergePlantAction<T extends Plant> extends AbstractModelAction {

	private List<T> toMerge;

	private ModelLabelProvider labelProvider = new ModelLabelProvider();

	public MergePlantAction(Session session, List<T> toMerge) {
		super("Fusionner les " + toMerge.size() + " plantes selectionnées", session);
		this.toMerge = toMerge;
	}

	@Override
	public void runWithEvent(Event event) {
		if (MessageDialog.openConfirm(event.display.getActiveShell(), "Fusion",
				"Etes vous sur de vouloir fusinner les especes suivantes :\n"
						+ toMerge.stream().map(labelProvider::getText).collect(joining("\n")))) {

			ElementListSelectionDialog dialog = new ElementListSelectionDialog(event.display.getActiveShell(),
					labelProvider);
			dialog.setElements(toMerge.toArray());
			dialog.setMultipleSelection(false);
			dialog.setMessage("Selectionnez l'espece dans laquelle les autres espèces seront fusionnées");

			if (dialog.open() == IDialogConstants.OK_ID) {
				T target = (T)dialog.getFirstResult();

				if (target != null) {
					PlantMerger<T> merger = new PlantMerger<T>(PermadelerSession.of(getSession()), target);
					modifyModel(() -> {

						for (var sm : toMerge) {
							if (sm != target) {
								merger.merge(sm);
							}
						}
					});
				}
			}

		}

	}

}
