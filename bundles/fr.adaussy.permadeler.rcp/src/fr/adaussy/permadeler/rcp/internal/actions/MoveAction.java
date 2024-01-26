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
import java.util.function.Predicate;

import javax.annotation.Generated;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

/**
 * Action to move an object to another container
 * 
 * @author Arthur Daussy
 * @param <T>
 *            target type
 */
public final class MoveAction<T extends EObject> extends AbstractModelAction {

	private final Predicate<T> targetFilter;

	private final EObject root;

	private final List<? extends EObject> toMove;

	private final Class<T> type;

	private final EReference ref;

	/**
	 * Simple constructor
	 * 
	 * @param builder
	 *            a builder
	 */
	private MoveAction(Builder<T> builder) {
		super(builder.text, builder.image, builder.session);
		this.targetFilter = builder.targetFilter;
		this.root = builder.root;
		this.toMove = builder.toMove;
		this.type = builder.type;
		this.ref = builder.ref;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void runWithEvent(Event event) {
		ObjectSelectionDialog<T> dialog = new ObjectSelectionDialog<T>(event.display.getActiveShell(), type,
				targetFilter, root);
		dialog.setMulti(false);
		if (dialog.open() == Dialog.OK) {
			List<T> target = dialog.getSelection();
			if (!target.isEmpty() && !toMove.isEmpty()) {
				modifyModel(() -> {
					if (ref.isMany()) {
						((EList<EObject>)target.get(0).eGet(ref)).addAll(toMove);
					} else {
						target.get(0).eSet(ref, toMove.get(0));
					}
				});
			}
		}
	}

	/**
	 * Creates builder to build {@link MoveAction}.
	 * 
	 * @param type
	 *            the type of element to move
	 * @param <E>
	 *            the type of element to move
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static <E extends EObject> Builder<E> builder(Class<E> type) {
		return new Builder<E>(type);
	}

	/**
	 * Builder to build {@link MoveAction}.
	 * 
	 * @param <T>
	 *            type of element to move
	 */
	// CHECKSTYLE:OFF Builder pattern
	public static final class Builder<T extends EObject> {
		private String text;

		private ImageDescriptor image;

		private Session session;

		private Predicate<T> targetFilter;

		private EObject root;

		private List<? extends EObject> toMove;

		private Class<T> type;

		private EReference ref;

		private Builder(Class<T> type) {
			this.type = type;
		}

		public Builder<T> withText(String text) {
			this.text = text;
			return this;
		}

		public Builder<T> withImage(ImageDescriptor image) {
			this.image = image;
			return this;
		}

		public Builder<T> withSession(Session session) {
			this.session = session;
			return this;
		}

		public Builder<T> withTargetFilter(Predicate<T> targetFilter) {
			this.targetFilter = targetFilter;
			return this;
		}

		public Builder<T> withRoot(EObject root) {
			this.root = root;
			return this;
		}

		public Builder<T> withToMove(List<? extends EObject> toMove) {
			this.toMove = toMove;
			return this;
		}

		public Builder<T> withRef(EReference ref) {
			this.ref = ref;
			return this;
		}

		public MoveAction<T> build() {
			return new MoveAction<T>(this);
		}
	}
	// CHECKSTYLE:ON Builder pattern

}
