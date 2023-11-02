package fr.adaussy.permadeler.rcp.internal.parts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.rcp.internal.provider.ISelfDescribingItem;
import fr.adaussy.permadeler.rcp.internal.utils.LayerPlantGroup;
import fr.adaussy.permadeler.rcp.internal.utils.TagsPlantGroup;

public class KnwoledgePartContentProvider extends ModelContentProvider {

	private TagsPlantGroup tagsPlantGroup;

	private LayerPlantGroup layerPlantGroup;

	public KnwoledgePartContentProvider(Session session, ITreeContentProvider semanticContentProvider) {
		super(session, semanticContentProvider);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> previousChildren = new ArrayList<Object>();
		if (parentElement instanceof KnowledgeBase) {
			KnowledgeBase knowledgeBase = (KnowledgeBase)parentElement;
			if (tagsPlantGroup == null) {
				tagsPlantGroup = new TagsPlantGroup(knowledgeBase, () -> knowledgeBase.getAllPlants(),
						getViewer());
			}
			previousChildren.add(tagsPlantGroup);
			if (layerPlantGroup == null) {
				layerPlantGroup = new LayerPlantGroup(knowledgeBase, getViewer());
			}
			previousChildren.add(layerPlantGroup);

		} else if (parentElement instanceof ISelfDescribingItem) {
			previousChildren.addAll(((ISelfDescribingItem)parentElement).getChildren());
		}

		Object[] superChildren = super.getChildren(parentElement);

		return Stream.concat(previousChildren.stream(), Stream.of(superChildren)).toArray();
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

	@Override
	public void dispose() {
		super.dispose();
		if (tagsPlantGroup != null) {
			tagsPlantGroup.dispose();
		}
	}

}
