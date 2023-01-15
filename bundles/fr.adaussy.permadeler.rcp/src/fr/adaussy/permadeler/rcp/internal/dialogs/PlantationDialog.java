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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog used to select a plantation
 * 
 * @author Arthur Daussy
 */
public class PlantationDialog extends ObjectSelectionDialogWithDate<Plant> {

	private Layer layer = Layer.UNDERSTORY;

	private RepresentationKind representationKind = RepresentationKind.ICON;

	private List<Button> layerWidgets;

	private List<Button> preKingWidget;

	public PlantationDialog(Shell shell, Date initialDate, EObject root) {
		super(shell, Plant.class, null, root, initialDate);
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		super.fillCustomContent(parent);

		layerWidgets = Dialogs.createEnumEntry(parent, RcpMessages.PlantationDialog_0, Layer.values(), layer,
				v -> {
					this.layer = (Layer)v;
					updateButtons();
				});
		preKingWidget = Dialogs.createEnumEntry(parent, "Representation graphique", //$NON-NLS-1$
				RepresentationKind.values(), representationKind, v -> {
					this.representationKind = (RepresentationKind)v;
					updateButtons();
				});

	}

	@Override
	protected void selectionChanges(List<Plant> newSelection) {
		super.selectionChanges(newSelection);
		if (!newSelection.isEmpty()) {
			updatePlant(newSelection.get(0));
		}
	}

	private void updatePlant(Plant plant) {

		layer = plant.getDefaultLayer();
		int ordinal = layer.ordinal();
		for (int i = 0; i < layerWidgets.size(); i++) {
			layerWidgets.get(i).setSelection(i == ordinal);
		}

		RepresentationKind defaultRepKind = switch (layer) {
			case CANOPY -> RepresentationKind.TREE_CROWN;
			case UNDERSTORY -> RepresentationKind.TREE_CROWN;
			case SHRUB -> RepresentationKind.TREE_CROWN;
			default -> RepresentationKind.ICON;
		};
		representationKind = plant.getDefaultRepresentationKind();
		if (representationKind == null) {
			representationKind = defaultRepKind;
		}
		int ordinal2 = representationKind.ordinal();
		for (int i = 0; i < preKingWidget.size(); i++) {
			preKingWidget.get(i).setSelection(i == ordinal2);
		}
		updateButtons();
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control result = super.createButtonBar(parent);
		updateButtons();
		return result;
	}

	private void updateButtons() {
		if (getOKButton() != null && !getOKButton().isDisposed()) {
			getOKButton().setEnabled(
					layerWidgets != null && representationKind != null && !getSelection().isEmpty());
		}
	}

	public Layer getLayer() {
		return layer;
	}

	public RepresentationKind getRepresentationKind() {
		return representationKind;
	}

}
