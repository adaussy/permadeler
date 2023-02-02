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

/**
 * {@link SeedBankItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class SeedBankItemProviderCustomImpl extends SeedBankItemProvider {

	public SeedBankItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return "Seed bank"; //$NON-NLS-1$
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("other/icons/083-seed-1.png")); //$NON-NLS-1$
	}
}
