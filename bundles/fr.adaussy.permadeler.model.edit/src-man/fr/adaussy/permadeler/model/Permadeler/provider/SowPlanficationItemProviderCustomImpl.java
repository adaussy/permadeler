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

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.EditMessages;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;

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
		String iconPath = ""; //$NON-NLS-1$
		SowPlanfication sowPlan = (SowPlanfication)object;
		if (sowPlan.getType() == SowType.INDOOR) {
			iconPath = "other/icons/greenhouse.png"; //$NON-NLS-1$
		} else if (sowPlan.getType() == SowType.OUTDOOR) {
			iconPath = "other/icons/sow.png"; //$NON-NLS-1$
		}
		return overlayImage(object, getResourceLocator().getImage(iconPath));
	}

	@Override
	public String getText(Object object) {
		SowPlanfication planification = (SowPlanfication)object;
		StringBuilder builder = new StringBuilder();

		if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber())) {
			builder.append(EditMessages.SowPlanficationItemProviderCustomImpl_0);
		} else if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber() + 1)) {
			builder.append(EditMessages.SowPlanficationItemProviderCustomImpl_1);
		} else if (planification.getWeeks().contains(DateUtils.getCurrentWeekNumber() - 1)) {
			builder.append(EditMessages.SowPlanficationItemProviderCustomImpl_2);
		}
		SeedItem seed = planification.getSeed();
		if (seed != null && seed.getType() != null) {
			builder.append(" " + seed.getType().getName()); //$NON-NLS-1$
		}
		return builder.toString();
	}

}
