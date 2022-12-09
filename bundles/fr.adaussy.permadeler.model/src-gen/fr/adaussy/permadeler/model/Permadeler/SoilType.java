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
 * A representation of the literals of the enumeration '<em><b>Soil Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSoilType()
 * @model
 * @generated
 */
public enum SoilType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Light Sandy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SANDY_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_SANDY(1, "Light_Sandy", "Light_Sandy"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Medium Loam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_LOAM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM_LOAM(2, "Medium_Loam", "Medium_Loam"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Heavy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAVY_VALUE
	 * @generated
	 * @ordered
	 */
	HEAVY(3, "Heavy", "Heavy"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Heavy Clay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAVY_CLAY_VALUE
	 * @generated
	 * @ordered
	 */
	HEAVY_CLAY(4, "HeavyClay", "HeavyClay"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Poor Soil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR_SOIL_VALUE
	 * @generated
	 * @ordered
	 */
	POOR_SOIL(4, "PoorSoil", "PoorSoil"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(6, "Water", "Water"); //$NON-NLS-1$ //$NON-NLS-2$

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
	 * The '<em><b>Light Sandy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_SANDY
	 * @model name="Light_Sandy"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_SANDY_VALUE = 1;

	/**
	 * The '<em><b>Medium Loam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_LOAM
	 * @model name="Medium_Loam"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_LOAM_VALUE = 2;

	/**
	 * The '<em><b>Heavy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAVY
	 * @model name="Heavy"
	 * @generated
	 * @ordered
	 */
	public static final int HEAVY_VALUE = 3;

	/**
	 * The '<em><b>Heavy Clay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAVY_CLAY
	 * @model name="HeavyClay"
	 * @generated
	 * @ordered
	 */
	public static final int HEAVY_CLAY_VALUE = 4;

	/**
	 * The '<em><b>Poor Soil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR_SOIL
	 * @model name="PoorSoil"
	 * @generated
	 * @ordered
	 */
	public static final int POOR_SOIL_VALUE = 4;

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="Water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Soil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SoilType[] VALUES_ARRAY = new SoilType[] {UNKNOWN, LIGHT_SANDY, MEDIUM_LOAM, HEAVY,
			HEAVY_CLAY, POOR_SOIL, WATER, };

	/**
	 * A public read-only list of all the '<em><b>Soil Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SoilType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoilType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SoilType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Soil Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SoilType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE:
				return UNKNOWN;
			case LIGHT_SANDY_VALUE:
				return LIGHT_SANDY;
			case MEDIUM_LOAM_VALUE:
				return MEDIUM_LOAM;
			case HEAVY_VALUE:
				return HEAVY;
			case HEAVY_CLAY_VALUE:
				return HEAVY_CLAY;
			case WATER_VALUE:
				return WATER;
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
	private SoilType(int value, String name, String literal) {
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

} //SoilType
