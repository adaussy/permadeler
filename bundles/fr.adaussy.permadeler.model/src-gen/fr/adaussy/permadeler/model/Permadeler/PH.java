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
 * A representation of the literals of the enumeration '<em><b>PH</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPH()
 * @model
 * @generated
 */
public enum PH implements Enumerator {
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
	 * The '<em><b>Very Acid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_ACID_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_ACID(1, "VeryAcid", "VeryAcid"),

	/**
	 * The '<em><b>Acid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACID_VALUE
	 * @generated
	 * @ordered
	 */
	ACID(2, "Acid", "Acid"),

	/**
	 * The '<em><b>Neutral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRAL_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTRAL(3, "Neutral", "Neutral"),

	/**
	 * The '<em><b>Alkaline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALKALINE_VALUE
	 * @generated
	 * @ordered
	 */
	ALKALINE(4, "Alkaline", "Alkaline"),

	/**
	 * The '<em><b>Very Alkaline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_ALKALINE_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_ALKALINE(5, "VeryAlkaline", "VeryAlkaline"),

	/**
	 * The '<em><b>Saline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALINE_VALUE
	 * @generated
	 * @ordered
	 */
	SALINE(6, "Saline", "Saline");

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
	 * The '<em><b>Very Acid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_ACID
	 * @model name="VeryAcid"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_ACID_VALUE = 1;

	/**
	 * The '<em><b>Acid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACID
	 * @model name="Acid"
	 * @generated
	 * @ordered
	 */
	public static final int ACID_VALUE = 2;

	/**
	 * The '<em><b>Neutral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRAL
	 * @model name="Neutral"
	 * @generated
	 * @ordered
	 */
	public static final int NEUTRAL_VALUE = 3;

	/**
	 * The '<em><b>Alkaline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALKALINE
	 * @model name="Alkaline"
	 * @generated
	 * @ordered
	 */
	public static final int ALKALINE_VALUE = 4;

	/**
	 * The '<em><b>Very Alkaline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_ALKALINE
	 * @model name="VeryAlkaline"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_ALKALINE_VALUE = 5;

	/**
	 * The '<em><b>Saline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALINE
	 * @model name="Saline"
	 * @generated
	 * @ordered
	 */
	public static final int SALINE_VALUE = 6;

	/**
	 * An array of all the '<em><b>PH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PH[] VALUES_ARRAY = new PH[] {UNKNOWN, VERY_ACID, ACID, NEUTRAL, ALKALINE,
			VERY_ALKALINE, SALINE, };

	/**
	 * A public read-only list of all the '<em><b>PH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PH> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PH</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PH get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PH result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PH</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PH getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PH result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PH</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PH get(int value) {
		switch (value) {
			case UNKNOWN_VALUE:
				return UNKNOWN;
			case VERY_ACID_VALUE:
				return VERY_ACID;
			case ACID_VALUE:
				return ACID;
			case NEUTRAL_VALUE:
				return NEUTRAL;
			case ALKALINE_VALUE:
				return ALKALINE;
			case VERY_ALKALINE_VALUE:
				return VERY_ALKALINE;
			case SALINE_VALUE:
				return SALINE;
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
	private PH(int value, String name, String literal) {
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

} //PH
