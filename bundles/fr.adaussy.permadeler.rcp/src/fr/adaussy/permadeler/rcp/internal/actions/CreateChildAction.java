package fr.adaussy.permadeler.rcp.internal.actions;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;

import fr.adaussy.permadeler.rcp.internal.parts.KnowledgeViewerPart;

public class CreateChildAction extends org.eclipse.emf.edit.ui.action.CreateChildAction {

	public CreateChildAction(EditingDomain editingDomain, ISelection selection, Object descriptor) {
		super(editingDomain, selection, descriptor);
	}

	@Override
	public void run() {
		super.run();

		List<EObject> newElements = command.getResult().stream().filter(e -> e instanceof EObject)
				.map(e -> ((EObject)e)).collect(toList());
		FocusOnElementAction.selectInViewExplorer(newElements, KnowledgeViewerPart.ID);
	}

}
