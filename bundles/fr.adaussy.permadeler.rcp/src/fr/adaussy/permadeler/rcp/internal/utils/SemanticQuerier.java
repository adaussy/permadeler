/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.utils;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.business.api.session.Session;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class SemanticQuerier {

	private <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType, EReference ref) {
		Optional<Session> optSession = Session.of(source);
		return optSession
				.map(session -> session.getSemanticCrossReferencer().getInverseReferences(source, ref, true)
						.stream().filter(s -> expectedType.isInstance(s.getEObject()))
						.map(s -> expectedType.cast(s.getEObject())).toList())
				.orElse(List.of());
	}

	public Object getMostUsedFeatureValue(Plant p, EAttribute feature, Object defaultValue) {
		List<Plant> sameSpecies = getSameSpecies(p);
		return getMostUseFeatureValue(sameSpecies, feature, defaultValue);
	}

	private Object getMostUseFeatureValue(List<? extends EObject> existingPlantations, EAttribute feature,
			Object defaultValue) {
		Map<Object, Long> byCount = existingPlantations.stream().filter(e -> isSet(e, feature))
				.collect(Collectors.groupingBy(p -> p.eGet(feature), Collectors.counting()));
		return byCount.entrySet().stream().max(Comparator.comparing(Entry::getValue)).map(Entry::getKey)
				.orElse(defaultValue);
	}

	private boolean isSet(EObject e, EAttribute attr) {
		Object value = e.eGet(attr);
		if (attr.isMany()) {
			return !((List<?>)value).isEmpty();
		} else {
			return e.eGet(attr) != null;
		}
	}

	public Layer getMostUsedLayer(Plant p, Layer defaultValue) {
		// Look for plantation

		List<Plantation> existingPlantations = getPlantation(p);
		if (existingPlantations.isEmpty()) {
			// Look for other plantation of the same genus
			existingPlantations = getSameSpecies(p).stream().flatMap(pl -> getPlantation(p).stream())
					.toList();
		}
		return (Layer)getMostUseFeatureValue(existingPlantations,
				PermadelerPackage.eINSTANCE.getPlantation_CurrentLayer(), defaultValue);

	}

	public RepresentationKind getMostUsedRepresentationKind(Plant p, RepresentationKind defaultValue) {
		// Look for plantation

		List<Plantation> existingPlantations = getPlantation(p);
		if (existingPlantations.isEmpty()) {
			// Look for other plantation of the same genus
			existingPlantations = getSameSpecies(p).stream().flatMap(pl -> getPlantation(p).stream())
					.toList();
		}
		return (RepresentationKind)getMostUseFeatureValue(existingPlantations,
				PermadelerPackage.eINSTANCE.getPlantation_RepresentationKind(), defaultValue);

	}

	protected List<Plantation> getPlantation(Plant p) {
		return getInverse(p, Plantation.class, PermadelerPackage.eINSTANCE.getPlantation_Type());
	}

	public List<Plant> getSameSpecies(Plant p) {
		String genus = p.getGenus();
		if (Strings.isNullOrEmpty(genus)) {
			return List.of();
		}
		String species = p.getSpecies();
		boolean hasSpecies = !Strings.isNullOrEmpty(genus);

		Predicate<Plant> pred = plant -> genus.equalsIgnoreCase(plant.getGenus())
				&& (!hasSpecies || species.equalsIgnoreCase(plant.getSpecies()));
		return EMFUtils.getAncestor(KnowledgeBase.class, p).getPlantTypes().stream().filter(pred)
				.collect(toList());
	}

}
