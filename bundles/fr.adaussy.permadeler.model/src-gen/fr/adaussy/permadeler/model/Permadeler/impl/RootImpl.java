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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getKnowledgeBase <em>Knowledge Base</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getSeedbank <em>Seedbank</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getNursary <em>Nursary</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getPlanifier <em>Planifier</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends NamedElementImpl implements Root {
	/**
	 * The cached value of the '{@link #getKnowledgeBase() <em>Knowledge Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeBase()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeBase knowledgeBase;

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
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

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
	public KnowledgeBase getKnowledgeBase() {
		return knowledgeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledgeBase(KnowledgeBase newKnowledgeBase, NotificationChain msgs) {
		KnowledgeBase oldKnowledgeBase = knowledgeBase;
		knowledgeBase = newKnowledgeBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.ROOT__KNOWLEDGE_BASE, oldKnowledgeBase, newKnowledgeBase);
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
	public void setKnowledgeBase(KnowledgeBase newKnowledgeBase) {
		if (newKnowledgeBase != knowledgeBase) {
			NotificationChain msgs = null;
			if (knowledgeBase != null)
				msgs = ((InternalEObject)knowledgeBase).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__KNOWLEDGE_BASE, null, msgs);
			if (newKnowledgeBase != null)
				msgs = ((InternalEObject)newKnowledgeBase).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.ROOT__KNOWLEDGE_BASE, null, msgs);
			msgs = basicSetKnowledgeBase(newKnowledgeBase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__KNOWLEDGE_BASE,
					newKnowledgeBase, newKnowledgeBase));
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
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.ROOT__PRODUCT_VERSION,
					oldProductVersion, productVersion));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.ROOT__KNOWLEDGE_BASE:
				return basicSetKnowledgeBase(null, msgs);
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
			case PermadelerPackage.ROOT__KNOWLEDGE_BASE:
				return getKnowledgeBase();
			case PermadelerPackage.ROOT__SEEDBANK:
				return getSeedbank();
			case PermadelerPackage.ROOT__ZONES:
				return getZones();
			case PermadelerPackage.ROOT__NURSARY:
				return getNursary();
			case PermadelerPackage.ROOT__PLANIFIER:
				return getPlanifier();
			case PermadelerPackage.ROOT__PRODUCT_VERSION:
				return getProductVersion();
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
			case PermadelerPackage.ROOT__KNOWLEDGE_BASE:
				setKnowledgeBase((KnowledgeBase)newValue);
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
			case PermadelerPackage.ROOT__PRODUCT_VERSION:
				setProductVersion((String)newValue);
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
			case PermadelerPackage.ROOT__KNOWLEDGE_BASE:
				setKnowledgeBase((KnowledgeBase)null);
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
			case PermadelerPackage.ROOT__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
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
			case PermadelerPackage.ROOT__KNOWLEDGE_BASE:
				return knowledgeBase != null;
			case PermadelerPackage.ROOT__SEEDBANK:
				return seedbank != null;
			case PermadelerPackage.ROOT__ZONES:
				return zones != null && !zones.isEmpty();
			case PermadelerPackage.ROOT__NURSARY:
				return nursary != null;
			case PermadelerPackage.ROOT__PLANIFIER:
				return planifier != null;
			case PermadelerPackage.ROOT__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null
						: !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
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
		result.append(" (productVersion: "); //$NON-NLS-1$
		result.append(productVersion);
		result.append(')');
		return result.toString();
	}

} //RootImpl
