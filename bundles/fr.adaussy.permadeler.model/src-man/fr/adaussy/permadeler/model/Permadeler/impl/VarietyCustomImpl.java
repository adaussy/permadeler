package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerSemanticUtils;

public class VarietyCustomImpl extends VarietyImpl {

	@Override
	public String getFullLatinName() {
		boolean hasVariety = getVariety() != null;
		String vari = hasVariety ? getVariety() : "";
		return getSpecies().getFullLatinName() + (hasVariety ? " '" + vari + "'" : ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public EList<Production> getAllProductions() {
		EList<Production> customProduction = ECollections.newBasicEList(getProductions());
		getSpecies().getProductions().stream().filter(p -> !containSameCustomProd(p))
				.forEach(customProduction::add);
		return customProduction;
	}

	private boolean containSameCustomProd(Production prod) {
		return getProductions().stream().anyMatch(p -> p.getType() == prod.getType());
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
	public Lifecycle getLifeCycle() {
		return getSpecies().getLifeCycle();
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

	@Override
	public EList<SpecialUses> getAllSpecialUses() {
		return getSpecies().getSpecialUses();
	}

	@Override
	public String getEffectiveIconKey() {
		String key = getIconKey();
		if (key != null) {
			return key;
		}
		return getSpecies().getEffectiveIconKey();
	}

	@Override
	public String getEffectiveRepresentationKey() {
		String key = getRepresentationKey();
		if (key != null) {
			return key;
		}
		return getSpecies().getEffectiveRepresentationKey();
	}

	@Override
	public EList<Plantation> getPlantations() {
		return ECollections.asEList(PermadelerSemanticUtils.getPlantations(this));
	}
}
