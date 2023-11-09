/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.session;

import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import fr.adaussy.permadeler.model.design.utils.SizeAndBoundFixerChangeTrigger;

public class DesignSessionManagerListener implements SessionManagerListener {

	public DesignSessionManagerListener() {
	}

	@Override
	public void notify(Session session, int arg1) {
	}

	@Override
	public void notifyAddSession(Session newSession) {
		newSession.getEventBroker().addLocalTrigger(
				NotificationFilter.createNotifierTypeFilter(Diagram.class),
				new SizeAndBoundFixerChangeTrigger(newSession.getTransactionalEditingDomain()));

	}

	@Override
	public void notifyRemoveSession(Session session) {
	}

	@Override
	public void viewpointDeselected(Viewpoint viewpoint) {
	}

	@Override
	public void viewpointSelected(Viewpoint viewpoint) {
	}

}
