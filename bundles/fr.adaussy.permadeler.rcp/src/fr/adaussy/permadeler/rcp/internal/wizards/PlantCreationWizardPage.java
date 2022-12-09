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
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.dialogs.ImageSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

public class PlantCreationWizardPage extends WizardPage {

	private Plant plant;

	protected PlantCreationWizardPage(Plant plant) {
		super(RcpMessages.PlantCreationWizardPage_0);
		this.plant = plant;
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = new Composite(parent, SWT.NONE);
		setControl(cc);
		cc.setLayout(new GridLayout(2, false));

		Dialogs.createTextEntry(cc, RcpMessages.PlantCreationWizardPage_1, RcpMessages.PlantCreationWizardPage_2, v -> {
			plant.setName(v.trim());
			getContainer().updateButtons();
		});
		Dialogs.createTextEntry(cc, RcpMessages.PlantCreationWizardPage_3, RcpMessages.PlantCreationWizardPage_4, v -> {
			plant.setLatinName(v.trim());
			getContainer().updateButtons();
		});

		Dialogs.createEnumEntry(cc, RcpMessages.PlantCreationWizardPage_5, Layer.values(), Layer.UNDERSTORY, v -> {
			plant.setFoodForestLayer((Layer)v);
			getContainer().updateButtons();
		});

		Button iconButton = new Button(cc, SWT.PUSH);
		iconButton.setText(RcpMessages.PlantCreationWizardPage_6);
		iconButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ImageSelectionDialog imageSelectionDialog = new ImageSelectionDialog(getShell(), RcpMessages.PlantCreationWizardPage_7);
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
