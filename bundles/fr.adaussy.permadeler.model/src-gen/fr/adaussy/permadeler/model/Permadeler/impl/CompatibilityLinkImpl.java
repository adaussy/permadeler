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

import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compatibility Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibilityLinkImpl extends MinimalEObjectImpl.Container implements CompatibilityLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected EList<Genus> species;

	/**
	 * The default value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected static final int AFFINITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected int affinity = AFFINITY_EDEFAULT;

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
	protected CompatibilityLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.COMPATIBILITY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genus> getSpecies() {
		if (species == null) {
			species = new EObjectWithInverseResolvingEList.ManyInverse<Genus>(Genus.class, this,
					PermadelerPackage.COMPATIBILITY_LINK__SPECIES,
					PermadelerPackage.GENUS__COMPATIBILITY_LINKS);
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAffinity() {
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity(int newAffinity) {
		int oldAffinity = affinity;
		affinity = newAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.COMPATIBILITY_LINK__AFFINITY, oldAffinity, affinity));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.COMPATIBILITY_LINK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecies()).basicAdd(otherEnd,
						msgs);
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
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				return ((InternalEList<?>)getSpecies()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				return getSpecies();
			case PermadelerPackage.COMPATIBILITY_LINK__AFFINITY:
				return getAffinity();
			case PermadelerPackage.COMPATIBILITY_LINK__DESCRIPTION:
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
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				getSpecies().clear();
				getSpecies().addAll((Collection<? extends Genus>)newValue);
				return;
			case PermadelerPackage.COMPATIBILITY_LINK__AFFINITY:
				setAffinity((Integer)newValue);
				return;
			case PermadelerPackage.COMPATIBILITY_LINK__DESCRIPTION:
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
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				getSpecies().clear();
				return;
			case PermadelerPackage.COMPATIBILITY_LINK__AFFINITY:
				setAffinity(AFFINITY_EDEFAULT);
				return;
			case PermadelerPackage.COMPATIBILITY_LINK__DESCRIPTION:
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
			case PermadelerPackage.COMPATIBILITY_LINK__SPECIES:
				return species != null && !species.isEmpty();
			case PermadelerPackage.COMPATIBILITY_LINK__AFFINITY:
				return affinity != AFFINITY_EDEFAULT;
			case PermadelerPackage.COMPATIBILITY_LINK__DESCRIPTION:
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (affinity: ");
		result.append(affinity);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CompatibilityLinkImpl
