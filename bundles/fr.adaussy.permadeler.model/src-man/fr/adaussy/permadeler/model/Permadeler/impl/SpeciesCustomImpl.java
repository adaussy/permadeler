package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerSemanticUtils;

public class SpeciesCustomImpl extends SpeciesImpl {
	@Override
	public String getFullLatinName() {
		String genusName = getGenus() != null ? getGenus() : ""; //$NON-NLS-1$
		String speciesName = getSpecies() != null ? getSpecies() : ""; //$NON-NLS-1$
		return genusName + " " + speciesName; //$NON-NLS-1$
	}

	@Override
	public String getRepresentation() {
		String key = getRepresentationKey();
		if (key == null) {
			return "/icons/representations/arbre2/green1.png"; //$NON-NLS-1$
		}
		return key;
	}

	@Override
	public String getEffectiveIconKey() {
		return getIconKey();
	}

	@Override
	public String getEffectiveRepresentationKey() {
		return getRepresentationKey();
	}

	@Override
	public EList<Action> getAllActions() {
		return getActions();
	}

	@Override
	public EList<SpecialUses> getAllSpecialUses() {
		return getSpecialUses();
	}

	@Override
	public EList<Production> getAllProductions() {
		return getProductions();
	}

	@Override
	public EList<Plantation> getPlantations() {
		return ECollections.asEList(PermadelerSemanticUtils.getPlantations(this));
	}
}
