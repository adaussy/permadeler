package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;
import org.eclipse.jface.viewers.IStructuredSelection;

import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public abstract class AbstractZOrderAction {

	protected abstract String getRequestType();

	@Execute
	public void execute(ESelectionService selectionService, PermadelerSession session) {
		for (IGraphicalEditPart editpart : getEditPart(selectionService)) {
			ZOrderRequest request = new ZOrderRequest(getRequestType());
			request.setPartsToOrder(Collections.singletonList(editpart));
			Command cmd = editpart.getCommand(request);

			if (cmd.canExecute()) {
				session.getSession().getTransactionalEditingDomain().getCommandStack()
						.execute(new RecordingCommand(session.getSession().getTransactionalEditingDomain()) {

							@Override
							protected void doExecute() {
								cmd.execute();

							}
						});
			}
		}

	}

	private List<IGraphicalEditPart> getEditPart(ESelectionService selectionService) {
		Object selection = selectionService.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection struct = (IStructuredSelection)selection;
			return Stream.of(struct.toArray()).filter(e -> e instanceof IGraphicalEditPart)
					.map(e -> (IGraphicalEditPart)e).toList();
		}
		return Collections.emptyList();
	}

	@CanExecute
	public boolean canExecute(ESelectionService selection) {
		return !getEditPart(selection).isEmpty();
	}

}
