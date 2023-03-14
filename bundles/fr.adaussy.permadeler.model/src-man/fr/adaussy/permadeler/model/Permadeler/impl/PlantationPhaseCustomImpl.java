package fr.adaussy.permadeler.model.Permadeler.impl;

import static java.util.stream.Collectors.toList;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Plant;

public class PlantationPhaseCustomImpl extends PlantationPhaseImpl {

	@Override
	public EList<Plant> getAllPlants() {
		return ECollections.toEList(getPlantations().stream()//
				.filter(p -> p.getType() != null)//
				.distinct()//
				.map(p -> p.getType())//
				.collect(toList()));
	}
}
