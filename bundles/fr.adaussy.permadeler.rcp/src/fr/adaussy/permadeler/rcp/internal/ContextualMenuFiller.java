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

import fr.adaussy.permadeler.model.Permadeler.ActionType;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.Reference;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.rcp.internal.actions.DeleteObject;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.actions.ListAllPlantationAction;
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
				default:
					break;
			}
		}
	}
	// CHECKSTYLE:ON Switch pattern

	/**
	 * Provides the actions for {@link Plantation}s
	 * 
	 * @param selections
	 *            some {@link Plantation}s
	 */
	private void casePlantation(List<Plantation> selections) {

		if (selections.size() == 1) {
			Plantation plantation = selections.get(0);
			Plant type = plantation.getType();
			if (type != null) {
				navigateAction.add(new FocusOnElementAction("To variety", Collections.singletonList(type),
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
			if (cell.getPlant() != null) {
				navigateAction.add(new FocusOnElementAction("To variety",
						Collections.singletonList(cell.getPlant()), KnowledgeViewerPart.ID));
			}
		}

	}

	private void caseZone(List<Zone> zones) {
		if (zones.size() == 1) {
			Zone zone = zones.get(0);
			others.add(new ListAllPlantationAction(session, zone));
		}
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

	private void casePlant(List<Plant> varieties) {

		if (varieties.size() == 1) {
			Plant variety = varieties.get(0);
			for (Image img : variety.getImages()) {
				others.add(new OpenImageAction(img));
			}
			for (Reference ref : variety.getReferences()) {
				others.add(new OpenReference(ref));
			}

			List<SeedItem> seedItems = getNonEmptySeedItem(variety);
			if (!seedItems.isEmpty()) {
				others.add(new SowSpeciesAction(session, variety));
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
		List<Plant> types = selections.stream().map(o -> o.getType()).collect(toList());
		navigateAction.add(new FocusOnElementAction("To variety", types, KnowledgeViewerPart.ID));

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

		Plant variety = seedItem.getType();

		for (var sowIndoor : variety.getActions().stream().filter(a -> a.getType() == ActionType.SOW_INDOOR)
				.collect(toList())) {
			newElementActions.add(PlanificationAction.builder().withText("Plan indoor sow")//
					.withDefaultChoise(sowIndoor.getPeriod())//
					.withSession(session)//
					.withSeedItem(seedItem).withType(SowType.INDOOR)//
					.build());
		}
		for (var sowIndoor : variety.getActions().stream().filter(a -> a.getType() == ActionType.SOW_OUTDOOR)
				.collect(toList())) {
			newElementActions.add(PlanificationAction.builder().withText("Plan outdoor sow")//
					.withDefaultChoise(sowIndoor.getPeriod())//
					.withSession(session)//
					.withSeedItem(seedItem).withType(SowType.OUTDOOR)//
					.build());
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
	private List<SeedItem> getNonEmptySeedItem(Plant plant) {
		return session.getSemanticCrossReferencer()
				.getInverseReferences(plant, PermadelerPackage.eINSTANCE.getSeedItem_Type(), false).stream()//
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
