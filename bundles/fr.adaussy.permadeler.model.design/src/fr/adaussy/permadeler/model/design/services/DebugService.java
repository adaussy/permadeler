package fr.adaussy.permadeler.model.design.services;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.ui.IEditorPart;

public class DebugService {

	public void printEditPart(DDiagramElement diagramElement) {
		System.out.println(getEditPart(diagramElement));
	}

	private static IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagramElement).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);

			IGraphicalEditPart result = null;
			if (gmfView != null && editor instanceof DiagramEditor) {
				final Map<?, ?> editPartRegistry = ((DiagramEditor)editor).getDiagramGraphicalViewer()
						.getEditPartRegistry();
				final Object editPart = editPartRegistry.get(gmfView);
				if (editPart instanceof IGraphicalEditPart) {
					result = (IGraphicalEditPart)editPart;
					return result;
				}
			}
		}
		return null;
	}

	public EObject printVariable(EObject self) {
		Map<String, ?> variables = Session.of(self).get().getInterpreter().getVariables();
		variables.keySet().stream().forEach(key -> System.out.println(key + " " + variables.get(key))); //$NON-NLS-1$
		return self;
	}

}
