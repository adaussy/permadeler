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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Action#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends TemporalItem {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Multiplication"</code>.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.ActionType
	 * @see #setType(ActionType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getAction_Type()
	 * @model default="Multiplication"
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.ActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

} // Action
