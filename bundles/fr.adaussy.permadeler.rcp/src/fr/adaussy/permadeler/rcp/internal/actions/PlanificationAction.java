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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Generated;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Planfication;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.dialogs.MonthWeekDialog;

/**
 * Action that create planification from a seed item
 * 
 * @author Arthur Daussy
 */
public final class PlanificationAction extends AbstractModelAction {

	private List<Integer> defaultChoise;

	private SeedItem seedItem;

	private SowType type;

	/**
	 * Simple constructor
	 * 
	 * @param builder
	 *            a builder
	 */
	private PlanificationAction(Builder builder) {
		super(builder.text,
				builder.type == SowType.INDOOR
						? ImageProvider.INSTANCE.getImageDescriptor("icons/bank/icons/greenhouse.png") //$NON-NLS-1$
						: ImageProvider.INSTANCE.getImageDescriptor("icons/bank/icons/sow.png"), //$NON-NLS-1$
				builder.session);
		this.defaultChoise = builder.defaultChoise;
		this.seedItem = builder.seedItem;
		this.type = builder.type;
	}

	@Override
	public void runWithEvent(Event event) {
		MonthWeekDialog dialog = new MonthWeekDialog(event.display.getActiveShell(), RcpMessages.PlanificationAction_0,
				defaultChoise);
		if (dialog.open() == Dialog.OK) {
			modifyModel(() -> {
				Root root = EMFUtils.getAncestor(Root.class, seedItem);
				root.addSowPlanification(seedItem, dialog.getMonths(), type);
				Planifier planifier = root.getPlanifier();
				if (planifier != null) {
					EList<Planfication> planifications = planifier.getPlanfications();
					ECollections.sort(planifications, Comparator.comparing(p -> {
						return p.getWeeks().stream().mapToInt(i -> (int)i).max().orElse(0);
					}));
				}
			});
		}
	}

	/**
	 * Creates builder to build {@link PlanificationAction}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link PlanificationAction}.
	 */
	// CHECKSTYLE:OFF Builder pattern
	public static final class Builder {
		private String text;

		private Session session;

		private List<Integer> defaultChoise = Collections.emptyList();

		private SeedItem seedItem;

		private SowType type;

		private Builder() {
		}

		public Builder withText(String text) {
			this.text = text;
			return this;
		}

		public Builder withSession(Session session) {
			this.session = session;
			return this;
		}

		public Builder withDefaultChoise(List<Integer> defaultChoise) {
			this.defaultChoise = defaultChoise;
			return this;
		}

		public Builder withSeedItem(SeedItem seedItem) {
			this.seedItem = seedItem;
			return this;
		}

		public Builder withType(SowType type) {
			this.type = type;
			return this;
		}

		public PlanificationAction build() {
			return new PlanificationAction(this);
		}
	}
	// CHECKSTYLE:ON Builder pattern

}
