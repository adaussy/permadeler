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
package fr.adaussy.permadeler.rcp.internal.migratations;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class Migrator {

	public void migrate(PermadelerSession session) {

		Root root = session.getRoot();

		if (root.getProductVersion() == null) {
			// Migration from 0.4.3 -> 0.5.0
			session.modify("Migration to 0.5.0", () -> migratePlantationPhase(session));
		}

	}

	private void migratePlantationPhase(PermadelerSession session) {
		session.modify("Migrate plantation phase", () -> {
			Root root = session.getRoot();

			List<Zone> zones = EMFUtils.allContainedObjectOfType(root, Zone.class).toList();
			for (Zone z : zones) {
				if (!z.getPhases().isEmpty()) {
					for (PlantationPhase phase : z.getPhases()) {
						z.getPlantations().addAll(phase.getPlantations());
						z.setBackgroundImage(phase.getBackgroundImage());
						session.getSession().getSemanticCrossReferencer().getInverseReferences(phase, true)
								.forEach(setting -> migratePlantationDiagramToZone(z, phase, setting));
					}
				}
			}
		});
	}

	private void migratePlantationDiagramToZone(Zone z, PlantationPhase phase, Setting setting) {
		EStructuralFeature feature = setting.getEStructuralFeature();

		if (ViewpointPackage.eINSTANCE.getDRepresentationDescriptor_Target() == feature) {
			((DRepresentationDescriptor)setting.getEObject()).setTarget(z);
		} else if (ViewpointPackage.eINSTANCE.getDSemanticDecorator_Target() == feature) {
			((DSemanticDecorator)setting.getEObject()).setTarget(z);

		} else if (ViewpointPackage.eINSTANCE.getDRepresentationElement_SemanticElements() == feature) {
			EList<EObject> semanticElements = ((DRepresentationElement)setting.getEObject())
					.getSemanticElements();
			semanticElements.remove(phase);
			semanticElements.add(z);

		}
	}
}
