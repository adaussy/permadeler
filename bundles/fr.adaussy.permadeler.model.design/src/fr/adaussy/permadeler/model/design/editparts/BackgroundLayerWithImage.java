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

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Graphics;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;
import org.eclipse.swt.graphics.Image;

public class BackgroundLayerWithImage extends FreeformLayer {

	/* Image used for the diagram background */
	private Image image;

	/* Transparency used to display image in the diagram background */
	private int transparency;

	private double scale;

	private String path;

	/**
	 * Constructor.
	 * 
	 * @param path
	 *            path of the image to display in background
	 * @param theTransparency
	 *            transparency of the image to display
	 */
	public BackgroundLayerWithImage(String path, int theTransparency, double scale) {
		super();
		this.path = path;
		this.transparency = theTransparency;
		this.scale = scale;
		setImage(WorkspaceImageFigure.getImageInstanceFromPath(path));

	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public double getScale() {
		return scale;
	}

	public String getPath() {
		return path;
	}

	public int getTransparency() {
		return transparency;
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		if (getImage() != null) {
			// Set Transparency
			graphics.setAlpha(transparency);

			// Mode with stretched image
			Image img = getImage();
			if (img.isDisposed()) {
				setImage(WorkspaceImageFigure.getImageInstanceFromPath(path));
			}
			org.eclipse.swt.graphics.Rectangle imgBounds = img.getBounds();
			graphics.drawImage(img, 0, 0, imgBounds.width, imgBounds.height, 0, 0,
					(int)(imgBounds.width * scale), (int)(imgBounds.height * scale));
		}
		super.paintFigure(graphics);
	}
}
