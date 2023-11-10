/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;

public class TraversableEditPart extends DNodeEditPart {

	public TraversableEditPart(View view) {
		super(view);
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateRequest createRequest
				&& createRequest.getNewObject() instanceof NodeCreationDescription nodeCreationTool) {
			// When the plantation is in wireframe mode then the creation request shoud be sent to the parent
			return getParent().getTargetEditPart(request);
		}
		// Dropping on plantation should be the same of dropping he diagram itself
		else if (request instanceof ChangeBoundsRequest chReq && "drop".equals(chReq.getType())) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
