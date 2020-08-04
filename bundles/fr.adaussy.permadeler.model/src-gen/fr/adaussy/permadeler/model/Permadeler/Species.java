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
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMin <em>Usda Hardiness Min</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getReferences <em>References</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getProductiveMonths <em>Productive Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getBloomMonths <em>Bloom Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFruitConservation <em>Fruit Conservation</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFruitsAvailability <em>Fruits Availability</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getEatingType <em>Eating Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getEdibleParts <em>Edible Parts</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMax <em>Usda Hardiness Max</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getFlowerColor <em>Flower Color</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getPruningMonths <em>Pruning Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.Species#getPruneNote <em>Prune Note</em>}</li>
 * </ul>
 *
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies()
 * @model abstract="true"
 * @generated
 */
public interface Species extends PlantNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(Genus)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Type()
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getSpecies
	 * @model opposite="species" required="true" transient="false"
	 * @generated
	 */
	Genus getType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Genus value);

	/**
	 * Returns the value of the '<em><b>Usda Hardiness Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usda Hardiness Min</em>' attribute.
	 * @see #setUsdaHardinessMin(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_UsdaHardinessMin()
	 * @model
	 * @generated
	 */
	int getUsdaHardinessMin();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMin <em>Usda Hardiness Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usda Hardiness Min</em>' attribute.
	 * @see #getUsdaHardinessMin()
	 * @generated
	 */
	void setUsdaHardinessMin(int value);

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
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Productive Months</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productive Months</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_ProductiveMonths()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek" upper="12"
	 * @generated
	 */
	EList<Integer> getProductiveMonths();

	/**
	 * Returns the value of the '<em><b>Bloom Months</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloom Months</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_BloomMonths()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek" upper="12"
	 * @generated
	 */
	EList<Integer> getBloomMonths();

	/**
	 * Returns the value of the '<em><b>Fruit Conservation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fruit Conservation</em>' attribute.
	 * @see #setFruitConservation(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_FruitConservation()
	 * @model default="0"
	 * @generated
	 */
	int getFruitConservation();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFruitConservation <em>Fruit Conservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fruit Conservation</em>' attribute.
	 * @see #getFruitConservation()
	 * @generated
	 */
	void setFruitConservation(int value);

	/**
	 * Returns the value of the '<em><b>Fruits Availability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fruits Availability</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_FruitsAvailability()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek" transient="true" derived="true"
	 * @generated
	 */
	EList<Integer> getFruitsAvailability();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

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
	 * Returns the value of the '<em><b>Eating Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.EatingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eating Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.EatingType
	 * @see #setEatingType(EatingType)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_EatingType()
	 * @model
	 * @generated
	 */
	EatingType getEatingType();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getEatingType <em>Eating Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eating Type</em>' attribute.
	 * @see fr.adaussy.permadeler.model.Permadeler.EatingType
	 * @see #getEatingType()
	 * @generated
	 */
	void setEatingType(EatingType value);

	/**
	 * Returns the value of the '<em><b>Edible Parts</b></em>' attribute list.
	 * The list contents are of type {@link fr.adaussy.permadeler.model.Permadeler.EdiblePart}.
	 * The literals are from the enumeration {@link fr.adaussy.permadeler.model.Permadeler.EdiblePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edible Parts</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.EdiblePart
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_EdibleParts()
	 * @model
	 * @generated
	 */
	EList<EdiblePart> getEdibleParts();

	/**
	 * Returns the value of the '<em><b>Usda Hardiness Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usda Hardiness Max</em>' attribute.
	 * @see #setUsdaHardinessMax(int)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_UsdaHardinessMax()
	 * @model
	 * @generated
	 */
	int getUsdaHardinessMax();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMax <em>Usda Hardiness Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usda Hardiness Max</em>' attribute.
	 * @see #getUsdaHardinessMax()
	 * @generated
	 */
	void setUsdaHardinessMax(int value);

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
	 * Returns the value of the '<em><b>Flower Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flower Color</em>' attribute.
	 * @see #setFlowerColor(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_FlowerColor()
	 * @model
	 * @generated
	 */
	String getFlowerColor();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFlowerColor <em>Flower Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flower Color</em>' attribute.
	 * @see #getFlowerColor()
	 * @generated
	 */
	void setFlowerColor(String value);

	/**
	 * Returns the value of the '<em><b>Pruning Months</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pruning Months</em>' attribute list.
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_PruningMonths()
	 * @model dataType="fr.adaussy.permadeler.model.Permadeler.MonthWeek"
	 * @generated
	 */
	EList<Integer> getPruningMonths();

	/**
	 * Returns the value of the '<em><b>Prune Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prune Note</em>' attribute.
	 * @see #setPruneNote(String)
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#getSpecies_PruneNote()
	 * @model
	 * @generated
	 */
	String getPruneNote();

	/**
	 * Sets the value of the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getPruneNote <em>Prune Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prune Note</em>' attribute.
	 * @see #getPruneNote()
	 * @generated
	 */
	void setPruneNote(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllNames();

} // Species
