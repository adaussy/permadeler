
package fr.adaussy.permadeler.rcp.internal.handlers;

import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SowCalendarSeedBankDirectMenu extends AbstractSowCalendarDirectMenu<SeedBank> {
	@Override
	protected SeedBank getRootItem(PermadelerSession session) {
		return session.getSeedBank();
	}

}
