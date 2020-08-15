/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Lucas Chaigne - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import java.util.Set;
import java.util.stream.Collectors;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.utils.EMFUtils;

/**
 * ValidationService: return true if all the plantations in an area are compatible
 * 
 * @param Area
 *            the area to be validated
 */
public class ValidationService {

	public static boolean validatePlantationCompatibility(Area self) {

		Root root = EMFUtils.getAncestor(Root.class, self);

		Set<Genus> plantedGenus = self.getPlantations().stream()//
				.filter(e -> e.getType() != null && e.getType().getType() != null)//
				.map(e -> e.getType().getType())//
				.collect(Collectors.toSet());

		if (root.getSeedLib() != null && root.getSeedLib().getCompatibilityMatrix() != null
				&& root.getSeedLib().getCompatibilityMatrix().getCompatibilties() != null) {

			return !root.getSeedLib().getCompatibilityMatrix().getCompatibilties().stream()//
					.anyMatch(l -> {
						return isIncompatibleLink(plantedGenus, l);
					});

		} else {
			return true;

		}

	}

	/**
	 * isIncompatibleLink: return true if Genus in a set of Genus are incompatible according to a
	 * CompatibilityLink
	 * 
	 * @param plantedGenus
	 *            a set of Genus
	 * @param l
	 *            a CompatibilityLink
	 */
	private static boolean isIncompatibleLink(Set<Genus> plantedGenus, CompatibilityLink l) {
		return l.getAffinity() < 0
				&& l.getSpecies().stream().filter(g -> plantedGenus.contains(g)).count() >= 2;
	}
}
