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

import fr.adaussy.permadeler.model.Permadeler.EatingType;
import fr.adaussy.permadeler.model.Permadeler.EdiblePart;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.GrowRate;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.Moisture;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Reference;
import fr.adaussy.permadeler.model.Permadeler.Shade;
import fr.adaussy.permadeler.model.Permadeler.SoilType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Wind;

import fr.adaussy.permadeler.model.utils.Color;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getUsdaHardinessMin <em>Usda Hardiness Min</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getLightingCondition <em>Lighting Condition</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getSoilType <em>Soil Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getMoisture <em>Moisture</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getReferences <em>References</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getProductiveMonths <em>Productive Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getBloomMonths <em>Bloom Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFruitConservation <em>Fruit Conservation</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFruitsAvailability <em>Fruits Availability</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getImages <em>Images</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getGrowRate <em>Grow Rate</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getWind <em>Wind</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getEatingType <em>Eating Type</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getEdibleParts <em>Edible Parts</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getUsdaHardinessMax <em>Usda Hardiness Max</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getSpecialUses <em>Special Uses</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getFlowerColor <em>Flower Color</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getPruningMonths <em>Pruning Months</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getPruneNote <em>Prune Note</em>}</li>
 *   <li>{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpeciesImpl extends PlantNamedElementImpl implements Species {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The default value of the '{@link #getUsdaHardinessMin() <em>Usda Hardiness Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsdaHardinessMin()
	 * @generated
	 * @ordered
	 */
	protected static final int USDA_HARDINESS_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsdaHardinessMin() <em>Usda Hardiness Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsdaHardinessMin()
	 * @generated
	 * @ordered
	 */
	protected int usdaHardinessMin = USDA_HARDINESS_MIN_EDEFAULT;

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
	 * The cached value of the '{@link #getSoilType() <em>Soil Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoilType()
	 * @generated
	 * @ordered
	 */
	protected EList<SoilType> soilType;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getProductiveMonths() <em>Productive Months</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductiveMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> productiveMonths;

	/**
	 * The cached value of the '{@link #getBloomMonths() <em>Bloom Months</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloomMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> bloomMonths;

	/**
	 * The default value of the '{@link #getFruitConservation() <em>Fruit Conservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFruitConservation()
	 * @generated
	 * @ordered
	 */
	protected static final int FRUIT_CONSERVATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFruitConservation() <em>Fruit Conservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFruitConservation()
	 * @generated
	 * @ordered
	 */
	protected int fruitConservation = FRUIT_CONSERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFruitsAvailability() <em>Fruits Availability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFruitsAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> fruitsAvailability;

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
	 * The default value of the '{@link #getEatingType() <em>Eating Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEatingType()
	 * @generated
	 * @ordered
	 */
	protected static final EatingType EATING_TYPE_EDEFAULT = EatingType.UNKOWN;

	/**
	 * The cached value of the '{@link #getEatingType() <em>Eating Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEatingType()
	 * @generated
	 * @ordered
	 */
	protected EatingType eatingType = EATING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdibleParts() <em>Edible Parts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdibleParts()
	 * @generated
	 * @ordered
	 */
	protected EList<EdiblePart> edibleParts;

	/**
	 * The default value of the '{@link #getUsdaHardinessMax() <em>Usda Hardiness Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsdaHardinessMax()
	 * @generated
	 * @ordered
	 */
	protected static final int USDA_HARDINESS_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsdaHardinessMax() <em>Usda Hardiness Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsdaHardinessMax()
	 * @generated
	 * @ordered
	 */
	protected int usdaHardinessMax = USDA_HARDINESS_MAX_EDEFAULT;

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
	 * The default value of the '{@link #getFlowerColor() <em>Flower Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowerColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOWER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowerColor() <em>Flower Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowerColor()
	 * @generated
	 * @ordered
	 */
	protected String flowerColor = FLOWER_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPruningMonths() <em>Pruning Months</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruningMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pruningMonths;

	/**
	 * The default value of the '{@link #getPruneNote() <em>Prune Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruneNote()
	 * @generated
	 * @ordered
	 */
	protected static final String PRUNE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPruneNote() <em>Prune Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruneNote()
	 * @generated
	 * @ordered
	 */
	protected String pruneNote = PRUNE_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

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
	public Genus getType() {
		if (eContainerFeatureID() != PermadelerPackage.SPECIES__TYPE)
			return null;
		return (Genus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Genus newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newType, PermadelerPackage.SPECIES__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Genus newType) {
		if (newType != eInternalContainer()
				|| (eContainerFeatureID() != PermadelerPackage.SPECIES__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, PermadelerPackage.GENUS__SPECIES,
						Genus.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__TYPE, newType,
					newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsdaHardinessMin() {
		return usdaHardinessMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsdaHardinessMin(int newUsdaHardinessMin) {
		int oldUsdaHardinessMin = usdaHardinessMin;
		usdaHardinessMin = newUsdaHardinessMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.SPECIES__USDA_HARDINESS_MIN, oldUsdaHardinessMin, usdaHardinessMin));
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
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this,
					PermadelerPackage.SPECIES__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getProductiveMonths() {
		if (productiveMonths == null) {
			productiveMonths = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS);
		}
		return productiveMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getBloomMonths() {
		if (bloomMonths == null) {
			bloomMonths = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.SPECIES__BLOOM_MONTHS);
		}
		return bloomMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFruitConservation() {
		return fruitConservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFruitConservation(int newFruitConservation) {
		int oldFruitConservation = fruitConservation;
		fruitConservation = newFruitConservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.SPECIES__FRUIT_CONSERVATION, oldFruitConservation, fruitConservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getFruitsAvailability() {
		if (fruitsAvailability == null) {
			fruitsAvailability = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.SPECIES__FRUITS_AVAILABILITY);
		}
		return fruitsAvailability;
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
	public EatingType getEatingType() {
		return eatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEatingType(EatingType newEatingType) {
		EatingType oldEatingType = eatingType;
		eatingType = newEatingType == null ? EATING_TYPE_EDEFAULT : newEatingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__EATING_TYPE,
					oldEatingType, eatingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdiblePart> getEdibleParts() {
		if (edibleParts == null) {
			edibleParts = new EDataTypeUniqueEList<EdiblePart>(EdiblePart.class, this,
					PermadelerPackage.SPECIES__EDIBLE_PARTS);
		}
		return edibleParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsdaHardinessMax() {
		return usdaHardinessMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsdaHardinessMax(int newUsdaHardinessMax) {
		int oldUsdaHardinessMax = usdaHardinessMax;
		usdaHardinessMax = newUsdaHardinessMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PermadelerPackage.SPECIES__USDA_HARDINESS_MAX, oldUsdaHardinessMax, usdaHardinessMax));
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
	public String getFlowerColor() {
		return flowerColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowerColor(String newFlowerColor) {
		String oldFlowerColor = flowerColor;
		flowerColor = newFlowerColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__FLOWER_COLOR,
					oldFlowerColor, flowerColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPruningMonths() {
		if (pruningMonths == null) {
			pruningMonths = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					PermadelerPackage.SPECIES__PRUNING_MONTHS);
		}
		return pruningMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPruneNote() {
		return pruneNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPruneNote(String newPruneNote) {
		String oldPruneNote = pruneNote;
		pruneNote = newPruneNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__PRUNE_NOTE,
					oldPruneNote, pruneNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PermadelerPackage.SPECIES__COLOR, oldColor,
					color));
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
	public Color getEffectiveColor() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PermadelerPackage.SPECIES__TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetType((Genus)otherEnd, msgs);
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
			case PermadelerPackage.SPECIES__TYPE:
				return basicSetType(null, msgs);
			case PermadelerPackage.SPECIES__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case PermadelerPackage.SPECIES__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PermadelerPackage.SPECIES__TYPE:
				return eInternalContainer().eInverseRemove(this, PermadelerPackage.GENUS__SPECIES,
						Genus.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PermadelerPackage.SPECIES__TYPE:
				return getType();
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MIN:
				return getUsdaHardinessMin();
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				return getLightingCondition();
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				return getSoilType();
			case PermadelerPackage.SPECIES__MOISTURE:
				return getMoisture();
			case PermadelerPackage.SPECIES__REFERENCES:
				return getReferences();
			case PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS:
				return getProductiveMonths();
			case PermadelerPackage.SPECIES__BLOOM_MONTHS:
				return getBloomMonths();
			case PermadelerPackage.SPECIES__FRUIT_CONSERVATION:
				return getFruitConservation();
			case PermadelerPackage.SPECIES__FRUITS_AVAILABILITY:
				return getFruitsAvailability();
			case PermadelerPackage.SPECIES__IMAGES:
				return getImages();
			case PermadelerPackage.SPECIES__GROW_RATE:
				return getGrowRate();
			case PermadelerPackage.SPECIES__WIND:
				return getWind();
			case PermadelerPackage.SPECIES__WIDTH:
				return getWidth();
			case PermadelerPackage.SPECIES__HEIGHT:
				return getHeight();
			case PermadelerPackage.SPECIES__EATING_TYPE:
				return getEatingType();
			case PermadelerPackage.SPECIES__EDIBLE_PARTS:
				return getEdibleParts();
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MAX:
				return getUsdaHardinessMax();
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				return getSpecialUses();
			case PermadelerPackage.SPECIES__FLOWER_COLOR:
				return getFlowerColor();
			case PermadelerPackage.SPECIES__PRUNING_MONTHS:
				return getPruningMonths();
			case PermadelerPackage.SPECIES__PRUNE_NOTE:
				return getPruneNote();
			case PermadelerPackage.SPECIES__COLOR:
				return getColor();
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
			case PermadelerPackage.SPECIES__TYPE:
				setType((Genus)newValue);
				return;
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MIN:
				setUsdaHardinessMin((Integer)newValue);
				return;
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				getLightingCondition().clear();
				getLightingCondition().addAll((Collection<? extends Shade>)newValue);
				return;
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				getSoilType().clear();
				getSoilType().addAll((Collection<? extends SoilType>)newValue);
				return;
			case PermadelerPackage.SPECIES__MOISTURE:
				getMoisture().clear();
				getMoisture().addAll((Collection<? extends Moisture>)newValue);
				return;
			case PermadelerPackage.SPECIES__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS:
				getProductiveMonths().clear();
				getProductiveMonths().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.SPECIES__BLOOM_MONTHS:
				getBloomMonths().clear();
				getBloomMonths().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.SPECIES__FRUIT_CONSERVATION:
				setFruitConservation((Integer)newValue);
				return;
			case PermadelerPackage.SPECIES__FRUITS_AVAILABILITY:
				getFruitsAvailability().clear();
				getFruitsAvailability().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.SPECIES__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case PermadelerPackage.SPECIES__GROW_RATE:
				setGrowRate((GrowRate)newValue);
				return;
			case PermadelerPackage.SPECIES__WIND:
				getWind().clear();
				getWind().addAll((Collection<? extends Wind>)newValue);
				return;
			case PermadelerPackage.SPECIES__WIDTH:
				setWidth((Float)newValue);
				return;
			case PermadelerPackage.SPECIES__HEIGHT:
				setHeight((Float)newValue);
				return;
			case PermadelerPackage.SPECIES__EATING_TYPE:
				setEatingType((EatingType)newValue);
				return;
			case PermadelerPackage.SPECIES__EDIBLE_PARTS:
				getEdibleParts().clear();
				getEdibleParts().addAll((Collection<? extends EdiblePart>)newValue);
				return;
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MAX:
				setUsdaHardinessMax((Integer)newValue);
				return;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				getSpecialUses().clear();
				getSpecialUses().addAll((Collection<? extends SpecialUses>)newValue);
				return;
			case PermadelerPackage.SPECIES__FLOWER_COLOR:
				setFlowerColor((String)newValue);
				return;
			case PermadelerPackage.SPECIES__PRUNING_MONTHS:
				getPruningMonths().clear();
				getPruningMonths().addAll((Collection<? extends Integer>)newValue);
				return;
			case PermadelerPackage.SPECIES__PRUNE_NOTE:
				setPruneNote((String)newValue);
				return;
			case PermadelerPackage.SPECIES__COLOR:
				setColor((Color)newValue);
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
			case PermadelerPackage.SPECIES__TYPE:
				setType((Genus)null);
				return;
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MIN:
				setUsdaHardinessMin(USDA_HARDINESS_MIN_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				getLightingCondition().clear();
				return;
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				getSoilType().clear();
				return;
			case PermadelerPackage.SPECIES__MOISTURE:
				getMoisture().clear();
				return;
			case PermadelerPackage.SPECIES__REFERENCES:
				getReferences().clear();
				return;
			case PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS:
				getProductiveMonths().clear();
				return;
			case PermadelerPackage.SPECIES__BLOOM_MONTHS:
				getBloomMonths().clear();
				return;
			case PermadelerPackage.SPECIES__FRUIT_CONSERVATION:
				setFruitConservation(FRUIT_CONSERVATION_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__FRUITS_AVAILABILITY:
				getFruitsAvailability().clear();
				return;
			case PermadelerPackage.SPECIES__IMAGES:
				getImages().clear();
				return;
			case PermadelerPackage.SPECIES__GROW_RATE:
				setGrowRate(GROW_RATE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__WIND:
				getWind().clear();
				return;
			case PermadelerPackage.SPECIES__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__EATING_TYPE:
				setEatingType(EATING_TYPE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__EDIBLE_PARTS:
				getEdibleParts().clear();
				return;
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MAX:
				setUsdaHardinessMax(USDA_HARDINESS_MAX_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				getSpecialUses().clear();
				return;
			case PermadelerPackage.SPECIES__FLOWER_COLOR:
				setFlowerColor(FLOWER_COLOR_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__PRUNING_MONTHS:
				getPruningMonths().clear();
				return;
			case PermadelerPackage.SPECIES__PRUNE_NOTE:
				setPruneNote(PRUNE_NOTE_EDEFAULT);
				return;
			case PermadelerPackage.SPECIES__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case PermadelerPackage.SPECIES__TYPE:
				return getType() != null;
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MIN:
				return usdaHardinessMin != USDA_HARDINESS_MIN_EDEFAULT;
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
				return lightingCondition != null && !lightingCondition.isEmpty();
			case PermadelerPackage.SPECIES__SOIL_TYPE:
				return soilType != null && !soilType.isEmpty();
			case PermadelerPackage.SPECIES__MOISTURE:
				return moisture != null && !moisture.isEmpty();
			case PermadelerPackage.SPECIES__REFERENCES:
				return references != null && !references.isEmpty();
			case PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS:
				return productiveMonths != null && !productiveMonths.isEmpty();
			case PermadelerPackage.SPECIES__BLOOM_MONTHS:
				return bloomMonths != null && !bloomMonths.isEmpty();
			case PermadelerPackage.SPECIES__FRUIT_CONSERVATION:
				return fruitConservation != FRUIT_CONSERVATION_EDEFAULT;
			case PermadelerPackage.SPECIES__FRUITS_AVAILABILITY:
				return fruitsAvailability != null && !fruitsAvailability.isEmpty();
			case PermadelerPackage.SPECIES__IMAGES:
				return images != null && !images.isEmpty();
			case PermadelerPackage.SPECIES__GROW_RATE:
				return growRate != GROW_RATE_EDEFAULT;
			case PermadelerPackage.SPECIES__WIND:
				return wind != null && !wind.isEmpty();
			case PermadelerPackage.SPECIES__WIDTH:
				return width != WIDTH_EDEFAULT;
			case PermadelerPackage.SPECIES__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PermadelerPackage.SPECIES__EATING_TYPE:
				return eatingType != EATING_TYPE_EDEFAULT;
			case PermadelerPackage.SPECIES__EDIBLE_PARTS:
				return edibleParts != null && !edibleParts.isEmpty();
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MAX:
				return usdaHardinessMax != USDA_HARDINESS_MAX_EDEFAULT;
			case PermadelerPackage.SPECIES__SPECIAL_USES:
				return specialUses != null && !specialUses.isEmpty();
			case PermadelerPackage.SPECIES__FLOWER_COLOR:
				return FLOWER_COLOR_EDEFAULT == null ? flowerColor != null
						: !FLOWER_COLOR_EDEFAULT.equals(flowerColor);
			case PermadelerPackage.SPECIES__PRUNING_MONTHS:
				return pruningMonths != null && !pruningMonths.isEmpty();
			case PermadelerPackage.SPECIES__PRUNE_NOTE:
				return PRUNE_NOTE_EDEFAULT == null ? pruneNote != null
						: !PRUNE_NOTE_EDEFAULT.equals(pruneNote);
			case PermadelerPackage.SPECIES__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
			case PermadelerPackage.SPECIES___GET_ALL_NAMES:
				return getAllNames();
			case PermadelerPackage.SPECIES___GET_EFFECTIVE_COLOR:
				return getEffectiveColor();
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
		result.append(" (usdaHardinessMin: ");
		result.append(usdaHardinessMin);
		result.append(", lightingCondition: ");
		result.append(lightingCondition);
		result.append(", soilType: ");
		result.append(soilType);
		result.append(", moisture: ");
		result.append(moisture);
		result.append(", productiveMonths: ");
		result.append(productiveMonths);
		result.append(", bloomMonths: ");
		result.append(bloomMonths);
		result.append(", fruitConservation: ");
		result.append(fruitConservation);
		result.append(", fruitsAvailability: ");
		result.append(fruitsAvailability);
		result.append(", growRate: ");
		result.append(growRate);
		result.append(", wind: ");
		result.append(wind);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", eatingType: ");
		result.append(eatingType);
		result.append(", edibleParts: ");
		result.append(edibleParts);
		result.append(", usdaHardinessMax: ");
		result.append(usdaHardinessMax);
		result.append(", specialUses: ");
		result.append(specialUses);
		result.append(", flowerColor: ");
		result.append(flowerColor);
		result.append(", pruningMonths: ");
		result.append(pruningMonths);
		result.append(", pruneNote: ");
		result.append(pruneNote);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SpeciesImpl
