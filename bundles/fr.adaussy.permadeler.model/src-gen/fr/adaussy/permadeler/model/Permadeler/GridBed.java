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
 * A representation of the model object '<em><b>Grid Bed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.GridBed#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGridBed()
 * @model
 * @generated
 */
public interface GridBed extends Bed {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.GridBedRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGridBed_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<GridBedRow> getRows();

} // GridBed
