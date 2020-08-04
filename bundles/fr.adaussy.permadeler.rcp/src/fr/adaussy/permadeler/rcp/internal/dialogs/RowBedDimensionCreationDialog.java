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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog use to create {@link RowBed}
 * 
 * @author Arthur Daussy
 */
public class RowBedDimensionCreationDialog extends Dialog {

	private int nbOfRows;

	private Text totalText;

	/**
	 * Simple constructor
	 * 
	 * @param shell
	 *            a parent {@link Shell}
	 * @param nbOfRows
	 *            a number of row
	 */
	public RowBedDimensionCreationDialog(Shell shell, int nbOfRows) {
		super(shell);
		this.nbOfRows = nbOfRows;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Dialogs.createIntEntry(cc, "Rows", nbOfRows, i -> {
			this.nbOfRows = i;
			if (totalText != null) {
				totalText.setText(String.valueOf(nbOfRows));
			}

		});

		return cc;
	}

	/**
	 * Returns the nbOfRows.
	 * 
	 * @return the nbOfRows
	 */
	public int getNbOfRows() {
		return nbOfRows;
	}

}
