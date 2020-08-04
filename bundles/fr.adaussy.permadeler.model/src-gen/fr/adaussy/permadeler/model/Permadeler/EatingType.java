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
 * A representation of the literals of the enumeration '<em><b>Eating Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getEatingType()
 * @model
 * @generated
 */
public enum EatingType implements Enumerator {
	/**
	 * The '<em><b>Unkown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKOWN(0, "Unkown", "Unkown"),

	/**
	 * The '<em><b>Fruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT_VALUE
	 * @generated
	 * @ordered
	 */
	FRUIT(1, "Fruit", "Fruit"),

	/**
	 * The '<em><b>Vegetable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETABLE(2, "Vegetable", "Vegetable"),

	/**
	 * The '<em><b>Aromatic Plant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROMATIC_PLANT_VALUE
	 * @generated
	 * @ordered
	 */
	AROMATIC_PLANT(3, "AromaticPlant", "AromaticPlant"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "None", "None"),

	/**
	 * The '<em><b>Flower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWER_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWER(5, "Flower", "Flower");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The '<em><b>Unkown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKOWN
	 * @model name="Unkown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKOWN_VALUE = 0;

	/**
	 * The '<em><b>Fruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT
	 * @model name="Fruit"
	 * @generated
	 * @ordered
	 */
	public static final int FRUIT_VALUE = 1;

	/**
	 * The '<em><b>Vegetable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETABLE
	 * @model name="Vegetable"
	 * @generated
	 * @ordered
	 */
	public static final int VEGETABLE_VALUE = 2;

	/**
	 * The '<em><b>Aromatic Plant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROMATIC_PLANT
	 * @model name="AromaticPlant"
	 * @generated
	 * @ordered
	 */
	public static final int AROMATIC_PLANT_VALUE = 3;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * The '<em><b>Flower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWER
	 * @model name="Flower"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Eating Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EatingType[] VALUES_ARRAY = new EatingType[] {UNKOWN, FRUIT, VEGETABLE,
			AROMATIC_PLANT, NONE, FLOWER, };

	/**
	 * A public read-only list of all the '<em><b>Eating Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EatingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eating Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EatingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EatingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eating Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EatingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EatingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eating Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EatingType get(int value) {
		switch (value) {
			case UNKOWN_VALUE:
				return UNKOWN;
			case FRUIT_VALUE:
				return FRUIT;
			case VEGETABLE_VALUE:
				return VEGETABLE;
			case AROMATIC_PLANT_VALUE:
				return AROMATIC_PLANT;
			case NONE_VALUE:
				return NONE;
			case FLOWER_VALUE:
				return FLOWER;
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
	private EatingType(int value, String name, String literal) {
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

} //EatingType
