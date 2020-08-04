
package fr.adaussy.permadeler.rcp.internal.handlers;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SowCalendarKnowledgeBaseDirectMenu extends AbstractSowCalendarDirectMenu<KnowledgeBase> {
	@Override
	protected KnowledgeBase getRootItem(PermadelerSession session) {
		return session.getKnowledgeBase();
	}

}
