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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getLatinName <em>Latin Name</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getIconKey <em>Icon Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getGenus <em>Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getVariety <em>Variety</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getRepresentationKey <em>Representation Key</em>}</li>
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
	 * Returns the value of the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latin Name</em>' attribute.
	 * @see #setLatinName(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_LatinName()
	 * @model required="true"
	 * @generated
	 */
	String getLatinName();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getLatinName <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latin Name</em>' attribute.
	 * @see #getLatinName()
	 * @generated
	 */
	void setLatinName(String value);

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
	 * Returns the value of the '<em><b>Genus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genus</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_Genus()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getGenus();

	/**
	 * Returns the value of the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_Species()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSpecies();

	/**
	 * Returns the value of the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variety</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_Variety()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getVariety();

	/**
	 * Returns the value of the '<em><b>Representation Key</b></em>' attribute.
	 * The default value is <code>"/icons/representations/arbre2/green1.png"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Key</em>' attribute.
	 * @see #setRepresentationKey(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantNamedElement_RepresentationKey()
	 * @model default="/icons/representations/arbre2/green1.png"
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

} // PlantNamedElement
