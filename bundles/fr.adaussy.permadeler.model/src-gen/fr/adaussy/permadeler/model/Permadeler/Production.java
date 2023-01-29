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
 * A representation of the model object '<em><b>Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Production#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Production#getConservation <em>Conservation</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Production#isEatable <em>Eatable</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getProduction()
 * @model
 * @generated
 */
public interface Production extends TemporalItem {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.ProductionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.ProductionType
	 * @see #setType(ProductionType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getProduction_Type()
	 * @model
	 * @generated
	 */
	ProductionType getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Production#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.ProductionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProductionType value);

	/**
	 * Returns the value of the '<em><b>Conservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Production Conservation in weeks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conservation</em>' attribute.
	 * @see #setConservation(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getProduction_Conservation()
	 * @model
	 * @generated
	 */
	int getConservation();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Production#getConservation <em>Conservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conservation</em>' attribute.
	 * @see #getConservation()
	 * @generated
	 */
	void setConservation(int value);

	/**
	 * Returns the value of the '<em><b>Eatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eatable</em>' attribute.
	 * @see #setEatable(boolean)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getProduction_Eatable()
	 * @model default="false"
	 * @generated
	 */
	boolean isEatable();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Production#isEatable <em>Eatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eatable</em>' attribute.
	 * @see #isEatable()
	 * @generated
	 */
	void setEatable(boolean value);

} // Production
