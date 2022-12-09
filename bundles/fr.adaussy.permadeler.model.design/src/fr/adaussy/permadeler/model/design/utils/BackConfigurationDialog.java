/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.utils;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.design.DesignMessages;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

public class BackConfigurationDialog extends Dialog {

	private BackgroundImage bgImg;

	private IGraphicalEditPart graphicalEditpart;

	public BackConfigurationDialog(Shell parentShell, BackgroundImage bgImg,
			IGraphicalEditPart graphicalEditpart) {
		super(parentShell);
		this.bgImg = bgImg;
		this.graphicalEditpart = graphicalEditpart;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Dialogs.createDoubleEntry(cc, DesignMessages.BackConfigurationDialog_0, bgImg.getScaling(), v -> {
			bgImg.setScaling((float)v);
			graphicalEditpart.refresh();
		});

		Dialogs.createIntEntry(cc, DesignMessages.BackConfigurationDialog_1, bgImg.getTransparency(), v -> {
			bgImg.setTransparency(v);
			graphicalEditpart.refresh();
		});

		return cc;
	}
}
