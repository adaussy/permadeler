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

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.edit.ImageProvider;

/**
 * {@link PlanifierItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class PlanifierItemProviderCustomImpl extends PlanifierItemProvider {

	public PlanifierItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		return "Planifier current week " + DateUtils.getCurrentWeekNumber();
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		switch (notification.getFeatureID(Planifier.class)) {
			case PermadelerPackage.PLANIFIER__PLANFICATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true,
						true /* Need update the model */));
				return;
			default:
				break;
		}
	}

}
