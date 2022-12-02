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

import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Zone;

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
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl#getPlantations <em>Plantations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends NamedElementImpl implements Zone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getBackgroundImage() <em>Background Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected BackgroundImage backgroundImage;

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
	public BackgroundImage getBackgroundImage() {
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundImage(BackgroundImage newBackgroundImage,
			NotificationChain msgs) {
		BackgroundImage oldBackgroundImage = backgroundImage;
		backgroundImage = newBackgroundImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ZONE__BACKGROUND_IMAGE, oldBackgroundImage, newBackgroundImage);
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
	public void setBackgroundImage(BackgroundImage newBackgroundImage) {
		if (newBackgroundImage != backgroundImage) {
			NotificationChain msgs = null;
			if (backgroundImage != null)
				msgs = ((InternalEObject)backgroundImage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ZONE__BACKGROUND_IMAGE, null, msgs);
			if (newBackgroundImage != null)
				msgs = ((InternalEObject)newBackgroundImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ZONE__BACKGROUND_IMAGE, null, msgs);
			msgs = basicSetBackgroundImage(newBackgroundImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ZONE__BACKGROUND_IMAGE,
					newBackgroundImage, newBackgroundImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plantation> getPlantations() {
		if (plantations == null) {
			plantations = new EObjectContainmentEList<Plantation>(Plantation.class, this,
					PermadelerPackage.ZONE__PLANTATIONS);
		}
		return plantations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.ZONE__BACKGROUND_IMAGE:
				return basicSetBackgroundImage(null, msgs);
			case PermadelerPackage.ZONE__PLANTATIONS:
				return ((InternalEList<?>)getPlantations()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.ZONE__BACKGROUND_IMAGE:
				return getBackgroundImage();
			case PermadelerPackage.ZONE__PLANTATIONS:
				return getPlantations();
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
			case PermadelerPackage.ZONE__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImage)newValue);
				return;
			case PermadelerPackage.ZONE__PLANTATIONS:
				getPlantations().clear();
				getPlantations().addAll((Collection<? extends Plantation>)newValue);
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
			case PermadelerPackage.ZONE__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImage)null);
				return;
			case PermadelerPackage.ZONE__PLANTATIONS:
				getPlantations().clear();
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
			case PermadelerPackage.ZONE__BACKGROUND_IMAGE:
				return backgroundImage != null;
			case PermadelerPackage.ZONE__PLANTATIONS:
				return plantations != null && !plantations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneImpl
