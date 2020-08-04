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

import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;

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
 * An implementation of the model object '<em><b>Compatibility Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityMatrixImpl#getCompatibilties <em>Compatibilties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibilityMatrixImpl extends MinimalEObjectImpl.Container implements CompatibilityMatrix {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getCompatibilties() <em>Compatibilties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilties()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibilityLink> compatibilties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibilityMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.COMPATIBILITY_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibilityLink> getCompatibilties() {
		if (compatibilties == null) {
			compatibilties = new EObjectContainmentEList<CompatibilityLink>(CompatibilityLink.class, this,
					PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES);
		}
		return compatibilties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES:
				return ((InternalEList<?>)getCompatibilties()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES:
				return getCompatibilties();
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
			case PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES:
				getCompatibilties().clear();
				getCompatibilties().addAll((Collection<? extends CompatibilityLink>)newValue);
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
			case PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES:
				getCompatibilties().clear();
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
			case PermadelerPackage.COMPATIBILITY_MATRIX__COMPATIBILTIES:
				return compatibilties != null && !compatibilties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompatibilityMatrixImpl
