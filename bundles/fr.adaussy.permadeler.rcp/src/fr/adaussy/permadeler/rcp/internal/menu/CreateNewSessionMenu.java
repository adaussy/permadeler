
package fr.adaussy.permadeler.rcp.internal.menu;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.util.PermadelerResourceCustomImpl;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.SemanticFactory;

/**
 * Menu direct item used to create a new session
 * 
 * @author Arthur Daussy
 */
public class CreateNewSessionMenu {
	@Execute
	public void execute(Shell shell) {

		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		String path = dialog.open();
		if (path != null) {
			String fileName = dialog.getFileName();
			Path rootFolderPath = Paths.get(path);
			File rootFolderFile = rootFolderPath.toFile();
			if (rootFolderFile.exists()) {
				MessageDialog.openError(shell, "Problem during creation", "The given path can't be used.");
				return;
			}

			if (rootFolderFile.mkdirs()) {
				URI siriusURI = URI.createFileURI(
						rootFolderPath.resolve(rootFolderPath).resolve(fileName + ".aird").toUri().getPath());
				try {
					URI semanticURI = createAndFillSemanticResource(fileName, rootFolderPath);

					Session session = SessionFactory.INSTANCE.createDefaultSession(siriusURI);
					addSemanticResource(semanticURI, session);

					activatePermadelerViewpoint(session);

					SessionManager.INSTANCE.getSession(siriusURI, new NullProgressMonitor())
							.open(new NullProgressMonitor());

				} catch (CoreException | InvocationTargetException | InterruptedException | IOException e) {
					MessageDialog.openError(shell, "Problem during creation",
							"Unable to create sessiokn at " + siriusURI);
					return;
				}
			} else {
				RcpPlugin.getDefault().logError("Unable to create a folder at " + rootFolderFile);
			}
		}

	}

	/**
	 * Activate the permadeler viewpoints
	 * 
	 * @param session
	 *            an existing session
	 * @throws InvocationTargetException
	 *             if something went wrong during the activation
	 * @throws InterruptedException
	 *             if the activation is interrupted (should never happen)
	 */
	private void activatePermadelerViewpoint(Session session)
			throws InvocationTargetException, InterruptedException {
		Viewpoint permaViewPoint = ViewpointRegistry.getInstance().getViewpoints().stream()
				.filter(v -> "SeedStore".equals(v.getName())).findFirst().get();

		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			@Override
			public void run(final IProgressMonitor monitor) {
				@SuppressWarnings("restriction")
				Command command = new ChangeViewpointSelectionCommand(session,
						new ViewpointSelectionCallback(), Collections.singleton(permaViewPoint),
						Collections.emptySet(), true, monitor);

				session.getTransactionalEditingDomain().getCommandStack().execute(command);
				session.getSessionResource().setModified(true);
				session.save(new NullProgressMonitor());
			}

		};
		new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()).run(true,
				false, runnable);
	}

	/**
	 * Add the semantic resource to the given session
	 * 
	 * @param semanticURI
	 *            a semantic {@link URI}
	 * @param session
	 *            the new session
	 */
	private void addSemanticResource(URI semanticURI, Session session) {
		org.eclipse.emf.transaction.TransactionalEditingDomain domain = session
				.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				session.addSemanticResource(semanticURI, new NullProgressMonitor());
			}
		});
	}

	/**
	 * Creates a fill the semantic session with initial content
	 * 
	 * @param fileName
	 *            the name of the file
	 * @param rootFolderPath
	 *            the path to the root folder that will hold the file
	 * @return the semantic URI of the resource
	 * @throws IOException
	 *             if something wrong appends during save
	 */
	private URI createAndFillSemanticResource(String fileName, Path rootFolderPath) throws IOException {
		String siriusSemanticFileName = fileName + ".permadeler";
		URI semanticURI = URI.createFileURI(
				rootFolderPath.resolve(rootFolderPath).resolve(siriusSemanticFileName).toUri().getPath());
		PermadelerResourceCustomImpl resource = new PermadelerResourceCustomImpl(semanticURI);
		SemanticFactory factory = new SemanticFactory();
		resource.getContents().add(factory.createEmptyProject(fileName));
		resource.save(Collections.emptyMap());
		return semanticURI;
	}

}
