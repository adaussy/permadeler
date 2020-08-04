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

import fr.adaussy.permadeler.model.Permadeler.Bed;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationOwner;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plantation Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl#getPlantations <em>Plantations</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl#getBeds <em>Beds</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlantationOwnerImpl extends MinimalEObjectImpl.Container implements PlantationOwner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getPlantations() <em>Plantations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantations()
	 * @generated
	 * @ordered
	 */
	protected EList<Plantation> plantations;

	/**
	 * The cached value of the '{@link #getBeds() <em>Beds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Bed> beds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantationOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANTATION_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plantation> getPlantations() {
		if (plantations == null) {
			plantations = new EObjectContainmentEList<Plantation>(Plantation.class, this,
					PermadelerPackage.PLANTATION_OWNER__PLANTATIONS);
		}
		return plantations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bed> getBeds() {
		if (beds == null) {
			beds = new EObjectContainmentEList<Bed>(Bed.class, this,
					PermadelerPackage.PLANTATION_OWNER__BEDS);
		}
		return beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
				return ((InternalEList<?>)getPlantations()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANTATION_OWNER__BEDS:
				return ((InternalEList<?>)getBeds()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
				return getPlantations();
			case PermadelerPackage.PLANTATION_OWNER__BEDS:
				return getBeds();
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
			case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
				getPlantations().clear();
				getPlantations().addAll((Collection<? extends Plantation>)newValue);
				return;
			case PermadelerPackage.PLANTATION_OWNER__BEDS:
				getBeds().clear();
				getBeds().addAll((Collection<? extends Bed>)newValue);
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
			case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
				getPlantations().clear();
				return;
			case PermadelerPackage.PLANTATION_OWNER__BEDS:
				getBeds().clear();
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
			case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
				return plantations != null && !plantations.isEmpty();
			case PermadelerPackage.PLANTATION_OWNER__BEDS:
				return beds != null && !beds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlantationOwnerImpl
