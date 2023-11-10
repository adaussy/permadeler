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
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;
import fr.adaussy.permadeler.rcp.internal.utils.LayerPlantGroup;
import fr.adaussy.permadeler.rcp.internal.utils.TagsPlantGroup;

public class PlantationContentProvider extends ModelContentProvider {

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

			TagsPlantGroup tagsPlantGroup = EMFUtils.getAdapter(plantationPhase, TagsPlantGroup.class)
					.orElseGet(() -> {
						TagsPlantGroup adapter = new TagsPlantGroup(plantationPhase, getViewer(),
								() -> plantationPhase.getPlantations());
						plantationPhase.eAdapters().add(adapter);
						return adapter;
					});

			previousChildren.add(tagsPlantGroup);

			@SuppressWarnings("unchecked")
			LayerPlantGroup<PlantationPhase> layerPlantGroup = EMFUtils
					.getAdapter(plantationPhase, LayerPlantGroup.class).orElseGet(() -> {
						LayerPlantGroup<PlantationPhase> adapter = new LayerPlantGroup<PlantationPhase>(
								plantationPhase, getViewer(),
								PermadelerPackage.eINSTANCE.getPlantation_CurrentLayer(),
								base -> computeLayerGroups(base));
						plantationPhase.eAdapters().add(adapter);
						return adapter;
					});

			previousChildren.add(layerPlantGroup);

		} else if (parentElement instanceof ISelfDescribingItem) {
			previousChildren.addAll(((ISelfDescribingItem)parentElement).getChildren());
		}

		Object[] superChildren = super.getChildren(parentElement);

		return Stream.concat(previousChildren.stream(), Stream.of(superChildren)).toArray();
	}

	private List<Pair<Layer, List<EObject>>> computeLayerGroups(PlantationPhase base) {
		Map<Layer, List<EObject>> groupByTag = new LinkedHashMap<Layer, List<EObject>>();
		for (Plantation plantation : base.getPlantations()) {
			groupByTag.computeIfAbsent(plantation.getCurrentLayer(), k -> new ArrayList<EObject>())
					.add(plantation);
		}
		return groupByTag.entrySet().stream().sorted(Comparator.comparing(Entry::getKey))//
				.map(entry -> Tuples.pair(entry.getKey(), entry.getValue()))//
				.toList();
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).hasChildren();
		}
		return super.hasChildren(element);
	}

}
