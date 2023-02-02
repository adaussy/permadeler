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
package fr.adaussy.permadeler.model.Permadeler;

import java.time.Instant;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plantation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationDate <em>Plantation Date</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRootstock <em>Rootstock</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getId <em>Id</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#isWireframe <em>Wireframe</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRepresentationKind <em>Representation Kind</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation()
 * @model
 * @generated
 */
public interface Plantation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Plant)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Type()
	 * @model required="true"
	 * @generated
	 */
	Plant getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Plant value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Plantation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plantation Date</em>' attribute.
	 * @see #setPlantationDate(Instant)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_PlantationDate()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.Date"
	 * @generated
	 */
	Instant getPlantationDate();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationDate <em>Plantation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plantation Date</em>' attribute.
	 * @see #getPlantationDate()
	 * @generated
	 */
	void setPlantationDate(Instant value);

	/**
	 * Returns the value of the '<em><b>Current Layer</b></em>' attribute.
	 * The default value is <code>"UNDERSTORY"</code>.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Layer</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @see #setCurrentLayer(Layer)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_CurrentLayer()
	 * @model default="UNDERSTORY"
	 * @generated
	 */
	Layer getCurrentLayer();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getCurrentLayer <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Layer</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @see #getCurrentLayer()
	 * @generated
	 */
	void setCurrentLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Rootstock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootstock</em>' attribute.
	 * @see #setRootstock(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Rootstock()
	 * @model
	 * @generated
	 */
	String getRootstock();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRootstock <em>Rootstock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rootstock</em>' attribute.
	 * @see #getRootstock()
	 * @generated
	 */
	void setRootstock(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Wireframe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Impact the representation of this plantation in all representations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wireframe</em>' attribute.
	 * @see #setWireframe(boolean)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_Wireframe()
	 * @model
	 * @generated
	 */
	boolean isWireframe();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#isWireframe <em>Wireframe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wireframe</em>' attribute.
	 * @see #isWireframe()
	 * @generated
	 */
	void setWireframe(boolean value);

	/**
	 * Returns the value of the '<em><b>Representation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.RepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Kind</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RepresentationKind
	 * @see #setRepresentationKind(RepresentationKind)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlantation_RepresentationKind()
	 * @model
	 * @generated
	 */
	RepresentationKind getRepresentationKind();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRepresentationKind <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Kind</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RepresentationKind
	 * @see #getRepresentationKind()
	 * @generated
	 */
	void setRepresentationKind(RepresentationKind value);

} // Plantation
