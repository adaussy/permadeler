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
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import fr.adaussy.permadeler.model.Permadeler.SeedItem;

/**
 * {@link SeedItemItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class SeedItemItemProviderCustomImpl extends SeedItemItemProvider {

	public SeedItemItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		SeedItem item = (SeedItem)object;
		if (item.getType() != null) {
			IItemLabelProvider adapt = (IItemLabelProvider)getRootAdapterFactory().adapt(item.getType(),
					IItemLabelProvider.class);
			return adapt.getText(item.getType());
		}
		return super.getText(object);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("other/icons/072-seed.png")); //$NON-NLS-1$
	}

}
