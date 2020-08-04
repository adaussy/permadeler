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
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.Species;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seed Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl#getByDate <em>By Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeedItemImpl extends MinimalEObjectImpl.Container implements SeedItem {
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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Quantity QUANTITY_EDEFAULT = Quantity.UNKNOWN;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByDate() <em>By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByDate() <em>By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByDate()
	 * @generated
	 * @ordered
	 */
	protected Date byDate = BY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.SEED_ITEM;
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
							PermadelerPackage.SEED_ITEM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SEED_ITEM__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity == null ? QUANTITY_EDEFAULT : newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SEED_ITEM__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getByDate() {
		return byDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByDate(Date newByDate) {
		Date oldByDate = byDate;
		byDate = newByDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SEED_ITEM__BY_DATE,
					oldByDate, byDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.SEED_ITEM__TYPE:
				if (resolve)
					return getType();
				return basicGetType();
			case PermadelerPackage.SEED_ITEM__QUANTITY:
				return getQuantity();
			case PermadelerPackage.SEED_ITEM__BY_DATE:
				return getByDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PermadelerPackage.SEED_ITEM__TYPE:
				setType((Species)newValue);
				return;
			case PermadelerPackage.SEED_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case PermadelerPackage.SEED_ITEM__BY_DATE:
				setByDate((Date)newValue);
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
			case PermadelerPackage.SEED_ITEM__TYPE:
				setType((Species)null);
				return;
			case PermadelerPackage.SEED_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case PermadelerPackage.SEED_ITEM__BY_DATE:
				setByDate(BY_DATE_EDEFAULT);
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
			case PermadelerPackage.SEED_ITEM__TYPE:
				return type != null;
			case PermadelerPackage.SEED_ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case PermadelerPackage.SEED_ITEM__BY_DATE:
				return BY_DATE_EDEFAULT == null ? byDate != null : !BY_DATE_EDEFAULT.equals(byDate);
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", byDate: ");
		result.append(byDate);
		result.append(')');
		return result.toString();
	}

} //SeedItemImpl
