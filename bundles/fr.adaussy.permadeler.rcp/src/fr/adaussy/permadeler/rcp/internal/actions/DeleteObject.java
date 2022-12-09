package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.rcp.RcpMessages;

/**
 * Deletes an object
 * 
 * @author Arthur Daussy
 */
public class DeleteObject extends AbstractModelAction {

	private final List<EObject> objects;

	public DeleteObject(List<EObject> objects, Session session) {
		super(RcpMessages.DeleteObject_0, session);
		this.objects = objects;
	}

	@Override
	public void runWithEvent(Event event) {
		modifyModel(() -> {
			Session session = getSession();
			for (EObject o : objects) {
				session.getModelAccessor().eDelete(o, session.getSemanticCrossReferencer());
			}
		});
	}

}
