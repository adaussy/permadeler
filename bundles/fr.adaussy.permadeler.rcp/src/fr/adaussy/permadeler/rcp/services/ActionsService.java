/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.services;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Service that gathers method that implement global action
 * 
 * @author Arthur Daussy
 */
public class ActionsService {

	/**
	 * Open the given URL in the default browser
	 * 
	 * @param url
	 *            the url to open
	 * @throws IOException
	 *             send by default Desktop API
	 * @throws URISyntaxException
	 *             if incorrect uri
	 */
	public static void openInBrowser(String url) throws IOException, URISyntaxException {
			if (url != null) {
				Desktop.getDesktop().browse(new URI(url));
			}
	}
}
