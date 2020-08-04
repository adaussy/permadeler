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
 * A representation of the model object '<em><b>Row Bed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.RowBed#getRows <em>Rows</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.RowBed#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRowBed()
 * @model
 * @generated
 */
public interface RowBed extends Bed {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.RowBedRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRowBed_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<RowBedRow> getRows();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.RowBedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
	 * @see #setType(RowBedType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRowBed_Type()
	 * @model
	 * @generated
	 */
	RowBedType getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.RowBed#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
	 * @see #getType()
	 * @generated
	 */
	void setType(RowBedType value);

} // RowBed
