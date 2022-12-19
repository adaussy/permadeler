
package fr.adaussy.permadeler.rcp.internal.actions;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.rcp.internal.parts.KnowledgeViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.NursaryViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.PlantationsViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.SeedBankViewerPart;

public class RefreshViewers {

	@Execute
	public void execute() {
		refreshView(KnowledgeViewerPart.ID);
		refreshView(PlantationsViewerPart.ID);
		refreshView(SeedBankViewerPart.ID);
		refreshView(NursaryViewerPart.ID);

	}

	private void refreshView(String viewId) {
		MApplication application = PlatformUI.getWorkbench().getService(MApplication.class);
		EModelService modelService = PlatformUI.getWorkbench().getService(EModelService.class);
		MUIElement part = modelService.find(viewId, application);
		if (part instanceof MPart) {
			MPart mPart = (MPart)part;
			if (mPart.getObject() instanceof IViewerProvider) {
				IViewerProvider viewProvider = (IViewerProvider)mPart.getObject();
				Viewer viewer = viewProvider.getViewer();
				if (viewer != null && !viewer.getControl().isDisposed()) {
					viewer.refresh();
				}
			}
		}
	}

}
