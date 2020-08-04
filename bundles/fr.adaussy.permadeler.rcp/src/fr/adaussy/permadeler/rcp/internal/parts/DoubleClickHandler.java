/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.parts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.internal.editor.NavigateToCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.ContextualMenuFiller;
import fr.adaussy.permadeler.rcp.internal.menu.MenuFiller;

/**
 * Handler for double click on {@link TreeViewer}
 * 
 * @author Arthur Daussy
 */
public class DoubleClickHandler implements IDoubleClickListener {

	private TreeViewer viewer;

	private Supplier<Session> sessionSup;

	public DoubleClickHandler(Supplier<Session> sessionSup, TreeViewer viewer) {
		this.sessionSup = sessionSup;
		this.viewer = viewer;
	}

	@SuppressWarnings("restriction")
	@Override
	public void doubleClick(DoubleClickEvent event) {
		List<EObject> permSelection = MenuFiller.getPermadellerSelection(viewer.getStructuredSelection());
		ContextualMenuFiller filler = new ContextualMenuFiller(sessionSup.get());
		for (EClass eClass : EMFUtils.getCommonEClasses(permSelection)) {
			filler.fill(eClass, permSelection);
		}
		if (filler.getDefaultAction() != null) {
			Event swtEvent = new Event();
			swtEvent.display = event.getViewer().getControl().getDisplay();
			filler.getDefaultAction().runWithEvent(swtEvent);
		} else {
			Object firstSection = viewer.getStructuredSelection().getFirstElement();
			if (firstSection instanceof DRepresentationDescriptor) {
				DRepresentationDescriptor representationDescription = (DRepresentationDescriptor)firstSection;
				DRepresentation representation = representationDescription.getRepresentation();
				Session session = sessionSup.get();
				session.getTransactionalEditingDomain().getCommandStack()
						.execute(new NavigateToCommand(session, representation));
			} else {
				ISelection selection = viewer.getSelection();
				IWorkbenchPage page = EclipseUIUtil.getActivePage();
				IEditorPart activeEditor = page.getActiveEditor();
				if (activeEditor instanceof DialectEditor) {
					DialectEditor dialectEditor = (DialectEditor)activeEditor;
					page.bringToTop(dialectEditor);
					selectRepresentationElements(selection, dialectEditor);
				}
			}
		}

	}

	private void selectRepresentationElements(ISelection selection, DialectEditor dialectEditor) {
		List<DRepresentationElement> representationElements = getRepresentationElements(
				dialectEditor.getRepresentation(), ((IStructuredSelection)selection).toList());
		DialectUIManager.INSTANCE.selectAndReveal(dialectEditor, representationElements);
	}

	/**
	 * Gets all {@link DRepresentationElement} in a {@link DRepresentation} for a given semantic selection
	 * 
	 * @param representation
	 *            the {@link DRepresentation}
	 * @param selection
	 *            the semantic selection
	 * @return a list of representation
	 */
	private List<DRepresentationElement> getRepresentationElements(final DRepresentation representation,
			final List<?> selection) {
		List<DRepresentationElement> result = new ArrayList<>();
		if (representation != null) {
			for (final DRepresentationElement element : representation.getRepresentationElements()) {
				if (selection != null && selection.contains(element.getTarget())) {
					result.add(element);
				}
			}
		}
		return result;
	}
}
