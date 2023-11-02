/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.parts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;
import fr.adaussy.permadeler.rcp.internal.utils.TagsPlantGroup;

public class PlantationContentProvider extends ModelContentProvider {

	private TagsPlantGroup tagsPlantGroup;

	public PlantationContentProvider(Session session, ITreeContentProvider semanticContentProvider) {
		super(session, semanticContentProvider);
	}

	@Override
	protected Object[] getSemanticChildren(Object parentElement) {
		if (parentElement instanceof Root) {
			return ((Root)parentElement).getZones().toArray();
		}
		return super.getSemanticChildren(parentElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> previousChildren = new ArrayList<Object>();
		if (parentElement instanceof PlantationPhase) {
			PlantationPhase plantationPhase = (PlantationPhase)parentElement;
			if (tagsPlantGroup == null) {
				tagsPlantGroup = new TagsPlantGroup(plantationPhase, () -> plantationPhase.getPlantations(),
						getViewer());
			}
			previousChildren.add(tagsPlantGroup);

		} else if (parentElement instanceof ISelfDescribingItem) {
			previousChildren.addAll(((ISelfDescribingItem)parentElement).getChildren());
		}

		Object[] superChildren = super.getChildren(parentElement);

		return Stream.concat(previousChildren.stream(), Stream.of(superChildren)).toArray();
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).hasChildren();
		}
		return super.hasChildren(element);
	}

}
