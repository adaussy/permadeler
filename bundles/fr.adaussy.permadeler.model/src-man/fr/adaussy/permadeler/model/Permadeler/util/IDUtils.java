/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.Permadeler.util;

import java.util.Set;
import java.util.stream.Collectors;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class IDUtils {

	public static String generateId(Plantation plantation) {
		Plant type = plantation.getType();
		if (type != null) {
			String shortName = type.getShortName();
			String trigram = shortName != null ? shortName : ""; //$NON-NLS-1$

			Set<String> candiates = EMFUtils.getAncestor(Root.class, plantation).getZones().stream()//
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getId() != null && p.getId().startsWith(trigram))//
					.map(p -> p.getId()).collect(Collectors.toSet());
			int i = 1;
			String id = trigram + i;
			while (candiates.contains(id)) {
				i++;
				id = trigram + i;
			}

			return id;
		}
		return null;
	}

	private static String generateShortName(Species species) {

		String genus = species.getGenus();
		String speciesLT = species.getSpecies();

		String shortName = ""; //$NON-NLS-1$
		if (genus != null && !genus.isBlank()) {
			shortName += genus.substring(0, 1).toUpperCase();
		}

		if (speciesLT != null && speciesLT.length() >= 2) {
			shortName += speciesLT.substring(0, 1).toUpperCase();
			shortName += speciesLT.substring(1, 2).toLowerCase();
		}

		return shortName;

	}

	private static String generateShortName(Variety variety) {

		Species species = variety.getSpecies();

		String genus = species.getGenus();
		String speciesLT = species.getSpecies();

		String shortName = ""; //$NON-NLS-1$
		if (genus != null && !genus.isBlank()) {
			shortName += genus.substring(0, 1).toUpperCase();
		}

		if (speciesLT != null && !speciesLT.isBlank()) {
			shortName += speciesLT.substring(0, 1).toUpperCase();
		}

		String varietyLT = variety.getVariety();
		if (varietyLT != null && varietyLT.length() >= 2) {
			shortName += varietyLT.substring(0, 1).toUpperCase();
			shortName += varietyLT.substring(1, 2).toLowerCase();
		}

		return shortName;

	}

	public static String generateShortName(Plant plant) {

		if (plant instanceof Species) {
			return generateShortName((Species)plant);

		} else if (plant instanceof Variety) {
			return generateShortName(((Variety)plant));
		} else {
			return ""; //$NON-NLS-1$
		}
	}

}
