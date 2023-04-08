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

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class TagPlantGroup implements ISelfDescribingItem {

	private final String tag;

	private final KnowledgeBase base;

	private TagsPlantGroup tagsPlantGroup;

	public TagPlantGroup(String tag, KnowledgeBase base, TagsPlantGroup tagsPlantGroup) {
		super();
		this.tag = tag;
		this.base = base;
		this.tagsPlantGroup = tagsPlantGroup;
	}

	public TagsPlantGroup getTagsPlantGroup() {
		return tagsPlantGroup;
	}

	@Override
	public List<? extends Object> getChildren() {
		return base.getAllPlants().stream().filter(p -> p.getTags().contains(tag)).toList();
	}

	@Override
	public String getLabel() {
		return tag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(base, tag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagPlantGroup other = (TagPlantGroup)obj;
		return Objects.equals(base, other.base) && Objects.equals(tag, other.tag);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/folder-blue.png"); //$NON-NLS-1$
	}

	@Override
	public Object getParent() {
		return tagsPlantGroup;
	}

}
