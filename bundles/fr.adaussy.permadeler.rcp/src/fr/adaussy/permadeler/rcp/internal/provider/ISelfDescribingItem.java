/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.provider;

import java.util.List;

import org.eclipse.swt.graphics.Image;

public interface ISelfDescribingItem {

	List<? extends Object> getChildren();

	String getLabel();

	Image getImage();

	default boolean hasChildren() {
		return !getChildren().isEmpty();
	}

}
