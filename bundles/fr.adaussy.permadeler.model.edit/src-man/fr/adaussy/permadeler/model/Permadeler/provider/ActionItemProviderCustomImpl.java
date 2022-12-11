package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;

public class ActionItemProviderCustomImpl extends ActionItemProvider {

	public ActionItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		Action action = (Action)object;
		String label = "<" + TextHelper.getEditLabel(action.getType()) + ">"; //$NON-NLS-1$//$NON-NLS-2$
		String name = action.getName();
		if (name != null && !name.isBlank()) {
			label += " " + name; //$NON-NLS-1$
		}
		return label;
	}
}
