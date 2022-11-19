/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.handlers;

import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SowCalendarSeedBankDirectMenu extends AbstractSowCalendarDirectMenu<SeedBank> {
	@Override
	protected SeedBank getRootItem(PermadelerSession session) {
		return session.getSeedBank();
	}

}
