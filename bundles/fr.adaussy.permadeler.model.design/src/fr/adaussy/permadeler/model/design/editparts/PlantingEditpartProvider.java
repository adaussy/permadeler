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

public class PlantingEditpartProvider extends AbstractEditPartProvider {

	@Override
	protected Class getDiagramEditPartClass(View view) {
		EObject element = view.getElement();
		if (element instanceof DDiagram) {
			// Custom edit part for plantation diagrams
			if ("Plantations".equals(((DDiagram)element).getDescription().getName())) {
				return PlantingDiagramEditPart.class;
			}
		}
		return super.getDiagramEditPartClass(view);
	}

}
