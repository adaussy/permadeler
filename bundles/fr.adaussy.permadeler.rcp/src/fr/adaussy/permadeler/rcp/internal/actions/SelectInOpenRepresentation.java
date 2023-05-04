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
package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.utils.EMFUtils;

public class SelectInOpenRepresentation extends AbstractModelAction {

	private List<? extends EObject> elementToSelect;

	public SelectInOpenRepresentation(List<? extends EObject> elementToSelect, Session session) {
		super("Selectionner dans les représentation ouvertes", session);
		this.elementToSelect = elementToSelect;
	}

	@Override
	public void runWithEvent(Event event) {
		super.runWithEvent(event);
		IEditingSession uiSession = SessionUIManager.INSTANCE.getUISession(getSession());

		for (DialectEditor dialec : uiSession.getEditors()) {
			DRepresentation rep = dialec.getRepresentation();
			List<DRepresentationElement> uiElementToSelect = new ArrayList<DRepresentationElement>();
			for (EObject semantic : elementToSelect) {

				List<DRepresentationElement> representations = EMFUtils.getInverse(semantic,
						DRepresentationElement.class,
						ViewpointPackage.eINSTANCE.getDSemanticDecorator_Target(),
						getSession().getSemanticCrossReferencer());

				representations.stream().filter(e -> EMFUtils.getAncestor(DRepresentation.class, e) == rep)//
						.forEach(uiElementToSelect::add);

			}
			DialectUIManager.INSTANCE.setSelection(dialec, uiElementToSelect);
		}
	}
}
