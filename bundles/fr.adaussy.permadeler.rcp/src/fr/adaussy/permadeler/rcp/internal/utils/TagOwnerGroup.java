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

import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class TagOwnerGroup implements ISelfDescribingItem {

	private final String tag;

	private TagsPlantGroup tagsPlantGroup;

	private List<TaggedElement> children;

	public TagOwnerGroup(String tag, List<TaggedElement> children, TagsPlantGroup tagsPlantGroup) {
		super();
		this.tag = tag;
		this.children = children;
		this.tagsPlantGroup = tagsPlantGroup;
	}

	@Override
	public List<? extends Object> getChildren() {
		return children;
	}

	@Override
	public String getLabel() {
		return tag;
	}

	public String getTag() {
		return tag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tag, tagsPlantGroup);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagOwnerGroup other = (TagOwnerGroup)obj;
		return Objects.equals(tag, other.tag) && Objects.equals(tagsPlantGroup, other.tagsPlantGroup);
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
