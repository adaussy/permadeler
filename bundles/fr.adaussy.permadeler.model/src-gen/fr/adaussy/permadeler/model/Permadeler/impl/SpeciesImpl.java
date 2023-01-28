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
import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.FoilageShade;
import fr.adaussy.permadeler.model.Permadeler.FoliageType;
import fr.adaussy.permadeler.model.Permadeler.GrowRate;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.ImageOwner;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.Moisture;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.RootType;
import fr.adaussy.permadeler.model.Permadeler.Shade;
import fr.adaussy.permadeler.model.Permadeler.SoilType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getVarieties <em>Varieties</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getGenus <em>Genus</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getRootType <em>Root Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFoilageType <em>Foilage Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getDroughtTolerance <em>Drought Tolerance</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFoilageShade <em>Foilage Shade</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getToleratedLightingCondition <em>Tolerated Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getMinTemperature <em>Min Temperature</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getProductions <em>Productions</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getDefaultLayer <em>Default Layer</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getDefaultRepresentationKind <em>Default Representation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeciesImpl extends PlantNamedElementImpl implements Species {
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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getVarieties() <em>Varieties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarieties()
	 * @generated
	 * @ordered
	 */
	protected EList<Variety> varieties;

	/**
	 * The default value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected String species = SPECIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenus() <em>Genus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenus()
	 * @generated
	 * @ordered
	 */
	protected static final String GENUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenus() <em>Genus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenus()
	 * @generated
	 * @ordered
	 */
	protected String genus = GENUS_EDEFAULT;

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
	 * The cached value of the '{@link #getToleratedLightingCondition() <em>Tolerated Lighting Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleratedLightingCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Shade> toleratedLightingCondition;

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
	 * The cached value of the '{@link #getMoisture() <em>Moisture</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoisture()
	 * @generated
	 * @ordered
	 */
	protected EList<Moisture> moisture;

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
	 * The cached value of the '{@link #getWind() <em>Wind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected EList<Wind> wind;

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
	 * The cached value of the '{@link #getSpecialUses() <em>Special Uses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialUses()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialUses> specialUses;

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
	 * The cached value of the '{@link #getProductions() <em>Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<Production> productions;

	/**
	 * The default value of the '{@link #getDefaultLayer() <em>Default Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLayer()
	 * @generated
	 * @ordered
	 */
	protected static final Layer DEFAULT_LAYER_EDEFAULT = Layer.UNDERSTORY;

	/**
	 * The cached value of the '{@link #getDefaultLayer() <em>Default Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer defaultLayer = DEFAULT_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultRepresentationKind() <em>Default Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected static final RepresentationKind DEFAULT_REPRESENTATION_KIND_EDEFAULT = RepresentationKind.TREE_CROWN;

	/**
	 * The cached value of the '{@link #getDefaultRepresentationKind() <em>Default Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected RepresentationKind defaultRepresentationKind = DEFAULT_REPRESENTATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PermadelerPackage.Literals.SPECIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this,
					PermadelerPackage.SPECIES__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, PermadelerPackage.SPECIES__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variety> getVarieties() {
		if (varieties == null) {
			varieties = new EObjectContainmentWithInverseEList<Variety>(Variety.class, this,
					PermadelerPackage.SPECIES__VARIETIES, PermadelerPackage.VARIETY__SPECIES);
		}
		return varieties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(String newSpecies) {
		String oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__SPECIES,
					oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenus() {
		return genus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenus(String newGenus) {
		String oldGenus = genus;
		genus = newGenus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__GENUS, oldGenus,
					genus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__FAMILY,
					oldFamily, family));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__LIFE_CYCLE,
					oldLifeCycle, lifeCycle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__ROOT_TYPE,
					oldRootType, rootType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__FOILAGE_TYPE,
					oldFoilageType, foilageType));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.SPECIES__DROUGHT_TOLERANCE, oldDroughtTolerance, droughtTolerance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__FOILAGE_SHADE,
					oldFoilageShade, foilageShade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shade> getToleratedLightingCondition() {
		if (toleratedLightingCondition == null) {
			toleratedLightingCondition = new EDataTypeUniqueEList<Shade>(Shade.class, this,
					PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION);
		}
		return toleratedLightingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shade> getLightingCondition() {
		if (lightingCondition == null) {
			lightingCondition = new EDataTypeUniqueEList<Shade>(Shade.class, this,
					PermadelerPackage.SPECIES__LIGHTING_CONDITION);
		}
		return lightingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Moisture> getMoisture() {
		if (moisture == null) {
			moisture = new EDataTypeUniqueEList<Moisture>(Moisture.class, this,
					PermadelerPackage.SPECIES__MOISTURE);
		}
		return moisture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoilType> getSoilType() {
		if (soilType == null) {
			soilType = new EDataTypeUniqueEList<SoilType>(SoilType.class, this,
					PermadelerPackage.SPECIES__SOIL_TYPE);
		}
		return soilType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__MIN_TEMPERATURE,
					oldMinTemperature, minTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wind> getWind() {
		if (wind == null) {
			wind = new EDataTypeUniqueEList<Wind>(Wind.class, this, PermadelerPackage.SPECIES__WIND);
		}
		return wind;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialUses> getSpecialUses() {
		if (specialUses == null) {
			specialUses = new EDataTypeUniqueEList<SpecialUses>(SpecialUses.class, this,
					PermadelerPackage.SPECIES__SPECIAL_USES);
		}
		return specialUses;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__HEIGHT,
					oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__GROW_RATE,
					oldGrowRate, growRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Production> getProductions() {
		if (productions == null) {
			productions = new EObjectContainmentEList<Production>(Production.class, this,
					PermadelerPackage.SPECIES__PRODUCTIONS);
		}
		return productions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getDefaultLayer() {
		return defaultLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultLayer(Layer newDefaultLayer) {
		Layer oldDefaultLayer = defaultLayer;
		defaultLayer = newDefaultLayer == null ? DEFAULT_LAYER_EDEFAULT : newDefaultLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__DEFAULT_LAYER,
					oldDefaultLayer, defaultLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationKind getDefaultRepresentationKind() {
		return defaultRepresentationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRepresentationKind(RepresentationKind newDefaultRepresentationKind) {
		RepresentationKind oldDefaultRepresentationKind = defaultRepresentationKind;
		defaultRepresentationKind = newDefaultRepresentationKind == null
				? DEFAULT_REPRESENTATION_KIND_EDEFAULT
				: newDefaultRepresentationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND, oldDefaultRepresentationKind,
					defaultRepresentationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullLatinName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAllActions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialUses> getAllSpecialUses() {
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
			case PermadelerPackage.SPECIES__VARIETIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVarieties()).basicAdd(otherEnd,
						msgs);
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
			case PermadelerPackage.SPECIES__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.SPECIES__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.SPECIES__VARIETIES:
				return ((InternalEList<?>)getVarieties()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.SPECIES__PRODUCTIONS:
				return ((InternalEList<?>)getProductions()).basicRemove(otherEnd, msgs);
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
			case PermadelerPackage.SPECIES__IMAGES:
				return getImages();
			case PermadelerPackage.SPECIES__ACTIONS:
				return getActions();
			case PermadelerPackage.SPECIES__VARIETIES:
				return getVarieties();
			case PermadelerPackage.SPECIES__SPECIES:
				return getSpecies();
			case PermadelerPackage.SPECIES__GENUS:
				return getGenus();
			case PermadelerPackage.SPECIES__FAMILY:
				return getFamily();
			case PermadelerPackage.SPECIES__LIFE_CYCLE:
				return getLifeCycle();
			case PermadelerPackage.SPECIES__ROOT_TYPE:
				return getRootType();
			case PermadelerPackage.SPECIES__FOILAGE_TYPE:
				return getFoilageType();
			case PermadelerPackage.SPECIES__DROUGHT_TOLERANCE:
				return getDroughtTolerance();
			case PermadelerPackage.SPECIES__FOILAGE_SHADE:
				return getFoilageShade();
			case PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION:
				return getToleratedLightingCondition();
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				return getLightingCondition();
			case PermadelerPackage.SPECIES__MOISTURE:
				return getMoisture();
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				return getSoilType();
			case PermadelerPackage.SPECIES__MIN_TEMPERATURE:
				return getMinTemperature();
			case PermadelerPackage.SPECIES__WIND:
				return getWind();
			case PermadelerPackage.SPECIES__WIDTH:
				return getWidth();
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				return getSpecialUses();
			case PermadelerPackage.SPECIES__HEIGHT:
				return getHeight();
			case PermadelerPackage.SPECIES__GROW_RATE:
				return getGrowRate();
			case PermadelerPackage.SPECIES__PRODUCTIONS:
				return getProductions();
			case PermadelerPackage.SPECIES__DEFAULT_LAYER:
				return getDefaultLayer();
			case PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND:
				return getDefaultRepresentationKind();
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
			case PermadelerPackage.SPECIES__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case PermadelerPackage.SPECIES__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case PermadelerPackage.SPECIES__VARIETIES:
				getVarieties().clear();
				getVarieties().addAll((Collection<? extends Variety>)newValue);
				return;
			case PermadelerPackage.SPECIES__SPECIES:
				setSpecies((String)newValue);
				return;
			case PermadelerPackage.SPECIES__GENUS:
				setGenus((String)newValue);
				return;
			case PermadelerPackage.SPECIES__FAMILY:
				setFamily((Family)newValue);
				return;
			case PermadelerPackage.SPECIES__LIFE_CYCLE:
				setLifeCycle((Lifecycle)newValue);
				return;
			case PermadelerPackage.SPECIES__ROOT_TYPE:
				setRootType((RootType)newValue);
				return;
			case PermadelerPackage.SPECIES__FOILAGE_TYPE:
				setFoilageType((FoliageType)newValue);
				return;
			case PermadelerPackage.SPECIES__DROUGHT_TOLERANCE:
				setDroughtTolerance((DroughtTolerance)newValue);
				return;
			case PermadelerPackage.SPECIES__FOILAGE_SHADE:
				setFoilageShade((FoilageShade)newValue);
				return;
			case PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION:
				getToleratedLightingCondition().clear();
				getToleratedLightingCondition().addAll((Collection<? extends Shade>)newValue);
				return;
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				getLightingCondition().clear();
				getLightingCondition().addAll((Collection<? extends Shade>)newValue);
				return;
			case PermadelerPackage.SPECIES__MOISTURE:
				getMoisture().clear();
				getMoisture().addAll((Collection<? extends Moisture>)newValue);
				return;
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				getSoilType().clear();
				getSoilType().addAll((Collection<? extends SoilType>)newValue);
				return;
			case PermadelerPackage.SPECIES__MIN_TEMPERATURE:
				setMinTemperature((Integer)newValue);
				return;
			case PermadelerPackage.SPECIES__WIND:
				getWind().clear();
				getWind().addAll((Collection<? extends Wind>)newValue);
				return;
			case PermadelerPackage.SPECIES__WIDTH:
				setWidth((Float)newValue);
				return;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				getSpecialUses().clear();
				getSpecialUses().addAll((Collection<? extends SpecialUses>)newValue);
				return;
			case PermadelerPackage.SPECIES__HEIGHT:
				setHeight((Float)newValue);
				return;
			case PermadelerPackage.SPECIES__GROW_RATE:
				setGrowRate((GrowRate)newValue);
				return;
			case PermadelerPackage.SPECIES__PRODUCTIONS:
				getProductions().clear();
				getProductions().addAll((Collection<? extends Production>)newValue);
				return;
			case PermadelerPackage.SPECIES__DEFAULT_LAYER:
				setDefaultLayer((Layer)newValue);
				return;
			case PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND:
				setDefaultRepresentationKind((RepresentationKind)newValue);
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
			case PermadelerPackage.SPECIES__IMAGES:
				getImages().clear();
				return;
			case PermadelerPackage.SPECIES__ACTIONS:
				getActions().clear();
				return;
			case PermadelerPackage.SPECIES__VARIETIES:
				getVarieties().clear();
				return;
			case PermadelerPackage.SPECIES__SPECIES:
				setSpecies(SPECIES_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__GENUS:
				setGenus(GENUS_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__LIFE_CYCLE:
				setLifeCycle(LIFE_CYCLE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__ROOT_TYPE:
				setRootType(ROOT_TYPE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__FOILAGE_TYPE:
				setFoilageType(FOILAGE_TYPE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__DROUGHT_TOLERANCE:
				setDroughtTolerance(DROUGHT_TOLERANCE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__FOILAGE_SHADE:
				setFoilageShade(FOILAGE_SHADE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION:
				getToleratedLightingCondition().clear();
				return;
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				getLightingCondition().clear();
				return;
			case PermadelerPackage.SPECIES__MOISTURE:
				getMoisture().clear();
				return;
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				getSoilType().clear();
				return;
			case PermadelerPackage.SPECIES__MIN_TEMPERATURE:
				setMinTemperature(MIN_TEMPERATURE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__WIND:
				getWind().clear();
				return;
			case PermadelerPackage.SPECIES__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				getSpecialUses().clear();
				return;
			case PermadelerPackage.SPECIES__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__GROW_RATE:
				setGrowRate(GROW_RATE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__PRODUCTIONS:
				getProductions().clear();
				return;
			case PermadelerPackage.SPECIES__DEFAULT_LAYER:
				setDefaultLayer(DEFAULT_LAYER_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND:
				setDefaultRepresentationKind(DEFAULT_REPRESENTATION_KIND_EDEFAULT);
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
			case PermadelerPackage.SPECIES__IMAGES:
				return images != null && !images.isEmpty();
			case PermadelerPackage.SPECIES__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PermadelerPackage.SPECIES__VARIETIES:
				return varieties != null && !varieties.isEmpty();
			case PermadelerPackage.SPECIES__SPECIES:
				return SPECIES_EDEFAULT == null ? species != null : !SPECIES_EDEFAULT.equals(species);
			case PermadelerPackage.SPECIES__GENUS:
				return GENUS_EDEFAULT == null ? genus != null : !GENUS_EDEFAULT.equals(genus);
			case PermadelerPackage.SPECIES__FAMILY:
				return family != FAMILY_EDEFAULT;
			case PermadelerPackage.SPECIES__LIFE_CYCLE:
				return lifeCycle != LIFE_CYCLE_EDEFAULT;
			case PermadelerPackage.SPECIES__ROOT_TYPE:
				return rootType != ROOT_TYPE_EDEFAULT;
			case PermadelerPackage.SPECIES__FOILAGE_TYPE:
				return foilageType != FOILAGE_TYPE_EDEFAULT;
			case PermadelerPackage.SPECIES__DROUGHT_TOLERANCE:
				return droughtTolerance != DROUGHT_TOLERANCE_EDEFAULT;
			case PermadelerPackage.SPECIES__FOILAGE_SHADE:
				return foilageShade != FOILAGE_SHADE_EDEFAULT;
			case PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION:
				return toleratedLightingCondition != null && !toleratedLightingCondition.isEmpty();
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				return lightingCondition != null && !lightingCondition.isEmpty();
			case PermadelerPackage.SPECIES__MOISTURE:
				return moisture != null && !moisture.isEmpty();
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				return soilType != null && !soilType.isEmpty();
			case PermadelerPackage.SPECIES__MIN_TEMPERATURE:
				return minTemperature != MIN_TEMPERATURE_EDEFAULT;
			case PermadelerPackage.SPECIES__WIND:
				return wind != null && !wind.isEmpty();
			case PermadelerPackage.SPECIES__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				return specialUses != null && !specialUses.isEmpty();
			case PermadelerPackage.SPECIES__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PermadelerPackage.SPECIES__GROW_RATE:
				return growRate != GROW_RATE_EDEFAULT;
			case PermadelerPackage.SPECIES__PRODUCTIONS:
				return productions != null && !productions.isEmpty();
			case PermadelerPackage.SPECIES__DEFAULT_LAYER:
				return defaultLayer != DEFAULT_LAYER_EDEFAULT;
			case PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND:
				return defaultRepresentationKind != DEFAULT_REPRESENTATION_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ImageOwner.class) {
			switch (derivedFeatureID) {
				case PermadelerPackage.SPECIES__IMAGES:
					return PermadelerPackage.IMAGE_OWNER__IMAGES;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ImageOwner.class) {
			switch (baseFeatureID) {
				case PermadelerPackage.IMAGE_OWNER__IMAGES:
					return PermadelerPackage.SPECIES__IMAGES;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PermadelerPackage.SPECIES___GET_FULL_LATIN_NAME:
				return getFullLatinName();
			case PermadelerPackage.SPECIES___GET_REPRESENTATION:
				return getRepresentation();
			case PermadelerPackage.SPECIES___GET_ALL_ACTIONS:
				return getAllActions();
			case PermadelerPackage.SPECIES___GET_ALL_SPECIAL_USES:
				return getAllSpecialUses();
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
		result.append(" (species: "); //$NON-NLS-1$
		result.append(species);
		result.append(", genus: "); //$NON-NLS-1$
		result.append(genus);
		result.append(", family: "); //$NON-NLS-1$
		result.append(family);
		result.append(", lifeCycle: "); //$NON-NLS-1$
		result.append(lifeCycle);
		result.append(", rootType: "); //$NON-NLS-1$
		result.append(rootType);
		result.append(", foilageType: "); //$NON-NLS-1$
		result.append(foilageType);
		result.append(", droughtTolerance: "); //$NON-NLS-1$
		result.append(droughtTolerance);
		result.append(", foilageShade: "); //$NON-NLS-1$
		result.append(foilageShade);
		result.append(", toleratedLightingCondition: "); //$NON-NLS-1$
		result.append(toleratedLightingCondition);
		result.append(", lightingCondition: "); //$NON-NLS-1$
		result.append(lightingCondition);
		result.append(", moisture: "); //$NON-NLS-1$
		result.append(moisture);
		result.append(", soilType: "); //$NON-NLS-1$
		result.append(soilType);
		result.append(", minTemperature: "); //$NON-NLS-1$
		result.append(minTemperature);
		result.append(", wind: "); //$NON-NLS-1$
		result.append(wind);
		result.append(", width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", specialUses: "); //$NON-NLS-1$
		result.append(specialUses);
		result.append(", height: "); //$NON-NLS-1$
		result.append(height);
		result.append(", growRate: "); //$NON-NLS-1$
		result.append(growRate);
		result.append(", defaultLayer: "); //$NON-NLS-1$
		result.append(defaultLayer);
		result.append(", defaultRepresentationKind: "); //$NON-NLS-1$
		result.append(defaultRepresentationKind);
		result.append(')');
		return result.toString();
	}

} //SpeciesImpl
