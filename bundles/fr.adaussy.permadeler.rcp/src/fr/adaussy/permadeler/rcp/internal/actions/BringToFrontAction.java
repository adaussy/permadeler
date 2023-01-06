
package fr.adaussy.permadeler.rcp.internal.actions;

import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;

public class BringToFrontAction extends AbstractZOrderAction {

	@Override
	protected String getRequestType() {
		return ZOrderRequest.REQ_BRING_TO_FRONT;
	}

}
