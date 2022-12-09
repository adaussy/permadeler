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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Bed Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.GridBedCell#getPlantation <em>Plantation</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGridBedCell()
 * @model
 * @generated
 */
public interface GridBedCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Plantation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantation</em>' reference.
	 * @see #setPlantation(Plantation)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getGridBedCell_Plantation()
	 * @model
	 * @generated
	 */
	Plantation getPlantation();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.GridBedCell#getPlantation <em>Plantation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plantation</em>' reference.
	 * @see #getPlantation()
	 * @generated
	 */
	void setPlantation(Plantation value);

} // GridBedCell
