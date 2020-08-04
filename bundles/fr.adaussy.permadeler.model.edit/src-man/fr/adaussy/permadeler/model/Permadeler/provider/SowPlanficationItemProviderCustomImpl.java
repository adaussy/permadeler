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
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.edit.ImageProvider;

/**
 * {@link SowPlanficationItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class SowPlanficationItemProviderCustomImpl extends SowPlanficationItemProvider {

	public SowPlanficationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		SowPlanfication planification = (SowPlanfication)object;
		StringBuilder builder = new StringBuilder();

		if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber())) {
			builder.append("[This week]");
		} else if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber() + 1)) {
			builder.append("[Next week]");
		} else if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber() - 1)) {
			builder.append("[Last week]");
		}
		SeedItem seed = planification.getSeed();
		if (seed != null && seed.getType() != null) {
			builder.append(" " + seed.getType().getName());
		}
		return builder.toString();
	}

}
