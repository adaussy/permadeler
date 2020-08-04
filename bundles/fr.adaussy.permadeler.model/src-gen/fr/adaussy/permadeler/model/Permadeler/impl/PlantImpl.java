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

import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getSowIndoorMonths <em>Sow Indoor Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getSowOutdoorMonths <em>Sow Outdoor Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getLifeCycle <em>Life Cycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends SpeciesCustomImpl implements Plant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getSowIndoorMonths() <em>Sow Indoor Months</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSowIndoorMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sowIndoorMonths;

	/**
	 * The cached value of the '{@link #getSowOutdoorMonths() <em>Sow Outdoor Months</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSowOutdoorMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sowOutdoorMonths;

	/**
	 * The default value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected static final Lifecycle LIFE_CYCLE_EDEFAULT = Lifecycle.UNKNOWN;

	/**
	 * The cached value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected Lifecycle lifeCycle = LIFE_CYCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSowIndoorMonths() {
		if (sowIndoorMonths == null) {
			sowIndoorMonths = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.PLANT__SOW_INDOOR_MONTHS);
		}
		return sowIndoorMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSowOutdoorMonths() {
		if (sowOutdoorMonths == null) {
			sowOutdoorMonths = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS);
		}
		return sowOutdoorMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle getLifeCycle() {
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycle(Lifecycle newLifeCycle) {
		Lifecycle oldLifeCycle = lifeCycle;
		lifeCycle = newLifeCycle == null ? LIFE_CYCLE_EDEFAULT : newLifeCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__LIFE_CYCLE,
					oldLifeCycle, lifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.PLANT__SOW_INDOOR_MONTHS:
				return getSowIndoorMonths();
			case PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS:
				return getSowOutdoorMonths();
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				return getLifeCycle();
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
			case PermadelerPackage.PLANT__SOW_INDOOR_MONTHS:
				getSowIndoorMonths().clear();
				getSowIndoorMonths().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS:
				getSowOutdoorMonths().clear();
				getSowOutdoorMonths().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				setLifeCycle((Lifecycle)newValue);
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
			case PermadelerPackage.PLANT__SOW_INDOOR_MONTHS:
				getSowIndoorMonths().clear();
				return;
			case PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS:
				getSowOutdoorMonths().clear();
				return;
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				setLifeCycle(LIFE_CYCLE_EDEFAULT);
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
			case PermadelerPackage.PLANT__SOW_INDOOR_MONTHS:
				return sowIndoorMonths != null && !sowIndoorMonths.isEmpty();
			case PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS:
				return sowOutdoorMonths != null && !sowOutdoorMonths.isEmpty();
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				return lifeCycle != LIFE_CYCLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sowIndoorMonths: ");
		result.append(sowIndoorMonths);
		result.append(", sowOutdoorMonths: ");
		result.append(sowOutdoorMonths);
		result.append(", lifeCycle: ");
		result.append(lifeCycle);
		result.append(')');
		return result.toString();
	}

} //PlantImpl
