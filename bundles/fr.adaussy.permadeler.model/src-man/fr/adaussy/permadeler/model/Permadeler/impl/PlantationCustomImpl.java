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

/**
 * Custom implementation of PlantationImpl
 * 
 * @author Arthur Daussy
 */
public class PlantationCustomImpl extends PlantationImpl {
	@Override
	public boolean isRemoved() {
		if (getRemovalEvent() != null) {
			Instant date = getRemovalEvent().getDate();
			return date != null && Instant.now().compareTo(date) > 0;
		}
		return false;
	}
}
