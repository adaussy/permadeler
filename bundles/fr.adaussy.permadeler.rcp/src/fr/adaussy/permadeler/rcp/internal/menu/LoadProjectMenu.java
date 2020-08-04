
package fr.adaussy.permadeler.rcp.internal.menu;

/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.ui.NoUICallback;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * Handler used to load a project
 * 
 * @author Arthur Daussy
 */
public class LoadProjectMenu {

	@Execute
	public void execute(Shell shell, IEclipseContext context) {
		FileDialog fileDialog = new FileDialog(shell);
		String path = fileDialog.open();
		URI createFileURI = URI.createFileURI(path);
		IRunnableWithProgress op = progress -> {
			progress.beginTask("Loading session", IProgressMonitor.UNKNOWN);
			Session session = SessionManager.INSTANCE.openSession(createFileURI, new NullProgressMonitor(),
					new NoUICallback());
			context.declareModifiable(Session.class);
			context.modify(Session.class, session);
			progress.done();
		};
		try {
			new ProgressMonitorDialog(shell).run(false, false, op);
		} catch (InvocationTargetException | InterruptedException e) {
			RcpPlugin.getDefault().logError("Problem during session loading " + e.getMessage(), e);
		}
	}

}
