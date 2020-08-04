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

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Reference#getLink <em>Link</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Reference#getId <em>Id</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Reference#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(URL)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getReference_Link()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.URL"
	 * @generated
	 */
	URL getLink();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(URL value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getReference_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getReference_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // Reference
