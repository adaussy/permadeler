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
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Species;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeBaseImpl extends MinimalEObjectImpl.Container implements KnowledgeBase {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantGroup> groups;

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
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<Species> templates;

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
	public EList<Species> getSpecies() {
		if (species == null) {
			species = new EObjectContainmentEList<Species>(Species.class, this,
					PermadelerPackage.KNOWLEDGE_BASE__SPECIES);
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Species> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<Species>(Species.class, this,
					PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<PlantGroup>(PlantGroup.class, this,
					PermadelerPackage.KNOWLEDGE_BASE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getAllPlants() {
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
			case PermadelerPackage.KNOWLEDGE_BASE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.KNOWLEDGE_BASE__SPECIES:
				return ((InternalEList<?>)getSpecies()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.KNOWLEDGE_BASE__GROUPS:
				return getGroups();
			case PermadelerPackage.KNOWLEDGE_BASE__SPECIES:
				return getSpecies();
			case PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES:
				return getTemplates();
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
			case PermadelerPackage.KNOWLEDGE_BASE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends PlantGroup>)newValue);
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__SPECIES:
				getSpecies().clear();
				getSpecies().addAll((Collection<? extends Species>)newValue);
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Species>)newValue);
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
			case PermadelerPackage.KNOWLEDGE_BASE__GROUPS:
				getGroups().clear();
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__SPECIES:
				getSpecies().clear();
				return;
			case PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES:
				getTemplates().clear();
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
			case PermadelerPackage.KNOWLEDGE_BASE__GROUPS:
				return groups != null && !groups.isEmpty();
			case PermadelerPackage.KNOWLEDGE_BASE__SPECIES:
				return species != null && !species.isEmpty();
			case PermadelerPackage.KNOWLEDGE_BASE__TEMPLATES:
				return templates != null && !templates.isEmpty();
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
			case PermadelerPackage.KNOWLEDGE_BASE___GET_ALL_PLANTS:
				return getAllPlants();
		}
		return super.eInvoke(operationID, arguments);
	}

} //KnowledgeBaseImpl
