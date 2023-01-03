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

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.DroughtTolerance;
import fr.adaussy.permadeler.model.Permadeler.FoilageShade;
import fr.adaussy.permadeler.model.Permadeler.FoliageType;
import fr.adaussy.permadeler.model.Permadeler.GrowRate;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.Moisture;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.RootType;
import fr.adaussy.permadeler.model.Permadeler.Shade;
import fr.adaussy.permadeler.model.Permadeler.SoilType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Wind;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getMinTemperature <em>Min Temperature</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getFoilageType <em>Foilage Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getFoilageShade <em>Foilage Shade</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getDroughtTolerance <em>Drought Tolerance</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getToleratedLightingCondition <em>Tolerated Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends PlantNamedElementImpl implements Plant {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected EList<SoilType> soilType;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getLightingCondition() <em>Lighting Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightingCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Shade> lightingCondition;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTemperature() <em>Min Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TEMPERATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinTemperature() <em>Min Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTemperature()
	 * @generated
	 * @ordered
	 */
	protected int minTemperature = MIN_TEMPERATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMoisture() <em>Moisture</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoisture()
	 * @generated
	 * @ordered
	 */
	protected EList<Moisture> moisture;

	/**
	 * The cached value of the '{@link #getSpecialUses() <em>Special Uses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialUses()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialUses> specialUses;

	/**
	 * The default value of the '{@link #getGrowRate() <em>Grow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowRate()
	 * @generated
	 * @ordered
	 */
	protected static final GrowRate GROW_RATE_EDEFAULT = GrowRate.UNKOWN;

	/**
	 * The cached value of the '{@link #getGrowRate() <em>Grow Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowRate()
	 * @generated
	 * @ordered
	 */
	protected GrowRate growRate = GROW_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWind() <em>Wind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected EList<Wind> wind;

	/**
	 * The cached value of the '{@link #getProductions() <em>Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<Production> productions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected static final Lifecycle LIFE_CYCLE_EDEFAULT = Lifecycle.UNKNOWN;

	/**
	 * The cached value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected Lifecycle lifeCycle = LIFE_CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoilageType() <em>Foilage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoilageType()
	 * @generated
	 * @ordered
	 */
	protected static final FoliageType FOILAGE_TYPE_EDEFAULT = FoliageType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getFoilageType() <em>Foilage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoilageType()
	 * @generated
	 * @ordered
	 */
	protected FoliageType foilageType = FOILAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoilageShade() <em>Foilage Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoilageShade()
	 * @generated
	 * @ordered
	 */
	protected static final FoilageShade FOILAGE_SHADE_EDEFAULT = FoilageShade.UNKOWN;

	/**
	 * The cached value of the '{@link #getFoilageShade() <em>Foilage Shade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoilageShade()
	 * @generated
	 * @ordered
	 */
	protected FoilageShade foilageShade = FOILAGE_SHADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDroughtTolerance() <em>Drought Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroughtTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final DroughtTolerance DROUGHT_TOLERANCE_EDEFAULT = DroughtTolerance.UNKNOWN;

	/**
	 * The cached value of the '{@link #getDroughtTolerance() <em>Drought Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroughtTolerance()
	 * @generated
	 * @ordered
	 */
	protected DroughtTolerance droughtTolerance = DROUGHT_TOLERANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToleratedLightingCondition() <em>Tolerated Lighting Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleratedLightingCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Shade> toleratedLightingCondition;

	/**
	 * The default value of the '{@link #getRootType() <em>Root Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootType()
	 * @generated
	 * @ordered
	 */
	protected static final RootType ROOT_TYPE_EDEFAULT = RootType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getRootType() <em>Root Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootType()
	 * @generated
	 * @ordered
	 */
	protected RootType rootType = ROOT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoilType> getSoilType() {
		if (soilType == null) {
			soilType = new EDataTypeUniqueEList<SoilType>(SoilType.class, this,
					PermadelerPackage.PLANT__SOIL_TYPE);
		}
		return soilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, PermadelerPackage.PLANT__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shade> getLightingCondition() {
		if (lightingCondition == null) {
			lightingCondition = new EDataTypeUniqueEList<Shade>(Shade.class, this,
					PermadelerPackage.PLANT__LIGHTING_CONDITION);
		}
		return lightingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinTemperature() {
		return minTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTemperature(int newMinTemperature) {
		int oldMinTemperature = minTemperature;
		minTemperature = newMinTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__MIN_TEMPERATURE,
					oldMinTemperature, minTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Moisture> getMoisture() {
		if (moisture == null) {
			moisture = new EDataTypeUniqueEList<Moisture>(Moisture.class, this,
					PermadelerPackage.PLANT__MOISTURE);
		}
		return moisture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialUses> getSpecialUses() {
		if (specialUses == null) {
			specialUses = new EDataTypeUniqueEList<SpecialUses>(SpecialUses.class, this,
					PermadelerPackage.PLANT__SPECIAL_USES);
		}
		return specialUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrowRate getGrowRate() {
		return growRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowRate(GrowRate newGrowRate) {
		GrowRate oldGrowRate = growRate;
		growRate = newGrowRate == null ? GROW_RATE_EDEFAULT : newGrowRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__GROW_RATE,
					oldGrowRate, growRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wind> getWind() {
		if (wind == null) {
			wind = new EDataTypeUniqueEList<Wind>(Wind.class, this, PermadelerPackage.PLANT__WIND);
		}
		return wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Production> getProductions() {
		if (productions == null) {
			productions = new EObjectContainmentEList<Production>(Production.class, this,
					PermadelerPackage.PLANT__PRODUCTIONS);
		}
		return productions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this,
					PermadelerPackage.PLANT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle getLifeCycle() {
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycle(Lifecycle newLifeCycle) {
		Lifecycle oldLifeCycle = lifeCycle;
		lifeCycle = newLifeCycle == null ? LIFE_CYCLE_EDEFAULT : newLifeCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__LIFE_CYCLE,
					oldLifeCycle, lifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoliageType getFoilageType() {
		return foilageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoilageType(FoliageType newFoilageType) {
		FoliageType oldFoilageType = foilageType;
		foilageType = newFoilageType == null ? FOILAGE_TYPE_EDEFAULT : newFoilageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__FOILAGE_TYPE,
					oldFoilageType, foilageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoilageShade getFoilageShade() {
		return foilageShade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoilageShade(FoilageShade newFoilageShade) {
		FoilageShade oldFoilageShade = foilageShade;
		foilageShade = newFoilageShade == null ? FOILAGE_SHADE_EDEFAULT : newFoilageShade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__FOILAGE_SHADE,
					oldFoilageShade, foilageShade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroughtTolerance getDroughtTolerance() {
		return droughtTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroughtTolerance(DroughtTolerance newDroughtTolerance) {
		DroughtTolerance oldDroughtTolerance = droughtTolerance;
		droughtTolerance = newDroughtTolerance == null ? DROUGHT_TOLERANCE_EDEFAULT : newDroughtTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__DROUGHT_TOLERANCE,
					oldDroughtTolerance, droughtTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shade> getToleratedLightingCondition() {
		if (toleratedLightingCondition == null) {
			toleratedLightingCondition = new EDataTypeUniqueEList<Shade>(Shade.class, this,
					PermadelerPackage.PLANT__TOLERATED_LIGHTING_CONDITION);
		}
		return toleratedLightingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType getRootType() {
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootType(RootType newRootType) {
		RootType oldRootType = rootType;
		rootType = newRootType == null ? ROOT_TYPE_EDEFAULT : newRootType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.PLANT__ROOT_TYPE,
					oldRootType, rootType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllNames() {
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
			case PermadelerPackage.PLANT__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANT__PRODUCTIONS:
				return ((InternalEList<?>)getProductions()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.PLANT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.PLANT__WIDTH:
				return getWidth();
			case PermadelerPackage.PLANT__SOIL_TYPE:
				return getSoilType();
			case PermadelerPackage.PLANT__IMAGES:
				return getImages();
			case PermadelerPackage.PLANT__LIGHTING_CONDITION:
				return getLightingCondition();
			case PermadelerPackage.PLANT__HEIGHT:
				return getHeight();
			case PermadelerPackage.PLANT__MIN_TEMPERATURE:
				return getMinTemperature();
			case PermadelerPackage.PLANT__MOISTURE:
				return getMoisture();
			case PermadelerPackage.PLANT__SPECIAL_USES:
				return getSpecialUses();
			case PermadelerPackage.PLANT__GROW_RATE:
				return getGrowRate();
			case PermadelerPackage.PLANT__WIND:
				return getWind();
			case PermadelerPackage.PLANT__PRODUCTIONS:
				return getProductions();
			case PermadelerPackage.PLANT__ACTIONS:
				return getActions();
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				return getLifeCycle();
			case PermadelerPackage.PLANT__FOILAGE_TYPE:
				return getFoilageType();
			case PermadelerPackage.PLANT__FOILAGE_SHADE:
				return getFoilageShade();
			case PermadelerPackage.PLANT__DROUGHT_TOLERANCE:
				return getDroughtTolerance();
			case PermadelerPackage.PLANT__TOLERATED_LIGHTING_CONDITION:
				return getToleratedLightingCondition();
			case PermadelerPackage.PLANT__ROOT_TYPE:
				return getRootType();
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
			case PermadelerPackage.PLANT__WIDTH:
				setWidth((Float)newValue);
				return;
			case PermadelerPackage.PLANT__SOIL_TYPE:
				getSoilType().clear();
				getSoilType().addAll((Collection<? extends SoilType>)newValue);
				return;
			case PermadelerPackage.PLANT__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case PermadelerPackage.PLANT__LIGHTING_CONDITION:
				getLightingCondition().clear();
				getLightingCondition().addAll((Collection<? extends Shade>)newValue);
				return;
			case PermadelerPackage.PLANT__HEIGHT:
				setHeight((Float)newValue);
				return;
			case PermadelerPackage.PLANT__MIN_TEMPERATURE:
				setMinTemperature((Integer)newValue);
				return;
			case PermadelerPackage.PLANT__MOISTURE:
				getMoisture().clear();
				getMoisture().addAll((Collection<? extends Moisture>)newValue);
				return;
			case PermadelerPackage.PLANT__SPECIAL_USES:
				getSpecialUses().clear();
				getSpecialUses().addAll((Collection<? extends SpecialUses>)newValue);
				return;
			case PermadelerPackage.PLANT__GROW_RATE:
				setGrowRate((GrowRate)newValue);
				return;
			case PermadelerPackage.PLANT__WIND:
				getWind().clear();
				getWind().addAll((Collection<? extends Wind>)newValue);
				return;
			case PermadelerPackage.PLANT__PRODUCTIONS:
				getProductions().clear();
				getProductions().addAll((Collection<? extends Production>)newValue);
				return;
			case PermadelerPackage.PLANT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				setLifeCycle((Lifecycle)newValue);
				return;
			case PermadelerPackage.PLANT__FOILAGE_TYPE:
				setFoilageType((FoliageType)newValue);
				return;
			case PermadelerPackage.PLANT__FOILAGE_SHADE:
				setFoilageShade((FoilageShade)newValue);
				return;
			case PermadelerPackage.PLANT__DROUGHT_TOLERANCE:
				setDroughtTolerance((DroughtTolerance)newValue);
				return;
			case PermadelerPackage.PLANT__TOLERATED_LIGHTING_CONDITION:
				getToleratedLightingCondition().clear();
				getToleratedLightingCondition().addAll((Collection<? extends Shade>)newValue);
				return;
			case PermadelerPackage.PLANT__ROOT_TYPE:
				setRootType((RootType)newValue);
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
			case PermadelerPackage.PLANT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__SOIL_TYPE:
				getSoilType().clear();
				return;
			case PermadelerPackage.PLANT__IMAGES:
				getImages().clear();
				return;
			case PermadelerPackage.PLANT__LIGHTING_CONDITION:
				getLightingCondition().clear();
				return;
			case PermadelerPackage.PLANT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__MIN_TEMPERATURE:
				setMinTemperature(MIN_TEMPERATURE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__MOISTURE:
				getMoisture().clear();
				return;
			case PermadelerPackage.PLANT__SPECIAL_USES:
				getSpecialUses().clear();
				return;
			case PermadelerPackage.PLANT__GROW_RATE:
				setGrowRate(GROW_RATE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__WIND:
				getWind().clear();
				return;
			case PermadelerPackage.PLANT__PRODUCTIONS:
				getProductions().clear();
				return;
			case PermadelerPackage.PLANT__ACTIONS:
				getActions().clear();
				return;
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				setLifeCycle(LIFE_CYCLE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__FOILAGE_TYPE:
				setFoilageType(FOILAGE_TYPE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__FOILAGE_SHADE:
				setFoilageShade(FOILAGE_SHADE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__DROUGHT_TOLERANCE:
				setDroughtTolerance(DROUGHT_TOLERANCE_EDEFAULT);
				return;
			case PermadelerPackage.PLANT__TOLERATED_LIGHTING_CONDITION:
				getToleratedLightingCondition().clear();
				return;
			case PermadelerPackage.PLANT__ROOT_TYPE:
				setRootType(ROOT_TYPE_EDEFAULT);
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
			case PermadelerPackage.PLANT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PermadelerPackage.PLANT__SOIL_TYPE:
				return soilType != null && !soilType.isEmpty();
			case PermadelerPackage.PLANT__IMAGES:
				return images != null && !images.isEmpty();
			case PermadelerPackage.PLANT__LIGHTING_CONDITION:
				return lightingCondition != null && !lightingCondition.isEmpty();
			case PermadelerPackage.PLANT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PermadelerPackage.PLANT__MIN_TEMPERATURE:
				return minTemperature != MIN_TEMPERATURE_EDEFAULT;
			case PermadelerPackage.PLANT__MOISTURE:
				return moisture != null && !moisture.isEmpty();
			case PermadelerPackage.PLANT__SPECIAL_USES:
				return specialUses != null && !specialUses.isEmpty();
			case PermadelerPackage.PLANT__GROW_RATE:
				return growRate != GROW_RATE_EDEFAULT;
			case PermadelerPackage.PLANT__WIND:
				return wind != null && !wind.isEmpty();
			case PermadelerPackage.PLANT__PRODUCTIONS:
				return productions != null && !productions.isEmpty();
			case PermadelerPackage.PLANT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				return lifeCycle != LIFE_CYCLE_EDEFAULT;
			case PermadelerPackage.PLANT__FOILAGE_TYPE:
				return foilageType != FOILAGE_TYPE_EDEFAULT;
			case PermadelerPackage.PLANT__FOILAGE_SHADE:
				return foilageShade != FOILAGE_SHADE_EDEFAULT;
			case PermadelerPackage.PLANT__DROUGHT_TOLERANCE:
				return droughtTolerance != DROUGHT_TOLERANCE_EDEFAULT;
			case PermadelerPackage.PLANT__TOLERATED_LIGHTING_CONDITION:
				return toleratedLightingCondition != null && !toleratedLightingCondition.isEmpty();
			case PermadelerPackage.PLANT__ROOT_TYPE:
				return rootType != ROOT_TYPE_EDEFAULT;
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
			case PermadelerPackage.PLANT___GET_ALL_NAMES:
				return getAllNames();
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
		result.append(" (width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", soilType: "); //$NON-NLS-1$
		result.append(soilType);
		result.append(", lightingCondition: "); //$NON-NLS-1$
		result.append(lightingCondition);
		result.append(", height: "); //$NON-NLS-1$
		result.append(height);
		result.append(", minTemperature: "); //$NON-NLS-1$
		result.append(minTemperature);
		result.append(", moisture: "); //$NON-NLS-1$
		result.append(moisture);
		result.append(", specialUses: "); //$NON-NLS-1$
		result.append(specialUses);
		result.append(", growRate: "); //$NON-NLS-1$
		result.append(growRate);
		result.append(", wind: "); //$NON-NLS-1$
		result.append(wind);
		result.append(", lifeCycle: "); //$NON-NLS-1$
		result.append(lifeCycle);
		result.append(", foilageType: "); //$NON-NLS-1$
		result.append(foilageType);
		result.append(", foilageShade: "); //$NON-NLS-1$
		result.append(foilageShade);
		result.append(", droughtTolerance: "); //$NON-NLS-1$
		result.append(droughtTolerance);
		result.append(", toleratedLightingCondition: "); //$NON-NLS-1$
		result.append(toleratedLightingCondition);
		result.append(", rootType: "); //$NON-NLS-1$
		result.append(rootType);
		result.append(')');
		return result.toString();
	}

} //PlantImpl
