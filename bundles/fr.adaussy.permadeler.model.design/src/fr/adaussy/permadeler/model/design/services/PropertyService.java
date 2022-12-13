package fr.adaussy.permadeler.model.design.services;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;

public class PropertyService {

	public List<Production> getProductions(EObject o) {
		if (o instanceof Production) {
			return Collections.singletonList((Production)o);

		} else if (o instanceof Plant) {
			return ((Plant)o).getProductions();
		} else if (o instanceof Plantation) {
			return ((Plantation)o).getType().getProductions();
		} else {
			return Collections.emptyList();
		}
	}

	public List<Action> getActions(EObject o) {
		if (o instanceof Action) {
			return Collections.singletonList((Action)o);

		} else if (o instanceof Plant) {
			return ((Plant)o).getActions();
		} else if (o instanceof Plantation) {
			return ((Plantation)o).getType().getActions();
		} else {
			return Collections.emptyList();
		}
	}

}
