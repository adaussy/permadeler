/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.Reference;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.actions.DeleteObject;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.actions.MoveAction;
import fr.adaussy.permadeler.rcp.internal.actions.OpenImageAction;
import fr.adaussy.permadeler.rcp.internal.actions.OpenReference;
import fr.adaussy.permadeler.rcp.internal.actions.PlanificationAction;
import fr.adaussy.permadeler.rcp.internal.actions.SowCellAction;
import fr.adaussy.permadeler.rcp.internal.actions.SowSpeciesAction;
import fr.adaussy.permadeler.rcp.internal.actions.TimeViewAction;
import fr.adaussy.permadeler.rcp.internal.parts.KnowledgeViewerPart;
import fr.adaussy.permadeler.rcp.internal.timeview.InputFactory;

/**
 * Object that fill the contextual menu dependingon a selection
 * 
 * @author Arthur Daussy
 */
public class ContextualMenuFiller {

	private List<IAction> newElementActions = new ArrayList<IAction>();

	private List<IAction> navigateAction = new ArrayList<IAction>();

	private List<IAction> timeViewActions = new ArrayList<IAction>();

	private List<IAction> others = new ArrayList<IAction>();

	private IAction defaultAction;

	private final Session session;

	public ContextualMenuFiller(Session session) {
		this.session = session;
	}

	/**
	 * Fills the action depending on the selection and the selected {@link EClass}
	 * 
	 * @param eClass
	 *            the context {@link EClass}
	 * @param selections
	 *            the current selection
	 */
	@SuppressWarnings("unchecked")
	// CHECKSTYLE:OFF Switch pattern
	public void fill(EClass eClass, List<? extends EObject> selections) {
		if (eClass == null || selections == null || selections.isEmpty()) {
			return;
		}

		if (eClass == EcorePackage.eINSTANCE.getEObject()) {
			caseEObject((List<EObject>)selections);
		} else {

			switch (eClass.getClassifierID()) {
				case PermadelerPackage.PLANT:
					casePlant((List<Plant>)selections);
					break;
				case PermadelerPackage.SPECIES:
					caseSpecies((List<Species>)selections);
					break;
				case PermadelerPackage.SEED_ITEM:
					caseSeedItem((List<SeedItem>)selections);
					break;
				case PermadelerPackage.IMAGE:
					caseImage((List<Image>)selections);
					break;
				case PermadelerPackage.CELL:
					caseCell((List<Cell>)selections);
					break;
				case PermadelerPackage.TRAY:
					caseTray((List<Tray>)selections);
					break;
				case PermadelerPackage.ZONE:
					caseZone((List<Zone>)selections);
					break;
				case PermadelerPackage.PLANTATION:
					casePlantation((List<Plantation>)selections);
					break;
				case PermadelerPackage.PLANIFIER:
					casePlanifier((List<Planifier>)selections);
					break;
				default:
					break;
			}
		}
	}
	// CHECKSTYLE:ON Switch pattern

	private void casePlanifier(List<Planifier> selections) {
		if (selections.size() == 1) {
			Planifier planifier = selections.get(0);
			timeViewActions.add(buidSowTimeViewAction(planifier));
		}
	}

	/**
	 * Provides the actions for {@link Plant}s
	 * 
	 * @param selections
	 *            some {@link Plant}s
	 */
	private void casePlant(List<Plant> selections) {
		if (selections.size() == 1) {
			Plant plant = selections.get(0);
			List<SeedItem> seeds = session.getSemanticCrossReferencer()
					.getInverseReferences(plant, PermadelerPackage.eINSTANCE.getSeedItem_Type(), true)
					.stream()//
					.map(s -> (SeedItem)s.getEObject())//
					.filter(s -> s.getType() instanceof Plant)//
					.filter(s -> s.getQuantity() != Quantity.EMPTY)//
					.collect(toList());
			for (SeedItem s : seeds) {
				addPlanificationActions(Collections.singletonList(s));
			}
		}

	}

	/**
	 * Provides the actions for {@link Plantation}s
	 * 
	 * @param selections
	 *            some {@link Plantation}s
	 */
	private void casePlantation(List<Plantation> selections) {

		if (selections.size() == 1) {
			Plantation plantation = selections.get(0);
			Species type = plantation.getType();
			if (type != null) {
				navigateAction.add(new FocusOnElementAction("To Species", Collections.singletonList(type),
						KnowledgeViewerPart.ID));
			}
		}

	}

	public IAction getDefaultAction() {
		return defaultAction;
	}

	private void caseTray(List<Tray> selections) {

	}

	/**
	 * Provides the actions for {@link Cell}s
	 * 
	 * @param selections
	 *            some {@link Cell}s
	 */
	private void caseCell(List<Cell> selections) {
		others.add(new SowCellAction(selections, session));
		if (selections.size() == 1) {
			Cell cell = selections.get(0);
			if (cell.getSpecies() != null) {
				navigateAction.add(new FocusOnElementAction("To Species",
						Collections.singletonList(cell.getSpecies()), KnowledgeViewerPart.ID));
			}
		}

	}

	private void caseZone(List<Zone> zones) {

	}

	/**
	 * Provides the actions for {@link EObject}s
	 * 
	 * @param selections
	 *            some {@link EObject}s
	 */
	private void caseEObject(List<EObject> selections) {
		others.add(new DeleteObject(selections, session));
		if (selections.size() == 1) {
			TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
			EObject target = selections.get(0);
			Collection<?> childDescriptor = session.getTransactionalEditingDomain()
					.getNewChildDescriptors(target, null);
			for (Object descriptor : childDescriptor) {
				newElementActions.add(
						new CreateChildAction(editingDomain, new StructuredSelection(target), descriptor));
			}
		}

	}

	/**
	 * Builds an action to display Sow time on the selection
	 * 
	 * @param object
	 *            an {@link EObject}
	 * @return a {@link TimeViewAction}
	 */
	protected TimeViewAction buidSowTimeViewAction(EObject object) {
		return TimeViewAction.builder()//
				.withApplication(getApplication())//
				.withModelService(getModelService())//
				.withPartService(getPartService())//
				.withQuery(InputFactory.SOW_PERIOD)//
				.withTarget(object)//
				.withLabel("Sow times")//
				.build();
	}

	/**
	 * Provides the actions for {@link Species}s
	 * 
	 * @param selections
	 *            some {@link Species}s
	 */
	private void caseSpecies(List<Species> selections) {
		if (selections.size() == 1) {
			Species species = selections.get(0);
			others.add(MoveAction.builder(Genus.class)//
					.withRef(PermadelerPackage.eINSTANCE.getGenus_Species())//
					.withRoot(EMFUtils.getAncestor(KnowledgeBase.class, species))//
					.withSession(session)// )
					.withText("Move to other genus")//
					.withToMove(species)//
					.build());
			for (Image img : species.getImages()) {
				others.add(new OpenImageAction(img));
			}
			for (Reference ref : species.getReferences()) {
				others.add(new OpenReference(ref));
			}

			List<SeedItem> seedItems = getNonEmptySeedItem(species);
			if (!seedItems.isEmpty()) {
				others.add(new SowSpeciesAction(session, species));
			}

		}
	}

	/**
	 * Provides the actions for {@link SeedItem}s
	 * 
	 * @param selections
	 *            some {@link SeedItem}s
	 */
	public void caseSeedItem(List<SeedItem> selections) {
		List<Species> types = selections.stream().map(o -> o.getType()).collect(toList());
		navigateAction.add(new FocusOnElementAction("To species", types, KnowledgeViewerPart.ID));

		if (selections.size() == 1) {
			addPlanificationActions(selections);
		}
	}

	/**
	 * Adds the planification actions
	 * 
	 * @param objects
	 *            the selected item
	 */
	private void addPlanificationActions(List<SeedItem> objects) {
		SeedItem seedItem = objects.get(0);

		Species species = seedItem.getType();
		if (species instanceof Plant) {
			Plant p = (Plant)species;
			if (!p.getSowIndoorMonths().isEmpty()) {
				newElementActions.add(PlanificationAction.builder().withText("Planifier Semi interier")//
						.withDefaultChoise(p.getSowIndoorMonths())//
						.withSession(session)//
						.withSeedItem(seedItem).withType(SowType.INDOOR)//
						.build());
			}
			if (!p.getSowOutdoorMonths().isEmpty()) {
				newElementActions.add(PlanificationAction.builder().withText("Planifier Semi exterieur")//
						.withDefaultChoise(p.getSowOutdoorMonths())//
						.withSession(session)//
						.withSeedItem(seedItem).withType(SowType.OUTDOOR)//
						.build());
			}
		}
	}

	private void caseImage(List<Image> objects) {
		if (objects.size() == 1) {
			OpenImageAction openAction = new OpenImageAction(objects.get(0));
			others.add(openAction);
			defaultAction = openAction;
		}
	}

	/**
	 * Gets all {@link SeedItem} referencing the given {@link Species} which are not empty
	 * 
	 * @param species
	 *            a species
	 * @return a list of {@link SeedItem}
	 */
	private List<SeedItem> getNonEmptySeedItem(Species species) {
		return session.getSemanticCrossReferencer()
				.getInverseReferences(species, PermadelerPackage.eINSTANCE.getSeedItem_Type(), false).stream()//
				.filter(s -> {
					EObject notifier = s.getEObject();
					if (notifier instanceof SeedItem) {
						SeedItem item = (SeedItem)notifier;
						return item.getQuantity() != Quantity.EMPTY;
					}
					return false;
				}).map(s -> (SeedItem)s.getEObject()).collect(toList());
	}

	private EModelService getModelService() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(EModelService.class);
	}

	private EPartService getPartService() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(EPartService.class);
	}

	private MApplication getApplication() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(MApplication.class);
	}

	public List<IAction> getNewElementActions() {
		return newElementActions;
	}

	public List<IAction> getNavigateAction() {
		return navigateAction;
	}

	public List<IAction> getTimeViewActions() {
		return timeViewActions;
	}

	public List<IAction> getOthers() {
		return others;
	}

}
