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
 * A representation of the model object '<em><b>Plantation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getSowEvent <em>Sow Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationEvent <em>Plantation Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRemovalEvent <em>Removal Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation()
 * @model
 * @generated
 */
public interface Plantation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Species)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Type()
	 * @model
	 * @generated
	 */
	Species getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Species value);

	/**
	 * Returns the value of the '<em><b>Sow Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sow Event</em>' containment reference.
	 * @see #setSowEvent(Event)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_SowEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getSowEvent();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getSowEvent <em>Sow Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sow Event</em>' containment reference.
	 * @see #getSowEvent()
	 * @generated
	 */
	void setSowEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Plantation Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantation Event</em>' containment reference.
	 * @see #setPlantationEvent(Event)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_PlantationEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getPlantationEvent();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationEvent <em>Plantation Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plantation Event</em>' containment reference.
	 * @see #getPlantationEvent()
	 * @generated
	 */
	void setPlantationEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Removal Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Event</em>' containment reference.
	 * @see #setRemovalEvent(Event)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_RemovalEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getRemovalEvent();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRemovalEvent <em>Removal Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Event</em>' containment reference.
	 * @see #getRemovalEvent()
	 * @generated
	 */
	void setRemovalEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRemoved();

} // Plantation
