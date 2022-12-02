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
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getCommonNames <em>Common Names</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getLatinName <em>Latin Name</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getRepresentationKey <em>Representation Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlantNamedElementImpl extends NamedElementImpl implements PlantNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getCommonNames() <em>Common Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commonNames;

	/**
	 * The default value of the '{@link #getLatinName() <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatinName()
	 * @generated
	 * @ordered
	 */
	protected static final String LATIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatinName() <em>Latin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatinName()
	 * @generated
	 * @ordered
	 */
	protected String latinName = LATIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationKey() <em>Representation Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKey()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationKey() <em>Representation Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKey()
	 * @generated
	 * @ordered
	 */
	protected String representationKey = REPRESENTATION_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANT_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommonNames() {
		if (commonNames == null) {
			commonNames = new EDataTypeUniqueEList<String>(String.class, this,
					PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES);
		}
		return commonNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatinName() {
		return latinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatinName(String newLatinName) {
		String oldLatinName = latinName;
		latinName = newLatinName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME, oldLatinName, latinName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationKey() {
		return representationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationKey(String newRepresentationKey) {
		String oldRepresentationKey = representationKey;
		representationKey = newRepresentationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY, oldRepresentationKey,
					representationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				return getCommonNames();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				return getLatinName();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				return getRepresentationKey();
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				getCommonNames().clear();
				getCommonNames().addAll((Collection<? extends String>)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				setLatinName((String)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				setRepresentationKey((String)newValue);
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				getCommonNames().clear();
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				setLatinName(LATIN_NAME_EDEFAULT);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				setRepresentationKey(REPRESENTATION_KEY_EDEFAULT);
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				return commonNames != null && !commonNames.isEmpty();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				return LATIN_NAME_EDEFAULT == null ? latinName != null
						: !LATIN_NAME_EDEFAULT.equals(latinName);
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				return REPRESENTATION_KEY_EDEFAULT == null ? representationKey != null
						: !REPRESENTATION_KEY_EDEFAULT.equals(representationKey);
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
		result.append(" (commonNames: ");
		result.append(commonNames);
		result.append(", latinName: ");
		result.append(latinName);
		result.append(", representationKey: ");
		result.append(representationKey);
		result.append(')');
		return result.toString();
	}

} //PlantNamedElementImpl
