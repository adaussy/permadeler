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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatibility Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCompatibilityLink()
 * @model
 * @generated
 */
public interface CompatibilityLink extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Genus}.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getCompatibilityLinks <em>Compatibility Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCompatibilityLink_Species()
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getCompatibilityLinks
	 * @model opposite="compatibilityLinks" upper="2"
	 * @generated
	 */
	EList<Genus> getSpecies();

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity</em>' attribute.
	 * @see #setAffinity(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCompatibilityLink_Affinity()
	 * @model
	 * @generated
	 */
	int getAffinity();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getAffinity <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity</em>' attribute.
	 * @see #getAffinity()
	 * @generated
	 */
	void setAffinity(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCompatibilityLink_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CompatibilityLink
