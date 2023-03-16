package fr.adaussy.permadeler.model.design.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Display;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ReferencingElement;
import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.design.utils.TagDialog;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

public class PropertyService {

	public List<Production> getProductionsToDisplay(EObject o) {
		if (o instanceof Production) {
			return Collections.singletonList((Production)o);

		} else if (o instanceof Plant) {
			return ((Plant)o).getAllProductions();
		} else if (o instanceof Plantation) {
			return getProductionsToDisplay(((Plantation)o).getType());
		} else {
			return Collections.emptyList();
		}
	}

	public List<Action> getActions(EObject o) {
		if (o instanceof Action) {
			return Collections.singletonList((Action)o);

		} else if (o instanceof Plant) {
			return ((Plant)o).getAllActions();
		} else if (o instanceof Plantation && ((Plantation)o).getType() != null) {
			return ((Plantation)o).getType().getAllActions();
		} else {
			return Collections.emptyList();
		}
	}

	private List<String> getAllExistingTags(EObject o) {
		return EMFUtils.allContainedObjectOfType(o.eResource(), TaggedElement.class)//
				.flatMap(t -> t.getTags().stream())//
				.distinct()//
				.toList();
	}

	public void addTags(TaggedElement element) {
		TagDialog inputDialog = new TagDialog(DiagramService.getShell(), getAllExistingTags(element));
		if (inputDialog.open() == IDialogConstants.OK_ID) {
			String value = inputDialog.getValue();
			if (value != null && !value.isBlank()) {
				Stream.of(value.split(";")).map(v -> v.trim()).filter(v -> !element.getTags().contains(v))
						.forEach(v -> {
							element.getTags().add(v);
						});
				ECollections.sort(element.getTags());
			}
		}
	}

	public void removeTags(TaggedElement element, List<String> selected) {
		element.getTags().removeAll(selected);
	}

	public Action createAction(EObject owner) {
		Action action = PermadelerFactory.eINSTANCE.createAction();
		if (owner instanceof Plant) {
			((Plant)owner).getActions().add(action);
			return action;
		} else if (owner instanceof Plantation) {
			Plant type = ((Plantation)owner).getType();
			if (type != null) {
				type.getActions().add(action);
				return action;
			}
		}
		return null;
	}

	public Production createProduction(EObject owner) {
		Production production = PermadelerFactory.eINSTANCE.createProduction();
		if (owner instanceof Plant) {
			((Plant)owner).getProductions().add(production);
			return production;
		} else if (owner instanceof Plantation) {
			Plant type = ((Plantation)owner).getType();
			if (type != null) {
				type.getProductions().add(production);
				return production;
			}
		}
		return null;
	}

	public Action getActionToEdit(Action action, Plantation p) {
		Plant type = p.getType();
		if (type != null) {
			return getActionToEdit(action, type);
		}
		return null;
	}

	public Action getActionToEdit(Action action, Plant p) {
		if (action.eContainer() == p) {
			// Edit
			return action;
		} else {
			// Copy and create
			Action copy = EcoreUtil.copy(action);
			p.getActions().add(copy);
			return copy;

		}
	}

	public Production getProductionToEdit(Production production, Plantation p) {
		Plant type = p.getType();
		if (type != null) {
			return getProductionToEdit(production, type);
		}
		return null;
	}

	public Production getProductionToEdit(Production production, Plant p) {
		if (production.eContainer() == p) {
			// Edit
			return production;
		} else {
			// Copy and create
			Production copy = EcoreUtil.copy(production);
			p.getProductions().add(copy);
			return copy;

		}
	}

	public void safeDeleteInheritedTemporal(EObject toDelete, EObject context) {
		if (toDelete.eContainer() != context) {
			if (!MessageDialog.openConfirm(Display.getDefault().getActiveShell(), "Suppression",
					"Voulez vous vraiment supprimer cet élément pour l'espece et toute ses variétés?")) {
				return;
			}
		}
		Session session = Session.of(toDelete).get();
		session.getModelAccessor().eDelete(toDelete, session.getSemanticCrossReferencer());
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
