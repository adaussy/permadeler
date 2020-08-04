/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.List;

import javax.annotation.Generated;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.rcp.internal.timeview.InputFactory;
import fr.adaussy.permadeler.rcp.internal.timeview.TimeViewPart;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeViewEditorInput;

/**
 * Action that displays a time view
 * 
 * @author Arthur Daussy
 */
public final class TimeViewAction extends Action {

	private final EPartService partService;

	private final EModelService modelService;

	private final MApplication application;

	private final EObject target;

	private final String query;

	/**
	 * Simple constructor
	 * 
	 * @param builder
	 *            a builder
	 */
	private TimeViewAction(Builder builder) {
		super(builder.label, builder.imgDescriptor);
		this.partService = builder.partService;
		this.modelService = builder.modelService;
		this.application = builder.application;
		this.target = builder.target;
		this.query = builder.query;
	}

	@Override
	public void runWithEvent(Event event) {
		openTimeView();
	}

	/**
	 * Open the a time view for the set up query
	 */
	public void openTimeView() {
		TimeViewEditorInput input = InputFactory.INSTANCE.build(query, target);
		MPart mPart = partService.getParts().stream().filter(p -> TimeViewPart.ID.equals(p.getElementId()))//
				.filter(p -> ((TimeViewPart)p.getObject()) != null && ((TimeViewPart)p.getObject()).match(input))
				.findFirst().orElseGet(() -> {
					MPart newPart = partService.createPart(TimeViewPart.ID);
					List<MPartStack> container = modelService.findElements(application,
							"org.eclipse.e4.primaryDataStack", MPartStack.class);
					container.get(0).getChildren().add(newPart);
					partService.activate(newPart, true);
					partService.showPart(newPart, PartState.ACTIVATE);
					TimeViewPart toto = (TimeViewPart)newPart.getObject();
					toto.setInput(input);
					return newPart;
				});
		partService.activate(mPart, true);
		partService.showPart(mPart, PartState.ACTIVATE);
	}

	/**
	 * Creates builder to build {@link TimeViewAction}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link TimeViewAction}.
	 */
	// CHECKSTYLE:OFF Builder pattern
	public static final class Builder {
		private EPartService partService;

		private EModelService modelService;

		private MApplication application;

		private EObject target;

		private String query;

		private String label;

		private ImageDescriptor imgDescriptor;

		private Builder() {
		}

		public Builder withPartService(EPartService partService) {
			this.partService = partService;
			return this;
		}

		public Builder withModelService(EModelService modelService) {
			this.modelService = modelService;
			return this;
		}

		public Builder withApplication(MApplication application) {
			this.application = application;
			return this;
		}

		public Builder withTarget(EObject target) {
			this.target = target;
			return this;
		}

		public Builder withQuery(String query) {
			this.query = query;
			return this;
		}

		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}

		public Builder withImgDescriptor(ImageDescriptor imgDescriptor) {
			this.imgDescriptor = imgDescriptor;
			return this;
		}

		public TimeViewAction build() {
			return new TimeViewAction(this);
		}
	}
	// CHECKSTYLE:ON
}
