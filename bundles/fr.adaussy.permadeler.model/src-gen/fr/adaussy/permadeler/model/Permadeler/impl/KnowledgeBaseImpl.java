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

import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl#getPlantTypes <em>Plant Types</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl#getCompatibilityMatrix <em>Compatibility Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeBaseImpl extends MinimalEObjectImpl.Container implements KnowledgeBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The cached value of the '{@link #getPlantTypes() <em>Plant Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Genus> plantTypes;

	/**
	 * The cached value of the '{@link #getCompatibilityMatrix() <em>Compatibility Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibilityMatrix()
	 * @generated
	 * @ordered
	 */
	protected CompatibilityMatrix compatibilityMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.KNOWLEDGE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genus> getPlantTypes() {
		if (plantTypes == null) {
			plantTypes = new EObjectContainmentEList<Genus>(Genus.class, this,
					PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES);
		}
		return plantTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibilityMatrix getCompatibilityMatrix() {
		return compatibilityMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompatibilityMatrix(CompatibilityMatrix newCompatibilityMatrix,
			NotificationChain msgs) {
		CompatibilityMatrix oldCompatibilityMatrix = compatibilityMatrix;
		compatibilityMatrix = newCompatibilityMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX, oldCompatibilityMatrix,
					newCompatibilityMatrix);
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
	public void setCompatibilityMatrix(CompatibilityMatrix newCompatibilityMatrix) {
		if (newCompatibilityMatrix != compatibilityMatrix) {
			NotificationChain msgs = null;
			if (compatibilityMatrix != null)
				msgs = ((InternalEObject)compatibilityMatrix).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX, null,
						msgs);
			if (newCompatibilityMatrix != null)
				msgs = ((InternalEObject)newCompatibilityMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX, null,
						msgs);
			msgs = basicSetCompatibilityMatrix(newCompatibilityMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX, newCompatibilityMatrix,
					newCompatibilityMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES:
				return ((InternalEList<?>)getPlantTypes()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX:
				return basicSetCompatibilityMatrix(null, msgs);
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
			case PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES:
				return getPlantTypes();
			case PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX:
				return getCompatibilityMatrix();
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
			case PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES:
				getPlantTypes().clear();
				getPlantTypes().addAll((Collection<? extends Genus>)newValue);
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX:
				setCompatibilityMatrix((CompatibilityMatrix)newValue);
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
			case PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES:
				getPlantTypes().clear();
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX:
				setCompatibilityMatrix((CompatibilityMatrix)null);
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
			case PermadelerPackage.KNOWLEDGE_BASE__PLANT_TYPES:
				return plantTypes != null && !plantTypes.isEmpty();
			case PermadelerPackage.KNOWLEDGE_BASE__COMPATIBILITY_MATRIX:
				return compatibilityMatrix != null;
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeBaseImpl
