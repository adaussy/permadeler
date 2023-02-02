package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import fr.adaussy.permadeler.model.Permadeler.Production;

public class ProductionItemProviderCustomImpl extends ProductionItemProvider {

	public ProductionItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custo/commons/production.png")); //$NON-NLS-1$
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
