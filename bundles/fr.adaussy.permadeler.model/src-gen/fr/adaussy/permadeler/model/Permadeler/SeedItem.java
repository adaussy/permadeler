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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seed Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getByDate <em>By Date</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSeedItem()
 * @model
 * @generated
 */
public interface SeedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Plant)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSeedItem_Type()
	 * @model required="true"
	 * @generated
	 */
	Plant getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Plant value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
	 * @see #setQuantity(Quantity)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSeedItem_Quantity()
	 * @model
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Date</em>' attribute.
	 * @see #setByDate(Date)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSeedItem_ByDate()
	 * @model
	 * @generated
	 */
	Date getByDate();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getByDate <em>By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Date</em>' attribute.
	 * @see #getByDate()
	 * @generated
	 */
	void setByDate(Date value);

} // SeedItem
