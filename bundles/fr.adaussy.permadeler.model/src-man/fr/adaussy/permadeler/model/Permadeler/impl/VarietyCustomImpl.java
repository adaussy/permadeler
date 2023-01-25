package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;

public class VarietyCustomImpl extends VarietyImpl {

	@Override
	public String getFullLatinName() {
		return getSpecies().getGenus() + " " + getSpecies().getSpecies() + " '" + getVariety() + "'"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public EList<Production> getProductions() {
		EList<Production> customProduction = ECollections.newBasicEList(getCustomProductions());
		getSpecies().getProductions().stream().filter(p -> !containSameCustomProd(p))
				.forEach(customProduction::add);
		return customProduction;
	}

	private boolean containSameCustomProd(Production prod) {
		return getCustomProductions().stream().anyMatch(p -> p.getType() == prod.getType());
	}

	@Override
	public Layer getDefaultLayer() {
		return getSpecies().getDefaultLayer();
	}

	@Override
	public RepresentationKind getDefaultRepresentationKind() {
		return getSpecies().getDefaultRepresentationKind();
	}

	@Override
	public String getRepresentation() {
		String key = getRepresentationKey();
		if (key == null) {
			return getSpecies().getRepresentation();
		}
		return key;
	}

	@Override
	public EList<Action> getAllActions() {
		EList<Action> customActions = ECollections.newBasicEList(getActions());
		getSpecies().getActions().stream().filter(p -> !containSameCustomAction(p))
				.forEach(customActions::add);
		return customActions;
	}

	private boolean containSameCustomAction(Action action) {
		return getActions().stream().anyMatch(p -> p.getType() == action.getType());
	}
}
