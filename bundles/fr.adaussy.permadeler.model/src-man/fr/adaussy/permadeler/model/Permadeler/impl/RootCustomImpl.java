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

import java.util.List;

import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;

/**
 * Custom impl {@link Root}
 * 
 * @author Arthur Daussy
 */
public class RootCustomImpl extends RootImpl {

	@Override
	public void addSowPlanification(SeedItem seed, List<Integer> weeks, SowType type) {

		Planifier aPlanifier = getPlanifier();
		if (aPlanifier == null) {
			aPlanifier = PermadelerFactory.eINSTANCE.createPlanifier();
			setPlanifier(aPlanifier);
		}

		SowPlanfication planification = PermadelerFactory.eINSTANCE.createSowPlanfication();
		planification.setSeed(seed);
		planification.setType(type);
		planification.getWeeks().addAll(weeks);
		aPlanifier.getPlanfications().add(planification);

	}

	@Override
	public CompatibilityLink addCompatibility(Genus source, Genus target, int cmp) {
		KnowledgeBase aSeedLib = getSeedLib();
		if (aSeedLib == null) {
			aSeedLib = PermadelerFactory.eINSTANCE.createKnowledgeBase();
			setSeedLib(aSeedLib);
		}

		CompatibilityMatrix matrix = aSeedLib.getCompatibilityMatrix();
		if (matrix == null) {
			matrix = PermadelerFactory.eINSTANCE.createCompatibilityMatrix();
			aSeedLib.setCompatibilityMatrix(matrix);
		}

		// Look for existing link

		List<CompatibilityLink> existing = matrix.getCompatibilties().stream()
				.filter(link -> link.getSpecies().contains(source) && link.getSpecies().contains(target))
				.collect(toList());

		final CompatibilityLink result;
		if (existing.size() == 1) {
			result = existing.get(0);
			result.setAffinity(cmp);
		} else if (existing.size() > 1) {
			result = existing.get(0);
			result.setAffinity(cmp);
			// Remove all other
			// TODO merge all others...
			matrix.getCompatibilties().removeAll(existing.subList(1, existing.size()));
		} else {
			result = PermadelerFactory.eINSTANCE.createCompatibilityLink();
			result.getSpecies().add(source);
			result.getSpecies().add(target);
			result.setAffinity(cmp);
			matrix.getCompatibilties().add(result);
		}

		return result;

	}

}
