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

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog used to select a plantation
 * 
 * @author Arthur Daussy
 */
public class PlantationDialog extends ObjectSelectionDialogWithDate<Plant> {

	private Layer layer;

	public PlantationDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, Plant.class, null, root, initialDate);
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		super.fillCustomContent(parent);
		Dialogs.createEnumEntry(parent, "Current Layer :", Layer.values(), Layer.UNDERSTORY, v -> {
			this.layer = (Layer)v;
		});
	}

	public Layer getLayer() {
		return layer;
	}
}
