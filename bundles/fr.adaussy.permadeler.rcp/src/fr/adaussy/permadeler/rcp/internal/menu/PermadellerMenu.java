/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import java.util.function.Supplier;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

/**
 * Menu to used to plug permadeller action
 * 
 * @author Arthur Daussy
 */
public class PermadellerMenu extends ContributionItem {

	private static final String PERMADELLER_MENU_ID = "PermadellerID"; //$NON-NLS-1$

	@Override
	public void fill(Menu menu, int index) {
		if (getParent() instanceof MenuManager) {
			MenuManager menuManager = (MenuManager)getParent();
			if (!PERMADELLER_MENU_ID.equals(menuManager.getId())
					&& menuManager.find(PERMADELLER_MENU_ID) == null) {
				MenuManager menu2 = new MenuManager("Permadeller", PERMADELLER_MENU_ID); //$NON-NLS-1$
				menu2.setRemoveAllWhenShown(true);
				final ISelection selection;
				ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getService(ISelectionService.class);
				if (selectionService != null) {
					selection = selectionService.getSelection();
				} else {
					selection = new StructuredSelection();
				}
				Supplier<ISelection> selectionProvicer = () -> {
					return selection;
				};

				menu2.addMenuListener(new MenuFiller(() -> getSession(selection), selectionProvicer));
				menuManager.add(menu2);
			}
		}

	}

	private Session getSession(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection stSelection = (IStructuredSelection)selection;

			Object first = stSelection.getFirstElement();

			if (first instanceof EObject) {
				return Session.of((EObject)first).orElse(null);
			} else if (first instanceof IGraphicalEditPart) {
				EObject semanticElement = ((IGraphicalEditPart)first).resolveSemanticElement();
				if (semanticElement != null) {
					return Session.of(semanticElement).orElse(null);
				}
			} else if (first instanceof IAdaptable) {
				EObject eObject = Platform.getAdapterManager().getAdapter(first, EObject.class);
				if (eObject != null) {
					return Session.of(eObject).orElse(null);
				}
			}

		}

		return null;
	}

}
