/**
 *  Copyright (c) 2020 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.model.utils;

import java.util.Comparator;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.Species;

/**
 * Class taht gathers compartors
 * 
 * @author Arthur Daussy
 */
public class Comparators {

	/**
	 * Comparator used to order {@link SeedItem}
	 */
	public static final Comparator<SeedItem> SEED_ITEM_CMP = Comparator
			.nullsLast(Comparator.<SeedItem, String> comparing(seddItem -> {
				Species type = seddItem.getType();
				if (type == null || type.getName() == null) {
					return "";
				} else {
					return type.getName();
				}
			}));

	/**
	 * Comparator used to order {@link Species}
	 */
	public static final Comparator<Species> SPECIES_CMP = Comparator
			.nullsLast(Comparator.<Species, String> comparing(s -> {
				if (s == null || s.getName() == null) {
					return "";
				} else {
					return s.getName();
				}
			}));

	/**
	 * Comparator used to order {@link Genus}
	 */
	public static final Comparator<Genus> GENUS_CMP = Comparator
			.nullsLast(Comparator.<Genus, String> comparing(s -> {
				if (s == null || s.getName() == null) {
					return "";
				} else {
					return s.getName();
				}
			}));
}
