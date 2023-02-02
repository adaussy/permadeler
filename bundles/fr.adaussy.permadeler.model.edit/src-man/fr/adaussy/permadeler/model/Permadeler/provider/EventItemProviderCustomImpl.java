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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.Event;

/**
 * {@link EventItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class EventItemProviderCustomImpl extends EventItemProvider {

	private static final String SOW_EVENT = "sow"; //$NON-NLS-1$

	private static final String REMOVAL_FEATURE = "removal"; //$NON-NLS-1$

	private static final String PLANTATION_FEATURE = "plantation"; //$NON-NLS-1$

	public EventItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Instant date = ((Event)object).getDate();
		if (date == null) {
			return ""; //$NON-NLS-1$
		}
		return DateUtils.instantToDateString(date);
	}

	@Override
	public Object getImage(Object object) {
		Event event = (Event)object;
		EStructuralFeature containerFeature = event.eContainingFeature();
		String iconPath = "custo/commons/post-it.png";//$NON-NLS-1$
		if (containerFeature != null) {
			if (containerFeature.getName().contains(PLANTATION_FEATURE)) {
				iconPath = "custo/commons/planting.png"; //$NON-NLS-1$
			} else if (containerFeature.getName().contains(REMOVAL_FEATURE)) {
				iconPath = "custo/commons/knife.png"; //$NON-NLS-1$
			} else if (containerFeature.getName().contains(SOW_EVENT)) {
				iconPath = "other/icons/072-seed.png"; //$NON-NLS-1$
			}
		}
		return overlayImage(object, getResourceLocator().getImage(iconPath));
	}
}
