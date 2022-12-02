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

import java.util.List;

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

}
