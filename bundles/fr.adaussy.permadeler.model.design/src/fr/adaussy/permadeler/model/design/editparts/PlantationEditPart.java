package fr.adaussy.permadeler.model.design.editparts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;

import fr.adaussy.permadeler.model.Permadeler.Plantation;

public class PlantationEditPart extends DNodeEditPart {

	public PlantationEditPart(View view) {
		super(view);
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateRequest && ((CreateRequest)request).getNewObject() != null) {
			// When the plantation is in wireframe mode then the creation request sould be sent to the parent
			return getParent().getTargetEditPart(request);
		}
		// Dropping on plantation should be the same of dropping he diagram itself
		else if (request instanceof ChangeBoundsRequest chReq && "drop".equals(chReq.getType())) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

	private Plantation getPlantation() {
		EObject semantic = resolveSemanticElement();
		if (semantic instanceof DNode) {
			DNode node = (DNode)semantic;
			EObject target = node.getTarget();
			return ((Plantation)target);
		}
		return null;
	}
}
