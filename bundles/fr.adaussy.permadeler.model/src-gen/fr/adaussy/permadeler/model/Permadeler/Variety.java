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
 * A representation of the model object '<em><b>Variety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Variety#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Variety#getVariety <em>Variety</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getVariety()
 * @model
 * @generated
 */
public interface Variety extends Plant {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.Species#getVarieties <em>Varieties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' container reference.
	 * @see #setSpecies(Species)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getVariety_Species()
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getVarieties
	 * @model opposite="varieties" required="true" transient="false"
	 * @generated
	 */
	Species getSpecies();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Variety#getSpecies <em>Species</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' container reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(Species value);

	/**
	 * Returns the value of the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variety</em>' attribute.
	 * @see #setVariety(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getVariety_Variety()
	 * @model
	 * @generated
	 */
	String getVariety();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Variety#getVariety <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variety</em>' attribute.
	 * @see #getVariety()
	 * @generated
	 */
	void setVariety(String value);

} // Variety
