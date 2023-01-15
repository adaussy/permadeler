package fr.adaussy.permadeler.model.Permadeler.impl;

public class SpeciesCustomImpl extends SpeciesImpl {
	@Override
	public String getFullLatinName() {
		return getGenus() + " " + getSpecies(); //$NON-NLS-1$
	}
}
