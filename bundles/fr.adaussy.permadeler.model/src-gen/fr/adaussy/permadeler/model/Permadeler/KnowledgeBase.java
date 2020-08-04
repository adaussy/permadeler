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
 * A representation of the model object '<em><b>Knowledge Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getPlantTypes <em>Plant Types</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getCompatibilityMatrix <em>Compatibility Matrix</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getKnowledgeBase()
 * @model
 * @generated
 */
public interface KnowledgeBase extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Plant Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Genus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Types</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getKnowledgeBase_PlantTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Genus> getPlantTypes();

	/**
	 * Returns the value of the '<em><b>Compatibility Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility Matrix</em>' containment reference.
	 * @see #setCompatibilityMatrix(CompatibilityMatrix)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getKnowledgeBase_CompatibilityMatrix()
	 * @model containment="true"
	 * @generated
	 */
	CompatibilityMatrix getCompatibilityMatrix();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getCompatibilityMatrix <em>Compatibility Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility Matrix</em>' containment reference.
	 * @see #getCompatibilityMatrix()
	 * @generated
	 */
	void setCompatibilityMatrix(CompatibilityMatrix value);

} // KnowledgeBase
