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
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Nursary;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getSeedLib <em>Seed Lib</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getSeedbank <em>Seedbank</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getNursary <em>Nursary</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getPlanifier <em>Planifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends NamedElementImpl implements Root {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getSeedLib() <em>Seed Lib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedLib()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeBase seedLib;

	/**
	 * The cached value of the '{@link #getSeedbank() <em>Seedbank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedbank()
	 * @generated
	 * @ordered
	 */
	protected SeedBank seedbank;

	/**
	 * The cached value of the '{@link #getZones() <em>Zones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zones;

	/**
	 * The cached value of the '{@link #getNursary() <em>Nursary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNursary()
	 * @generated
	 * @ordered
	 */
	protected Nursary nursary;

	/**
	 * The cached value of the '{@link #getPlanifier() <em>Planifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanifier()
	 * @generated
	 * @ordered
	 */
	protected Planifier planifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBase getSeedLib() {
		return seedLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeedLib(KnowledgeBase newSeedLib, NotificationChain msgs) {
		KnowledgeBase oldSeedLib = seedLib;
		seedLib = newSeedLib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ROOT__SEED_LIB, oldSeedLib, newSeedLib);
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
	public void setSeedLib(KnowledgeBase newSeedLib) {
		if (newSeedLib != seedLib) {
			NotificationChain msgs = null;
			if (seedLib != null)
				msgs = ((InternalEObject)seedLib).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__SEED_LIB, null, msgs);
			if (newSeedLib != null)
				msgs = ((InternalEObject)newSeedLib).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__SEED_LIB, null, msgs);
			msgs = basicSetSeedLib(newSeedLib, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__SEED_LIB,
					newSeedLib, newSeedLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedBank getSeedbank() {
		return seedbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeedbank(SeedBank newSeedbank, NotificationChain msgs) {
		SeedBank oldSeedbank = seedbank;
		seedbank = newSeedbank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ROOT__SEEDBANK, oldSeedbank, newSeedbank);
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
	public void setSeedbank(SeedBank newSeedbank) {
		if (newSeedbank != seedbank) {
			NotificationChain msgs = null;
			if (seedbank != null)
				msgs = ((InternalEObject)seedbank).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__SEEDBANK, null, msgs);
			if (newSeedbank != null)
				msgs = ((InternalEObject)newSeedbank).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__SEEDBANK, null, msgs);
			msgs = basicSetSeedbank(newSeedbank, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__SEEDBANK,
					newSeedbank, newSeedbank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZones() {
		if (zones == null) {
			zones = new EObjectContainmentEList<Zone>(Zone.class, this, PermadelerPackage.ROOT__ZONES);
		}
		return zones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nursary getNursary() {
		return nursary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNursary(Nursary newNursary, NotificationChain msgs) {
		Nursary oldNursary = nursary;
		nursary = newNursary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ROOT__NURSARY, oldNursary, newNursary);
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
	public void setNursary(Nursary newNursary) {
		if (newNursary != nursary) {
			NotificationChain msgs = null;
			if (nursary != null)
				msgs = ((InternalEObject)nursary).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__NURSARY, null, msgs);
			if (newNursary != null)
				msgs = ((InternalEObject)newNursary).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__NURSARY, null, msgs);
			msgs = basicSetNursary(newNursary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__NURSARY, newNursary,
					newNursary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planifier getPlanifier() {
		return planifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanifier(Planifier newPlanifier, NotificationChain msgs) {
		Planifier oldPlanifier = planifier;
		planifier = newPlanifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ROOT__PLANIFIER, oldPlanifier, newPlanifier);
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
	public void setPlanifier(Planifier newPlanifier) {
		if (newPlanifier != planifier) {
			NotificationChain msgs = null;
			if (planifier != null)
				msgs = ((InternalEObject)planifier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__PLANIFIER, null, msgs);
			if (newPlanifier != null)
				msgs = ((InternalEObject)newPlanifier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__PLANIFIER, null, msgs);
			msgs = basicSetPlanifier(newPlanifier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__PLANIFIER,
					newPlanifier, newPlanifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSowPlanification(SeedItem seedItem, List<Integer> weeks, SowType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibilityLink addCompatibility(Genus source, Genus target, int cmp) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.ROOT__SEED_LIB:
				return basicSetSeedLib(null, msgs);
			case PermadelerPackage.ROOT__SEEDBANK:
				return basicSetSeedbank(null, msgs);
			case PermadelerPackage.ROOT__ZONES:
				return ((InternalEList<?>)getZones()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.ROOT__NURSARY:
				return basicSetNursary(null, msgs);
			case PermadelerPackage.ROOT__PLANIFIER:
				return basicSetPlanifier(null, msgs);
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
			case PermadelerPackage.ROOT__SEED_LIB:
				return getSeedLib();
			case PermadelerPackage.ROOT__SEEDBANK:
				return getSeedbank();
			case PermadelerPackage.ROOT__ZONES:
				return getZones();
			case PermadelerPackage.ROOT__NURSARY:
				return getNursary();
			case PermadelerPackage.ROOT__PLANIFIER:
				return getPlanifier();
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
			case PermadelerPackage.ROOT__SEED_LIB:
				setSeedLib((KnowledgeBase)newValue);
				return;
			case PermadelerPackage.ROOT__SEEDBANK:
				setSeedbank((SeedBank)newValue);
				return;
			case PermadelerPackage.ROOT__ZONES:
				getZones().clear();
				getZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case PermadelerPackage.ROOT__NURSARY:
				setNursary((Nursary)newValue);
				return;
			case PermadelerPackage.ROOT__PLANIFIER:
				setPlanifier((Planifier)newValue);
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
			case PermadelerPackage.ROOT__SEED_LIB:
				setSeedLib((KnowledgeBase)null);
				return;
			case PermadelerPackage.ROOT__SEEDBANK:
				setSeedbank((SeedBank)null);
				return;
			case PermadelerPackage.ROOT__ZONES:
				getZones().clear();
				return;
			case PermadelerPackage.ROOT__NURSARY:
				setNursary((Nursary)null);
				return;
			case PermadelerPackage.ROOT__PLANIFIER:
				setPlanifier((Planifier)null);
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
			case PermadelerPackage.ROOT__SEED_LIB:
				return seedLib != null;
			case PermadelerPackage.ROOT__SEEDBANK:
				return seedbank != null;
			case PermadelerPackage.ROOT__ZONES:
				return zones != null && !zones.isEmpty();
			case PermadelerPackage.ROOT__NURSARY:
				return nursary != null;
			case PermadelerPackage.ROOT__PLANIFIER:
				return planifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PermadelerPackage.ROOT___ADD_SOW_PLANIFICATION__SEEDITEM_LIST_SOWTYPE:
				addSowPlanification((SeedItem)arguments.get(0), (List<Integer>)arguments.get(1),
						(SowType)arguments.get(2));
				return null;
			case PermadelerPackage.ROOT___ADD_COMPATIBILITY__GENUS_GENUS_INT:
				return addCompatibility((Genus)arguments.get(0), (Genus)arguments.get(1),
						(Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RootImpl
