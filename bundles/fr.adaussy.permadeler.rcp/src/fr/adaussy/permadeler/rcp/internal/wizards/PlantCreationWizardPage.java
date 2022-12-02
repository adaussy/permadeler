/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy. 
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * Contributors: Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.wizards;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.internal.dialogs.ImageSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

public class PlantCreationWizardPage extends WizardPage {

	private Plant plant;

	protected PlantCreationWizardPage(Plant plant) {
		super("Plant information");
		this.plant = plant;
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = new Composite(parent, SWT.NONE);
		setControl(cc);
		cc.setLayout(new GridLayout(2, false));

		Dialogs.createTextEntry(cc, "Name : ", "", v -> {
			plant.setName(v.trim());
			getContainer().updateButtons();
		});
		Dialogs.createTextEntry(cc, "Latin Name (Genus species 'Variety') : ", "", v -> {
			plant.setLatinName(v.trim());
			getContainer().updateButtons();
		});

		Dialogs.createEnumEntry(cc, "Layer : ", Layer.values(), Layer.UNDERSTORY, v -> {
			plant.setFoodForestLayer((Layer)v);
			getContainer().updateButtons();
		});

		Button iconButton = new Button(cc, SWT.PUSH);
		iconButton.setText("Select an icon");
		iconButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ImageSelectionDialog imageSelectionDialog = new ImageSelectionDialog(getShell(), "");
				if (imageSelectionDialog.open() == IDialogConstants.OK_ID) {
					plant.setRepresentationKey(imageSelectionDialog.getSelection());
					iconButton.setText(plant.getRepresentationKey());
				}
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

}
