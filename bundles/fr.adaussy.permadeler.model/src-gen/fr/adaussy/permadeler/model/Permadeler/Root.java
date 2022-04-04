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

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedLib <em>Seed Lib</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedbank <em>Seedbank</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Root#getZones <em>Zones</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Root#getNursary <em>Nursary</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Root#getPlanifier <em>Planifier</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Seed Lib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Lib</em>' containment reference.
	 * @see #setSeedLib(KnowledgeBase)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot_SeedLib()
	 * @model containment="true" required="true"
	 * @generated
	 */
	KnowledgeBase getSeedLib();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedLib <em>Seed Lib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Lib</em>' containment reference.
	 * @see #getSeedLib()
	 * @generated
	 */
	void setSeedLib(KnowledgeBase value);

	/**
	 * Returns the value of the '<em><b>Seedbank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seedbank</em>' containment reference.
	 * @see #setSeedbank(SeedBank)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot_Seedbank()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SeedBank getSeedbank();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedbank <em>Seedbank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seedbank</em>' containment reference.
	 * @see #getSeedbank()
	 * @generated
	 */
	void setSeedbank(SeedBank value);

	/**
	 * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot_Zones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zone> getZones();

	/**
	 * Returns the value of the '<em><b>Nursary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nursary</em>' containment reference.
	 * @see #setNursary(Nursary)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot_Nursary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Nursary getNursary();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Root#getNursary <em>Nursary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nursary</em>' containment reference.
	 * @see #getNursary()
	 * @generated
	 */
	void setNursary(Nursary value);

	/**
	 * Returns the value of the '<em><b>Planifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planifier</em>' containment reference.
	 * @see #setPlanifier(Planifier)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getRoot_Planifier()
	 * @model containment="true"
	 * @generated
	 */
	Planifier getPlanifier();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Root#getPlanifier <em>Planifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planifier</em>' containment reference.
	 * @see #getPlanifier()
	 * @generated
	 */
	void setPlanifier(Planifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model weeksDataType="fr.adaussy.permadeler.model.Permadeler.MonthWeeks"
	 * @generated
	 */
	void addSowPlanification(SeedItem seedItem, List<Integer> weeks, SowType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CompatibilityLink addCompatibility(Genus source, Genus target, int cmp);

} // Root
