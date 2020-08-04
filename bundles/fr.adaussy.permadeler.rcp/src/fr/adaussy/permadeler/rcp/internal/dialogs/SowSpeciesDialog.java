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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog use to sow seed by selecting a species
 * 
 * @author Arthur Daussy
 */
public class SowSpeciesDialog extends ObjectSelectionDialogWithDate<Tray> {

	private int nbOfSow;

	public SowSpeciesDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, Tray.class, t -> !t.getEmptyCells().isEmpty(), root, initialDate);
	}

	@Override
	protected boolean hasCustomContent() {
		return true;
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		super.fillCustomContent(parent);

		Dialogs.createIntEntry(parent, "Number of sow", 1, i -> this.nbOfSow = i);
	}

	public int getNbOfSow() {
		return nbOfSow;
	}

}
