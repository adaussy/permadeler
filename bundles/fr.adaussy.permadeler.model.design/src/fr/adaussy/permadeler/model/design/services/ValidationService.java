package fr.adaussy.permadeler.model.design.services;

import java.util.regex.Pattern;

import fr.adaussy.permadeler.model.Permadeler.Plant;

public class ValidationService {

	private static Pattern VALID_LATING_NAME_PATTERN = Pattern.compile(
			"(?<genus>[A-Z][-a-z0-9\\p{IsLatin}]*)(\\s(?<species>[-a-z0-9\\p{IsLatin}\\s]*))?(\\s'(?<variety>['-a-z0-9\\p{IsLatin}\\s]*)')?"); //$NON-NLS-1$

	public static boolean hasValidLatinName(Plant plant) {
		String latinName = plant.getLatinName();
		if (latinName == null || latinName.isBlank()) {
			return false;
		}
		return VALID_LATING_NAME_PATTERN.matcher(latinName).matches();
	}

}
