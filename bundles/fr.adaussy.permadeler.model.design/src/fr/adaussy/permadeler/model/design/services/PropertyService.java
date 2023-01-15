package fr.adaussy.permadeler.model.design.services;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ReferencingElement;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

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
		} else if (o instanceof Plantation && ((Plantation)o).getType() != null) {
			return ((Plantation)o).getType().getActions();
		} else {
			return Collections.emptyList();
		}
	}

	public EObject addReference(ReferencingElement element) {
		InputDialog inputDialog = new InputDialog(DiagramService.getShell(), "Reference", //$NON-NLS-1$
				"Entrer une reference", //$NON-NLS-1$
				"", null); //$NON-NLS-1$
		if (inputDialog.open() == IDialogConstants.OK_ID) {
			element.getReferences().add(inputDialog.getValue());
		}
		return element;
	}

	public EObject removeReference(ReferencingElement element, List<String> toRemove) {
		element.getReferences().removeAll(toRemove);
		return element;
	}

	public void importFromOtherSpecies(Plant p) {

		ObjectSelectionDialog<Plant> selection = new ObjectSelectionDialog<Plant>(DiagramService.getShell(),
				Plant.class, e -> true, EMFUtils.getAncestor(KnowledgeBase.class, p));

		if (selection.open() == IDialogConstants.OK_ID) {
			List<Plant> plants = selection.getSelection();
			if (!plants.isEmpty()) {
				Plant imported = plants.get(0);

				for (var attr : PermadelerPackage.eINSTANCE.getPlant().getEAllAttributes()) {
					if (!attr.isDerived()) {
						p.eSet(attr, imported.eGet(attr));
					}
				}

				for (var action : imported.getActions()) {
					p.getActions().add(EcoreUtil.copy(action));
				}
				for (var production : imported.getProductions()) {
					p.getProductions().add(EcoreUtil.copy(production));
				}
			}
		}

	}

}
