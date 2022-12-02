/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dialogs;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;

/**
 * Builds a predicated that filter genuses using some criteria
 * 
 * @author Arthur Daussy
 */
public final class PlantNamedFilter<T extends PlantNamedElement> {

	private String genusName;

	private String commonName;

	private Predicate<T> filterPredicate;

	private List<T> allSpecies;

	/**
	 * Simple constructor
	 * 
	 * @param species
	 *            all available genuses
	 */
	public PlantNamedFilter(List<T> species) {
		super();
		this.allSpecies = species;
		buildPredicate();
	}

	private void buildPredicate() {

		Predicate<String> genusPredicate = buildLocalPredicate(genusName);
		Predicate<String> commonPredicate = buildLocalPredicate(commonName);

		filterPredicate = e -> genusPredicate.test(e.getLatinName()) && commonPredicate.test(e.getName());
	}

	public List<? extends PlantNamedElement> getMatchingGenus() {
		return allSpecies.stream().filter(filterPredicate).collect(toList());
	}

	/**
	 * Builds a a predicate from a given string
	 * 
	 * @param v
	 *            filter
	 * @return a Predicate
	 */
	private Predicate<String> buildLocalPredicate(String v) {
		if (v == null) {
			return e -> true;
		} else {
			Pattern regex = Pattern.compile(v.toLowerCase());
			return e -> e == null ? false : regex.matcher(e.toLowerCase()).matches();
		}
	}

	/**
	 * Sets the filter used to filter on the genus name
	 * 
	 * @param aGenusName
	 *            the name of the genus
	 */
	public void setGenusNameFilter(String aGenusName) {
		if (Strings.isNullOrEmpty(aGenusName)) {
			this.genusName = null;
		} else {
			this.genusName = aGenusName;
		}
		buildPredicate();
	}

	/**
	 * Sets the filter used to filter on the genus common name
	 * 
	 * @param aCommonName
	 *            the filter on common name
	 */
	public void setCommonNameFilter(String aCommonName) {
		if (Strings.isNullOrEmpty(aCommonName)) {
			this.commonName = null;
		} else {
			this.commonName = aCommonName;
		}
		buildPredicate();
	}

}
