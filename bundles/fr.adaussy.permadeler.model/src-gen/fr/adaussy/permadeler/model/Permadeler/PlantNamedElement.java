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
 * A representation of the model object '<em><b>Plant Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getCommonNames <em>Common Names</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getIconKey <em>Icon Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getRepresentationKey <em>Representation Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface PlantNamedElement extends NamedElement, ReferencingElement {
	/**
	 * Returns the value of the '<em><b>Common Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Names</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_CommonNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCommonNames();

	/**
	 * Returns the value of the '<em><b>Icon Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Key</em>' attribute.
	 * @see #setIconKey(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_IconKey()
	 * @model
	 * @generated
	 */
	String getIconKey();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getIconKey <em>Icon Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Key</em>' attribute.
	 * @see #getIconKey()
	 * @generated
	 */
	void setIconKey(String value);

	/**
	 * Returns the value of the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Key</em>' attribute.
	 * @see #setRepresentationKey(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_RepresentationKey()
	 * @model
	 * @generated
	 */
	String getRepresentationKey();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getRepresentationKey <em>Representation Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Key</em>' attribute.
	 * @see #getRepresentationKey()
	 * @generated
	 */
	void setRepresentationKey(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllNames();

} // PlantNamedElement
