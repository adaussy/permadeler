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
package fr.adaussy.permadeler.rcp.internal.utils;

import java.util.List;
import java.util.Optional;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

public class SemanticSelectionHelper {

	public static Optional<Zone> selectZone(Shell shell, PermadelerSession session) {
		ObjectSelectionDialog<Zone> dialog = new ObjectSelectionDialog<Zone>(shell, Zone.class, z -> true,
				List.of(session.getRoot()));
		if (dialog.open() == IDialogConstants.OK_ID) {
			List<Zone> zones = dialog.getSelection();
			if (!zones.isEmpty()) {
				return Optional.of(zones.get(0));
			}
		}

		return Optional.empty();
	}

}
