/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.io.File;
import java.nio.file.Paths;
import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * Action to open on image in the internal browser
 * 
 * @author Arthur Daussy
 */
public class OpenImageAction extends Action {

	private final Image img;

	public OpenImageAction(Image img) {
		super();
		this.img = img;
	}

	@Override
	public String getText() {
		return MessageFormat.format(RcpMessages.OpenImageAction_0, img.getTitle());
	}

	@Override
	public void runWithEvent(Event event) {
		if (img.getSource() == null || img.getSource().isBlank()) {
			return;
		}
		try {
			URI uri = SessionManager.INSTANCE.getSession(img).getSessionResource().getURI();
			if (uri.isPlatformResource()) {
				String path = uri.toPlatformString(true);
				IPath iPath = new Path(path).removeLastSegments(1).append(img.getPath());
				IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(iPath);

				if (iFile.exists()) {

					IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
							new FileEditorInput(iFile), "org.eclipse.ui.browser.editor"); //$NON-NLS-1$

				} else {
					RcpPlugin.logError(MessageFormat.format("The image does not exist {0}", iPath)); //$NON-NLS-1$
				}
			} else if (uri.isFile()) {
				String path = uri.toFileString();
				File image = Paths.get(path).getParent().resolve(img.getPath()).toFile();
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
						image.toURI(), "org.eclipse.ui.browser.editor", true); //$NON-NLS-1$
			}
		} catch (PartInitException e) {
			RcpPlugin.logError("Unable to display image ", e); //$NON-NLS-1$
		}

	}

}
