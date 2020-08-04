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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Zone#getPlantings <em>Plantings</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Plantings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Planting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantings</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getZone_Plantings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Planting> getPlantings();

} // Zone
