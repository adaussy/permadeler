package fr.adaussy.permadeler.model.design.editparts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;

public class PlantationEditPart extends DNodeEditPart {

	public PlantationEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createMainFigure() {
		NodeFigure afigure = super.createMainFigure();
		afigure.setFocusTraversable(true);
		return afigure;
	}

}
