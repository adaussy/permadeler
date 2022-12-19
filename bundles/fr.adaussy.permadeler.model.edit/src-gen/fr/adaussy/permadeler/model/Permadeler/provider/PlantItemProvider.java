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
import fr.adaussy.permadeler.model.Permadeler.Plant;

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
 * This is the item provider adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Plant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantItemProvider extends PlantNamedElementItemProviderCustomImpl {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantItemProvider(AdapterFactory adapterFactory) {
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

			addWidthPropertyDescriptor(object);
			addSoilTypePropertyDescriptor(object);
			addLightingConditionPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addMinTemperaturePropertyDescriptor(object);
			addMoisturePropertyDescriptor(object);
			addSpecialUsesPropertyDescriptor(object);
			addGrowRatePropertyDescriptor(object);
			addWindPropertyDescriptor(object);
			addLifeCyclePropertyDescriptor(object);
			addFamilyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				getString("_UI_Plant_width_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_width_feature", "_UI_Plant_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PermadelerPackage.Literals.PLANT__WIDTH, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_soilType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_soilType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__SOIL_TYPE, true, false, false,
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
				getString("_UI_Plant_lightingCondition_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_lightingCondition_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__LIGHTING_CONDITION, true, false, false,
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
				getString("_UI_Plant_height_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_height_feature", "_UI_Plant_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PermadelerPackage.Literals.PLANT__HEIGHT, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_minTemperature_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_minTemperature_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__MIN_TEMPERATURE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_moisture_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_moisture_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__MOISTURE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_specialUses_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_specialUses_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__SPECIAL_USES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_growRate_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_growRate_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__GROW_RATE, true, false, false,
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
				getString("_UI_Plant_wind_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_wind_feature", "_UI_Plant_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PermadelerPackage.Literals.PLANT__WIND, true, false, false,
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
				getString("_UI_Plant_lifeCycle_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_lifeCycle_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Plant_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT__LIFE_CYCLE, true, false, false,
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
				getString("_UI_Plant_family_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_family_feature", "_UI_Plant_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				PermadelerPackage.Literals.PLANT__FAMILY, true, false, false,
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
			childrenFeatures.add(PermadelerPackage.Literals.PLANT__IMAGES);
			childrenFeatures.add(PermadelerPackage.Literals.PLANT__PRODUCTIONS);
			childrenFeatures.add(PermadelerPackage.Literals.PLANT__ACTIONS);
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
	 * This returns Plant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plant")); //$NON-NLS-1$
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
		String label = ((Plant)object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Plant_type") : //$NON-NLS-1$
				getString("_UI_Plant_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Plant.class)) {
			case PermadelerPackage.PLANT__WIDTH:
			case PermadelerPackage.PLANT__SOIL_TYPE:
			case PermadelerPackage.PLANT__LIGHTING_CONDITION:
			case PermadelerPackage.PLANT__HEIGHT:
			case PermadelerPackage.PLANT__MIN_TEMPERATURE:
			case PermadelerPackage.PLANT__MOISTURE:
			case PermadelerPackage.PLANT__SPECIAL_USES:
			case PermadelerPackage.PLANT__GROW_RATE:
			case PermadelerPackage.PLANT__WIND:
			case PermadelerPackage.PLANT__LIFE_CYCLE:
			case PermadelerPackage.PLANT__FAMILY:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PermadelerPackage.PLANT__IMAGES:
			case PermadelerPackage.PLANT__PRODUCTIONS:
			case PermadelerPackage.PLANT__ACTIONS:
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

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.PLANT__IMAGES,
				PermadelerFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.PLANT__PRODUCTIONS,
				PermadelerFactory.eINSTANCE.createProduction()));

		newChildDescriptors.add(createChildParameter(PermadelerPackage.Literals.PLANT__ACTIONS,
				PermadelerFactory.eINSTANCE.createAction()));
	}

}
