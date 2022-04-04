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
import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.Bed;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationOwner;
import fr.adaussy.permadeler.model.Permadeler.Planting;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Planting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getPlantations <em>Plantations</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getBeds <em>Beds</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getAreas <em>Areas</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl#getBackgroundImage <em>Background Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantingImpl extends NamedElementImpl implements Planting {
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
	 * The cached value of the '{@link #getAreas() <em>Areas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> areas;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plantation> getPlantations() {
		if (plantations == null) {
			plantations = new EObjectContainmentEList<Plantation>(Plantation.class, this,
					PermadelerPackage.PLANTING__PLANTATIONS);
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
			beds = new EObjectContainmentEList<Bed>(Bed.class, this, PermadelerPackage.PLANTING__BEDS);
		}
		return beds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getAreas() {
		if (areas == null) {
			areas = new EObjectContainmentEList<Area>(Area.class, this, PermadelerPackage.PLANTING__AREAS);
		}
		return areas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTING__START_TIME,
					oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANTING__END_TIME,
					oldEndTime, endTime));
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
					PermadelerPackage.PLANTING__BACKGROUND_IMAGE, oldBackgroundImage, newBackgroundImage);
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
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTING__BACKGROUND_IMAGE, null, msgs);
			if (newBackgroundImage != null)
				msgs = ((InternalEObject)newBackgroundImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.PLANTING__BACKGROUND_IMAGE, null, msgs);
			msgs = basicSetBackgroundImage(newBackgroundImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANTING__BACKGROUND_IMAGE, newBackgroundImage, newBackgroundImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.PLANTING__PLANTATIONS:
				return ((InternalEList<?>)getPlantations()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANTING__BEDS:
				return ((InternalEList<?>)getBeds()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANTING__AREAS:
				return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANTING__BACKGROUND_IMAGE:
				return basicSetBackgroundImage(null, msgs);
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
			case PermadelerPackage.PLANTING__PLANTATIONS:
				return getPlantations();
			case PermadelerPackage.PLANTING__BEDS:
				return getBeds();
			case PermadelerPackage.PLANTING__AREAS:
				return getAreas();
			case PermadelerPackage.PLANTING__START_TIME:
				return getStartTime();
			case PermadelerPackage.PLANTING__END_TIME:
				return getEndTime();
			case PermadelerPackage.PLANTING__BACKGROUND_IMAGE:
				return getBackgroundImage();
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
			case PermadelerPackage.PLANTING__PLANTATIONS:
				getPlantations().clear();
				getPlantations().addAll((Collection<? extends Plantation>)newValue);
				return;
			case PermadelerPackage.PLANTING__BEDS:
				getBeds().clear();
				getBeds().addAll((Collection<? extends Bed>)newValue);
				return;
			case PermadelerPackage.PLANTING__AREAS:
				getAreas().clear();
				getAreas().addAll((Collection<? extends Area>)newValue);
				return;
			case PermadelerPackage.PLANTING__START_TIME:
				setStartTime((Date)newValue);
				return;
			case PermadelerPackage.PLANTING__END_TIME:
				setEndTime((Date)newValue);
				return;
			case PermadelerPackage.PLANTING__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImage)newValue);
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
			case PermadelerPackage.PLANTING__PLANTATIONS:
				getPlantations().clear();
				return;
			case PermadelerPackage.PLANTING__BEDS:
				getBeds().clear();
				return;
			case PermadelerPackage.PLANTING__AREAS:
				getAreas().clear();
				return;
			case PermadelerPackage.PLANTING__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case PermadelerPackage.PLANTING__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case PermadelerPackage.PLANTING__BACKGROUND_IMAGE:
				setBackgroundImage((BackgroundImage)null);
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
			case PermadelerPackage.PLANTING__PLANTATIONS:
				return plantations != null && !plantations.isEmpty();
			case PermadelerPackage.PLANTING__BEDS:
				return beds != null && !beds.isEmpty();
			case PermadelerPackage.PLANTING__AREAS:
				return areas != null && !areas.isEmpty();
			case PermadelerPackage.PLANTING__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null
						: !START_TIME_EDEFAULT.equals(startTime);
			case PermadelerPackage.PLANTING__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case PermadelerPackage.PLANTING__BACKGROUND_IMAGE:
				return backgroundImage != null;
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
				case PermadelerPackage.PLANTING__PLANTATIONS:
					return PermadelerPackage.PLANTATION_OWNER__PLANTATIONS;
				case PermadelerPackage.PLANTING__BEDS:
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
					return PermadelerPackage.PLANTING__PLANTATIONS;
				case PermadelerPackage.PLANTATION_OWNER__BEDS:
					return PermadelerPackage.PLANTING__BEDS;
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //PlantingImpl
