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
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Area#getSubAreas <em>Sub Areas</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Area#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Area#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends NamedElement, PlantationOwner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Sub Areas</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Areas</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getArea_SubAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getSubAreas();

	/**
	 * Returns the value of the '<em><b>Soil Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SoilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see #setSoilType(SoilType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getArea_SoilType()
	 * @model
	 * @generated
	 */
	SoilType getSoilType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Area#getSoilType <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soil Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see #getSoilType()
	 * @generated
	 */
	void setSoilType(SoilType value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getArea_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SoilType getActualSoilType();

} // Area
