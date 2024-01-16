/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.function.Consumer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.sirius.tools.api.command.ui.NoUICallback;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * A wrapper of {@link Session} that help accessing and modify the model
 * 
 * @author Arthur Daussy
 */
public class PermadelerSession {

	private final Session wrappedSession;

	private final Root root;

	public PermadelerSession(Session wrappedSession, Root root) {
		super();
		this.wrappedSession = wrappedSession;
		this.root = root;
	}

	public static void loadSession(String path, IEclipseContext context, Shell shell,
			PermadelerSession oldPermSession) {

		if (oldPermSession != null) {
			Session oldSession = oldPermSession.getSession();
			if (oldSession.getStatus() == SessionStatus.DIRTY) {
				if (MessageDialog.openQuestion(shell, "Sauvegarder les changements",
						"Voulez vous sauvegarder les changements?")) {
					oldSession.save(new NullProgressMonitor());
				}
			}
			oldSession.close(new NullProgressMonitor());
		}

		URI createFileURI = URI.createFileURI(path);
		IRunnableWithProgress op = progress -> {
			progress.beginTask(RcpMessages.LoadProjectMenu_0, IProgressMonitor.UNKNOWN);
			SessionManager.INSTANCE.openSession(createFileURI, new NullProgressMonitor(), new NoUICallback());
			progress.done();
		};
		try {
			new ProgressMonitorDialog(shell).run(false, false, op);
		} catch (InvocationTargetException | InterruptedException e) {
			RcpPlugin.logError("Problem during session loading " + e.getMessage(), e); //$NON-NLS-1$
		}
	}

	public static PermadelerSession of(Session session) {
		Root root = session.getSemanticResources().stream()
				.filter(r -> !r.getContents().isEmpty() && r.getContents().get(0) instanceof Root)
				.map(r -> (Root)r.getContents().get(0)).findFirst().get();
		return new PermadelerSession(session, root);
	}

	/**
	 * Modifies the model by creating a transaction and passing the {@link KnowledgeBase}
	 * 
	 * @param name
	 *            the name of the action
	 * @param updater
	 *            the runnable that will modify the model
	 */
	public void modifyKnowledgeBase(String name, Consumer<KnowledgeBase> updater) {
		wrappedSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(wrappedSession.getTransactionalEditingDomain(), name) {

					@Override
					protected void doExecute() {
						updater.accept(getKnowledgeBase());
					}
				});
	}

	public void modify(String name, Runnable runnable) {
		wrappedSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(wrappedSession.getTransactionalEditingDomain(), name) {

					@Override
					protected void doExecute() {
						runnable.run();
					}
				});
	}

	/**
	 * Modifies the model by creating a transaction and passing the {@link SeedBank}
	 * 
	 * @param name
	 *            the name of the action
	 * @param updater
	 *            the runnable that will modify the model
	 */
	public void modifySeedBank(String name, Consumer<SeedBank> updater) {
		wrappedSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(wrappedSession.getTransactionalEditingDomain(), name) {

					@Override
					protected void doExecute() {
						updater.accept(getSeedBank());
					}
				});
	}

	public KnowledgeBase getKnowledgeBase() {
		return root.getKnowledgeBase();
	}

	public Session getSession() {
		return wrappedSession;
	}

	public SeedBank getSeedBank() {
		return root.getSeedbank();
	}

	public Root getRoot() {
		return root;
	}

	public Path getRootFolder() {
		URI uri = wrappedSession.getSessionResource().getURI();
		if (uri.isPlatformResource()) {
			String path = uri.toPlatformString(true);
			IPath iPath = new org.eclipse.core.runtime.Path(path).removeLastSegments(1);
			IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(iPath);

			if (iFile.exists()) {
				return iFile.getLocation().toFile().toPath();
			}
		} else if (uri.isFile()) {
			return Path.of(uri.toFileString()).getParent();
		}

		return null;
	}

}
