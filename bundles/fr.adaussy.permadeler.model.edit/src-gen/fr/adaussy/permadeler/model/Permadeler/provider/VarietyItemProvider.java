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
import fr.adaussy.permadeler.model.Permadeler.Variety;

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
 * This is the item provider adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Variety} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VarietyItemProvider extends ImageOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarietyItemProvider(AdapterFactory adapterFactory) {
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
			addVarietyPropertyDescriptor(object);
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
				getString("_UI_Variety_species_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Variety_species_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Variety_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.VARIETY__SPECIES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Variety feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarietyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Variety_variety_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Variety_variety_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Variety_type"), //$NON-NLS-1$
				PermadelerPackage.Literals.VARIETY__VARIETY, false, false, false,
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
	 * This returns Variety.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Variety")); //$NON-NLS-1$
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
		String label = ((Variety)object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Variety_type") : //$NON-NLS-1$
				getString("_UI_Variety_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Variety.class)) {
			case PermadelerPackage.VARIETY__NAME:
			case PermadelerPackage.VARIETY__DESCRIPTION:
			case PermadelerPackage.VARIETY__REFERENCES:
			case PermadelerPackage.VARIETY__ICON_KEY:
			case PermadelerPackage.VARIETY__COMMON_NAMES:
			case PermadelerPackage.VARIETY__REPRESENTATION_KEY:
			case PermadelerPackage.VARIETY__SHORT_NAME:
			case PermadelerPackage.VARIETY__VARIETY:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PermadelerPackage.VARIETY__ACTIONS:
			case PermadelerPackage.VARIETY__PRODUCTIONS:
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
	}

}
