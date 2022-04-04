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
import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;

import fr.adaussy.permadeler.model.utils.Color;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl#getSubGenus <em>Sub Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl#getCompatibilityLinks <em>Compatibility Links</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenusImpl extends PlantNamedElementImpl implements Genus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> species;

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
	 * The cached value of the '{@link #getSubGenus() <em>Sub Genus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Genus> subGenus;

	/**
	 * The cached value of the '{@link #getCompatibilityLinks() <em>Compatibility Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibilityLink> compatibilityLinks;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.GENUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Species> getSpecies() {
		if (species == null) {
			species = new EObjectContainmentWithInverseEList<Species>(Species.class, this,
					PermadelerPackage.GENUS__SPECIES, PermadelerPackage.SPECIES__TYPE);
		}
		return species;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.GENUS__FAMILY, oldFamily,
					family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genus> getSubGenus() {
		if (subGenus == null) {
			subGenus = new EObjectContainmentEList<Genus>(Genus.class, this,
					PermadelerPackage.GENUS__SUB_GENUS);
		}
		return subGenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibilityLink> getCompatibilityLinks() {
		if (compatibilityLinks == null) {
			compatibilityLinks = new EObjectWithInverseResolvingEList.ManyInverse<CompatibilityLink>(
					CompatibilityLink.class, this, PermadelerPackage.GENUS__COMPATIBILITY_LINKS,
					PermadelerPackage.COMPATIBILITY_LINK__SPECIES);
		}
		return compatibilityLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.GENUS__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getEffectiveColor() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PermadelerPackage.GENUS__SPECIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecies()).basicAdd(otherEnd,
						msgs);
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibilityLinks())
						.basicAdd(otherEnd, msgs);
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
			case PermadelerPackage.GENUS__SPECIES:
				return ((InternalEList<?>)getSpecies()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.GENUS__SUB_GENUS:
				return ((InternalEList<?>)getSubGenus()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				return ((InternalEList<?>)getCompatibilityLinks()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.GENUS__SPECIES:
				return getSpecies();
			case PermadelerPackage.GENUS__FAMILY:
				return getFamily();
			case PermadelerPackage.GENUS__SUB_GENUS:
				return getSubGenus();
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				return getCompatibilityLinks();
			case PermadelerPackage.GENUS__COLOR:
				return getColor();
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
			case PermadelerPackage.GENUS__SPECIES:
				getSpecies().clear();
				getSpecies().addAll((Collection<? extends Species>)newValue);
				return;
			case PermadelerPackage.GENUS__FAMILY:
				setFamily((Family)newValue);
				return;
			case PermadelerPackage.GENUS__SUB_GENUS:
				getSubGenus().clear();
				getSubGenus().addAll((Collection<? extends Genus>)newValue);
				return;
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				getCompatibilityLinks().clear();
				getCompatibilityLinks().addAll((Collection<? extends CompatibilityLink>)newValue);
				return;
			case PermadelerPackage.GENUS__COLOR:
				setColor((Color)newValue);
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
			case PermadelerPackage.GENUS__SPECIES:
				getSpecies().clear();
				return;
			case PermadelerPackage.GENUS__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case PermadelerPackage.GENUS__SUB_GENUS:
				getSubGenus().clear();
				return;
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				getCompatibilityLinks().clear();
				return;
			case PermadelerPackage.GENUS__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case PermadelerPackage.GENUS__SPECIES:
				return species != null && !species.isEmpty();
			case PermadelerPackage.GENUS__FAMILY:
				return family != FAMILY_EDEFAULT;
			case PermadelerPackage.GENUS__SUB_GENUS:
				return subGenus != null && !subGenus.isEmpty();
			case PermadelerPackage.GENUS__COMPATIBILITY_LINKS:
				return compatibilityLinks != null && !compatibilityLinks.isEmpty();
			case PermadelerPackage.GENUS__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
			case PermadelerPackage.GENUS___GET_EFFECTIVE_COLOR:
				return getEffectiveColor();
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
		result.append(" (family: ");
		result.append(family);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //GenusImpl
