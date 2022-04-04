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

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.Bed;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationOwner;
import fr.adaussy.permadeler.model.Permadeler.SoilType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl#getPlantations <em>Plantations</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl#getBeds <em>Beds</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl#getSubAreas <em>Sub Areas</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends NamedElementImpl implements Area {
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
	 * The cached value of the '{@link #getSubAreas() <em>Sub Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> subAreas;

	/**
	 * The default value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected static final SoilType SOIL_TYPE_EDEFAULT = SoilType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected SoilType soilType = SOIL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plantation> getPlantations() {
		if (plantations == null) {
			plantations = new EObjectContainmentEList<Plantation>(Plantation.class, this,
					PermadelerPackage.AREA__PLANTATIONS);
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
			beds = new EObjectContainmentEList<Bed>(Bed.class, this, PermadelerPackage.AREA__BEDS);
		}
		return beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getSubAreas() {
		if (subAreas == null) {
			subAreas = new EObjectContainmentEList<Area>(Area.class, this, PermadelerPackage.AREA__SUB_AREAS);
		}
		return subAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoilType getSoilType() {
		return soilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoilType(SoilType newSoilType) {
		SoilType oldSoilType = soilType;
		soilType = newSoilType == null ? SOIL_TYPE_EDEFAULT : newSoilType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.AREA__SOIL_TYPE,
					oldSoilType, soilType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, PermadelerPackage.AREA__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoilType getActualSoilType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.AREA__PLANTATIONS:
				return ((InternalEList<?>)getPlantations()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.AREA__BEDS:
				return ((InternalEList<?>)getBeds()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.AREA__SUB_AREAS:
				return ((InternalEList<?>)getSubAreas()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.AREA__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.AREA__PLANTATIONS:
				return getPlantations();
			case PermadelerPackage.AREA__BEDS:
				return getBeds();
			case PermadelerPackage.AREA__SUB_AREAS:
				return getSubAreas();
			case PermadelerPackage.AREA__SOIL_TYPE:
				return getSoilType();
			case PermadelerPackage.AREA__EVENTS:
				return getEvents();
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
			case PermadelerPackage.AREA__PLANTATIONS:
				getPlantations().clear();
				getPlantations().addAll((Collection<? extends Plantation>)newValue);
				return;
			case PermadelerPackage.AREA__BEDS:
				getBeds().clear();
				getBeds().addAll((Collection<? extends Bed>)newValue);
				return;
			case PermadelerPackage.AREA__SUB_AREAS:
				getSubAreas().clear();
				getSubAreas().addAll((Collection<? extends Area>)newValue);
				return;
			case PermadelerPackage.AREA__SOIL_TYPE:
				setSoilType((SoilType)newValue);
				return;
			case PermadelerPackage.AREA__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case PermadelerPackage.AREA__PLANTATIONS:
				getPlantations().clear();
				return;
			case PermadelerPackage.AREA__BEDS:
				getBeds().clear();
				return;
			case PermadelerPackage.AREA__SUB_AREAS:
				getSubAreas().clear();
				return;
			case PermadelerPackage.AREA__SOIL_TYPE:
				setSoilType(SOIL_TYPE_EDEFAULT);
				return;
			case PermadelerPackage.AREA__EVENTS:
				getEvents().clear();
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
			case PermadelerPackage.AREA__PLANTATIONS:
				return plantations != null && !plantations.isEmpty();
			case PermadelerPackage.AREA__BEDS:
				return beds != null && !beds.isEmpty();
			case PermadelerPackage.AREA__SUB_AREAS:
				return subAreas != null && !subAreas.isEmpty();
			case PermadelerPackage.AREA__SOIL_TYPE:
				return soilType != SOIL_TYPE_EDEFAULT;
			case PermadelerPackage.AREA__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PlantationOwner.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.AREA__PLANTATIONS:
					return PermadelerPackage.PLANTATION_OWNER__PLANTATIONS;
				case PermadelerPackage.AREA__BEDS:
					return PermadelerPackage.PLANTATION_OWNER__BEDS;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PlantationOwner.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.PLANTATION_OWNER__PLANTATIONS:
					return PermadelerPackage.AREA__PLANTATIONS;
				case PermadelerPackage.PLANTATION_OWNER__BEDS:
					return PermadelerPackage.AREA__BEDS;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PermadelerPackage.AREA___GET_ACTUAL_SOIL_TYPE:
				return getActualSoilType();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (soilType: ");
		result.append(soilType);
		result.append(')');
		return result.toString();
	}

} //AreaImpl
