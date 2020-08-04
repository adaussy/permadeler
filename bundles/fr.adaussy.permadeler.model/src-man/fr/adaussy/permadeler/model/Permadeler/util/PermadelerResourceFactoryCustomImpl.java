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
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Custom {@link PermadelerResourceFactoryImpl}
 * 
 * @author Arthur Daussy
 */
public class PermadelerResourceFactoryCustomImpl extends PermadelerResourceFactoryImpl {
	@Override
	public Resource createResource(URI uri) {
		Resource result = new PermadelerResourceCustomImpl(uri);
		return result;
	}

}
