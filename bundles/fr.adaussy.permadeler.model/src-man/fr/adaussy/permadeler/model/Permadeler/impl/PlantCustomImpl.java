package fr.adaussy.permadeler.model.Permadeler.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlantCustomImpl extends PlantImpl {

	private static Pattern LATIN_NAME_NICER_PARTTERN = Pattern.compile(
			"(?<genus>[a-z0-9\\p{IsLatin}]*)\\s(?<species>[a-zA-Z0-9\\p{IsLatin}\\s]*)?(\\s'(?<variety>[a-zA-Z0-9]*)')?"); //$NON-NLS-1$

	private String genus;

	private String species;

	private String variety;

	@Override
	public void setLatinName(String newLatinName) {
		if (newLatinName != null && !newLatinName.isBlank()) {
			Matcher matcher = LATIN_NAME_NICER_PARTTERN.matcher(newLatinName);
			if (matcher.matches()) {
				genus = matcher.group("genus"); //$NON-NLS-1$
				if (genus != null && !genus.isBlank()) {
					genus = Character.toUpperCase(genus.charAt(0)) + genus.substring(1);
				}
				species = matcher.group("species"); //$NON-NLS-1$
				if (species != null && !species.isBlank()) {
					species = species.toLowerCase();
				}
				variety = matcher.group("variety"); //$NON-NLS-1$
			}
		}

		super.setLatinName(newLatinName);
	}

	@Override
	public String getGenus() {
		return genus;
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public String getVariety() {
		return variety;
	}

}
