/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import static fr.adaussy.permadeler.model.design.utils.GMFUtils.getGMFBounds;
import static fr.adaussy.permadeler.model.design.utils.GMFUtils.getNodeInDiagram;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.ui.internal.refresh.GMFHelper;

import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.model.Permadeler.RowBedType;

/**
 * Services used to layout a GMF diagram
 * 
 * @author Arthur Daussy
 */
public class LayoutService {

	private static final String PLANTATION_IN_BED = "PlantationInBed"; //$NON-NLS-1$

	private static final String ROW_BED_ROW_CONTAINER = "RowBedRowContainer"; //$NON-NLS-1$

	/**
	 * Layout a RowBed
	 * 
	 * @param rowBed
	 *            the semantic row bed to layout
	 * @param selectedViews
	 *            the view of the row bedsss
	 * @param fillPercentage
	 *            the percentage space taken by the plantation represetation
	 */
	public static void layoutBed(RowBed rowBed, List<DDiagramElement> selectedViews, double fillPercentage) {
		for (DDiagramElement view : selectedViews) {
			if (view instanceof DNodeContainer) {
				DNodeContainer nodeContainer = (DNodeContainer)view;

				List<DNodeContainer> rows = nodeContainer.getOwnedDiagramElements().stream()
						.filter(d -> d instanceof DNodeContainer)//
						.map(d -> (DNodeContainer)d)
						.filter(d -> ROW_BED_ROW_CONTAINER.equals(d.getActualMapping().getName()))//
						.collect(toList());

				// Node containerRep = getNodeInDiagram(nodeContainer).get();

				int defaultSize = 0;
				boolean vertical = rowBed.getType() == RowBedType.VERTICAL;
				for (DNodeContainer row : rows) {
					Bounds rowBounds = getGMFBounds(row).get();
					int newValue = vertical ? rowBounds.getWidth() : rowBounds.getHeight();
					defaultSize += newValue;
				}
				defaultSize = defaultSize / rows.size();

				for (DNodeContainer row : rows) {

					Node rowNode = getNodeInDiagram(row).get();
					Bounds rowBounds = getGMFBounds(rowNode).get();
					if (vertical) {
						rowBounds.setWidth(defaultSize);
					} else {
						rowBounds.setHeight(defaultSize);
					}

					// Gets the plantations
					List<DNode> plantationNodes = row.getOwnedDiagramElements().stream()
							.filter(d -> d instanceof DNode)//
							.map(d -> (DNode)d)
							.filter(d -> PLANTATION_IN_BED.equals(d.getActualMapping().getName()))//
							.collect(toList());
					if (!plantationNodes.isEmpty()) {

						int plantationIndex = 0;

						int nbPlantation = plantationNodes.size();

						final int plantationSize;
						if (vertical) {
							plantationSize = (int)(Math.min(
									rowBounds.getHeight() * fillPercentage / nbPlantation,
									rowBounds.getWidth() * fillPercentage));
						} else {
							plantationSize = (int)(Math.min(rowBounds.getHeight() * fillPercentage,
									rowBounds.getWidth() * fillPercentage / nbPlantation));
						}

						int halfSize = plantationSize / 2;
						Dimension inset = GMFHelper.getContainerTopLeftInsets(rowNode, true);
						for (DNode plantationNode : plantationNodes) {
							Bounds plantationBounds = getGMFBounds(plantationNode).get();
							plantationBounds.setHeight(plantationSize);
							plantationBounds.setWidth(plantationSize);

							if (vertical) {
								plantationBounds.setX(
										(rowBounds.getWidth() / 2) - (plantationSize / 2) - inset.width);
							} else {
								plantationBounds
										.setX(plantationSize * plantationIndex + halfSize - inset.width);
							}
							if (vertical) {
								plantationBounds
										.setY(plantationSize * plantationIndex + halfSize - inset.height);
							} else {
								plantationBounds.setY(
										(rowBounds.getHeight() / 2) - (plantationSize / 2) - inset.height);
							}
							plantationIndex++;
						}
					}
				}

			}
		}
	}

	/**
	 * Center a node inside its container an resize it so its fill the container up to the given percentage
	 *
	 * @param node
	 *            the node to update
	 * @param fillPercentage
	 *            the percentage of the space used by the child
	 */
	public static void centerAndFill(DNode node, double fillPercentage) {
		EObject container = node.eContainer();
		if (container instanceof DNodeContainer) {
			Optional<Node> childNode = getNodeInDiagram(node);
			Optional<Node> containerRep = getNodeInDiagram((DNodeContainer)container);
			if (containerRep.isPresent() && childNode.isPresent()) {
				Node containerRepNode = containerRep.get();
				Optional<Bounds> optContainerBounds = getGMFBounds(containerRepNode);
				Optional<Bounds> optChildBounds = getGMFBounds(childNode.get());
				Bounds containerBounds = optContainerBounds.get();
				Bounds childBounds = optChildBounds.get();
				Dimension inset = GMFHelper.getContainerTopLeftInsets(containerRepNode, true);

				int newSize = (int)(Math.min(containerBounds.getHeight(), containerBounds.getWidth())
						* fillPercentage);
				childBounds.setHeight(newSize);
				childBounds.setWidth(newSize);

				int xCenter = (containerBounds.getWidth() / 2) - (childBounds.getWidth() / 2) - inset.width;
				int yCenter = (containerBounds.getHeight() / 2) - (childBounds.getHeight() / 2)
						- inset.height;

				childBounds.setX(xCenter);
				childBounds.setY(yCenter);
			}

		}
	}

}
