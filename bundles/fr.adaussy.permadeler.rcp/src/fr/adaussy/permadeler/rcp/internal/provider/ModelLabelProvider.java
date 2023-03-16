/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.provider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.swt.graphics.Image;

public class ModelLabelProvider implements ILabelProvider {

	SiriusCommonLabelProvider labelProvider = new SiriusCommonLabelProvider();

	@Override
	public Image getImage(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).getImage();
		}
		return labelProvider.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ISelfDescribingItem) {
			return ((ISelfDescribingItem)element).getLabel();
		}
		return labelProvider.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		labelProvider.addListener(listener);

	}

	@Override
	public void dispose() {
		labelProvider.dispose();

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return labelProvider.isLabelProperty(element, property);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		labelProvider.removeListener(listener);

	}

}
