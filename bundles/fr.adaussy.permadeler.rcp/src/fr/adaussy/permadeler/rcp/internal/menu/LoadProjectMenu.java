/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

/**
 * Handler used to load a project
 * 
 * @author Arthur Daussy
 */
public class LoadProjectMenu {

	@Execute
	public void execute(Shell shell, IEclipseContext context, @Optional PermadelerSession oldSession) {
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setFilterExtensions(new String[] {"*" + CreateNewProjectMenu.REPRESENTATION_FILE_EXT }); //$NON-NLS-1$
		String path = fileDialog.open();
		if (path != null) {
			PermadelerSession.loadSession(path, context, shell, oldSession);
		}
	}

}
