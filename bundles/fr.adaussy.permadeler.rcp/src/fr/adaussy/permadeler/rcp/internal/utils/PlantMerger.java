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
package fr.adaussy.permadeler.rcp.internal.utils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class PlantMerger<T extends Plant> {

	private final PermadelerSession session;

	private final T target;

	public PlantMerger(PermadelerSession session, T target) {
		super();
		this.session = session;
		this.target = target;
	}

	public void merge(T toMerge) {
		// Move all contained object into the new target
		for (EReference containmentReference : target.eClass().getEAllReferences().stream()
				.filter(ref -> ref.isContainment()).toList()) {
			EMFUtils.eSet(target, containmentReference, toMerge.eGet(containmentReference));
		}

		// For all feature set if the target feautre is unset set

		for (EAttribute attr : target.eClass().getEAllAttributes()) {
			if (toMerge.eIsSet(attr) && !target.eIsSet(attr)) {
				EMFUtils.eSet(target, attr, toMerge.eGet(attr));
			}
		}
		// Change all inverse references
		ECrossReferenceAdapter semanticCrossReferencer = EMFUtils.getCrossReference(target);
		for (var setting : semanticCrossReferencer.getInverseReferences(toMerge)) {
			EMFUtils.eSet(setting.getEObject(), setting.getEStructuralFeature(), target);
		}
		session.getSession().getModelAccessor().eDelete(toMerge,
				session.getSession().getSemanticCrossReferencer());
	}

}
