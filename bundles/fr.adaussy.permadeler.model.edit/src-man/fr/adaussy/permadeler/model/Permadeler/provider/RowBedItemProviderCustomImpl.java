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

import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.model.edit.ImageProvider;

/**
 * {@link RowBedItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class RowBedItemProviderCustomImpl extends RowBedItemProvider {

	public RowBedItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((RowBed)object).getName();
		return label == null || label.length() == 0 ? "" : label;
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((RowBed)object);
	}
}
