/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.Permadeler.util;

import org.eclipse.emf.common.util.URI;

/**
 * Custom PermadelerResourceImpl
 * 
 * @author Arthur Daussy
 */
public class PermadelerResourceCustomImpl extends PermadelerResourceImpl {

	/**
	 * Simple constructor
	 * 
	 * @param uri
	 *            abd URI
	 */
	public PermadelerResourceCustomImpl(URI uri) {
		super(uri);
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
