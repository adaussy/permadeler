/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.Permadeler.impl;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.common.date.DateUtils;

/**
 * Custom implementation of SpeciesImpl
 * 
 * @author Arthur Daussy
 */
public class SpeciesCustomImpl extends SpeciesImpl {

	@Override
	public EList<Integer> getFruitsAvailability() {
		List<Integer> result = getProductiveMonths().stream()
				.mapToInt(i -> i.intValue())
				.flatMap(it -> IntStream.range(it, it + getFruitConservation() + 1))//
				.map(i -> i % (DateUtils.NB_OF_QUARTER * DateUtils.NB_OF_MONTHS))
				.distinct()
				.boxed()
				.collect(toList());

		return new BasicEList<>(result);
	}
}
