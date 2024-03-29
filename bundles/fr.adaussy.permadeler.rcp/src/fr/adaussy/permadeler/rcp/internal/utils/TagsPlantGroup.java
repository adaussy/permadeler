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
import java.util.function.Supplier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class TagsPlantGroup extends AdapterImpl implements ISelfDescribingItem {

	private final EObject parent;

	private TaggedListener listener;

	private Supplier<List<? extends TaggedElement>> allElementsProvider;

	public TagsPlantGroup(EObject parent, Viewer viewer,
			Supplier<List<? extends TaggedElement>> allElementsProvider) {
		super();
		this.parent = parent;
		this.allElementsProvider = allElementsProvider;

		listener = new TaggedListener(viewer);
		Session.of(parent).get().getTransactionalEditingDomain().addResourceSetListener(listener);

	}

	public void dispose() {
		Session.of(parent).get().getTransactionalEditingDomain().removeResourceSetListener(listener);
	}

	@Override
	public List<? extends Object> getChildren() {
		Map<String, List<TaggedElement>> groupByTag = new LinkedHashMap<String, List<TaggedElement>>();
		for (TaggedElement tagElement : allElementsProvider.get()) {

			for (String s : tagElement.getTags()) {
				groupByTag.computeIfAbsent(s, k -> new ArrayList<TaggedElement>()).add(tagElement);
			}
		}

		List<TagOwnerGroup> tagged = groupByTag.entrySet().stream()
				.sorted(Comparator.comparing(Entry::getKey))//
				.map(entry -> new TagOwnerGroup(entry.getKey(), entry.getValue(), this))//
				.toList();
		return tagged;

	}

	@Override
	public String getLabel() {
		return "Par tags";
	}

	@Override
	public int hashCode() {
		return Objects.hash(allElementsProvider, listener, parent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagsPlantGroup other = (TagsPlantGroup)obj;
		return Objects.equals(allElementsProvider, other.allElementsProvider)
				&& Objects.equals(listener, other.listener) && Objects.equals(parent, other.parent);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/tag-folder.png"); //$NON-NLS-1$
	}

	@Override
	public Object getParent() {
		return parent;
	}

	private class TaggedListener extends ResourceSetListenerImpl {

		private final Viewer viewer;

		public TaggedListener(Viewer viewer) {
			super();
			this.viewer = viewer;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			if (event.getNotifications().stream().anyMatch(n -> needRefresh(n))) {
				if (viewer instanceof TreeViewer treeViewer) {
					treeViewer.refresh(TagsPlantGroup.this);
				} else {
					viewer.refresh();

				}
			}
		}

		private boolean needRefresh(Notification n) {
			return n.getFeature() == PermadelerPackage.eINSTANCE.getTaggedElement_Tags()
					|| (n.getFeature() instanceof EReference ref && ref.isContainment()
							&& PermadelerPackage.eINSTANCE.getTaggedElement()
									.isSuperTypeOf(ref.getEReferenceType()));
		}
	}

}
