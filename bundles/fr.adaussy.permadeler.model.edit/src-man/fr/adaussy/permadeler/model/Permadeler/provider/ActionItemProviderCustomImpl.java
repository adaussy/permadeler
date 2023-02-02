package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.edit.TextHelper;

public class ActionItemProviderCustomImpl extends ActionItemProvider {

	public ActionItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		String iconPath = switch (((Action)object).getType()) {
			case SOW_INDOOR -> "custo/commons/calendar-sow.png"; //$NON-NLS-1$
			case SOW_OUTDOOR -> "custo/commons/calendar-sow.png"; //$NON-NLS-1$
			case MULTIPLICATION -> "custo/commons/multipication.png"; //$NON-NLS-1$
			case PRUNING -> "custo/commons/pruning.png"; //$NON-NLS-1$
			case HARVEST -> "custo/commons/harvest.png"; //$NON-NLS-1$
			default -> "custo/commons/action.png"; //$NON-NLS-1$
		};

		return overlayImage(object, getResourceLocator().getImage(iconPath));
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
