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

import java.time.Instant;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Cell#getPlant <em>Plant</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Cell#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCell_Plant()
	 * @model
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Cell#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Instant)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getCell_Date()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.Date"
	 * @generated
	 */
	Instant getDate();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Cell#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Instant value);

} // Cell
