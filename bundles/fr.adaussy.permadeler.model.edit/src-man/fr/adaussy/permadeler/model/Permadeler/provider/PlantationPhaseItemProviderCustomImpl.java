package fr.adaussy.permadeler.model.Permadeler.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;

public class PlantationPhaseItemProviderCustomImpl extends PlantationPhaseItemProvider {

	public PlantationPhaseItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custo/commons/growth.png")); //$NON-NLS-1$
	}

	@Override
	public String getText(Object object) {
		return ((PlantationPhase)object).getName();
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		Collection<? extends EStructuralFeature> result = super.getChildrenFeatures(object);
		result.remove(PermadelerPackage.Literals.PLANTATION_PHASE__BACKGROUND_IMAGE);
		return result;
	}

}
