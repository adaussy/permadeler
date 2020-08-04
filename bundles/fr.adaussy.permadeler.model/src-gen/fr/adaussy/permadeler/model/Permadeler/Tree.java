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
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Tree#getRootstock <em>Rootstock</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends Species {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Rootstock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootstock</em>' attribute.
	 * @see #setRootstock(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getTree_Rootstock()
	 * @model
	 * @generated
	 */
	String getRootstock();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Tree#getRootstock <em>Rootstock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rootstock</em>' attribute.
	 * @see #getRootstock()
	 * @generated
	 */
	void setRootstock(String value);

} // Tree
