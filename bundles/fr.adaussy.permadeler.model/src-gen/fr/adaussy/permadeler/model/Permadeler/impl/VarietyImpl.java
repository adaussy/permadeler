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
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.ImageOwner;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Production;
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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getVariety <em>Variety</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.VarietyImpl#getCustomProductions <em>Custom Productions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarietyImpl extends PlantNamedElementImpl implements Variety {
	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

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
	 * The cached value of the '{@link #getCustomProductions() <em>Custom Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<Production> customProductions;

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
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, PermadelerPackage.VARIETY__IMAGES);
		}
		return images;
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
	public EList<Production> getCustomProductions() {
		if (customProductions == null) {
			customProductions = new EObjectContainmentEList<Production>(Production.class, this,
					PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS);
		}
		return customProductions;
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
	public EList<Production> getProductions() {
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
			case PermadelerPackage.VARIETY__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.VARIETY__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.VARIETY__SPECIES:
				return basicSetSpecies(null, msgs);
			case PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS:
				return ((InternalEList<?>)getCustomProductions()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.VARIETY__IMAGES:
				return getImages();
			case PermadelerPackage.VARIETY__ACTIONS:
				return getActions();
			case PermadelerPackage.VARIETY__SPECIES:
				return getSpecies();
			case PermadelerPackage.VARIETY__VARIETY:
				return getVariety();
			case PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS:
				return getCustomProductions();
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
			case PermadelerPackage.VARIETY__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case PermadelerPackage.VARIETY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PermadelerPackage.VARIETY__SPECIES:
				setSpecies((Species)newValue);
				return;
			case PermadelerPackage.VARIETY__VARIETY:
				setVariety((String)newValue);
				return;
			case PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS:
				getCustomProductions().clear();
				getCustomProductions().addAll((Collection<? extends Production>)newValue);
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
			case PermadelerPackage.VARIETY__IMAGES:
				getImages().clear();
				return;
			case PermadelerPackage.VARIETY__ACTIONS:
				getActions().clear();
				return;
			case PermadelerPackage.VARIETY__SPECIES:
				setSpecies((Species)null);
				return;
			case PermadelerPackage.VARIETY__VARIETY:
				setVariety(VARIETY_EDEFAULT);
				return;
			case PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS:
				getCustomProductions().clear();
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
			case PermadelerPackage.VARIETY__IMAGES:
				return images != null && !images.isEmpty();
			case PermadelerPackage.VARIETY__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PermadelerPackage.VARIETY__SPECIES:
				return getSpecies() != null;
			case PermadelerPackage.VARIETY__VARIETY:
				return VARIETY_EDEFAULT == null ? variety != null : !VARIETY_EDEFAULT.equals(variety);
			case PermadelerPackage.VARIETY__CUSTOM_PRODUCTIONS:
				return customProductions != null && !customProductions.isEmpty();
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
		if (baseClass == ImageOwner.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.VARIETY__IMAGES:
					return PermadelerPackage.IMAGE_OWNER__IMAGES;
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
		if (baseClass == ImageOwner.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.IMAGE_OWNER__IMAGES:
					return PermadelerPackage.VARIETY__IMAGES;
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
			case PermadelerPackage.VARIETY___GET_PRODUCTIONS:
				return getProductions();
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
		result.append(" (variety: "); //$NON-NLS-1$
		result.append(variety);
		result.append(')');
		return result.toString();
	}

} //VarietyImpl
