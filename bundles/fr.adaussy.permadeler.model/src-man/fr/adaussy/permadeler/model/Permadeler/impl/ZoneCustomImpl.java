/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.model.Permadeler.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Zone;

public class ZoneCustomImpl extends ZoneImpl {

	@Override
	public EList<Plantation> getAllPlantations() {
		List<Plantation> allPlantations = new ArrayList<>(getPlantations());

		for (Zone subZone : getSubZones()) {
			allPlantations.addAll(subZone.getAllPlantations());
		}
		return ECollections.asEList(allPlantations);
	}

}
