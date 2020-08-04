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
public class SpeciesItemProvider extends PlantNamedElementItemProviderCustomImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

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

			addTypePropertyDescriptor(object);
			addUsdaHardinessMinPropertyDescriptor(object);
			addLightingConditionPropertyDescriptor(object);
			addSoilTypePropertyDescriptor(object);
			addMoisturePropertyDescriptor(object);
			addProductiveMonthsPropertyDescriptor(object);
			addBloomMonthsPropertyDescriptor(object);
			addFruitConservationPropertyDescriptor(object);
			addFruitsAvailabilityPropertyDescriptor(object);
			addGrowRatePropertyDescriptor(object);
			addWindPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addEatingTypePropertyDescriptor(object);
			addEdiblePartsPropertyDescriptor(object);
			addUsdaHardinessMaxPropertyDescriptor(object);
			addSpecialUsesPropertyDescriptor(object);
			addFlowerColorPropertyDescriptor(object);
			addPruningMonthsPropertyDescriptor(object);
			addPruneNotePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_type_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Usda Hardiness Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsdaHardinessMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_usdaHardinessMin_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_usdaHardinessMin_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__USDA_HARDINESS_MIN, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Species_lightingCondition_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_lightingCondition_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__LIGHTING_CONDITION, true, false, false,
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
				getString("_UI_Species_soilType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_soilType_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__SOIL_TYPE, true, false, false,
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
				getString("_UI_Species_moisture_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_moisture_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__MOISTURE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Productive Months feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductiveMonthsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_productiveMonths_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_productiveMonths_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__PRODUCTIVE_MONTHS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bloom Months feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBloomMonthsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_bloomMonths_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_bloomMonths_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__BLOOM_MONTHS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fruit Conservation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFruitConservationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_fruitConservation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_fruitConservation_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__FRUIT_CONSERVATION, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fruits Availability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFruitsAvailabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_fruitsAvailability_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_fruitsAvailability_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__FRUITS_AVAILABILITY, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Species_growRate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_growRate_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__GROW_RATE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_Species_wind_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_wind_feature",
						"_UI_Species_type"),
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
				getString("_UI_Species_width_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_width_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__WIDTH, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Species_height_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_height_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__HEIGHT, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Eating Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEatingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_eatingType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_eatingType_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__EATING_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Edible Parts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdiblePartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_edibleParts_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_edibleParts_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__EDIBLE_PARTS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Usda Hardiness Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsdaHardinessMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_usdaHardinessMax_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_usdaHardinessMax_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__USDA_HARDINESS_MAX, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Species_specialUses_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_specialUses_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__SPECIAL_USES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flower Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowerColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_flowerColor_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_flowerColor_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__FLOWER_COLOR, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pruning Months feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPruningMonthsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_pruningMonths_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_pruningMonths_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__PRUNING_MONTHS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prune Note feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPruneNotePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Species_pruneNote_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Species_pruneNote_feature",
						"_UI_Species_type"),
				PermadelerPackage.Literals.SPECIES__PRUNE_NOTE, true, false, false,
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
			childrenFeatures.add(PermadelerPackage.Literals.SPECIES__REFERENCES);
			childrenFeatures.add(PermadelerPackage.Literals.SPECIES__IMAGES);
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Species"));
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
		return label == null || label.length() == 0 ? getString("_UI_Species_type")
				: getString("_UI_Species_type") + " " + label;
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
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MIN:
			case PermadelerPackage.SPECIES__LIGHTING_CONDITION:
			case PermadelerPackage.SPECIES__SOIL_TYPE:
			case PermadelerPackage.SPECIES__MOISTURE:
			case PermadelerPackage.SPECIES__PRODUCTIVE_MONTHS:
			case PermadelerPackage.SPECIES__BLOOM_MONTHS:
			case PermadelerPackage.SPECIES__FRUIT_CONSERVATION:
			case PermadelerPackage.SPECIES__FRUITS_AVAILABILITY:
			case PermadelerPackage.SPECIES__GROW_RATE:
			case PermadelerPackage.SPECIES__WIND:
			case PermadelerPackage.SPECIES__WIDTH:
			case PermadelerPackage.SPECIES__HEIGHT:
			case PermadelerPackage.SPECIES__EATING_TYPE:
			case PermadelerPackage.SPECIES__EDIBLE_PARTS:
			case PermadelerPackage.SPECIES__USDA_HARDINESS_MAX:
			case PermadelerPackage.SPECIES__SPECIAL_USES:
			case PermadelerPackage.SPECIES__FLOWER_COLOR:
			case PermadelerPackage.SPECIES__PRUNING_MONTHS:
			case PermadelerPackage.SPECIES__PRUNE_NOTE:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PermadelerPackage.SPECIES__REFERENCES:
			case PermadelerPackage.SPECIES__IMAGES:
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

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.SPECIES__REFERENCES,
				PermadelerFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.SPECIES__IMAGES,
				PermadelerFactory.eINSTANCE.createImage()));
	}

}
