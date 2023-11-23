/**
 *  Copyright (c) 2023 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.model.design.editparts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;

public class FoodForestMapDiagramEditpartProvider extends AbstractEditPartProvider {

	private static final String PLANTATIONS_MAP_DIAGRAM_ID = "FoodForestMapDiagram"; //$NON-NLS-1$

	@Override
	protected Class getDiagramEditPartClass(View view) {
		EObject element = view.getElement();
		if (element instanceof DDiagram) {
			// Custom edit part for plantation diagrams
			if (PLANTATIONS_MAP_DIAGRAM_ID.equals(((DDiagram)element).getDescription().getName())) {
				return ZoneDiagramEditPart.class;
			}
		}
		return super.getDiagramEditPartClass(view);
	}

	@Override
	protected Class getNodeEditPartClass(View view) {
		EObject element = view.getElement();
		if (element instanceof DNode) {
			int visualID = SiriusVisualIDRegistry.getVisualID(view);
			if (DNodeEditPart.VISUAL_ID == visualID
					&& (isPlantationEditPart(element) || isCalibration(element))) { // $NON-NLS-1$
				// Custom edit part for plantation
				return TraversableEditPart.class;
			}
		}
		return super.getNodeEditPartClass(view);
	}

	private boolean isCalibration(EObject element) {
		String mappingName = ((DNode)element).getDiagramElementMapping().getName();
		return mappingName != null && mappingName.startsWith("PMD_") && mappingName.endsWith("_Calibration");
	}

	private boolean isPlantationEditPart(EObject element) {
		return "PMD_Plantation".equals(((DNode)element).getDiagramElementMapping().getName());
	}
}
