package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.edit.ImageProvider;

public class ProductionItemProviderCustomImpl extends ProductionItemProvider {

	public ProductionItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		Production production = (Production)object;
		String label = "<" + production.getType() + ">"; //$NON-NLS-1$//$NON-NLS-2$
		String name = production.getName();
		if (name != null && !name.isBlank()) {
			label += " " + name; //$NON-NLS-1$
		}
		return label;
	}
}
