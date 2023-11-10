/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.utils;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class LayerPlantGroup<T extends EObject> extends AdapterImpl implements ISelfDescribingItem {

	private StrateListener listener;

	private T root;

	private Function<T, List<Pair<Layer, List<EObject>>>> computer;

	public LayerPlantGroup(T root, Viewer viewer, EStructuralFeature listeningReference,
			Function<T, List<Pair<Layer, List<EObject>>>> computer) {
		super();
		this.root = root;
		this.computer = computer;

		listener = new StrateListener(viewer, listeningReference);
		Session.of(root).get().getTransactionalEditingDomain().addResourceSetListener(listener);

	}

	public void dispose() {
		Session.of(root).get().getTransactionalEditingDomain().removeResourceSetListener(listener);
	}

	@Override
	public List<? extends Object> getChildren() {
		return computer.apply(root).stream()
				.map(pair -> new LayerOwnerGroup(pair.getOne(), pair.getTwo(), this)).toList();

	}

	@Override
	public String getLabel() {
		return "Par strate";
	}

	@Override
	public int hashCode() {
		return Objects.hash(computer, listener, root);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LayerPlantGroup other = (LayerPlantGroup)obj;
		return Objects.equals(computer, other.computer) && Objects.equals(listener, other.listener)
				&& Objects.equals(root, other.root);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/strate-folder.png"); //$NON-NLS-1$
	}

	@Override
	public Object getParent() {
		return root;
	}

	private static class StrateListener extends ResourceSetListenerImpl {

		private final Viewer viewer;

		private final EStructuralFeature feature;

		public StrateListener(Viewer viewer, EStructuralFeature feature) {
			super();
			this.viewer = viewer;
			this.feature = feature;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			if (event.getNotifications().stream().anyMatch(n -> n.getFeature() == feature)) {
				viewer.refresh();
			}
		}
	}

}
