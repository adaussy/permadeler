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
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantNamedElementItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantNamedElementItemProvider(AdapterFactory adapterFactory) {
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

			addReferencesPropertyDescriptor(object);
			addCommonNamesPropertyDescriptor(object);
			addIconKeyPropertyDescriptor(object);
			addRepresentationKeyPropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Common Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PlantNamedElement_commonNames_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PlantNamedElement_commonNames_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_PlantNamedElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT_NAMED_ELEMENT__COMMON_NAMES, true, false, false,
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
				getString("_UI_PlantNamedElement_iconKey_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PlantNamedElement_iconKey_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_PlantNamedElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT_NAMED_ELEMENT__ICON_KEY, true, false, false,
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
				getString("_UI_PlantNamedElement_representationKey_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_PlantNamedElement_representationKey_feature", "_UI_PlantNamedElement_type"), //$NON-NLS-1$ //$NON-NLS-2$
				PermadelerPackage.Literals.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY, true, false, false,
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
				getString("_UI_PlantNamedElement_shortName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PlantNamedElement_shortName_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_PlantNamedElement_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.PLANT_NAMED_ELEMENT__SHORT_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PlantNamedElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlantNamedElement")); //$NON-NLS-1$
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
		String label = ((PlantNamedElement)object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PlantNamedElement_type") : //$NON-NLS-1$
				getString("_UI_PlantNamedElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(PlantNamedElement.class)) {
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REFERENCES:
			case PermadelerPackage.PLANT_NAMED_ELEMENT__COMMON_NAMES:
			case PermadelerPackage.PLANT_NAMED_ELEMENT__ICON_KEY:
			case PermadelerPackage.PLANT_NAMED_ELEMENT__REPRESENTATION_KEY:
			case PermadelerPackage.PLANT_NAMED_ELEMENT__SHORT_NAME:
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
