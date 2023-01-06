
package fr.adaussy.permadeler.rcp.internal.actions;

import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;

public class SendToBackAction extends AbstractZOrderAction {

	@Override
	protected String getRequestType() {
		return ZOrderRequest.REQ_SEND_TO_BACK;
	}

}
