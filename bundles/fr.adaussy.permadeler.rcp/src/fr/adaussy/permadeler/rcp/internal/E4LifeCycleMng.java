/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal;

import java.io.File;
import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.eef.ide.ui.internal.preferences.EEFPreferences;
import org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager.ConflictResolutionMode;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.common.tools.api.resource.FileProvider;
import org.eclipse.sirius.common.tools.api.resource.IFileGetter;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Version;
import org.osgi.service.event.Event;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Nursary;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerResourceCustomImpl;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.menu.CreateNewProjectMenu;
import fr.adaussy.permadeler.rcp.internal.migratations.Migrator;

/**
 * Add on to handle the application lifecycle
 * 
 * @author Arthur Daussy
 */
public class E4LifeCycleMng {

	/**
	 * Method called once the application has started
	 * 
	 * @param event
	 *            an event
	 * @param eclipseContext
	 *            the workbench context
	 */
	@Inject
	@Optional
	public void applicationStarted(@EventTopic(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE) Event event,
			IEclipseContext eclipseContext, Display display) {

		eclipseContext.declareModifiable(Session.class);
		eclipseContext.declareModifiable(Root.class);
		eclipseContext.declareModifiable(SeedBank.class);
		eclipseContext.declareModifiable(KnowledgeBase.class);
		eclipseContext.declareModifiable(Nursary.class);
		eclipseContext.declareModifiable(PermadelerSession.class);
		SessionManager.INSTANCE.addSessionsListener(new SessionInjector(eclipseContext));

		checkForUpdate(eclipseContext, display);

		EEFPreferences.setTextConflictResolutionMode(ConflictResolutionMode.USE_MODEL_VERSION);

		loadFileFromArg();
	}

	protected void checkForUpdate(IEclipseContext eclipseContext, Display display) {
		CompletableFuture.supplyAsync(() -> {
			if (RcpPlugin.getDefault().getUpdateManager().needUpdate()) {
				display.asyncExec(() -> {
					performUpdate(display, eclipseContext);
				});
			}
			return null;
		});
	}

	private void performUpdate(Display display, IEclipseContext eclipseContext) {
		if (MessageDialog.openConfirm(display.getActiveShell(), "Mise à jours",
				"Des mises a jours sont disponibles, voulez vous les installer?")) {
			if (RcpPlugin.getDefault().getUpdateManager().performAutoUpdate()) {
				if (MessageDialog.openConfirm(display.getActiveShell(), "Redemerrage",
						"Souhaitez vous redemarrer l'application pour finir l'installation?")) {
					eclipseContext.get(IWorkbench.class).restart();
				}

			}
		}
	}

	/**
	 * Tries to path in the parameters that points to an AIRD file to start loading the session
	 */
	private void loadFileFromArg() {
		for (String arg : Platform.getApplicationArgs()) {
			if (arg.endsWith(CreateNewProjectMenu.REPRESENTATION_FILE_EXT)) {
				SessionManager.INSTANCE.openSession(URI.createFileURI(arg), new NullProgressMonitor(), null,
						false);
			}
		}

	}

	/**
	 * Object in charge of injecting the current session into the Eclipse context
	 * 
	 * @author Arthur Daussy
	 */
	private final class SessionInjector extends SessionManagerListener.Stub implements SessionListener {

		private IEclipseContext eclipseContext;

		private Session session;

		/**
		 * Simple constructor
		 * 
		 * @param eclipseContext
		 *            the workbench context
		 */
		private SessionInjector(IEclipseContext eclipseContext) {
			this.eclipseContext = eclipseContext;
		}

		@Override
		public void notifyRemoveSession(Session removedSession) {
			if (removedSession != null) {
				removedSession.removeListener(this);
			}
		}

		@Override
		public void notifyAddSession(Session newSession) {

			newSession.getTransactionalEditingDomain().getResourceSet().getLoadOptions()
					.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

			FileProvider.getDefault().registerFileGetter(new IFileGetter() {

				@Override
				public File getFile(IPath path) {
					File file = path.toFile();

					if (file.exists()) {
						return file;
					}
					return null;
				}

				@Override
				public java.util.Optional<Boolean> exists(IPath fullPath) {
					boolean exist = fullPath.toFile().exists();
					return exist ? java.util.Optional.of(exist) : java.util.Optional.empty();
				}
			});
			if (newSession.getSelectedViewpoints(false).stream()
					.anyMatch(v -> CreateNewProjectMenu.DEFAULT_VIEWPOINT.equals(v.getName()))) {
				if (session != null) {
					session.removeListener(this);
				}
				session = newSession;
				session.addListener(this);
			}

		}

		@Override
		public void notify(int changeKind) {
			if (SessionListener.OPENED == changeKind) {
				Root root = session.getSemanticResources().stream()
						.filter(s -> s instanceof PermadelerResourceCustomImpl)//
						.filter(s -> !s.getContents().isEmpty()).map(s -> (Root)s.getContents().get(0))
						.findFirst().orElse(null);
				if (root != null) {
					eclipseContext.modify(Root.class, root);
					SeedBank seedBank = root.getSeedbank();
					eclipseContext.modify(SeedBank.class, seedBank);
					eclipseContext.modify(KnowledgeBase.class, root.getKnowledgeBase());
					eclipseContext.modify(Nursary.class, root.getNursary());
					PermadelerSession permSession = new PermadelerSession(session, root);
					eclipseContext.modify(PermadelerSession.class, permSession);
					
					// Run update migration
					new Migrator().migrate(permSession);

					// Update the vesion of the model to the current version of software
					String version = root.getProductVersion();
					Version currentVersion = Platform.getProduct().getDefiningBundle().getVersion();
					if (version == null || Version.parseVersion(version).compareTo(currentVersion) < 0) {
						permSession.modify("Update model version", () -> {
							root.setProductVersion(currentVersion.toString());
						});
					}

					eclipseContext.modify(Session.class, session);
				}

			}

		}
	}

}
