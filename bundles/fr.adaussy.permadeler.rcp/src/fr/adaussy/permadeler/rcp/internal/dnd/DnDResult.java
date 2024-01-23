/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dnd;

public record DnDResult(String message, DndStatus status) {

	public static DnDResult OK = new DnDResult("", DndStatus.OK); //$NON-NLS-1$

	public static DnDResult NOTHING = new DnDResult("", DndStatus.NOTHING); //$NON-NLS-1$

	public static DnDResult createError(String errorMessage) {
		return new DnDResult(errorMessage, DndStatus.ERROR);
	}

}
