/**
 Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 *
 */
package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import fr.adaussy.permadeler.model.Permadeler.Row;

/**
 * {@link RowItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class RowItemProviderCustomImpl extends RowItemProvider {

	public RowItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Row row = (Row)object;
		long notEmpty = row.getCells().stream().filter(c -> c.getPlant() != null).count();
		return "[" + notEmpty + "/" + row.getCells().size() + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("other/icons/row.png")); //$NON-NLS-1$
	}

}
