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
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Plant extends PlantNamedElement, ImageOwner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Production> getProductions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullLatinName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Layer getDefaultLayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RepresentationKind getDefaultRepresentationKind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Action> getAllActions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Plant
