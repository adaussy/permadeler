package fr.adaussy.permadeler.model.design.services;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Before;
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

public class ValidationServiceTest {

	private static final PermadelerFactory sFactory = PermadelerFactory.eINSTANCE;

	private static final int nbPlantations = 3;

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
	 * Initialize an area with no plantations and initialize genus, species and plantations variables for all
	 * the tests
	 */
	@Before
	public void initTest() {
		Arrays.setAll(genuses, e -> sFactory.createGenus());
		Arrays.setAll(species, e -> sFactory.createPlant());
		Arrays.setAll(plantations, e -> sFactory.createPlantation());

		// create 3 genuses with the first 3 families available
		IntStream.range(0, genuses.length).forEach(i -> genuses[i].setFamily(Family.values()[i]));

		planting.getAreas().add(area);
		zone.getPlantings().add(planting);
		root.getZones().add(zone);
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
		knowledgeBase.setCompatibilityMatrix(compatibilityMatrix);

		root.setSeedLib(knowledgeBase);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 3 plantations among which 2 have negative affinity link
	 */
	@Test
	public void validatePlantationCompatibilityIncompatible() {
		createKnowledgeBase();
		createPlantations();
		plantPlantations(plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == false);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with positive affinity link
	 */
	@Test
	public void validatePlantationCompatibilityCompatible() {
		createKnowledgeBase();
		createPlantations();
		plantPlantations(new Plantation[] {plantations[0], plantations[2] });

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with no compatibility link in knowledge base
	 */
	@Test
	public void validatePlantationCompatibilityNoLink() {
		createKnowledgeBase();
		createPlantations();
		plantPlantations(new Plantation[] {plantations[1], plantations[2] });

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain 2 plantations with no genuses
	 */
	@Test
	public void validatePlantationCompatibilityNoGenus() {
		createKnowledgeBase();
		plantPlantations(plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: validate an area
	 * which contain no plantations
	 */
	@Test
	public void validatePlantationCompatibilityNoPlantation() {
		createKnowledgeBase();
		createPlantations();

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == true);
	}

	/**
	 * Test for the service {@link ValidationService#validatePlantationCompatibility(Area)}: case with no
	 * existing knowledge base
	 */
	@Test
	public void validatePlantationCompatibilityNoCompatibilityMatrix() {
		createPlantations();
		plantPlantations(plantations);

		boolean validation = ValidationService.validatePlantationCompatibility(area);
		assertTrue(validation == true);
	}

}
