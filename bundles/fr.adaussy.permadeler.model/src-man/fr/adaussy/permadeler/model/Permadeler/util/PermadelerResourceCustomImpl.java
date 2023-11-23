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

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;

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

	@Override
	public Map<Object, Object> getDefaultLoadOptions() {
		Map<Object, Object> map = super.getDefaultLoadOptions();
		if (map.containsValue(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE)) {
			map.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		}
		return map;
	}

}
