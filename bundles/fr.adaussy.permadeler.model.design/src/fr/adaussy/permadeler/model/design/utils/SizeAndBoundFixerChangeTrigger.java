/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.utils;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Plantation;

/**
 * Model change trigger that is in charge of setting property the size and the coordinate of a new plantation
 * in a representation.
 * 
 * @author Arthur Daussy
 */
public class SizeAndBoundFixerChangeTrigger implements ModelChangeTrigger {

	private static final String NODE_TYPE = "2001";

	private static final String PMD_PLANTATION_MAPING_NAME = "PMD_Plantation";

	private TransactionalEditingDomain transactionalEditingDomain;

	public SizeAndBoundFixerChangeTrigger(TransactionalEditingDomain transactionalEditingDomain) {
		this.transactionalEditingDomain = transactionalEditingDomain;
	}

	@Override
	public int priority() {
		return 0;
	}

	private Optional<Command> matchAddPlantationNodeNotification(Notification notification) {
		if (notification.getEventType() == Notification.ADD
				&& notification.getNotifier() instanceof Diagram diagram //
				&& notification.getNewValue() instanceof Node node //
				&& NODE_TYPE.equals(node.getType())//
				&& node.getElement() instanceof DNode dNode //
				&& dNode.getActualMapping() != null//
				&& PMD_PLANTATION_MAPING_NAME.equals(dNode.getActualMapping().getName())//
				&& node.getLayoutConstraint() instanceof Bounds bounds//
				&& dNode.getTarget() instanceof Plantation plantation) {

			ShapeStyle shapeStyle = (ShapeStyle)node.getStyle(NotationPackage.eINSTANCE.getShapeStyle());
			Layer layer = plantation.getCurrentLayer();
			return getCalibrationBounds(diagram, layer).map(
					calibrationBounds -> createCalibrateCommand(calibrationBounds, bounds, shapeStyle));

		}
		return Optional.empty();
	}

	private Command createCalibrateCommand(Bounds calibrationBounds, Bounds bounds, ShapeStyle shapeStyle) {

		RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain) {

			@Override
			protected void doExecute() {
				bounds.setHeight(calibrationBounds.getHeight());
				bounds.setWidth(calibrationBounds.getWidth());
				bounds.setX(bounds.getX() - calibrationBounds.getWidth() / 2);
				bounds.setY(bounds.getY() - calibrationBounds.getHeight() / 2);

				// Compute Font height

				int fontHeight = Math.min(calibrationBounds.getHeight() / 6, 24);
				if (fontHeight < 5) {
					fontHeight = 5;
				}
				if (shapeStyle != null) {
					shapeStyle.setFontHeight(fontHeight);
				}

			}
		};
		return cmd;
	}

	@SuppressWarnings("unchecked")
	private Optional<Bounds> getCalibrationBounds(Diagram diagram, Layer layer) {
		return diagram.getChildren().stream()
				.filter(child -> child instanceof Node node && node.getLayoutConstraint() instanceof Bounds
						&& isCalibrationNodeForLayer(node, layer))
				.map(child -> (Bounds)((Node)child).getLayoutConstraint()).findFirst();
	}

	private boolean isCalibrationNodeForLayer(Node node, Layer layer) {
		return node.getElement() instanceof DNode dNode && dNode.getActualMapping() != null
				&& buildCalibrationMappingName(layer).equals(dNode.getActualMapping().getName());
	}

	private String buildCalibrationMappingName(Layer layer) {
		return "PMD_" + layer.getName() + "_Calibration";
	}

	@Override
	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {

		List<Command> commands = notifications.stream().map(this::matchAddPlantationNodeNotification)
				.filter(Optional::isPresent).map(Optional::get).toList();

		if (commands.isEmpty()) {
			return Options.newNone();
		} else if (commands.size() == 1) {
			return Options.newSome(commands.get(0));
		} else {
			CompoundCommand cc = new CompoundCommand(0, commands);
			return Options.newSome(cc);
		}
	}
}
