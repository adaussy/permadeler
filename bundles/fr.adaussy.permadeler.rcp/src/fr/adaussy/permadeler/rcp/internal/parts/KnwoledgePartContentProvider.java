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

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;
import fr.adaussy.permadeler.rcp.internal.utils.LayerPlantGroup;
import fr.adaussy.permadeler.rcp.internal.utils.TagsPlantGroup;

public class KnwoledgePartContentProvider extends ModelContentProvider {

	public KnwoledgePartContentProvider(Session session, ITreeContentProvider semanticContentProvider) {
		super(session, semanticContentProvider);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> previousChildren = new ArrayList<Object>();
		if (parentElement instanceof KnowledgeBase) {
			KnowledgeBase knowledgeBase = (KnowledgeBase)parentElement;

			TagsPlantGroup tagsPlantGroup = EMFUtils.getAdapter(knowledgeBase, TagsPlantGroup.class)
					.orElseGet(() -> createTagAdapter(knowledgeBase));
			previousChildren.add(tagsPlantGroup);

			@SuppressWarnings("unchecked")
			LayerPlantGroup<Zone> layerPlantGroup = EMFUtils.getAdapter(knowledgeBase, LayerPlantGroup.class)
					.orElseGet(() -> createLayerAdapter(knowledgeBase));

			previousChildren.add(layerPlantGroup);

		} else if (parentElement instanceof ISelfDescribingItem) {
			previousChildren.addAll(((ISelfDescribingItem)parentElement).getChildren());
		}

		Object[] superChildren = super.getChildren(parentElement);

		return Stream.concat(previousChildren.stream(), Stream.of(superChildren)).toArray();
	}

	private LayerPlantGroup<KnowledgeBase> createLayerAdapter(KnowledgeBase knowledgeBase) {
		LayerPlantGroup<KnowledgeBase> adapter = new LayerPlantGroup<KnowledgeBase>(knowledgeBase,
				getViewer(), PermadelerPackage.eINSTANCE.getSpecies_DefaultLayer(),
				base -> computeLayerGroup(base));
		knowledgeBase.eAdapters().add(adapter);
		return adapter;
	}

	private TagsPlantGroup createTagAdapter(KnowledgeBase knowledgeBase) {
		TagsPlantGroup adapter = new TagsPlantGroup(knowledgeBase, getViewer(),
				() -> knowledgeBase.getAllPlants());
		knowledgeBase.eAdapters().add(adapter);
		return adapter;
	}

	private List<Pair<Layer, List<EObject>>> computeLayerGroup(KnowledgeBase base) {
		Map<Layer, List<EObject>> groupByTag = new LinkedHashMap<Layer, List<EObject>>();
		for (Species species : base.getSpecies()) {
			groupByTag.computeIfAbsent(species.getDefaultLayer(), k -> new ArrayList<EObject>()).add(species);
		}
		return groupByTag.entrySet().stream().sorted(Comparator.comparing(Entry::getKey))//
				.map(entry -> Tuples.pair(entry.getKey(), entry.getValue()))//
				.toList();
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).getParent();
		}
		return super.getParent(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).hasChildren();
		}
		return super.hasChildren(element);
	}

}
