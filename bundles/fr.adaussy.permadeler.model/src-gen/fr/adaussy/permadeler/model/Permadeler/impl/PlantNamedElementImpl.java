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

import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.Permadeler.ReferencingElement;

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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getReferences <em>References</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getCommonNames <em>Common Names</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getLatinName <em>Latin Name</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getIconKey <em>Icon Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getGenus <em>Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getVariety <em>Variety</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getRepresentationKey <em>Representation Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlantNamedElementImpl extends NamedElementImpl implements PlantNamedElement {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

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
	 * The default value of the '{@link #getIconKey() <em>Icon Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconKey() <em>Icon Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconKey()
	 * @generated
	 * @ordered
	 */
	protected String iconKey = ICON_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenus() <em>Genus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenus()
	 * @generated
	 * @ordered
	 */
	protected static final String GENUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIETY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRepresentationKey() <em>Representation Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKey()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_KEY_EDEFAULT = "/icons/representations/arbre2/green1.png"; //$NON-NLS-1$

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
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final Family FAMILY_EDEFAULT = Family.UNKNOWN;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected Family family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

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
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this,
					PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES);
		}
		return references;
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
	public String getIconKey() {
		return iconKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconKey(String newIconKey) {
		String oldIconKey = iconKey;
		iconKey = newIconKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY, oldIconKey, iconKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenus() {
		// TODO: implement this method to return the 'Genus' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecies() {
		// TODO: implement this method to return the 'Species' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariety() {
		// TODO: implement this method to return the 'Variety' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Family getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(Family newFamily) {
		Family oldFamily = family;
		family = newFamily == null ? FAMILY_EDEFAULT : newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANT_NAMED_ELEMENT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
				return getReferences();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				return getCommonNames();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				return getLatinName();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY:
				return getIconKey();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__GENUS:
				return getGenus();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SPECIES:
				return getSpecies();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__VARIETY:
				return getVariety();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				return getRepresentationKey();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__FAMILY:
				return getFamily();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME:
				return getShortName();
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				getCommonNames().clear();
				getCommonNames().addAll((Collection<? extends String>)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				setLatinName((String)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY:
				setIconKey((String)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				setRepresentationKey((String)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__FAMILY:
				setFamily((Family)newValue);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME:
				setShortName((String)newValue);
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
				getReferences().clear();
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				getCommonNames().clear();
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				setLatinName(LATIN_NAME_EDEFAULT);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY:
				setIconKey(ICON_KEY_EDEFAULT);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				setRepresentationKey(REPRESENTATION_KEY_EDEFAULT);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
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
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
				return references != null && !references.isEmpty();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
				return commonNames != null && !commonNames.isEmpty();
			case PermadelerPackage.PLANT_NAMED_ELEMENT__LATIN_NAME:
				return LATIN_NAME_EDEFAULT == null ? latinName != null
						: !LATIN_NAME_EDEFAULT.equals(latinName);
			case PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY:
				return ICON_KEY_EDEFAULT == null ? iconKey != null : !ICON_KEY_EDEFAULT.equals(iconKey);
			case PermadelerPackage.PLANT_NAMED_ELEMENT__GENUS:
				return GENUS_EDEFAULT == null ? getGenus() != null : !GENUS_EDEFAULT.equals(getGenus());
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SPECIES:
				return SPECIES_EDEFAULT == null ? getSpecies() != null
						: !SPECIES_EDEFAULT.equals(getSpecies());
			case PermadelerPackage.PLANT_NAMED_ELEMENT__VARIETY:
				return VARIETY_EDEFAULT == null ? getVariety() != null
						: !VARIETY_EDEFAULT.equals(getVariety());
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
				return REPRESENTATION_KEY_EDEFAULT == null ? representationKey != null
						: !REPRESENTATION_KEY_EDEFAULT.equals(representationKey);
			case PermadelerPackage.PLANT_NAMED_ELEMENT__FAMILY:
				return family != FAMILY_EDEFAULT;
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null
						: !SHORT_NAME_EDEFAULT.equals(shortName);
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
		if (baseClass == ReferencingElement.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
					return PermadelerPackage.REFERENCING_ELEMENT__REFERENCES;
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
		if (baseClass == ReferencingElement.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.REFERENCING_ELEMENT__REFERENCES:
					return PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES;
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
		result.append(" (references: "); //$NON-NLS-1$
		result.append(references);
		result.append(", commonNames: "); //$NON-NLS-1$
		result.append(commonNames);
		result.append(", latinName: "); //$NON-NLS-1$
		result.append(latinName);
		result.append(", iconKey: "); //$NON-NLS-1$
		result.append(iconKey);
		result.append(", representationKey: "); //$NON-NLS-1$
		result.append(representationKey);
		result.append(", family: "); //$NON-NLS-1$
		result.append(family);
		result.append(", shortName: "); //$NON-NLS-1$
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //PlantNamedElementImpl
