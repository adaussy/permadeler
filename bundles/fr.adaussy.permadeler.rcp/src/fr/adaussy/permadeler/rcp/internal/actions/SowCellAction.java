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

import java.util.Date;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.dialogs.SowInCellDialog;

/**
 * Action that sow a species selected by the user in the selected celss
 * 
 * @author Arthur Daussy
 */
public class SowCellAction extends AbstractModelAction {

	private final List<Cell> cells;

	public SowCellAction(List<Cell> cells, Session session) {
		super(RcpMessages.SowCellAction_0, session);
		this.cells = cells;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor
				.createFromImage(ImageProvider.INSTANCE.getImage("icons/custo/commons/planting.png")); //$NON-NLS-1$
	}

	@Override
	public void runWithEvent(Event event) {
		SowInCellDialog dialog = new SowInCellDialog(event.display.getActiveShell(), new Date(),
				cells.get(0).eResource().getContents().get(0));
		if (dialog.open() == Dialog.OK) {
			List<SeedItem> type = dialog.getSelection();
			if (!type.isEmpty()) {
				modifyModel(() -> {
					for (Cell c : cells) {
						c.setPlant(type.get(0).getType());
						c.setDate(dialog.getDate().toInstant());
					}
				});
			}
		}
	}

}
