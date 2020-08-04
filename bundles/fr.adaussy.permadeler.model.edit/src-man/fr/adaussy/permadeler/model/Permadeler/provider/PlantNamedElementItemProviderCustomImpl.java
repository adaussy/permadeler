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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.business.api.session.SessionManager;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;

/**
 * {@link PlantNamedElementItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class PlantNamedElementItemProviderCustomImpl extends PlantNamedElementItemProvider {

	public PlantNamedElementItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getFeature() == PermadelerPackage.eINSTANCE
				.getPlantNamedElement_RepresentationKey()) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof EObject) {
				EObject eObject = (EObject)notifier;

				List<EObject> toNotifiy = new ArrayList<>();
				TreeIterator<EObject> contentIte = eObject.eAllContents();
				ECrossReferenceAdapter semanticCrossReferencer = SessionManager.INSTANCE.getSession(eObject)
						.getSemanticCrossReferencer();
				semanticCrossReferencer.getInverseReferences(eObject).stream().forEach(s -> {
					toNotifiy.add(s.getEObject());
				});
				while (contentIte.hasNext()) {
					EObject child = contentIte.next();
					toNotifiy.add(child);
					semanticCrossReferencer.getInverseReferences(child).stream().forEach(s -> {
						toNotifiy.add(s.getEObject());
					});
				}
				for (EObject n : toNotifiy) {
					fireNotifyChanged(new ViewerNotification(notification, n, false, true));
				}

			}
		}
		super.notifyChanged(notification);
	}
}
