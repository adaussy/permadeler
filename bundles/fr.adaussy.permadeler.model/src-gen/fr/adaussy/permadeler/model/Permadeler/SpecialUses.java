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
package fr.adaussy.permadeler.model.Permadeler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Special Uses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecialUses()
 * @model
 * @generated
 */
public enum SpecialUses implements Enumerator {
	/**
	 * The '<em><b>Nitrogen Fixer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NITROGEN_FIXER_VALUE
	 * @generated
	 * @ordered
	 */
	NITROGEN_FIXER(0, "NitrogenFixer", "NitrogenFixer"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Scented Plants</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCENTED_PLANTS_VALUE
	 * @generated
	 * @ordered
	 */
	SCENTED_PLANTS(1, "ScentedPlants", "ScentedPlants"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Food Forest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOD_FOREST_VALUE
	 * @generated
	 * @ordered
	 */
	FOOD_FOREST(2, "FoodForest", "FoodForest"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Cardon Farming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDON_FARMING_VALUE
	 * @generated
	 * @ordered
	 */
	CARDON_FARMING(3, "CardonFarming", "CardonFarming"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Attracts Wildlife</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRACTS_WILDLIFE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRACTS_WILDLIFE(4, "AttractsWildlife", "AttractsWildlife"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Hedge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	HEDGE(5, "Hedge", "Hedge"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Dynamic Accumulator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_ACCUMULATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_ACCUMULATOR(6, "DynamicAccumulator", "DynamicAccumulator"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Ground Cover</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_COVER_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND_COVER(7, "GroundCover", "GroundCover"), //$NON-NLS-1$ //$NON-NLS-2$
	/**
	 * The '<em><b>Biomass Production</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BIOMASS_PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	BIOMASS_PRODUCTION(8, "BiomassProduction", "BiomassProduction"),
	/**
	 * The '<em><b>Honey Plant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HONEY_PLANT_VALUE
	 * @generated
	 * @ordered
	 */
	HONEY_PLANT(9, "HoneyPlant", "HoneyPlant"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Nitrogen Fixer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NITROGEN_FIXER
	 * @model name="NitrogenFixer"
	 * @generated
	 * @ordered
	 */
	public static final int NITROGEN_FIXER_VALUE = 0;

	/**
	 * The '<em><b>Scented Plants</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCENTED_PLANTS
	 * @model name="ScentedPlants"
	 * @generated
	 * @ordered
	 */
	public static final int SCENTED_PLANTS_VALUE = 1;

	/**
	 * The '<em><b>Food Forest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOD_FOREST
	 * @model name="FoodForest"
	 * @generated
	 * @ordered
	 */
	public static final int FOOD_FOREST_VALUE = 2;

	/**
	 * The '<em><b>Cardon Farming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDON_FARMING
	 * @model name="CardonFarming"
	 * @generated
	 * @ordered
	 */
	public static final int CARDON_FARMING_VALUE = 3;

	/**
	 * The '<em><b>Attracts Wildlife</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRACTS_WILDLIFE
	 * @model name="AttractsWildlife"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRACTS_WILDLIFE_VALUE = 4;

	/**
	 * The '<em><b>Hedge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEDGE
	 * @model name="Hedge"
	 * @generated
	 * @ordered
	 */
	public static final int HEDGE_VALUE = 5;

	/**
	 * The '<em><b>Dynamic Accumulator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_ACCUMULATOR
	 * @model name="DynamicAccumulator"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_ACCUMULATOR_VALUE = 6;

	/**
	 * The '<em><b>Ground Cover</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_COVER
	 * @model name="GroundCover"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_COVER_VALUE = 7;

	/**
	 * The '<em><b>Biomass Production</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMASS_PRODUCTION
	 * @model name="BiomassProduction"
	 * @generated
	 * @ordered
	 */
	public static final int BIOMASS_PRODUCTION_VALUE = 8;

	/**
	 * The '<em><b>Honey Plant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HONEY_PLANT
	 * @model name="HoneyPlant"
	 * @generated
	 * @ordered
	 */
	public static final int HONEY_PLANT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Special Uses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecialUses[] VALUES_ARRAY = new SpecialUses[] {NITROGEN_FIXER, SCENTED_PLANTS,
			FOOD_FOREST, CARDON_FARMING, ATTRACTS_WILDLIFE, HEDGE, DYNAMIC_ACCUMULATOR, GROUND_COVER,
			BIOMASS_PRODUCTION, HONEY_PLANT, };

	/**
	 * A public read-only list of all the '<em><b>Special Uses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecialUses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Special Uses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialUses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialUses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Uses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialUses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialUses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Uses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialUses get(int value) {
		switch (value) {
			case NITROGEN_FIXER_VALUE:
				return NITROGEN_FIXER;
			case SCENTED_PLANTS_VALUE:
				return SCENTED_PLANTS;
			case FOOD_FOREST_VALUE:
				return FOOD_FOREST;
			case CARDON_FARMING_VALUE:
				return CARDON_FARMING;
			case ATTRACTS_WILDLIFE_VALUE:
				return ATTRACTS_WILDLIFE;
			case HEDGE_VALUE:
				return HEDGE;
			case DYNAMIC_ACCUMULATOR_VALUE:
				return DYNAMIC_ACCUMULATOR;
			case GROUND_COVER_VALUE:
				return GROUND_COVER;
			case BIOMASS_PRODUCTION_VALUE:
				return BIOMASS_PRODUCTION;
			case HONEY_PLANT_VALUE:
				return HONEY_PLANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SpecialUses(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SpecialUses
