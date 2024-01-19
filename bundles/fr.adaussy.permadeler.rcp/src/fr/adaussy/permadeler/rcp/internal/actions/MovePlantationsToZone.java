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

import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

/**
 * Move all given plantation to a new zone.
 * 
 * @author Arthur Daussy
 */
public class MovePlantationsToZone extends AbstractModelAction {

	private List<Plantation> plantations;

	public MovePlantationsToZone(Session session, List<Plantation> plantations) {
		super("Deplacer dans une autre zone", RcpPlugin.imageDescriptorFromPlugin(
				"fr.adaussy.permadeler.model.edit", "/icons/custo/commons/zone.png"), session); //$NON-NLS-1$ //$NON-NLS-2$
		this.plantations = plantations;
	}

	@Override
	public void runWithEvent(Event event) {
		ObjectSelectionDialog<Zone> dialog = new ObjectSelectionDialog<Zone>(event.display.getActiveShell(),
				Zone.class, null, List.of(PermadelerSession.of(getSession()).getRoot()));
		if (dialog.open() == IDialogConstants.OK_ID) {
			List<Zone> selection = dialog.getSelection();
			if (!selection.isEmpty()) {
				modifyModel(() -> {
					selection.get(0).getPlantations().addAll(plantations);
				});
			}
		}
		super.runWithEvent(event);
	}

}
