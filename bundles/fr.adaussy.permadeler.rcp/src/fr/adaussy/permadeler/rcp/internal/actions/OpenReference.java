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

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.MessageFormat;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * Action used to display references in the web browser
 * 
 * @author Arthur Daussy
 */
public class OpenReference extends Action {

	private URL ref;

	public OpenReference(URL ref) {
		super(MessageFormat.format("Ouvrir lien {0}", //$NON-NLS-1$
				ref.getHost()),
				RcpPlugin.imageDescriptorFromPlugin("org.eclipse.help.ui", "/icons/obj16/sweb_obj.png"));
		this.ref = ref;
	}

	@Override
	public void runWithEvent(Event event) {
		if (ref != null) {
			try {
				Desktop.getDesktop().browse(ref.toURI());
			} catch (URISyntaxException | IOException e) {
				RcpPlugin.getDefault().logError(e.getMessage(), e);
			}
		}
	}

}
