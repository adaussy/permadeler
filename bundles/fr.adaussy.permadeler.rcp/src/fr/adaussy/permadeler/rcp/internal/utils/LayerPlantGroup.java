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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class LayerPlantGroup implements ISelfDescribingItem {

	private StrateListener listener;

	private KnowledgeBase base;

	public LayerPlantGroup(KnowledgeBase base, Viewer viewer) {
		super();
		this.base = base;

		listener = new StrateListener(viewer);
		Session.of(base).get().getTransactionalEditingDomain().addResourceSetListener(listener);

	}

	public void dispose() {
		Session.of(base).get().getTransactionalEditingDomain().removeResourceSetListener(listener);
	}

	@Override
	public List<? extends Object> getChildren() {
		Map<Layer, List<Species>> groupByTag = new LinkedHashMap<Layer, List<Species>>();
		for (Species species : base.getSpecies()) {
			groupByTag.computeIfAbsent(species.getDefaultLayer(), k -> new ArrayList<Species>()).add(species);
		}

		List<LayerOwnerGroup> tagged = groupByTag.entrySet().stream()
				.sorted(Comparator.comparing(Entry::getKey))//
				.map(entry -> new LayerOwnerGroup(entry.getKey(), entry.getValue(), this))//
				.toList();
		return tagged;

	}

	@Override
	public String getLabel() {
		return "Par strate";
	}

	@Override
	public int hashCode() {
		return Objects.hash(base, listener);
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
		return Objects.equals(base, other.base) && Objects.equals(listener, other.listener);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/strate-folder.png"); //$NON-NLS-1$
	}

	@Override
	public Object getParent() {
		return base;
	}

	private static class StrateListener extends ResourceSetListenerImpl {

		private final Viewer viewer;

		public StrateListener(Viewer viewer) {
			super();
			this.viewer = viewer;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			if (event.getNotifications().stream()
					.anyMatch(n -> n.getFeature() == PermadelerPackage.eINSTANCE.getSpecies_DefaultLayer())) {
				viewer.refresh();
			}
		}
	}

}
