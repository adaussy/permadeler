/**
 Copyright (c) 2023 Arthur Daussy.
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

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.edit.ImageProvider;

public class VarietyItemProviderCustomImpl extends VarietyItemProvider {

	public VarietyItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		Variety variety = (Variety)object;
		String path = variety.getIconKey();
		String iconPath = "custo/commons/plant.png";//$NON-NLS-1$
		if (path != null) {
			iconPath = ImageProvider.INSTANCE.getIcons().get(path);
			if (iconPath.startsWith("/icons/")) { //$NON-NLS-1$
				iconPath = iconPath.substring(7);
			}
		} else if (variety.getSpecies() != null) {
			Species species = variety.getSpecies();
			IItemLabelProvider adapt = (IItemLabelProvider)getRootAdapterFactory().adapt(species,
					IItemLabelProvider.class);
			return adapt.getImage(species);
		}
		return overlayImage(object, getResourceLocator().getImage(iconPath));
	}

	@Override
	public String getText(Object object) {
		Plant plant = (Plant)object;
		String name = plant.getName() != null ? plant.getName() : ""; //$NON-NLS-1$
		String baseLatinName = plant.getFullLatinName();
		String latinName = baseLatinName != null ? ("<" + baseLatinName + ">") : ""; //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		return name + " " + latinName; //$NON-NLS-1$
	}

}
