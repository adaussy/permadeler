/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.E4PartWrapper;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * Adapter that allows {@link E4PartWrapper} to be adapted so they can provide IPropertySheetPage
 * 
 * @author Arthur Daussy
 */
public class E4PropertySheetPageAdapter implements IAdapterFactory {

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		EModelService service = PlatformUI.getWorkbench().getService(EModelService.class);
		MApplication application = PlatformUI.getWorkbench().getService(MApplication.class);
		
		if (adaptableObject instanceof IWorkbenchPart) {
			IWorkbenchPart partWrapper = (IWorkbenchPart)adaptableObject;
			String id = partWrapper.getSite().getId();
			MUIElement find = service.find(id, application);
			if (find instanceof MPart) {
				MPart part = (MPart)find;
				Object obj = part.getObject();
				if (obj instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable)obj;
					return adaptable.getAdapter(adapterType);
				}
			}

		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class<?>[] {IPropertySheetPage.class };
	}

}
