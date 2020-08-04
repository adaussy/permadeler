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

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
public class PlantItemProvider extends SpeciesItemProvider {
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

			addSowIndoorMonthsPropertyDescriptor(object);
			addSowOutdoorMonthsPropertyDescriptor(object);
			addLifeCyclePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sow Indoor Months feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSowIndoorMonthsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_sowIndoorMonths_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_sowIndoorMonths_feature",
						"_UI_Plant_type"),
				PermadelerPackage.Literals.PLANT__SOW_INDOOR_MONTHS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sow Outdoor Months feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSowOutdoorMonthsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Plant_sowOutdoorMonths_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_sowOutdoorMonths_feature",
						"_UI_Plant_type"),
				PermadelerPackage.Literals.PLANT__SOW_OUTDOOR_MONTHS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
				getString("_UI_Plant_lifeCycle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Plant_lifeCycle_feature",
						"_UI_Plant_type"),
				PermadelerPackage.Literals.PLANT__LIFE_CYCLE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Plant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plant"));
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
		return label == null || label.length() == 0 ? getString("_UI_Plant_type")
				: getString("_UI_Plant_type") + " " + label;
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
			case PermadelerPackage.PLANT__SOW_INDOOR_MONTHS:
			case PermadelerPackage.PLANT__SOW_OUTDOOR_MONTHS:
			case PermadelerPackage.PLANT__LIFE_CYCLE:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
