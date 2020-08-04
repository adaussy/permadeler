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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Planting#getAreas <em>Areas</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Planting#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Planting#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlanting()
 * @model
 * @generated
 */
public interface Planting extends NamedElement, PlantationOwner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlanting_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getAreas();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlanting_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Planting#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlanting_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Planting#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

} // Planting
