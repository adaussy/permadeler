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

import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;

import java.time.Instant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plantation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getPlantationDate <em>Plantation Date</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getRootstock <em>Rootstock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantationImpl extends MinimalEObjectImpl.Container implements Plantation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Plant type;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlantationDate() <em>Plantation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Instant PLANTATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantationDate() <em>Plantation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantationDate()
	 * @generated
	 * @ordered
	 */
	protected Instant plantationDate = PLANTATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected static final Layer CURRENT_LAYER_EDEFAULT = Layer.UNDERSTORY;

	/**
	 * The cached value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer currentLayer = CURRENT_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootstock() <em>Rootstock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootstock()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOTSTOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootstock() <em>Rootstock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootstock()
	 * @generated
	 * @ordered
	 */
	protected String rootstock = ROOTSTOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Plant)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PermadelerPackage.PLANTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Plant newType) {
		Plant oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this,
					PermadelerPackage.PLANTATION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getPlantationDate() {
		return plantationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantationDate(Instant newPlantationDate) {
		Instant oldPlantationDate = plantationDate;
		plantationDate = newPlantationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__PLANTATION_DATE, oldPlantationDate, plantationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getCurrentLayer() {
		return currentLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLayer(Layer newCurrentLayer) {
		Layer oldCurrentLayer = currentLayer;
		currentLayer = newCurrentLayer == null ? CURRENT_LAYER_EDEFAULT : newCurrentLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__CURRENT_LAYER,
					oldCurrentLayer, currentLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootstock() {
		return rootstock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootstock(String newRootstock) {
		String oldRootstock = rootstock;
		rootstock = newRootstock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__ROOTSTOCK,
					oldRootstock, rootstock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.PLANTATION__EVENTS:
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
			case PermadelerPackage.PLANTATION__TYPE:
				if (resolve)
					return getType();
				return basicGetType();
			case PermadelerPackage.PLANTATION__EVENTS:
				return getEvents();
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				return getDescription();
			case PermadelerPackage.PLANTATION__PLANTATION_DATE:
				return getPlantationDate();
			case PermadelerPackage.PLANTATION__CURRENT_LAYER:
				return getCurrentLayer();
			case PermadelerPackage.PLANTATION__ROOTSTOCK:
				return getRootstock();
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
			case PermadelerPackage.PLANTATION__TYPE:
				setType((Plant)newValue);
				return;
			case PermadelerPackage.PLANTATION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PermadelerPackage.PLANTATION__PLANTATION_DATE:
				setPlantationDate((Instant)newValue);
				return;
			case PermadelerPackage.PLANTATION__CURRENT_LAYER:
				setCurrentLayer((Layer)newValue);
				return;
			case PermadelerPackage.PLANTATION__ROOTSTOCK:
				setRootstock((String)newValue);
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
			case PermadelerPackage.PLANTATION__TYPE:
				setType((Plant)null);
				return;
			case PermadelerPackage.PLANTATION__EVENTS:
				getEvents().clear();
				return;
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PermadelerPackage.PLANTATION__PLANTATION_DATE:
				setPlantationDate(PLANTATION_DATE_EDEFAULT);
				return;
			case PermadelerPackage.PLANTATION__CURRENT_LAYER:
				setCurrentLayer(CURRENT_LAYER_EDEFAULT);
				return;
			case PermadelerPackage.PLANTATION__ROOTSTOCK:
				setRootstock(ROOTSTOCK_EDEFAULT);
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
			case PermadelerPackage.PLANTATION__TYPE:
				return type != null;
			case PermadelerPackage.PLANTATION__EVENTS:
				return events != null && !events.isEmpty();
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null
						: !DESCRIPTION_EDEFAULT.equals(description);
			case PermadelerPackage.PLANTATION__PLANTATION_DATE:
				return PLANTATION_DATE_EDEFAULT == null ? plantationDate != null
						: !PLANTATION_DATE_EDEFAULT.equals(plantationDate);
			case PermadelerPackage.PLANTATION__CURRENT_LAYER:
				return currentLayer != CURRENT_LAYER_EDEFAULT;
			case PermadelerPackage.PLANTATION__ROOTSTOCK:
				return ROOTSTOCK_EDEFAULT == null ? rootstock != null : !ROOTSTOCK_EDEFAULT.equals(rootstock);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", plantationDate: ");
		result.append(plantationDate);
		result.append(", currentLayer: ");
		result.append(currentLayer);
		result.append(", rootstock: ");
		result.append(rootstock);
		result.append(')');
		return result.toString();
	}

} //PlantationImpl
