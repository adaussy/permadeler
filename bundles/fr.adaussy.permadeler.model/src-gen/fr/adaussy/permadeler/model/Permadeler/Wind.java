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
 * A representation of the literals of the enumeration '<em><b>Wind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getWind()
 * @model
 * @generated
 */
public enum Wind implements Enumerator {
	/**
	 * The '<em><b>Tolerate Martime Wind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_MARTIME_WIND_VALUE
	 * @generated
	 * @ordered
	 */
	TOLERATE_MARTIME_WIND(0, "TolerateMartimeWind", "TolerateMartimeWind"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Tolerate Strong Wind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_STRONG_WIND_VALUE
	 * @generated
	 * @ordered
	 */
	TOLERATE_STRONG_WIND(1, "TolerateStrongWind", "TolerateStrongWind"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Not Wind Tolerant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_WIND_TOLERANT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_WIND_TOLERANT(2, "NotWindTolerant", "NotWindTolerant"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Tolerate Martime Wind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_MARTIME_WIND
	 * @model name="TolerateMartimeWind"
	 * @generated
	 * @ordered
	 */
	public static final int TOLERATE_MARTIME_WIND_VALUE = 0;

	/**
	 * The '<em><b>Tolerate Strong Wind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERATE_STRONG_WIND
	 * @model name="TolerateStrongWind"
	 * @generated
	 * @ordered
	 */
	public static final int TOLERATE_STRONG_WIND_VALUE = 1;

	/**
	 * The '<em><b>Not Wind Tolerant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_WIND_TOLERANT
	 * @model name="NotWindTolerant"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_WIND_TOLERANT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Wind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Wind[] VALUES_ARRAY = new Wind[] {TOLERATE_MARTIME_WIND, TOLERATE_STRONG_WIND,
			NOT_WIND_TOLERANT, };

	/**
	 * A public read-only list of all the '<em><b>Wind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Wind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Wind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Wind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Wind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Wind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Wind get(int value) {
		switch (value) {
			case TOLERATE_MARTIME_WIND_VALUE:
				return TOLERATE_MARTIME_WIND;
			case TOLERATE_STRONG_WIND_VALUE:
				return TOLERATE_STRONG_WIND;
			case NOT_WIND_TOLERANT_VALUE:
				return NOT_WIND_TOLERANT;
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
	private Wind(int value, String name, String literal) {
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

} //Wind
