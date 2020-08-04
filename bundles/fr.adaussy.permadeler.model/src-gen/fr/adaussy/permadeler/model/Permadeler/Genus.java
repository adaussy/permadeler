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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Genus#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Genus#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Genus#getSubGenus <em>Sub Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Genus#getCompatibilityLinks <em>Compatibility Links</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGenus()
 * @model
 * @generated
 */
public interface Genus extends PlantNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Species}.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.Species#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGenus_Species()
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<Species> getSpecies();

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Family}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see #setFamily(Family)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGenus_Family()
	 * @model
	 * @generated
	 */
	Family getFamily();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Family value);

	/**
	 * Returns the value of the '<em><b>Sub Genus</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Genus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Genus</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGenus_SubGenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Genus> getSubGenus();

	/**
	 * Returns the value of the '<em><b>Compatibility Links</b></em>' reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink}.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility Links</em>' reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGenus_CompatibilityLinks()
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getSpecies
	 * @model opposite="species"
	 * @generated
	 */
	EList<CompatibilityLink> getCompatibilityLinks();

} // Genus
