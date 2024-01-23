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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SpeciesMerger {

	private final PermadelerSession session;

	private final Species target;

	public SpeciesMerger(PermadelerSession session, Species target) {
		super();
		this.session = session;
		this.target = target;
	}

	public void merge(Species toMerge) {
		// Move all contained object into the new target
		for (EReference containmentReference : PermadelerPackage.eINSTANCE.getSpecies().getEAllReferences()
				.stream().filter(ref -> ref.isContainment()).toList()) {
			EMFUtils.eSet(target, containmentReference, toMerge.eGet(containmentReference));
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
