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
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;

import java.time.Instant;

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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#isWireframe <em>Wireframe</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl#getRepresentationKind <em>Representation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantationImpl extends TaggedElementImpl implements Plantation {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isWireframe() <em>Wireframe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWireframe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WIREFRAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWireframe() <em>Wireframe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWireframe()
	 * @generated
	 * @ordered
	 */
	protected boolean wireframe = WIREFRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationKind() <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected static final RepresentationKind REPRESENTATION_KIND_EDEFAULT = RepresentationKind.ICON;

	/**
	 * The cached value of the '{@link #getRepresentationKind() <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected RepresentationKind representationKind = REPRESENTATION_KIND_EDEFAULT;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWireframe() {
		return wireframe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireframe(boolean newWireframe) {
		boolean oldWireframe = wireframe;
		wireframe = newWireframe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTATION__WIREFRAME,
					oldWireframe, wireframe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationKind getRepresentationKind() {
		return representationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationKind(RepresentationKind newRepresentationKind) {
		RepresentationKind oldRepresentationKind = representationKind;
		representationKind = newRepresentationKind == null ? REPRESENTATION_KIND_EDEFAULT
				: newRepresentationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTATION__REPRESENTATION_KIND, oldRepresentationKind,
					representationKind));
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
			case PermadelerPackage.PLANTATION__ID:
				return getId();
			case PermadelerPackage.PLANTATION__WIREFRAME:
				return isWireframe();
			case PermadelerPackage.PLANTATION__REPRESENTATION_KIND:
				return getRepresentationKind();
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
			case PermadelerPackage.PLANTATION__ID:
				setId((String)newValue);
				return;
			case PermadelerPackage.PLANTATION__WIREFRAME:
				setWireframe((Boolean)newValue);
				return;
			case PermadelerPackage.PLANTATION__REPRESENTATION_KIND:
				setRepresentationKind((RepresentationKind)newValue);
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
			case PermadelerPackage.PLANTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case PermadelerPackage.PLANTATION__WIREFRAME:
				setWireframe(WIREFRAME_EDEFAULT);
				return;
			case PermadelerPackage.PLANTATION__REPRESENTATION_KIND:
				setRepresentationKind(REPRESENTATION_KIND_EDEFAULT);
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
			case PermadelerPackage.PLANTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PermadelerPackage.PLANTATION__WIREFRAME:
				return wireframe != WIREFRAME_EDEFAULT;
			case PermadelerPackage.PLANTATION__REPRESENTATION_KIND:
				return representationKind != REPRESENTATION_KIND_EDEFAULT;
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
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", plantationDate: "); //$NON-NLS-1$
		result.append(plantationDate);
		result.append(", currentLayer: "); //$NON-NLS-1$
		result.append(currentLayer);
		result.append(", rootstock: "); //$NON-NLS-1$
		result.append(rootstock);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", wireframe: "); //$NON-NLS-1$
		result.append(wireframe);
		result.append(", representationKind: "); //$NON-NLS-1$
		result.append(representationKind);
		result.append(')');
		return result.toString();
	}

} //PlantationImpl
