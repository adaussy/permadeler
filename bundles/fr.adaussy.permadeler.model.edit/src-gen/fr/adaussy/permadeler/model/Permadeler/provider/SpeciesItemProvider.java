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
package fr.adaussy.permadeler.model.Permadeler.provider;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Species;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Species} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeciesItemProvider extends ImageOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeciesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addReferencesPropertyDescriptor(object);
			addIconKeyPropertyDescriptor(object);
			addCommonNamesPropertyDescriptor(object);
			addRepresentationKeyPropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
			addSpeciesPropertyDescriptor(object);
			addGenusPropertyDescriptor(object);
			addFamilyPropertyDescriptor(object);
			addLifeCyclePropertyDescriptor(object);
			addRootTypePropertyDescriptor(object);
			addFoilageTypePropertyDescriptor(object);
			addDroughtTolerancePropertyDescriptor(object);
			addFoilageShadePropertyDescriptor(object);
			addToleratedLightingConditionPropertyDescriptor(object);
			addLightingConditionPropertyDescriptor(object);
			addMoisturePropertyDescriptor(object);
			addSoilTypePropertyDescriptor(object);
			addMinTemperaturePropertyDescriptor(object);
			addWindPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addSpecialUsesPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addGrowRatePropertyDescriptor(object);
			addDefaultLayerPropertyDescriptor(object);
			addDefaultRepresentationKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NamedElement_name_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_NamedElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NamedElement_description_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_description_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_NamedElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.NAMED_ELEMENT__DESCRIPTION, true, true, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ReferencingElement_references_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ReferencingElement_references_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ReferencingElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.REFERENCING_ELEMENT__REFERENCES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Icon Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_iconKey_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_iconKey_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__ICON_KEY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Common Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_commonNames_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_commonNames_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__COMMON_NAMES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Representation Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_representationKey_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_representationKey_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__REPRESENTATION_KEY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_shortName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_shortName_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__SHORT_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Species feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_species_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_species_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__SPECIES, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Genus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_genus_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_genus_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__GENUS, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Family feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFamilyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_family_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_family_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__FAMILY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Life Cycle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifeCyclePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_lifeCycle_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_lifeCycle_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__LIFE_CYCLE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Root Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_rootType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_rootType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__ROOT_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Foilage Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoilageTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_foilageType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_foilageType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__FOILAGE_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Drought Tolerance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDroughtTolerancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_droughtTolerance_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_droughtTolerance_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__DROUGHT_TOLERANCE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Foilage Shade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoilageShadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_foilageShade_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_foilageShade_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__FOILAGE_SHADE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tolerated Lighting Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToleratedLightingConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_toleratedLightingCondition_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_Species_toleratedLightingCondition_feature", "_UI_Species_type"), //$NON-NLS-1$ //$NON-NLS-2$
				PermadelerPackage.Literals.SPECIES__TOLERATED_LIGHTING_CONDITION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lighting Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLightingConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_lightingCondition_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_lightingCondition_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__LIGHTING_CONDITION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Moisture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoisturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_moisture_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_moisture_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__MOISTURE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Soil Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoilTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_soilType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_soilType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__SOIL_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_minTemperature_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_minTemperature_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__MIN_TEMPERATURE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_wind_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_wind_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__WIND, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_width_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_width_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__WIDTH, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Special Uses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecialUsesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_specialUses_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_specialUses_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__SPECIAL_USES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_height_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_height_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__HEIGHT, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Grow Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrowRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_growRate_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_growRate_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__GROW_RATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_defaultLayer_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Species_defaultLayer_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Species_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.SPECIES__DEFAULT_LAYER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Representation Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRepresentationKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_defaultRepresentationKind_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_Species_defaultRepresentationKind_feature", "_UI_Species_type"), //$NON-NLS-1$ //$NON-NLS-2$
				PermadelerPackage.Literals.SPECIES__DEFAULT_REPRESENTATION_KIND, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PermadelerPackage.Literals.PLANT__ACTIONS);
			childrenFeatures.add(PermadelerPackage.Literals.PLANT__PRODUCTIONS);
			childrenFeatures.add(PermadelerPackage.Literals.SPECIES__VARIETIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Species.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Species")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Species)object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Species_type") : //$NON-NLS-1$
				getString("_UI_Species_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Species.class)) {
			case PermadelerPackage.SPECIES__NAME:
			case PermadelerPackage.SPECIES__DESCRIPTION:
			case PermadelerPackage.SPECIES__REFERENCES:
			case PermadelerPackage.SPECIES__ICON_KEY:
			case PermadelerPackage.SPECIES__COMMON_NAMES:
			case PermadelerPackage.SPECIES__REPRESENTATION_KEY:
			case PermadelerPackage.SPECIES__SHORT_NAME:
			case PermadelerPackage.SPECIES__SPECIES:
			case PermadelerPackage.SPECIES__GENUS:
			case PermadelerPackage.SPECIES__FAMILY:
			case PermadelerPackage.SPECIES__LIFE_CYCLE:
			case PermadelerPackage.SPECIES__ROOT_TYPE:
			case PermadelerPackage.SPECIES__FOILAGE_TYPE:
			case PermadelerPackage.SPECIES__DROUGHT_TOLERANCE:
			case PermadelerPackage.SPECIES__FOILAGE_SHADE:
			case PermadelerPackage.SPECIES__TOLERATED_LIGHTING_CONDITION:
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
			case PermadelerPackage.SPECIES__MOISTURE:
			case PermadelerPackage.SPECIES__SOIL_TYPE:
			case PermadelerPackage.SPECIES__MIN_TEMPERATURE:
			case PermadelerPackage.SPECIES__WIND:
			case PermadelerPackage.SPECIES__WIDTH:
			case PermadelerPackage.SPECIES__SPECIAL_USES:
			case PermadelerPackage.SPECIES__HEIGHT:
			case PermadelerPackage.SPECIES__GROW_RATE:
			case PermadelerPackage.SPECIES__DEFAULT_LAYER:
			case PermadelerPackage.SPECIES__DEFAULT_REPRESENTATION_KIND:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PermadelerPackage.SPECIES__ACTIONS:
			case PermadelerPackage.SPECIES__PRODUCTIONS:
			case PermadelerPackage.SPECIES__VARIETIES:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.PLANT__ACTIONS,
				PermadelerFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.PLANT__PRODUCTIONS,
				PermadelerFactory.eINSTANCE.createProduction()));

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.SPECIES__VARIETIES,
				PermadelerFactory.eINSTANCE.createVariety()));
	}

}
