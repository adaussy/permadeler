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

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Reference;
import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * Action used to display references in the web browser
 * 
 * @author Arthur Daussy
 */
public class OpenReference extends Action {

	private final Reference ref;

	public OpenReference(Reference ref) {
		super("Open reference " + ref.getSource());
		this.ref = ref;
	}

	@Override
	public void runWithEvent(Event event) {
		URL url = ref.getLink();
		if (url != null) {
			try {
				Desktop.getDesktop().browse(url.toURI());
			} catch (URISyntaxException | IOException e) {
				RcpPlugin.getDefault().logError(e.getMessage(), e);
			}
		}
	}

}
