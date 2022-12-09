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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getScaling <em>Scaling</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getTransparency <em>Transparency</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getBackgroundImage()
 * @model
 * @generated
 */
public interface BackgroundImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getBackgroundImage_RelativePath()
	 * @model required="true"
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' attribute.
	 * @see #setScaling(float)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getBackgroundImage_Scaling()
	 * @model
	 * @generated
	 */
	float getScaling();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getScaling <em>Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' attribute.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(float value);

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getBackgroundImage_Transparency()
	 * @model default="100"
	 * @generated
	 */
	int getTransparency();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(int value);

} // BackgroundImage
