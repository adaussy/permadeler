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
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

//TODO
public class ShowInRepresentationAction extends Action {

	private ISelection currentSelection;

	private DRepresentation representation;

	public ShowInRepresentationAction(ISelection currentSelection, DRepresentation representation) {
		super();
		this.currentSelection = currentSelection;
		this.representation = representation;
	}

	@Override
	public void runWithEvent(Event event) {
		IWorkbenchPage page = EclipseUIUtil.getActivePage();
		IEditorPart activeEditor = page.getActiveEditor();
		if (activeEditor instanceof DialectEditor) {
			DialectEditor dialectEditor = (DialectEditor)activeEditor;
			page.bringToTop(dialectEditor);
			selectRepresentationElements(currentSelection, dialectEditor);
		}
	}

	private void selectRepresentationElements(ISelection selection, DialectEditor dialectEditor) {
		List<DRepresentationElement> representationElements = getRepresentationElements(
				dialectEditor.getRepresentation(), ((IStructuredSelection)selection).toList());
		DialectUIManager.INSTANCE.selectAndReveal(dialectEditor, representationElements);
	}

	/**
	 * Gets the {@link DRepresentationElement} of the given selection in a {@link DRepresentation}
	 * 
	 * @param representation
	 *            a representation
	 * @param selection
	 *            the selection
	 * @return lsit of element
	 */
	public static List<DRepresentationElement> getRepresentationElements(final DRepresentation representation,
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
