/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dialogs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;

/**
 * Dialog to sow seed in a cell
 * 
 * @author Arthur Daussy
 */
public class SowInCellDialog extends ObjectSelectionDialogWithDate<SeedItem> {

	public SowInCellDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, SeedItem.class, s -> s.getQuantity() != Quantity.EMPTY && s.getType() != null, root,
				initialDate);
	}

}
