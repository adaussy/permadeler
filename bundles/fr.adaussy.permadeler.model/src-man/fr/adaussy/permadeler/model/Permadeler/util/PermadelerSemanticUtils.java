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
package fr.adaussy.permadeler.model.Permadeler.util;

import java.util.List;

import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class PermadelerSemanticUtils {

	/**
	 * Gets all the plantation of a given plant
	 * 
	 * @param p
	 *            a plant
	 * @return a list of plantation
	 */
	public static List<Plantation> getPlantations(Plant p) {
		ECrossReferenceAdapter semanticCrossReferencer = EMFUtils.getCrossReference(p);
		return EMFUtils.getInverse(p, Plantation.class, PermadelerPackage.eINSTANCE.getPlantation_Type(),
				semanticCrossReferencer);
	}
}
