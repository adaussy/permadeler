/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Nursary;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.parts.KnowledgeViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.NursaryViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.PlantationsViewerPart;
import fr.adaussy.permadeler.rcp.internal.parts.SeedBankViewerPart;

/**
 * Action use to display a list of element in a view
 * 
 * @author Arthur Daussy
 */
public class FocusOnElementAction extends Action {

	private final List<? extends EObject> targets;

	private final String viewId;

	/**
	 * Simple constructor
	 * 
	 * @param name
	 *            the name of the action
	 * @param targets
	 *            the element to display
	 * @param viewId
	 *            the id of the view to display the element in
	 */
	public FocusOnElementAction(String name, List<? extends EObject> targets, String viewId) {
		super(name);
		this.targets = targets;
		this.viewId = viewId;
	}

	/**
	 * Selects the given elements in the best representative view
	 * 
	 * @param targets
	 *            a list of target to display
	 */
	public static void selectInBestView(List<? extends EObject> targets) {
		Map<String, List<EObject>> toView = new HashMap<String, List<EObject>>();
		for (EObject t : targets) {
			final List<EObject> objects;
			if (EMFUtils.getAncestor(KnowledgeBase.class, t) != null) {
				objects = toView.computeIfAbsent(KnowledgeViewerPart.ID, o -> new ArrayList<EObject>());
			} else if (EMFUtils.getAncestor(Plantation.class, t) != null) {
				objects = toView.computeIfAbsent(PlantationsViewerPart.ID, o -> new ArrayList<EObject>());
			} else if (EMFUtils.getAncestor(SeedBank.class, t) != null) {
				objects = toView.computeIfAbsent(SeedBankViewerPart.ID, o -> new ArrayList<EObject>());
			} else if (EMFUtils.getAncestor(Nursary.class, t) != null) {
				objects = toView.computeIfAbsent(NursaryViewerPart.ID, o -> new ArrayList<EObject>());
			} else {
				objects = null;
			}
			if (objects != null) {
				objects.add(t);
			}
		}

		for (Entry<String, List<EObject>> entry : toView.entrySet()) {
			selectInViewExplorer(entry.getValue(), entry.getKey());
		}
	}

	/**
	 * Select the object in the given view
	 * 
	 * @param targets
	 *            list of object to select
	 * @param viewId
	 *            the view to display
	 */
	public static void selectInViewExplorer(List<? extends EObject> targets, String viewId) {
		if (targets == null || targets.isEmpty()) {
			return;
		}
		MApplication application = PlatformUI.getWorkbench().getService(MApplication.class);
		EModelService modelService = PlatformUI.getWorkbench().getService(EModelService.class);
		MUIElement part = modelService.find(viewId, application);
		if (part instanceof MPart) {
			MPart mPart = (MPart)part;
			modelService.bringToTop(mPart);
			if (mPart.getObject() instanceof IViewerProvider) {
				IViewerProvider viewProvider = (IViewerProvider)mPart.getObject();
				viewProvider.getViewer().setSelection(new StructuredSelection(targets));

			}
		}
	}

	@Override
	public void runWithEvent(Event event) {
		if (viewId == null) {
			selectInBestView(targets);
		} else {
			selectInViewExplorer(targets, viewId);
		}
	}
}
