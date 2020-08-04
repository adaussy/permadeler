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
 * A representation of the model object '<em><b>Sow Planfication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getSeed <em>Seed</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSowPlanfication()
 * @model
 * @generated
 */
public interface SowPlanfication extends Planfication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' reference.
	 * @see #setSeed(SeedItem)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSowPlanfication_Seed()
	 * @model required="true"
	 * @generated
	 */
	SeedItem getSeed();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getSeed <em>Seed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' reference.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(SeedItem value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowType
	 * @see #setType(SowType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSowPlanfication_Type()
	 * @model
	 * @generated
	 */
	SowType getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowType
	 * @see #getType()
	 * @generated
	 */
	void setType(SowType value);

} // SowPlanfication
