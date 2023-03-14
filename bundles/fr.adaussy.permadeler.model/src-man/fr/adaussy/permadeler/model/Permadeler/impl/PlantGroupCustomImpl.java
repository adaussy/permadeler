package fr.adaussy.permadeler.model.Permadeler.impl;

import java.util.stream.Stream;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class PlantGroupCustomImpl extends PlantGroupImpl implements PlantGroup {

	@Override
	public EList<Plant> getAllPlants() {

		return ECollections.toEList(EMFUtils.allContainedObjectOfType(this, PlantGroup.class)//
				.flatMap(g -> g.getSpecies().stream())
				.<Plant> flatMap(s -> Stream.concat(Stream.of(s), s.getVarieties().stream()))//
				.distinct()//
				.toList());
	}
}
