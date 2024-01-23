/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dnd;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerSwitch;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.utils.SpeciesMerger;
import fr.adaussy.permadeler.rcp.internal.utils.TagOwnerGroup;

public class DnDHandler {

	private final PermadelerSession session;

	private final Object[] dropedElements;

	private Supplier<Shell> shellProvider;

	private Handler dropHandler = new Handler();

	public DnDHandler(PermadelerSession session, Supplier<Shell> shellProvider, Object[] dropedElements) {
		super();
		this.session = session;
		this.shellProvider = shellProvider;
		this.dropedElements = dropedElements;
	}

	public DnDResult doDrop(Object target) {
		final DnDResult result;
		if (target instanceof EObject targetEObject) {
			result = dropHandler.doSwitch(targetEObject);
		} else if (target instanceof TagOwnerGroup tagOwner) {
			result = handleDropOnTagOwner(tagOwner);
		} else {
			result = DnDResult.NOTHING;
		}

		return result;
	}

	private DnDResult handleDropOnTagOwner(TagOwnerGroup tagOwner) {
		final DnDResult result;
		List<TaggedElement> taggedElements = Stream.of(dropedElements).filter(e -> e instanceof TaggedElement)
				.map(e -> ((TaggedElement)e)).toList();
		String tag = tagOwner.getTag();

		if (!taggedElements.isEmpty()) {
			session.modifyKnowledgeBase("Ajout d'un tag", b -> {
				taggedElements.forEach(t -> t.getTags().add(tag));
			});
			result = DnDResult.OK;
		} else {
			result = DnDResult.NOTHING;
		}
		return result;
	}

	private class Handler extends PermadelerSwitch<DnDResult> {

		private DnDResult addToGroup(Object[] dropedElements, PlantGroup targetGroup) {
			List<Species> droppedSpecies = Stream.of(dropedElements)//
					.filter(e -> e instanceof Species).map(e -> ((Species)e))//
					.toList();

			if (!droppedSpecies.isEmpty()) {
				session.modify("Ajout d'un group", () -> {
					targetGroup.getSpecies().addAll(droppedSpecies);
				});
				return DnDResult.OK;
			}
			return null;
		}

		@Override
		public DnDResult casePlantGroup(PlantGroup targetGroup) {
			return addToGroup(dropedElements, targetGroup);
		}

		@Override
		public DnDResult caseZone(Zone targetZone) {

			List<Plantation> dropPlantations = Stream.of(dropedElements)//
					.filter(e -> e instanceof Plantation)//
					.map(e -> (Plantation)e).toList();
			if (!dropPlantations.isEmpty()) {
				session.modifyKnowledgeBase("Changement de zone", b -> {
					targetZone.getPlantations().addAll(dropPlantations);
				});
				return DnDResult.OK;
			}

			return null;

		}

		@Override
		public DnDResult caseSpecies(Species species) {
			List<Variety> varieties = Stream.of(dropedElements).filter(e -> e instanceof Variety)
					.map(e -> (Variety)e).toList();

			if (!varieties.isEmpty()) {
				moveVarieties(species, varieties);
				return DnDResult.OK;
			}

			String targetLatinName = species.getFullLatinName();
			if (targetLatinName != null) {
				List<Species> speciesToMerge = Stream.of(dropedElements)
						.filter(e -> e instanceof Species dSpecies
								&& targetLatinName.equalsIgnoreCase(dSpecies.getFullLatinName()))
						.map(e -> (Species)e).toList();

				if (!speciesToMerge.isEmpty()) {
					return mergeSpecies(species, speciesToMerge);

				}
			}

			return null;
		}

		@Override
		public DnDResult defaultCase(EObject object) {
			return DnDResult.NOTHING;
		}

		private DnDResult mergeSpecies(Species species, List<Species> speciesToMerge) {
			if (MessageDialog.openConfirm(shellProvider.get(), "Fusion?",
					"Voulez vous fusionner ces especes?")) {
				session.modify("Fusion d'espece", () -> {
					SpeciesMerger merger = new SpeciesMerger(session, species);
					for (Species toMerge : speciesToMerge) {
						merger.merge(toMerge);
					}
				});
				return DnDResult.OK;
			}
			return null;
		}

		private void moveVarieties(Species species, List<Variety> varieties) {
			session.modify("Deplacement de varieté", () -> species.getVarieties().addAll(varieties));
		}

	}

}
