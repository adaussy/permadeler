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

import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog to create a {@link Tray} with initial dimension
 * 
 * @author Arthur Daussy
 */
public class TrayDimensionCreationDialog extends Dialog {

	private int nbOfRows;

	private int nbOfCells;

	private Text totalText;

	/**
	 * Simple constructor
	 * 
	 * @param shell
	 *            a parent {@link Shell}
	 * @param nbOfRows
	 *            initial number of row in the tray
	 * @param nbOfCell
	 *            initial in the tray
	 */
	public TrayDimensionCreationDialog(Shell shell, int nbOfRows, int nbOfCell) {
		super(shell);
		this.nbOfRows = nbOfRows;
		this.nbOfCells = nbOfCell;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Dialogs.createIntEntry(cc, RcpMessages.TrayDimensionCreationDialog_0, nbOfRows, i -> {
			this.nbOfRows = i;
			if (totalText != null) {
				totalText.setText(String.valueOf(nbOfRows * nbOfCells));
			}

		});

		Dialogs.createIntEntry(cc, RcpMessages.TrayDimensionCreationDialog_1, nbOfCells, i -> {
			this.nbOfCells = i;
			if (totalText != null) {
				totalText.setText(String.valueOf(nbOfRows * nbOfCells));
			}
		});

		totalText = Dialogs.createIntEntry(cc, RcpMessages.TrayDimensionCreationDialog_2,
				nbOfCells * nbOfRows, i -> {
				});

		return cc;
	}

	/**
	 * Returns the nbOfCells.
	 * 
	 * @return the nbOfCells
	 */
	public int getNbOfCells() {
		return nbOfCells;
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
