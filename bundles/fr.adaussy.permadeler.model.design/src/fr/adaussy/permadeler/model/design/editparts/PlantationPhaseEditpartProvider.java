/**
 *  Copyright (c) 2022 Arthur Daussy.
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

public class PlantationPhaseEditpartProvider extends AbstractEditPartProvider {

	private static final String PLANTATIONS_MAP_DIAGRAM_ID = "PlantationsMapDiagram"; //$NON-NLS-1$

	@Override
	protected Class getDiagramEditPartClass(View view) {
		EObject element = view.getElement();
		if (element instanceof DDiagram) {
			// Custom edit part for plantation diagrams
			if (PLANTATIONS_MAP_DIAGRAM_ID.equals(((DDiagram)element).getDescription().getName())) {
				return PlantationPhaseDiagramEditPart.class;
			}
		}
		return super.getDiagramEditPartClass(view);
	}

	// @Override
	// protected Class getNodeEditPartClass(View view) {
	// EObject element = view.getElement();
	// if (element instanceof DNode) {
	// if ("PMD_Plantation".equals(((DNode)element).getDiagramElementMapping().getName())) {
	// return PlantationEditPart.class;
	// }
	// }
	// return super.getNodeEditPartClass(view);
	// }
}
