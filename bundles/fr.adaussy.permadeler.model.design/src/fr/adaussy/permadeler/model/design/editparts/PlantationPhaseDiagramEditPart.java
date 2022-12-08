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

import java.util.List;
import java.util.Objects;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.model.business.internal.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DDiagramEditPart;

import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.design.services.DiagramService;

@SuppressWarnings("restriction")
public class PlantationPhaseDiagramEditPart extends DDiagramEditPart {

	private BackgroundLayerWithImage layerBackground;

	public PlantationPhaseDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected IFigure createFigure() {
		IFigure fig = super.createFigure();
		DSemanticDiagram dSemanticDiagram = (DSemanticDiagram)this.resolveDDiagram().get();
		if (dSemanticDiagram != null) {

			BackgroundImage bgImg = getBackgroundImage();
			if (bgImg != null) {
				setBackgroundLayer(fig, bgImg);

			} else {
				configureBackground(fig);
			}
		}
		return fig;
	}

	@Override
	public void refresh() {
		super.refresh();
	}

	private BackgroundImage getBackgroundImage() {
		EObject resolveSemanticElement = resolveSemanticElement();
		if (resolveSemanticElement instanceof DSemanticDiagramSpec) {
			DSemanticDiagramSpec diagram = (DSemanticDiagramSpec)resolveSemanticElement;

			EObject seamnticElement = diagram.getTarget();
			if (seamnticElement instanceof PlantationPhase) {
				return ((PlantationPhase)seamnticElement).getBackgroundImage();
			}
		}
		return null;
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		DSemanticDiagram dSemanticDiagram = (DSemanticDiagram)this.resolveDDiagram().get();
		if (dSemanticDiagram != null) {
			BackgroundImage bgImg = getBackgroundImage();
			refreshBackgroundImage(bgImg);
		}
	}

	/**
	 * Refresh background with image given by its path.
	 * 
	 * @param imagePath
	 *            path of the image to display in background
	 */
	private void refreshBackgroundImage(BackgroundImage bgImage) {
		if (bgImage != null) {

			// check background color
			IFigure figure = getFigure();
			if (figure.isOpaque()) {
				// reset background
				getFigure().setBackgroundColor(null);
				getFigure().setOpaque(false);
			}
			// check background layer
			if (layerBackground != null) {
				String imagePath = DiagramService.getBackgroundSVGPath(getBackgroundImage());
				if (!Objects.equals(layerBackground.getPath(), imagePath)
						|| bgImage.getTransparency() != layerBackground.getTransparency()
						|| bgImage.getScaling() != layerBackground.getScale()) {
					figure.remove(layerBackground);
					setBackgroundLayer(figure, bgImage);
				}
				// update background layer
				// backgroundLayer.setImage(WorkspaceImageFigure.getImageInstanceFromPath(imagePath));
			} else {
				// create background layer
				setBackgroundLayer(figure, bgImage);
			}
		} else {
			// TODO remove background image
		}
		getFigure().repaint();
	}

	protected void setBackgroundLayer(IFigure figure, BackgroundImage bgImage) {
		String imagePath = DiagramService.getBackgroundSVGPath(getBackgroundImage());
		this.layerBackground = new BackgroundLayerWithImage(imagePath, bgImage.getTransparency(),
				bgImage.getScaling());
		getLayer(LayerConstants.PRINTABLE_LAYERS).add(layerBackground, 0);
		figure.add(layerBackground);
	}

	@Override
	public void deactivate() {
		super.deactivate();
		layerBackground = null;
	}

	@Override
	public List getPrimaryEditParts() {
		List result = super.getPrimaryEditParts();
		DSemanticDiagram dSemanticDiagram = (DSemanticDiagram)this.resolveDDiagram().get();
		// Add the diagram figure to the export
		if (dSemanticDiagram != null) {
			if (getBackgroundImage() != null) {
				result.add(0, this);
			}
		}
		return result;
	}

}
