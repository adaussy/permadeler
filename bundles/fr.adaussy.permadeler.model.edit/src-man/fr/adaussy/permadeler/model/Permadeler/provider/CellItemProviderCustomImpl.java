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
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;

/**
 * {@link CellItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class CellItemProviderCustomImpl extends CellItemProvider {

	public CellItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Cell cell = (Cell)object;
		Plant species = cell.getPlant();
		if (species != null) {
			IItemLabelProvider adapt = (IItemLabelProvider)getRootAdapterFactory().adapt(species,
					IItemLabelProvider.class);
			return adapt.getText(species);
		} else {
			return "Empty"; //$NON-NLS-1$
		}
	}

	@Override
	public Object getImage(Object object) {
		Cell cell = (Cell)object;
		Plant plant = cell.getPlant();
		if (plant != null) {
			return ((IItemLabelProvider)getRootAdapterFactory().adapt(plant, IItemLabelProvider.class))
					.getImage((plant));
		} else {
			return overlayImage(object, getResourceLocator().getImage("other/icons/area.png")); //$NON-NLS-1$
		}
	}

	@Override
	public void notifyChanged(Notification notification) {

		switch (notification.getFeatureID(Cell.class)) {
			case PermadelerPackage.CELL__PLANT:
				Object notifier = notification.getNotifier();
				if (notifier instanceof EObject) {
					EObject eObject = (EObject)notifier;

					// Refresh label of the tray
					fireNotifyChanged(new ViewerNotification(notification, eObject.eContainer().eContainer(),
							false, true));
					// Refresh the row label (number of non empty cell)
					fireNotifyChanged(
							new ViewerNotification(notification, eObject.eContainer(), false, true));
					fireNotifyChanged(new ViewerNotification(notification, eObject, false, true));
				}
				break;
			default:
				break;

		}
		super.notifyChanged(notification);
	}

}
