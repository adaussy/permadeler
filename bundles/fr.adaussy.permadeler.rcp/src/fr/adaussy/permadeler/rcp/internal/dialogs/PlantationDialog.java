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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog used to select a plantation
 * 
 * @author Arthur Daussy
 */
public class PlantationDialog extends ObjectSelectionDialogWithDate<Plant> {

	private Layer layer;

	private List<Button> layerWidgets;

	public PlantationDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, Plant.class, null, root, initialDate);
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		super.fillCustomContent(parent);

		getViewer().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object first = getViewer().getStructuredSelection().getFirstElement();
				if (first instanceof Plant) {
					layer = ((Plant)first).getFoodForestLayer();
					int ordinal = layer.ordinal();
					for (int i = 0; i < layerWidgets.size(); i++) {
						layerWidgets.get(i).setSelection(i == ordinal);
					}
				}
			}
		});
		layerWidgets = Dialogs.createEnumEntry(parent, RcpMessages.PlantationDialog_0, Layer.values(), Layer.UNDERSTORY, v -> {
			this.layer = (Layer)v;
		});
	}

	public Layer getLayer() {
		return layer;
	}
}
