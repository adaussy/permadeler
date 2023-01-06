
package fr.adaussy.permadeler.rcp.internal.actions;

import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;

public class SendBackwardAction extends AbstractZOrderAction {

	@Override
	protected String getRequestType() {
		return ZOrderRequest.REQ_SEND_BACKWARD;
	}

}
