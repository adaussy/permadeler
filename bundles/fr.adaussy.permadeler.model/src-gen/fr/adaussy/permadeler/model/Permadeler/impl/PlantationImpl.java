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
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Species;

import java.lang.reflect.InvocationTargetException;

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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getSowEvent <em>Sow Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getPlantationEvent <em>Plantation Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getRemovalEvent <em>Removal Event</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getDescription <em>Description</em>}</li>
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
	protected Species type;

	/**
	 * The cached value of the '{@link #getSowEvent() <em>Sow Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSowEvent()
	 * @generated
	 * @ordered
	 */
	protected Event sowEvent;

	/**
	 * The cached value of the '{@link #getPlantationEvent() <em>Plantation Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantationEvent()
	 * @generated
	 * @ordered
	 */
	protected Event plantationEvent;

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
	 * The cached value of the '{@link #getRemovalEvent() <em>Removal Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalEvent()
	 * @generated
	 * @ordered
	 */
	protected Event removalEvent;

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
	public Species getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Species)eResolveProxy(oldType);
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
	public Species basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Species newType) {
		Species oldType = type;
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
	public Event getSowEvent() {
		return sowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSowEvent(Event newSowEvent, NotificationChain msgs) {
		Event oldSowEvent = sowEvent;
		sowEvent = newSowEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__SOW_EVENT, oldSowEvent, newSowEvent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSowEvent(Event newSowEvent) {
		if (newSowEvent != sowEvent) {
			NotificationChain msgs = null;
			if (sowEvent != null)
				msgs = ((InternalEObject)sowEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__SOW_EVENT, null, msgs);
			if (newSowEvent != null)
				msgs = ((InternalEObject)newSowEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__SOW_EVENT, null, msgs);
			msgs = basicSetSowEvent(newSowEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__SOW_EVENT,
					newSowEvent, newSowEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getPlantationEvent() {
		return plantationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlantationEvent(Event newPlantationEvent, NotificationChain msgs) {
		Event oldPlantationEvent = plantationEvent;
		plantationEvent = newPlantationEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__PLANTATION_EVENT, oldPlantationEvent, newPlantationEvent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantationEvent(Event newPlantationEvent) {
		if (newPlantationEvent != plantationEvent) {
			NotificationChain msgs = null;
			if (plantationEvent != null)
				msgs = ((InternalEObject)plantationEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__PLANTATION_EVENT, null, msgs);
			if (newPlantationEvent != null)
				msgs = ((InternalEObject)newPlantationEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__PLANTATION_EVENT, null, msgs);
			msgs = basicSetPlantationEvent(newPlantationEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__PLANTATION_EVENT, newPlantationEvent, newPlantationEvent));
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
	public Event getRemovalEvent() {
		return removalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovalEvent(Event newRemovalEvent, NotificationChain msgs) {
		Event oldRemovalEvent = removalEvent;
		removalEvent = newRemovalEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__REMOVAL_EVENT, oldRemovalEvent, newRemovalEvent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovalEvent(Event newRemovalEvent) {
		if (newRemovalEvent != removalEvent) {
			NotificationChain msgs = null;
			if (removalEvent != null)
				msgs = ((InternalEObject)removalEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__REMOVAL_EVENT, null, msgs);
			if (newRemovalEvent != null)
				msgs = ((InternalEObject)newRemovalEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTATION__REMOVAL_EVENT, null, msgs);
			msgs = basicSetRemovalEvent(newRemovalEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__REMOVAL_EVENT,
					newRemovalEvent, newRemovalEvent));
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
	public boolean isRemoved() {
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
			case PermadelerPackage.PLANTATION__SOW_EVENT:
				return basicSetSowEvent(null, msgs);
			case PermadelerPackage.PLANTATION__PLANTATION_EVENT:
				return basicSetPlantationEvent(null, msgs);
			case PermadelerPackage.PLANTATION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANTATION__REMOVAL_EVENT:
				return basicSetRemovalEvent(null, msgs);
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
			case PermadelerPackage.PLANTATION__SOW_EVENT:
				return getSowEvent();
			case PermadelerPackage.PLANTATION__PLANTATION_EVENT:
				return getPlantationEvent();
			case PermadelerPackage.PLANTATION__EVENTS:
				return getEvents();
			case PermadelerPackage.PLANTATION__REMOVAL_EVENT:
				return getRemovalEvent();
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				return getDescription();
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
				setType((Species)newValue);
				return;
			case PermadelerPackage.PLANTATION__SOW_EVENT:
				setSowEvent((Event)newValue);
				return;
			case PermadelerPackage.PLANTATION__PLANTATION_EVENT:
				setPlantationEvent((Event)newValue);
				return;
			case PermadelerPackage.PLANTATION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case PermadelerPackage.PLANTATION__REMOVAL_EVENT:
				setRemovalEvent((Event)newValue);
				return;
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				setDescription((String)newValue);
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
				setType((Species)null);
				return;
			case PermadelerPackage.PLANTATION__SOW_EVENT:
				setSowEvent((Event)null);
				return;
			case PermadelerPackage.PLANTATION__PLANTATION_EVENT:
				setPlantationEvent((Event)null);
				return;
			case PermadelerPackage.PLANTATION__EVENTS:
				getEvents().clear();
				return;
			case PermadelerPackage.PLANTATION__REMOVAL_EVENT:
				setRemovalEvent((Event)null);
				return;
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case PermadelerPackage.PLANTATION__SOW_EVENT:
				return sowEvent != null;
			case PermadelerPackage.PLANTATION__PLANTATION_EVENT:
				return plantationEvent != null;
			case PermadelerPackage.PLANTATION__EVENTS:
				return events != null && !events.isEmpty();
			case PermadelerPackage.PLANTATION__REMOVAL_EVENT:
				return removalEvent != null;
			case PermadelerPackage.PLANTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null
						: !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PermadelerPackage.PLANTATION___IS_REMOVED:
				return isRemoved();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PlantationImpl
