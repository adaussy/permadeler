/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.Permadeler.impl;

import java.time.Instant;

import org.eclipse.emf.ecore.EDataType;

/**
 * Custom implementation of PermadelerFactoryImpl
 * 
 * @author Arthur Daussy
 */
public class CustomPermadelerFactoryImpl extends PermadelerFactoryImpl {
	
	@Override
	public Instant createDateFromString(EDataType eDataType, String initialValue) {
		return Instant.parse(initialValue);
	}


}
