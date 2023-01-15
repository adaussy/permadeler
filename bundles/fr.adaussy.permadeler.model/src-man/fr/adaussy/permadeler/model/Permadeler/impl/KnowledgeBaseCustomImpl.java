package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class KnowledgeBaseCustomImpl extends KnowledgeBaseImpl {

	@Override
	public EList<Plant> getAllPlants() {
		return ECollections.asEList(EMFUtils.allContainedObjectOfType(this, Plant.class).toList());
	}
}
