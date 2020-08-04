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
 * A representation of the literals of the enumeration '<em><b>Moisture</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getMoisture()
 * @model
 * @generated
 */
public enum Moisture implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Dry Soil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRY_SOIL_VALUE
	 * @generated
	 * @ordered
	 */
	DRY_SOIL(1, "DrySoil", "DrySoil"),

	/**
	 * The '<em><b>Moist Soil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOIST_SOIL_VALUE
	 * @generated
	 * @ordered
	 */
	MOIST_SOIL(2, "MoistSoil", "MoistSoil"),

	/**
	 * The '<em><b>Wet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WET_VALUE
	 * @generated
	 * @ordered
	 */
	WET(3, "Wet", "Wet"),

	/**
	 * The '<em><b>Water Plant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_PLANT_VALUE
	 * @generated
	 * @ordered
	 */
	WATER_PLANT(4, "WaterPlant", "WaterPlant"),

	/**
	 * The '<em><b>Well Drained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WELL_DRAINED_VALUE
	 * @generated
	 * @ordered
	 */
	WELL_DRAINED(5, "WellDrained", "WellDrained"),

	/**
	 * The '<em><b>Tolerate Grought</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_GROUGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOLERATE_GROUGHT(6, "TolerateGrought", "TolerateGrought");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Dry Soil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRY_SOIL
	 * @model name="DrySoil"
	 * @generated
	 * @ordered
	 */
	public static final int DRY_SOIL_VALUE = 1;

	/**
	 * The '<em><b>Moist Soil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOIST_SOIL
	 * @model name="MoistSoil"
	 * @generated
	 * @ordered
	 */
	public static final int MOIST_SOIL_VALUE = 2;

	/**
	 * The '<em><b>Wet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WET
	 * @model name="Wet"
	 * @generated
	 * @ordered
	 */
	public static final int WET_VALUE = 3;

	/**
	 * The '<em><b>Water Plant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_PLANT
	 * @model name="WaterPlant"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_PLANT_VALUE = 4;

	/**
	 * The '<em><b>Well Drained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WELL_DRAINED
	 * @model name="WellDrained"
	 * @generated
	 * @ordered
	 */
	public static final int WELL_DRAINED_VALUE = 5;

	/**
	 * The '<em><b>Tolerate Grought</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_GROUGHT
	 * @model name="TolerateGrought"
	 * @generated
	 * @ordered
	 */
	public static final int TOLERATE_GROUGHT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Moisture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Moisture[] VALUES_ARRAY = new Moisture[] {UNKNOWN, DRY_SOIL, MOIST_SOIL, WET,
			WATER_PLANT, WELL_DRAINED, TOLERATE_GROUGHT, };

	/**
	 * A public read-only list of all the '<em><b>Moisture</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Moisture> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Moisture</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Moisture get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Moisture result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Moisture</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Moisture getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Moisture result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Moisture</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Moisture get(int value) {
		switch (value) {
			case UNKNOWN_VALUE:
				return UNKNOWN;
			case DRY_SOIL_VALUE:
				return DRY_SOIL;
			case MOIST_SOIL_VALUE:
				return MOIST_SOIL;
			case WET_VALUE:
				return WET;
			case WATER_PLANT_VALUE:
				return WATER_PLANT;
			case WELL_DRAINED_VALUE:
				return WELL_DRAINED;
			case TOLERATE_GROUGHT_VALUE:
				return TOLERATE_GROUGHT;
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
	private Moisture(int value, String name, String literal) {
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

} //Moisture
