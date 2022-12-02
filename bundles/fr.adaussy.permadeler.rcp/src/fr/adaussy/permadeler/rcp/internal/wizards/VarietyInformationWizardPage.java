/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

public class VarietyInformationWizardPage extends WizardPage {

	private String commonName;

	private String cultivarName;

	protected VarietyInformationWizardPage() {
		super("Cultivar configuration");
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = new Composite(parent, SWT.NONE);
		setControl(cc);
		cc.setLayout(new GridLayout(2, false));

		Dialogs.createTextEntry(cc, "Common name", "New common name", v -> {
			commonName = v;
		});
		Dialogs.createTextEntry(cc, "Variety name", "New variety", v -> {
			cultivarName = v;
		});

	}

	public String getCommonName() {
		return commonName;
	}

	public String getCultivarName() {
		return cultivarName;
	}

}
