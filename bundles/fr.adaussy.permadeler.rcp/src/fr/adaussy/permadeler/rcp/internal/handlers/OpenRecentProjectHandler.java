/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class OpenRecentProjectHandler {
	@Execute
	public void execute(@Named("fr.adaussy.permadeler.rcp.commandparameter.session.uri") String resourcePath,
			Shell shell, IEclipseContext context, @Optional PermadelerSession oldSession) {

		PermadelerSession.loadSession(resourcePath, context, shell, oldSession);
	}

}
