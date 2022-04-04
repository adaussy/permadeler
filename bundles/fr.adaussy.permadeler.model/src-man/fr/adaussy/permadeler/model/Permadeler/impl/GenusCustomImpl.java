package fr.adaussy.permadeler.model.Permadeler.impl;

import org.eclipse.emf.ecore.InternalEObject;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.utils.Color;
import fr.adaussy.permadeler.model.utils.Colors;

public class GenusCustomImpl extends GenusImpl {
	@Override
	public Color getEffectiveColor() {
		if (color != null) {
			return color;
		}
		InternalEObject parent = eContainer;
		if (parent instanceof Genus) {
			return ((Genus)parent).getEffectiveColor();
		}
		return Colors.DEFAULT_PANT_COLOR;
	}
}
