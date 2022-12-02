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

import static java.util.stream.Collectors.toList;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.utils.EMFUtils;

/**
 * Custom impl {@link Tray}
 * 
 * @author Arthur Daussy
 */
public class TrayCustomImpl extends TrayImpl {

	@Override
	public EList<Cell> getEmptyCells() {
		return ECollections.toEList(
				EMFUtils.getChildren(this, Cell.class).filter(c -> c.getPlant() == null).collect(toList()));
	}

}
