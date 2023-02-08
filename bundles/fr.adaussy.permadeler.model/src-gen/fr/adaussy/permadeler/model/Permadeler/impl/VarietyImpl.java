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

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.NamedElement;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ReferencingElement;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variety</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getReferences <em>References</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getIconKey <em>Icon Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getCommonNames <em>Common Names</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getRepresentationKey <em>Representation Key</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getVariety <em>Variety</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarietyImpl extends ImageOwnerImpl implements Variety {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	 * The cached value of the '{@link #getCommonNames() <em>Common Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commonNames;

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
	 * The cached value of the '{@link #getProductions() <em>Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<Production> productions;

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
	 * The cached value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected String variety = VARIETY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarietyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.VARIETY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this,
					PermadelerPackage.VARIETY__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this,
					PermadelerPackage.VARIETY__ACTIONS);
		}
		return actions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__ICON_KEY,
					oldIconKey, iconKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommonNames() {
		if (commonNames == null) {
			commonNames = new EDataTypeUniqueEList<String>(String.class, this,
					PermadelerPackage.VARIETY__COMMON_NAMES);
		}
		return commonNames;
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
					PermadelerPackage.VARIETY__REPRESENTATION_KEY, oldRepresentationKey, representationKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__SHORT_NAME,
					oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Production> getProductions() {
		if (productions == null) {
			productions = new EObjectContainmentEList<Production>(Production.class, this,
					PermadelerPackage.VARIETY__PRODUCTIONS);
		}
		return productions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Species getSpecies() {
		if (eContainerFeatureID() != PermadelerPackage.VARIETY__SPECIES)
			return null;
		return (Species)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(Species newSpecies, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecies, PermadelerPackage.VARIETY__SPECIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(Species newSpecies) {
		if (newSpecies != eInternalContainer()
				|| (eContainerFeatureID() != PermadelerPackage.VARIETY__SPECIES && newSpecies != null)) {
			if (EcoreUtil.isAncestor(this, newSpecies))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, PermadelerPackage.SPECIES__VARIETIES,
						Species.class, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__SPECIES,
					newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariety() {
		return variety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariety(String newVariety) {
		String oldVariety = variety;
		variety = newVariety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.VARIETY__VARIETY,
					oldVariety, variety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Production> getAllProductions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullLatinName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getDefaultLayer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationKind getDefaultRepresentationKind() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAllActions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialUses> getAllSpecialUses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllNames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveIconKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveRepresentationKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle getLifeCycle() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.VARIETY__SPECIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecies((Species)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.VARIETY__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.VARIETY__PRODUCTIONS:
				return ((InternalEList<?>)getProductions()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.VARIETY__SPECIES:
				return basicSetSpecies(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PermadelerPackage.VARIETY__SPECIES:
				return eInternalContainer().eInverseRemove(this, PermadelerPackage.SPECIES__VARIETIES,
						Species.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.VARIETY__NAME:
				return getName();
			case PermadelerPackage.VARIETY__DESCRIPTION:
				return getDescription();
			case PermadelerPackage.VARIETY__REFERENCES:
				return getReferences();
			case PermadelerPackage.VARIETY__ACTIONS:
				return getActions();
			case PermadelerPackage.VARIETY__ICON_KEY:
				return getIconKey();
			case PermadelerPackage.VARIETY__COMMON_NAMES:
				return getCommonNames();
			case PermadelerPackage.VARIETY__REPRESENTATION_KEY:
				return getRepresentationKey();
			case PermadelerPackage.VARIETY__SHORT_NAME:
				return getShortName();
			case PermadelerPackage.VARIETY__PRODUCTIONS:
				return getProductions();
			case PermadelerPackage.VARIETY__SPECIES:
				return getSpecies();
			case PermadelerPackage.VARIETY__VARIETY:
				return getVariety();
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
			case PermadelerPackage.VARIETY__NAME:
				setName((String)newValue);
				return;
			case PermadelerPackage.VARIETY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PermadelerPackage.VARIETY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case PermadelerPackage.VARIETY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PermadelerPackage.VARIETY__ICON_KEY:
				setIconKey((String)newValue);
				return;
			case PermadelerPackage.VARIETY__COMMON_NAMES:
				getCommonNames().clear();
				getCommonNames().addAll((Collection<? extends String>)newValue);
				return;
			case PermadelerPackage.VARIETY__REPRESENTATION_KEY:
				setRepresentationKey((String)newValue);
				return;
			case PermadelerPackage.VARIETY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case PermadelerPackage.VARIETY__PRODUCTIONS:
				getProductions().clear();
				getProductions().addAll((Collection<? extends Production>)newValue);
				return;
			case PermadelerPackage.VARIETY__SPECIES:
				setSpecies((Species)newValue);
				return;
			case PermadelerPackage.VARIETY__VARIETY:
				setVariety((String)newValue);
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
			case PermadelerPackage.VARIETY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__REFERENCES:
				getReferences().clear();
				return;
			case PermadelerPackage.VARIETY__ACTIONS:
				getActions().clear();
				return;
			case PermadelerPackage.VARIETY__ICON_KEY:
				setIconKey(ICON_KEY_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__COMMON_NAMES:
				getCommonNames().clear();
				return;
			case PermadelerPackage.VARIETY__REPRESENTATION_KEY:
				setRepresentationKey(REPRESENTATION_KEY_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__PRODUCTIONS:
				getProductions().clear();
				return;
			case PermadelerPackage.VARIETY__SPECIES:
				setSpecies((Species)null);
				return;
			case PermadelerPackage.VARIETY__VARIETY:
				setVariety(VARIETY_EDEFAULT);
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
			case PermadelerPackage.VARIETY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PermadelerPackage.VARIETY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null
						: !DESCRIPTION_EDEFAULT.equals(description);
			case PermadelerPackage.VARIETY__REFERENCES:
				return references != null && !references.isEmpty();
			case PermadelerPackage.VARIETY__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PermadelerPackage.VARIETY__ICON_KEY:
				return ICON_KEY_EDEFAULT == null ? iconKey != null : !ICON_KEY_EDEFAULT.equals(iconKey);
			case PermadelerPackage.VARIETY__COMMON_NAMES:
				return commonNames != null && !commonNames.isEmpty();
			case PermadelerPackage.VARIETY__REPRESENTATION_KEY:
				return REPRESENTATION_KEY_EDEFAULT == null ? representationKey != null
						: !REPRESENTATION_KEY_EDEFAULT.equals(representationKey);
			case PermadelerPackage.VARIETY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null
						: !SHORT_NAME_EDEFAULT.equals(shortName);
			case PermadelerPackage.VARIETY__PRODUCTIONS:
				return productions != null && !productions.isEmpty();
			case PermadelerPackage.VARIETY__SPECIES:
				return getSpecies() != null;
			case PermadelerPackage.VARIETY__VARIETY:
				return VARIETY_EDEFAULT == null ? variety != null : !VARIETY_EDEFAULT.equals(variety);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.VARIETY__NAME:
					return PermadelerPackage.NAMED_ELEMENT__NAME;
				case PermadelerPackage.VARIETY__DESCRIPTION:
					return PermadelerPackage.NAMED_ELEMENT__DESCRIPTION;
				default:
					return -1;
			}
		}
		if (baseClass == ReferencingElement.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.VARIETY__REFERENCES:
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.NAMED_ELEMENT__NAME:
					return PermadelerPackage.VARIETY__NAME;
				case PermadelerPackage.NAMED_ELEMENT__DESCRIPTION:
					return PermadelerPackage.VARIETY__DESCRIPTION;
				default:
					return -1;
			}
		}
		if (baseClass == ReferencingElement.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.REFERENCING_ELEMENT__REFERENCES:
					return PermadelerPackage.VARIETY__REFERENCES;
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
			case PermadelerPackage.VARIETY___GET_ALL_PRODUCTIONS:
				return getAllProductions();
			case PermadelerPackage.VARIETY___GET_FULL_LATIN_NAME:
				return getFullLatinName();
			case PermadelerPackage.VARIETY___GET_DEFAULT_LAYER:
				return getDefaultLayer();
			case PermadelerPackage.VARIETY___GET_DEFAULT_REPRESENTATION_KIND:
				return getDefaultRepresentationKind();
			case PermadelerPackage.VARIETY___GET_REPRESENTATION:
				return getRepresentation();
			case PermadelerPackage.VARIETY___GET_ALL_ACTIONS:
				return getAllActions();
			case PermadelerPackage.VARIETY___GET_ALL_SPECIAL_USES:
				return getAllSpecialUses();
			case PermadelerPackage.VARIETY___GET_ALL_NAMES:
				return getAllNames();
			case PermadelerPackage.VARIETY___GET_EFFECTIVE_ICON_KEY:
				return getEffectiveIconKey();
			case PermadelerPackage.VARIETY___GET_EFFECTIVE_REPRESENTATION_KEY:
				return getEffectiveRepresentationKey();
			case PermadelerPackage.VARIETY___GET_LIFE_CYCLE:
				return getLifeCycle();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", references: "); //$NON-NLS-1$
		result.append(references);
		result.append(", iconKey: "); //$NON-NLS-1$
		result.append(iconKey);
		result.append(", commonNames: "); //$NON-NLS-1$
		result.append(commonNames);
		result.append(", representationKey: "); //$NON-NLS-1$
		result.append(representationKey);
		result.append(", shortName: "); //$NON-NLS-1$
		result.append(shortName);
		result.append(", variety: "); //$NON-NLS-1$
		result.append(variety);
		result.append(')');
		return result.toString();
	}

} //VarietyImpl
