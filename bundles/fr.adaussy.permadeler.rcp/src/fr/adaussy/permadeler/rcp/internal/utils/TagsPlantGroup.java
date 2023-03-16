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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.viewers.Viewer;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class TagsPlantGroup implements ISelfDescribingItem {

	private final KnowledgeBase knowledge;

	private EContentAdapter contentAdapter;

	public TagsPlantGroup(KnowledgeBase knowledge, Viewer viewer) {
		super();
		this.knowledge = knowledge;
		this.contentAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if (notification.getFeature() == PermadelerPackage.eINSTANCE.getTaggedElement_Tags()) {
					viewer.refresh();
				}
			}
		};
		knowledge.eAdapters().add(contentAdapter);
	}

	public void dispose() {
		knowledge.eAdapters().remove(contentAdapter);
	}

	@Override
	public List<? extends Object> getChildren() {
		return EMFUtils.allContainedObjectOfType(knowledge, Plant.class)//
				.flatMap(p -> p.getTags().stream())//
				.distinct()//
				.sorted()//
				.map(t -> new TagPlantGroup(t, knowledge))//
				.toList();
	}

	@Override
	public String getLabel() {
		return "Par tags";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contentAdapter, knowledge);
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
		return Objects.equals(contentAdapter, other.contentAdapter)
				&& Objects.equals(knowledge, other.knowledge);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/folder-blue.png"); //$NON-NLS-1$
	}

}
