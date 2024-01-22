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

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.adaussy.permadeler.model.Permadeler.EditMessages;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
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
		Plantation plantation = (Plantation)object;
		Plant plant = plantation.getType();
		if (plant != null) {
			IItemLabelProvider iItemLabelProvider = (IItemLabelProvider)getRootAdapterFactory().adapt(plant,
					IItemLabelProvider.class);
			return iItemLabelProvider.getImage(plant);
		}
		return overlayImage(object, getResourceLocator().getImage("custo/commons/plant.png")); //$NON-NLS-1$ ;
	}

	@Override
	public String getText(Object object) {
		Plantation plantation = (Plantation)object;
		Plant type = plantation.getType();
		String label = ""; //$NON-NLS-1$

		if (type != null) {

			label += TextHelper.getEditLabel(getRootAdapterFactory(), type);
		} else {
			label += EditMessages.PlantationItemProviderCustomImpl_0;
		}

		String id = plantation.getId();
		if (id != null) {
			label += " [" + id + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		}

		Instant plantationDate = plantation.getPlantationDate();
		if (plantationDate != null) {
			label += " - " + LocalDate.ofInstant(plantationDate, ZoneId.systemDefault()).getYear(); //$NON-NLS-1$
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
