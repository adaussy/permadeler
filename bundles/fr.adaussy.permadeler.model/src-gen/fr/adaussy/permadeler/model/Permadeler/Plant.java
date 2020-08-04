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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSowIndoorMonths <em>Sow Indoor Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSowOutdoorMonths <em>Sow Outdoor Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle <em>Life Cycle</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends Species {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Sow Indoor Months</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sow Indoor Months</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_SowIndoorMonths()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek" upper="12"
	 * @generated
	 */
	EList<Integer> getSowIndoorMonths();

	/**
	 * Returns the value of the '<em><b>Sow Outdoor Months</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sow Outdoor Months</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_SowOutdoorMonths()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek" upper="12"
	 * @generated
	 */
	EList<Integer> getSowOutdoorMonths();

	/**
	 * Returns the value of the '<em><b>Life Cycle</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #setLifeCycle(Lifecycle)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_LifeCycle()
	 * @model
	 * @generated
	 */
	Lifecycle getLifeCycle();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #getLifeCycle()
	 * @generated
	 */
	void setLifeCycle(Lifecycle value);

} // Plant
