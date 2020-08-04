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
 * A representation of the literals of the enumeration '<em><b>Edible Part</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getEdiblePart()
 * @model
 * @generated
 */
public enum EdiblePart implements Enumerator {
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
	 * The '<em><b>Apical Bud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APICAL_BUD_VALUE
	 * @generated
	 * @ordered
	 */
	APICAL_BUD(1, "ApicalBud", "ApicalBud"),

	/**
	 * The '<em><b>Leaves</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAVES_VALUE
	 * @generated
	 * @ordered
	 */
	LEAVES(2, "Leaves", "Leaves"),

	/**
	 * The '<em><b>Pollen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLLEN_VALUE
	 * @generated
	 * @ordered
	 */
	POLLEN(3, "Pollen", "Pollen"),

	/**
	 * The '<em><b>Flowers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWERS_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWERS(4, "Flowers", "Flowers"),

	/**
	 * The '<em><b>Manna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANNA_VALUE
	 * @generated
	 * @ordered
	 */
	MANNA(5, "Manna", "Manna"),

	/**
	 * The '<em><b>Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(6, "Root", "Root"),

	/**
	 * The '<em><b>Shoots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS_VALUE
	 * @generated
	 * @ordered
	 */
	SHOOTS(7, "Shoots", "Shoots"),

	/**
	 * The '<em><b>Fruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT_VALUE
	 * @generated
	 * @ordered
	 */
	FRUIT(8, "Fruit", "Fruit"),

	/**
	 * The '<em><b>Nectar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NECTAR_VALUE
	 * @generated
	 * @ordered
	 */
	NECTAR(9, "Nectar", "Nectar"),

	/**
	 * The '<em><b>Sap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAP_VALUE
	 * @generated
	 * @ordered
	 */
	SAP(10, "Sap", "Sap"),

	/**
	 * The '<em><b>Stem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEM_VALUE
	 * @generated
	 * @ordered
	 */
	STEM(11, "Stem", "Stem"),

	/**
	 * The '<em><b>Inner Bark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INNER_BARK_VALUE
	 * @generated
	 * @ordered
	 */
	INNER_BARK(12, "InnerBark", "InnerBark"),

	/**
	 * The '<em><b>Oil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(13, "Oil", "Oil"),

	/**
	 * The '<em><b>Seed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEED_VALUE
	 * @generated
	 * @ordered
	 */
	SEED(14, "Seed", "Seed");

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
	 * The '<em><b>Apical Bud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APICAL_BUD
	 * @model name="ApicalBud"
	 * @generated
	 * @ordered
	 */
	public static final int APICAL_BUD_VALUE = 1;

	/**
	 * The '<em><b>Leaves</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAVES
	 * @model name="Leaves"
	 * @generated
	 * @ordered
	 */
	public static final int LEAVES_VALUE = 2;

	/**
	 * The '<em><b>Pollen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLLEN
	 * @model name="Pollen"
	 * @generated
	 * @ordered
	 */
	public static final int POLLEN_VALUE = 3;

	/**
	 * The '<em><b>Flowers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWERS
	 * @model name="Flowers"
	 * @generated
	 * @ordered
	 */
	public static final int FLOWERS_VALUE = 4;

	/**
	 * The '<em><b>Manna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANNA
	 * @model name="Manna"
	 * @generated
	 * @ordered
	 */
	public static final int MANNA_VALUE = 5;

	/**
	 * The '<em><b>Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT
	 * @model name="Root"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 6;

	/**
	 * The '<em><b>Shoots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOOTS
	 * @model name="Shoots"
	 * @generated
	 * @ordered
	 */
	public static final int SHOOTS_VALUE = 7;

	/**
	 * The '<em><b>Fruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT
	 * @model name="Fruit"
	 * @generated
	 * @ordered
	 */
	public static final int FRUIT_VALUE = 8;

	/**
	 * The '<em><b>Nectar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NECTAR
	 * @model name="Nectar"
	 * @generated
	 * @ordered
	 */
	public static final int NECTAR_VALUE = 9;

	/**
	 * The '<em><b>Sap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAP
	 * @model name="Sap"
	 * @generated
	 * @ordered
	 */
	public static final int SAP_VALUE = 10;

	/**
	 * The '<em><b>Stem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEM
	 * @model name="Stem"
	 * @generated
	 * @ordered
	 */
	public static final int STEM_VALUE = 11;

	/**
	 * The '<em><b>Inner Bark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INNER_BARK
	 * @model name="InnerBark"
	 * @generated
	 * @ordered
	 */
	public static final int INNER_BARK_VALUE = 12;

	/**
	 * The '<em><b>Oil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL
	 * @model name="Oil"
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 13;

	/**
	 * The '<em><b>Seed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEED
	 * @model name="Seed"
	 * @generated
	 * @ordered
	 */
	public static final int SEED_VALUE = 14;

	/**
	 * An array of all the '<em><b>Edible Part</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EdiblePart[] VALUES_ARRAY = new EdiblePart[] {UNKOWN, APICAL_BUD, LEAVES, POLLEN,
			FLOWERS, MANNA, ROOT, SHOOTS, FRUIT, NECTAR, SAP, STEM, INNER_BARK, OIL, SEED, };

	/**
	 * A public read-only list of all the '<em><b>Edible Part</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EdiblePart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Edible Part</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdiblePart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdiblePart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edible Part</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdiblePart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdiblePart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edible Part</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdiblePart get(int value) {
		switch (value) {
			case UNKOWN_VALUE:
				return UNKOWN;
			case APICAL_BUD_VALUE:
				return APICAL_BUD;
			case LEAVES_VALUE:
				return LEAVES;
			case POLLEN_VALUE:
				return POLLEN;
			case FLOWERS_VALUE:
				return FLOWERS;
			case MANNA_VALUE:
				return MANNA;
			case ROOT_VALUE:
				return ROOT;
			case SHOOTS_VALUE:
				return SHOOTS;
			case FRUIT_VALUE:
				return FRUIT;
			case NECTAR_VALUE:
				return NECTAR;
			case SAP_VALUE:
				return SAP;
			case STEM_VALUE:
				return STEM;
			case INNER_BARK_VALUE:
				return INNER_BARK;
			case OIL_VALUE:
				return OIL;
			case SEED_VALUE:
				return SEED;
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
	private EdiblePart(int value, String name, String literal) {
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

} //EdiblePart
