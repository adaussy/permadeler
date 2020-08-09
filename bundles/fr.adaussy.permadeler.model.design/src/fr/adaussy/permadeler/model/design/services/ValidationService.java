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

import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class ValidationService {

	public static boolean validatePlantationCompatibility(Area self) {

		// get the list of incompatible species

		// session = SessionManager.INSTANCE.getSession(self).getSemanticCrossReferencer()

		Root root = EMFUtils.getAncestor(Root.class, self);
		EList<CompatibilityLink> compatibilityLinkAll = root.getSeedLib().getCompatibilityMatrix()
				.getCompatibilties();

		Set<Genus> plantedGenus = self.getPlantations().stream()//
				.filter(e -> e.getType() != null && e.getType().getType() != null)//
				.map(e -> e.getType().getType())//
				.collect(Collectors.toSet());

		return !root.getSeedLib().getCompatibilityMatrix().getCompatibilties().stream().anyMatch(l -> {
			return isIncompatibleLink(plantedGenus, l);
		});
		// Set<CompatibilityLink> compatibilityLinkNeg = new HashSet<>();
		// for (CompatibilityLink e : compatibilityLinkAll) {
		// if (e.getAffinity() < 0) {
		// compatibilityLinkNeg.add(e);
		// }
		// }
		//
		// // get the list of plantations in area
		// EList<Plantation> plantations = self.getPlantations();
		//
		// Set<Genus> plantedGenus = new HashSet<>();
		// for (Plantation e : plantations) {
		// Genus genus = e.getType().getType();
		// plantedGenus.add(genus);
		// }
		//
		// // get the list of incompatible genus
		// for (CompatibilityLink e : compatibilityLinkNeg) {
		//
		// Set<Genus> incompatGenuses = new HashSet<>(e.getSpecies());
		//
		// if (Sets.intersection(incompatGenuses, plantedGenus).size() >= 2) {
		// System.out.println("Incompatible stuff");
		// return false;
		// }
		// }
		//
		// System.out.println("Everything ok");
		// return true;

	}

	private static boolean isIncompatibleLink(Set<Genus> plantedGenus, CompatibilityLink l) {
		return l.getAffinity() < 0
				&& l.getSpecies().stream().filter(g -> plantedGenus.contains(g)).count() >= 2;
	}
}
