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
 * A representation of the model object '<em><b>Plantation Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getPlantations <em>Plantations</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getBackgroundImage <em>Background Image</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantationPhase()
 * @model
 * @generated
 */
public interface PlantationPhase extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Plantations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Plantation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantations</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantationPhase_Plantations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plantation> getPlantations();

	/**
	 * Returns the value of the '<em><b>Background Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Image</em>' containment reference.
	 * @see #setBackgroundImage(BackgroundImage)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantationPhase_BackgroundImage()
	 * @model containment="true"
	 * @generated
	 */
	BackgroundImage getBackgroundImage();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getBackgroundImage <em>Background Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Image</em>' containment reference.
	 * @see #getBackgroundImage()
	 * @generated
	 */
	void setBackgroundImage(BackgroundImage value);

} // PlantationPhase
