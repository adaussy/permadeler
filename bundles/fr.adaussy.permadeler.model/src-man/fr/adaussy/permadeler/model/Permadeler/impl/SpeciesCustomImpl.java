package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Action;

public class SpeciesCustomImpl extends SpeciesImpl {
	@Override
	public String getFullLatinName() {
		return getGenus() + " " + getSpecies(); //$NON-NLS-1$
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
	public EList<Action> getAllActions() {
		return getActions();
	}
}
