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
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;

/**
 * {@link PlantationItemProvider} Custom impl
 * 
 * @author Arthur Daussy
 */
public class PlantationItemProviderCustomImpl extends PlantationItemProvider {

	public PlantationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		Species type = ((Plantation)object).getType();
		if (type != null) {
			return TextHelper.getLabel(type);
		}
		return "Plantation with no species";
	}
}
