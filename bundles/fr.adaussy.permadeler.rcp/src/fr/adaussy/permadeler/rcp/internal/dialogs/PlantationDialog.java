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

import fr.adaussy.permadeler.model.Permadeler.Species;

/**
 * Dialog used to select a plantation
 * 
 * @author Arthur Daussy
 */
public class PlantationDialog extends ObjectSelectionDialogWithDate<Species> {

	public PlantationDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, Species.class, null, root, initialDate);
	}

}
