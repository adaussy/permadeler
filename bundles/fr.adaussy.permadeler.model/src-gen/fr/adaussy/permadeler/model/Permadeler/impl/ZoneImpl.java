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
package fr.adaussy.permadeler.model.Permadeler.impl;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Zone;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl#getSubZones <em>Sub Zones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends NamedElementImpl implements Zone {
	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantationPhase> phases;

	/**
	 * The cached value of the '{@link #getSubZones() <em>Sub Zones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> subZones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantationPhase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentEList<PlantationPhase>(PlantationPhase.class, this,
					PermadelerPackage.ZONE__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getSubZones() {
		if (subZones == null) {
			subZones = new EObjectContainmentEList<Zone>(Zone.class, this, PermadelerPackage.ZONE__SUB_ZONES);
		}
		return subZones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.ZONE__PHASES:
				return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.ZONE__SUB_ZONES:
				return ((InternalEList<?>)getSubZones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.ZONE__PHASES:
				return getPhases();
			case PermadelerPackage.ZONE__SUB_ZONES:
				return getSubZones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PermadelerPackage.ZONE__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends PlantationPhase>)newValue);
				return;
			case PermadelerPackage.ZONE__SUB_ZONES:
				getSubZones().clear();
				getSubZones().addAll((Collection<? extends Zone>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PermadelerPackage.ZONE__PHASES:
				getPhases().clear();
				return;
			case PermadelerPackage.ZONE__SUB_ZONES:
				getSubZones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PermadelerPackage.ZONE__PHASES:
				return phases != null && !phases.isEmpty();
			case PermadelerPackage.ZONE__SUB_ZONES:
				return subZones != null && !subZones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneImpl
