/**
 Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 *
 */
package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;

/**
 * {@link PlantationItemProvider} Custom impl
 * 
 * @author Arthur Daussy
 */
public class PlantationItemProviderCustomImpl extends PlantationItemProvider {

	public PlantationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		Plantation plantation = (Plantation)object;
		Plant type = plantation.getType();
		String label;
		if (type != null) {
			label = TextHelper.getLabel(type);
		} else {
			label = "Plantation with no species";
		}

		return label;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		switch (notification.getFeatureID(Plantation.class)) {
			case PermadelerPackage.PLANTATION__TYPE:
			case PermadelerPackage.PLANTATION__CURRENT_LAYER:
			case PermadelerPackage.PLANTATION__EVENTS:
				fireNotifyChanged(
						new ViewerNotification(notification, notification.getNotifier(), true, true));
				return;
		}
		super.notifyChanged(notification);
	}

}
