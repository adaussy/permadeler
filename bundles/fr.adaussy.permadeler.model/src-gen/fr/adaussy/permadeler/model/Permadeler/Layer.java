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
 * A representation of the literals of the enumeration '<em><b>Layer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getLayer()
 * @model
 * @generated
 */
public enum Layer implements Enumerator {
	/**
	 * The '<em><b>CANOPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANOPY_VALUE
	 * @generated
	 * @ordered
	 */
	CANOPY(0, "CANOPY", "CANOPY"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UNDERSTORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERSTORY_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERSTORY(1, "UNDERSTORY", "UNDERSTORY"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SHRUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHRUB_VALUE
	 * @generated
	 * @ordered
	 */
	SHRUB(2, "SHRUB", "SHRUB"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>HERB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HERB_VALUE
	 * @generated
	 * @ordered
	 */
	HERB(3, "HERB", "HERB"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(4, "ROOT", "ROOT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>GROUND COVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_COVER_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND_COVER(5, "GROUND_COVER", "GROUND_COVER"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>VINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VINE_VALUE
	 * @generated
	 * @ordered
	 */
	VINE(6, "VINE", "VINE"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "OTHER", "OTHER"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CANOPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANOPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANOPY_VALUE = 0;

	/**
	 * The '<em><b>UNDERSTORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERSTORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERSTORY_VALUE = 1;

	/**
	 * The '<em><b>SHRUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHRUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHRUB_VALUE = 2;

	/**
	 * The '<em><b>HERB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HERB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HERB_VALUE = 3;

	/**
	 * The '<em><b>ROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 4;

	/**
	 * The '<em><b>GROUND COVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_COVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_COVER_VALUE = 5;

	/**
	 * The '<em><b>VINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VINE_VALUE = 6;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Layer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Layer[] VALUES_ARRAY = new Layer[] {CANOPY, UNDERSTORY, SHRUB, HERB, ROOT,
			GROUND_COVER, VINE, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Layer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Layer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Layer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Layer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Layer get(int value) {
		switch (value) {
			case CANOPY_VALUE:
				return CANOPY;
			case UNDERSTORY_VALUE:
				return UNDERSTORY;
			case SHRUB_VALUE:
				return SHRUB;
			case HERB_VALUE:
				return HERB;
			case ROOT_VALUE:
				return ROOT;
			case GROUND_COVER_VALUE:
				return GROUND_COVER;
			case VINE_VALUE:
				return VINE;
			case OTHER_VALUE:
				return OTHER;
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
	private Layer(int value, String name, String literal) {
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

} //Layer
