/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Lucas Chaigne - initial API and implementation.
 ******************************************************************************/

package fr.adaussy.permadeler.model.design.services;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Test;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Planting;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Zone;

/**
 * Tests for the service {@link ValidationService}
 */
public class ValidationServiceTest {

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 3 plantations among which 2 have negative affinity link
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWith2IncompatGenuses() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createKnowledgeBase();
		inputModel.createPlantations();
		inputModel.plantPlantations(inputModel.plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == false);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with positive affinity link
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWith2CompatGenuses() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createKnowledgeBase();
		inputModel.createPlantations();
		inputModel.plantPlantations(new Plantation[] {inputModel.plantations[0], inputModel.plantations[2] });

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with no compatibility link in knowledge base
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWith2UnlinkGenuses() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createKnowledgeBase();
		inputModel.createPlantations();
		inputModel.plantPlantations(new Plantation[] {inputModel.plantations[1], inputModel.plantations[2] });

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with no genuses
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWithNoGenusPlantations() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createKnowledgeBase();
		inputModel.plantPlantations(inputModel.plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain no plantations
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWithNoPlantationArea() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createKnowledgeBase();
		inputModel.createPlantations();

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService}: case with no existing knowledge base
	 */
	@Test
	public void checkValidatePlantationCompatibiltyWithNoCompatibilityMatrix() {
		InputModelHelper inputModel = new InputModelHelper();
		inputModel.initTest();

		inputModel.createPlantations();
		inputModel.plantPlantations(inputModel.plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(inputModel.area);
		assertTrue(validation == true);
	}

	/**
	 * Variables and methods used in ValidationServiceTest
	 */
	private static class InputModelHelper {
		private final static PermadelerFactory sFactory = PermadelerFactory.eINSTANCE;

		private final static int nbPlantations = 3;

		private Root root = sFactory.createRoot();

		private Zone zone = sFactory.createZone();

		private Planting planting = sFactory.createPlanting();

		private Area area = sFactory.createArea();

		private Genus[] genuses = new Genus[nbPlantations];

		private Species[] species = new Species[nbPlantations];

		private Plantation[] plantations = new Plantation[nbPlantations];

		private CompatibilityMatrix compatibilityMatrix = sFactory.createCompatibilityMatrix();

		private CompatibilityLink compatibilityLinkOne = sFactory.createCompatibilityLink();

		private CompatibilityLink compatibilityLinkTwo = sFactory.createCompatibilityLink();

		private KnowledgeBase knowledgeBase = sFactory.createKnowledgeBase();

		/**
		 * Initialize an area with no plantations and initialize genus, species and plantations variables for
		 * all the tests
		 */
		public void initTest() {
			Arrays.setAll(genuses, e -> sFactory.createGenus());
			Arrays.setAll(species, e -> sFactory.createPlant());
			Arrays.setAll(plantations, e -> sFactory.createPlantation());

			// create 3 genuses with the first 3 families available
			IntStream.range(0, genuses.length).forEach(i -> genuses[i].setFamily(Family.values()[i]));

			planting.getAreas().add(area);
			zone.getPlantings().add(planting);
			root.getZones().add(zone);
			knowledgeBase.setCompatibilityMatrix(compatibilityMatrix);
			root.setSeedLib(knowledgeBase);
		}

		/**
		 * Assign a genus to each species and a species to each plantation
		 */
		private void createPlantations() {
			IntStream.range(0, species.length).forEach(i -> species[i].setType(genuses[i]));
			IntStream.range(0, plantations.length).forEach(i -> plantations[i].setType(species[i]));
		}

		/**
		 * Plant wanted plantations in the test area
		 */
		private void plantPlantations(Plantation[] plantations) {
			Arrays.stream(plantations).forEach(p -> area.getPlantations().add(p));
		}

		/**
		 * create a test knowledge base with 2 compatibilities: one with positive affinity, one with negative
		 */
		private void createKnowledgeBase() {
			compatibilityLinkOne.getSpecies().add(genuses[0]);
			compatibilityLinkOne.getSpecies().add(genuses[1]);
			compatibilityLinkOne.setAffinity(-1);

			compatibilityLinkTwo.getSpecies().add(genuses[0]);
			compatibilityLinkTwo.getSpecies().add(genuses[2]);
			compatibilityLinkTwo.setAffinity(1);

			compatibilityMatrix.getCompatibilties().add(compatibilityLinkOne);
			compatibilityMatrix.getCompatibilties().add(compatibilityLinkTwo);
		}

	}
}
