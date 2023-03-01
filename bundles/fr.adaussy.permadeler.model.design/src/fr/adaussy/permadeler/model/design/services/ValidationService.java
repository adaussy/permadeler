package fr.adaussy.permadeler.model.design.services;

import java.util.List;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class ValidationService {

	public boolean validateUniqueLatinName(Plant plant) {
		String latinName = plant.getFullLatinName();
		if (latinName != null && !latinName.isBlank()) {

			List<Plant> dupplicates = getDupplicated(plant, latinName.toLowerCase());
			if (!dupplicates.isEmpty()) {
				return false;
			}
		}

		return true;
	}

	private List<Plant> getDupplicated(Plant plant, String latinName) {
		KnowledgeBase knowledgeBase = EMFUtils.getAncestor(KnowledgeBase.class, plant);
		List<Plant> dupplicates = EMFUtils.allContainedObjectOfType(knowledgeBase, Plant.class)//
				.filter(p -> plant != p && latinName.equalsIgnoreCase(p.getFullLatinName()))//
				.toList();
		return dupplicates;
	}

}
