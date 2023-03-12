/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import com.modumind.updatemanager.service.UpdateManager;

import fr.adaussy.permadeler.rcp.RcpPlugin;

public class CheckForUpdateMenu {
	@Execute
	public void execute(IWorkbench workbench, Shell shell) {
		UpdateManager updateManager = RcpPlugin.getDefault().getUpdateManager();
		if (updateManager.performAutoUpdate()) {
			workbench.restart();
			return;
		} else {
			MessageDialog.openInformation(shell, "Mise à jour", "Aucune mise à jours disponible");
		}
	}

}
