package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import fr.adaussy.permadeler.model.Permadeler.PlantGroup;

public class PlantGroupItemProviderCustomImpl extends PlantGroupItemProvider {

	public PlantGroupItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custo/commons/folder.png")); //$NON-NLS-1$
	}

	@Override
	public String getText(Object object) {
		return ((PlantGroup)object).getName();
	}

}
