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

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;

public class LayerOwnerGroup implements ISelfDescribingItem {

	private LayerPlantGroup stratePlantGroup;

	private List<Species> children;

	private Layer layer;

	public LayerOwnerGroup(Layer layer, List<Species> children, LayerPlantGroup tagsPlantGroup) {
		super();
		this.layer = layer;
		this.children = children;
		this.stratePlantGroup = tagsPlantGroup;
	}

	@Override
	public List<? extends Object> getChildren() {
		return children;
	}

	@Override
	public String getLabel() {
		return TextHelper.getEditLabel(layer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(layer, stratePlantGroup);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LayerOwnerGroup other = (LayerOwnerGroup)obj;
		return Objects.equals(layer, other.layer) && Objects.equals(stratePlantGroup, other.stratePlantGroup);
	}

	@Override
	public org.eclipse.swt.graphics.Image getImage() {
		return ImageProvider.INSTANCE.getImage("icons/custo/commons/folder-blue.png"); //$NON-NLS-1$
	}

	@Override
	public Object getParent() {
		return stratePlantGroup;
	}

}
