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
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geographic zone that will hold Plantation Phase
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Zone#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Zone#getSubZones <em>Sub Zones</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Zone#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Zone#getPlantations <em>Plantations</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone_Phases()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlantationPhase> getPhases();

	/**
	 * Returns the value of the '<em><b>Sub Zones</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Zones</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone_SubZones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zone> getSubZones();

	/**
	 * Returns the value of the '<em><b>Background Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image to be used in the backgroung of all plantation map
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Image</em>' containment reference.
	 * @see #setBackgroundImage(BackgroundImage)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone_BackgroundImage()
	 * @model containment="true"
	 * @generated
	 */
	BackgroundImage getBackgroundImage();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Zone#getBackgroundImage <em>Background Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Image</em>' containment reference.
	 * @see #getBackgroundImage()
	 * @generated
	 */
	void setBackgroundImage(BackgroundImage value);

	/**
	 * Returns the value of the '<em><b>Plantations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Plantation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantations</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone_Plantations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plantation> getPlantations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Plantation> getAllPlantations();

} // Zone
