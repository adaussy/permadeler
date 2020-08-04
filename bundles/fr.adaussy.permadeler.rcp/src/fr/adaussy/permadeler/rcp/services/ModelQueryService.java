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

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.eclipse.sirius.business.api.session.SessionManager;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;

/**
 * Service that gather helper merthod to query the model
 * 
 * @author Arthur Daussy
 */
public final class ModelQueryService {

	private ModelQueryService() {
	}

	/**
	 * Gets all the cells that contains a sow of the given species
	 * 
	 * @param s
	 *            a species
	 * @return a list of cell
	 */
	public static List<Cell> getLinkedCells(Species s) {
		List<Cell> allCells = SessionManager.INSTANCE.getSession(s).getSemanticCrossReferencer()
				.getInverseReferences(s, PermadelerPackage.eINSTANCE.getCell_Species(), true).stream()
				.map(n -> n.getEObject()).filter(e -> e instanceof Cell).map(c -> (Cell)c).collect(toList());
		return allCells;
	}

}
