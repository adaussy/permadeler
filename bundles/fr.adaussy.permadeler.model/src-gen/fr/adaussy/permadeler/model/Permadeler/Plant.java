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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getMinTemperature <em>Min Temperature</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getFoilageType <em>Foilage Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getFoilageShade <em>Foilage Shade</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getDroughtTolerance <em>Drought Tolerance</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getToleratedLightingCondition <em>Tolerated Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Plant#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends PlantNamedElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Soil Type</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.SoilType}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SoilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Type</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_SoilType()
	 * @model
	 * @generated
	 */
	EList<SoilType> getSoilType();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Lighting Condition</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lighting Condition</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_LightingCondition()
	 * @model
	 * @generated
	 */
	EList<Shade> getLightingCondition();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Min Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Temperature</em>' attribute.
	 * @see #setMinTemperature(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_MinTemperature()
	 * @model
	 * @generated
	 */
	int getMinTemperature();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getMinTemperature <em>Min Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Temperature</em>' attribute.
	 * @see #getMinTemperature()
	 * @generated
	 */
	void setMinTemperature(int value);

	/**
	 * Returns the value of the '<em><b>Moisture</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Moisture}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Moisture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Moisture()
	 * @model
	 * @generated
	 */
	EList<Moisture> getMoisture();

	/**
	 * Returns the value of the '<em><b>Special Uses</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.SpecialUses}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SpecialUses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Uses</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_SpecialUses()
	 * @model
	 * @generated
	 */
	EList<SpecialUses> getSpecialUses();

	/**
	 * Returns the value of the '<em><b>Grow Rate</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.GrowRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grow Rate</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see #setGrowRate(GrowRate)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_GrowRate()
	 * @model
	 * @generated
	 */
	GrowRate getGrowRate();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getGrowRate <em>Grow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grow Rate</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see #getGrowRate()
	 * @generated
	 */
	void setGrowRate(GrowRate value);

	/**
	 * Returns the value of the '<em><b>Wind</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Wind}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Wind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Wind
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Wind()
	 * @model
	 * @generated
	 */
	EList<Wind> getWind();

	/**
	 * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Production}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productions</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Productions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Production> getProductions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Life Cycle</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #setLifeCycle(Lifecycle)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_LifeCycle()
	 * @model
	 * @generated
	 */
	Lifecycle getLifeCycle();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #getLifeCycle()
	 * @generated
	 */
	void setLifeCycle(Lifecycle value);

	/**
	 * Returns the value of the '<em><b>Foilage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.FoliageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foilage Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoliageType
	 * @see #setFoilageType(FoliageType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_FoilageType()
	 * @model
	 * @generated
	 */
	FoliageType getFoilageType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getFoilageType <em>Foilage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foilage Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoliageType
	 * @see #getFoilageType()
	 * @generated
	 */
	void setFoilageType(FoliageType value);

	/**
	 * Returns the value of the '<em><b>Foilage Shade</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.FoilageShade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foilage Shade</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoilageShade
	 * @see #setFoilageShade(FoilageShade)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_FoilageShade()
	 * @model
	 * @generated
	 */
	FoilageShade getFoilageShade();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getFoilageShade <em>Foilage Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foilage Shade</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoilageShade
	 * @see #getFoilageShade()
	 * @generated
	 */
	void setFoilageShade(FoilageShade value);

	/**
	 * Returns the value of the '<em><b>Drought Tolerance</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.DroughtTolerance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drought Tolerance</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.DroughtTolerance
	 * @see #setDroughtTolerance(DroughtTolerance)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_DroughtTolerance()
	 * @model
	 * @generated
	 */
	DroughtTolerance getDroughtTolerance();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getDroughtTolerance <em>Drought Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drought Tolerance</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.DroughtTolerance
	 * @see #getDroughtTolerance()
	 * @generated
	 */
	void setDroughtTolerance(DroughtTolerance value);

	/**
	 * Returns the value of the '<em><b>Tolerated Lighting Condition</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerated Lighting Condition</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_ToleratedLightingCondition()
	 * @model
	 * @generated
	 */
	EList<Shade> getToleratedLightingCondition();

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.RootType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RootType
	 * @see #setRootType(RootType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getPlant_RootType()
	 * @model
	 * @generated
	 */
	RootType getRootType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getRootType <em>Root Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RootType
	 * @see #getRootType()
	 * @generated
	 */
	void setRootType(RootType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllNames();

} // Plant
