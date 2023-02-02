package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class PlanifierItemProviderCustomImpl extends PlanifierItemProvider {

	public PlanifierItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("other/icons/calendar-sow.png")); //$NON-NLS-1$
	}

}
