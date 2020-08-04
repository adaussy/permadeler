/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.timeview;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * {@link ILabelProvider} used to provide short label for the items
 * 
 * @author Arthur Daussy
 */
public class ShortLabelProvider implements ILabelProvider {

	private static final String ETC = "...";

	private final ILabelProvider delegate;

	private final int max;

	public ShortLabelProvider(ILabelProvider delegate, int max) {
		super();
		this.delegate = delegate;
		this.max = max;
	}

	@Override
	public Image getImage(Object element) {
		return delegate.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return getShortLabel(delegate.getText(element));
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		delegate.addListener(listener);
	}

	@Override
	public void dispose() {
		delegate.dispose();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return delegate.isLabelProperty(element, property);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		delegate.removeListener(listener);
	}

	/**
	 * Shorten the given label
	 * 
	 * @param name
	 *            the input name
	 * @return a short name
	 */
	private String getShortLabel(String name) {
		if (name == null) {
			return "";
		}
		if ((name.length() + ETC.length()) >= max) {
			return name.substring(0, max - ETC.length()) + ETC;
		} else {
			return name;
		}
	}

}
