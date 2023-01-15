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
 * A representation of the model object '<em><b>Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getVarieties <em>Varieties</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getGenus <em>Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getRootType <em>Root Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFoilageType <em>Foilage Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getDroughtTolerance <em>Drought Tolerance</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFoilageShade <em>Foilage Shade</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getToleratedLightingCondition <em>Tolerated Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getMinTemperature <em>Min Temperature</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getDefaultLayer <em>Default Layer</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getDefaultRepresentationKind <em>Default Representation Kind</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies()
 * @model
 * @generated
 */
public interface Species extends Plant {
	/**
	 * Returns the value of the '<em><b>Varieties</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Variety}.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.Variety#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varieties</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Varieties()
	 * @see fr.adaussy.permadeler.model.Permadeler.Variety#getSpecies
	 * @model opposite="species" containment="true"
	 * @generated
	 */
	EList<Variety> getVarieties();

	/**
	 * Returns the value of the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' attribute.
	 * @see #setSpecies(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Species()
	 * @model
	 * @generated
	 */
	String getSpecies();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getSpecies <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' attribute.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(String value);

	/**
	 * Returns the value of the '<em><b>Genus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genus</em>' attribute.
	 * @see #setGenus(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Genus()
	 * @model
	 * @generated
	 */
	String getGenus();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getGenus <em>Genus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genus</em>' attribute.
	 * @see #getGenus()
	 * @generated
	 */
	void setGenus(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Family}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see #setFamily(Family)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Family()
	 * @model
	 * @generated
	 */
	Family getFamily();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Family value);

	/**
	 * Returns the value of the '<em><b>Life Cycle</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #setLifeCycle(Lifecycle)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_LifeCycle()
	 * @model
	 * @generated
	 */
	Lifecycle getLifeCycle();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getLifeCycle <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see #getLifeCycle()
	 * @generated
	 */
	void setLifeCycle(Lifecycle value);

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.RootType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RootType
	 * @see #setRootType(RootType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_RootType()
	 * @model
	 * @generated
	 */
	RootType getRootType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getRootType <em>Root Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RootType
	 * @see #getRootType()
	 * @generated
	 */
	void setRootType(RootType value);

	/**
	 * Returns the value of the '<em><b>Foilage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.FoliageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foilage Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoliageType
	 * @see #setFoilageType(FoliageType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_FoilageType()
	 * @model
	 * @generated
	 */
	FoliageType getFoilageType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFoilageType <em>Foilage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foilage Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoliageType
	 * @see #getFoilageType()
	 * @generated
	 */
	void setFoilageType(FoliageType value);

	/**
	 * Returns the value of the '<em><b>Drought Tolerance</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.DroughtTolerance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drought Tolerance</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.DroughtTolerance
	 * @see #setDroughtTolerance(DroughtTolerance)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_DroughtTolerance()
	 * @model
	 * @generated
	 */
	DroughtTolerance getDroughtTolerance();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getDroughtTolerance <em>Drought Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drought Tolerance</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.DroughtTolerance
	 * @see #getDroughtTolerance()
	 * @generated
	 */
	void setDroughtTolerance(DroughtTolerance value);

	/**
	 * Returns the value of the '<em><b>Foilage Shade</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.FoilageShade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foilage Shade</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoilageShade
	 * @see #setFoilageShade(FoilageShade)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_FoilageShade()
	 * @model
	 * @generated
	 */
	FoilageShade getFoilageShade();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFoilageShade <em>Foilage Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foilage Shade</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.FoilageShade
	 * @see #getFoilageShade()
	 * @generated
	 */
	void setFoilageShade(FoilageShade value);

	/**
	 * Returns the value of the '<em><b>Tolerated Lighting Condition</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerated Lighting Condition</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_ToleratedLightingCondition()
	 * @model
	 * @generated
	 */
	EList<Shade> getToleratedLightingCondition();

	/**
	 * Returns the value of the '<em><b>Lighting Condition</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Shade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lighting Condition</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_LightingCondition()
	 * @model
	 * @generated
	 */
	EList<Shade> getLightingCondition();

	/**
	 * Returns the value of the '<em><b>Moisture</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Moisture}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Moisture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Moisture()
	 * @model
	 * @generated
	 */
	EList<Moisture> getMoisture();

	/**
	 * Returns the value of the '<em><b>Soil Type</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.SoilType}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SoilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soil Type</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_SoilType()
	 * @model
	 * @generated
	 */
	EList<SoilType> getSoilType();

	/**
	 * Returns the value of the '<em><b>Min Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Temperature</em>' attribute.
	 * @see #setMinTemperature(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_MinTemperature()
	 * @model
	 * @generated
	 */
	int getMinTemperature();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getMinTemperature <em>Min Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Temperature</em>' attribute.
	 * @see #getMinTemperature()
	 * @generated
	 */
	void setMinTemperature(int value);

	/**
	 * Returns the value of the '<em><b>Wind</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Wind}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Wind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.Wind
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Wind()
	 * @model
	 * @generated
	 */
	EList<Wind> getWind();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Special Uses</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.SpecialUses}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.SpecialUses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Uses</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_SpecialUses()
	 * @model
	 * @generated
	 */
	EList<SpecialUses> getSpecialUses();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Grow Rate</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.GrowRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grow Rate</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see #setGrowRate(GrowRate)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_GrowRate()
	 * @model
	 * @generated
	 */
	GrowRate getGrowRate();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getGrowRate <em>Grow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grow Rate</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see #getGrowRate()
	 * @generated
	 */
	void setGrowRate(GrowRate value);

	/**
	 * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Production}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productions</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Productions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Production> getProductions();

	/**
	 * Returns the value of the '<em><b>Default Layer</b></em>' attribute.
	 * The default value is <code>"UNDERSTORY"</code>.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Layer</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @see #setDefaultLayer(Layer)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_DefaultLayer()
	 * @model default="UNDERSTORY"
	 * @generated
	 */
	Layer getDefaultLayer();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getDefaultLayer <em>Default Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Layer</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @see #getDefaultLayer()
	 * @generated
	 */
	void setDefaultLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Default Representation Kind</b></em>' attribute.
	 * The default value is <code>"TREE_CROWN"</code>.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.RepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Representation Kind</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RepresentationKind
	 * @see #setDefaultRepresentationKind(RepresentationKind)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_DefaultRepresentationKind()
	 * @model default="TREE_CROWN"
	 * @generated
	 */
	RepresentationKind getDefaultRepresentationKind();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getDefaultRepresentationKind <em>Default Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Representation Kind</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.RepresentationKind
	 * @see #getDefaultRepresentationKind()
	 * @generated
	 */
	void setDefaultRepresentationKind(RepresentationKind value);

} // Species
