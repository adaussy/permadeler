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

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;

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
				Plant type = seddItem.getType();
				if (type == null || type.getName() == null) {
					return ""; //$NON-NLS-1$
				} else {
					return type.getName();
				}
			}));

	public static <T extends PlantNamedElement> Comparator<T> buildComparator() {
		return Comparator.nullsLast(Comparator.<PlantNamedElement, String> comparing(s -> {
			if (s == null || s.getName() == null) {
				return ""; //$NON-NLS-1$
			} else {
				return s.getName();
			}
		}));
	}

}
