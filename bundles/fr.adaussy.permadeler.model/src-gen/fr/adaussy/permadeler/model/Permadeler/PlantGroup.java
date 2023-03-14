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
 * A representation of the model object '<em><b>Plant Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantGroup#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantGroup#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantGroup()
 * @model
 * @generated
 */
public interface PlantGroup extends NamedElement, IPlantGroup {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Species}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantGroup_Species()
	 * @model
	 * @generated
	 */
	EList<Species> getSpecies();

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.PlantGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlantGroup> getSubGroups();

} // PlantGroup
