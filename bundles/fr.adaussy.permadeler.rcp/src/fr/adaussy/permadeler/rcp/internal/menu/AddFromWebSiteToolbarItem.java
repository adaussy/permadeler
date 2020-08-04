/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.rcp.internal.actions.AddSeedFromWebSite;

/**
 * Adds a seed from a downlaoded website
 * 
 * @author Arthur Daussy
 */
public class AddFromWebSiteToolbarItem {

	@Execute
	public void execute(SeedBank seedBank, Session session, Event event) {
		AddSeedFromWebSite action = new AddSeedFromWebSite(seedBank, session);
		action.runWithEvent(event);
	}

	@CanExecute
	public boolean canExecute(@Optional SeedBank seedBank) {
		return seedBank != null;
	}

}
