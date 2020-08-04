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

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

/**
 * Menu to used to plug permadeller action
 * 
 * @author Arthur Daussy
 */
public class PermadellerMenu extends ContributionItem {

	private static final String PERMADELLER_MENU_ID = "PermadellerID";

	@Override
	public void fill(Menu menu, int index) {
		if (getParent() instanceof MenuManager) {
			MenuManager menuManager = (MenuManager)getParent();
			if (!PERMADELLER_MENU_ID.equals(menuManager.getId())
					&& menuManager.find(PERMADELLER_MENU_ID) == null) {
				MenuManager menu2 = new MenuManager("Permadeller", PERMADELLER_MENU_ID);
				menu2.setRemoveAllWhenShown(true);
				Supplier<ISelection> selectionProvicer = () -> {
					ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getService(ISelectionService.class);
					if (selectionService != null) {
						return selectionService.getSelection();
					}
					return null;
				};
				menu2.addMenuListener(new MenuFiller(selectionProvicer));
				menuManager.add(menu2);
			}
		}

	}

}
