/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.ExceptionHandler;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.AbstractTransactionalCommandStack;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.model.business.internal.query.DDiagramInternalQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Iterators;

import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.Permadeler.util.IDUtils;
import fr.adaussy.permadeler.model.design.PermadelerModelBundle;
import fr.adaussy.permadeler.model.design.utils.BackConfigurationDialog;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.PlantationDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.TrayDimensionCreationDialog;
import fr.adaussy.permadeler.rcp.internal.parts.PlantationsViewerPart;
import fr.adaussy.permadeler.rcp.services.FillService;
import fr.adaussy.permadeler.rcp.services.ModelQueryService;

/**
 * Service class that gather services used in diagrams
 * 
 * @author Arthur Daussy
 */
public class DiagramService {

	private static final String BACKGROUND_IMAGE_FOLDER = "background-image"; //$NON-NLS-1$

	public void activateTopLayerWireFrameMode(DSemanticDiagram diagram) {

		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagram).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagram, session);
			getAllDisplayedTree(gmfView).forEach(n -> {
				viewToPlantation(n).setWireframe(true);
				ViewUtil.repositionChildAt(gmfView, n, 0);
			});

		}

	}

	/**
	 * Selects a {@link Plantation} from available candidates and removing already displayed ones
	 * 
	 * @param phase
	 *            the current phase
	 * @param view
	 *            a view element
	 * @return a {@link Plantation}
	 */
	public Plantation selectPlantation(Zone currentZone, DSemanticDecorator view) {

		List<Zone> zones = EMFUtils.getAncestors(Zone.class, currentZone);
		Zone rootZone = zones.get(zones.size() - 1);

		Set<EObject> alreadyDisplayed = EMFUtils
				.allContainedObjectOfType(EMFUtils.getAncestor(DDiagram.class, view),
						DSemanticDecorator.class)//
				.map(DSemanticDecorator::getTarget).filter(e -> e instanceof Plantation)
				.collect(Collectors.toSet());

		List<Plantation> reachablePlants = getReachablePlantations(currentZone);

		ObjectSelectionDialog<Plantation> plantationDialog = new ObjectSelectionDialog<>(getShell(),
				Plantation.class, p -> reachablePlants.contains(p) && !alreadyDisplayed.contains(p),
				rootZone);

		if (plantationDialog.open() == IDialogConstants.OK_ID) {
			List<Plantation> selection = plantationDialog.getSelection();
			if (!selection.isEmpty()) {
				return selection.get(0);
			}
		}
		return null;
	}

	/**
	 * Gets all plantations available from this zone
	 * 
	 * @param zone
	 *            a zone
	 * @return a list of plantation
	 */
	public List<Plantation> getReachablePlantations(Zone zone) {

		List<Plantation> plantations = zone.getPlantations().stream().collect(toList());

		EObject parent = zone.eContainer();
		if (parent instanceof Zone parentZone) {
			plantations.addAll(getReachablePlantations(parentZone));
		}

		return plantations;

	}

	public String getDefaultPlanName(Zone zone) {
		return "Carte Implantation " + zone.getName();
	}

	public static Plantation dupplicate(Plantation plantation, DDiagramElement targetView,
			DSemanticDiagram diagram) {
		// Duplication plantation

		Plantation newPlantation = EcoreUtil.copy(plantation);

		((Zone)plantation.eContainer()).getPlantations().add(newPlantation);

		// Change id
		newPlantation.setId(IDUtils.generateId(newPlantation));

		return newPlantation;
	}

	/**
	 * Move graphical a newly created no so it does not appear on he given existing node
	 * @param existing
	 * @param node
	 * @return
	 */
	public DNode moveNode(DNode existing, DNode node) {
		setGraphicalHintsFromExistingNode(existing, node);
		return node;
	}

	private static void setGraphicalHintsFromExistingNode(DDiagramElement existingNode,
			DDiagramElement newNode) {
		// Give hints about location and size
		IGraphicalEditPart editPart = getEditPart(existingNode);
		if (editPart instanceof ShapeEditPart) {
			ShapeEditPart part = (ShapeEditPart)editPart;
			Point location = part.getLocation();
			Dimension size = part.getSize();
			SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(newNode.eContainer(),
					new Point(location.x + size.width, location.y + size.height), part.getSize()));
		}
	}

	private static IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagramElement).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);

			IGraphicalEditPart result = null;
			if (gmfView != null && editor instanceof DiagramEditor) {
				final Map<?, ?> editPartRegistry = ((DiagramEditor)editor).getDiagramGraphicalViewer()
						.getEditPartRegistry();
				final Object editPart = editPartRegistry.get(gmfView);
				if (editPart instanceof IGraphicalEditPart) {
					result = (IGraphicalEditPart)editPart;
					return result;
				}
			}
		}
		return null;
	}

	/**
	 * Refreshes given {@link DRepresentation} in the given {@link TransactionalEditingDomain}.
	 * 
	 * @param transactionalEditingDomain
	 *            the {@link TransactionalEditingDomain}
	 * @param representations
	 *            the {@link List} of {@link DRepresentation} to refresh
	 */
	public static void refreshRepresentations(final TransactionalEditingDomain transactionalEditingDomain,
			final List<DRepresentation> representations) {
		// TODO prevent the editors from getting dirty
		if (representations.size() != 0) {
			final RefreshRepresentationsCommand refresh = new RefreshRepresentationsCommand(
					transactionalEditingDomain, new NullProgressMonitor(), representations);

			CommandStack commandStack = transactionalEditingDomain.getCommandStack();

			// If the command stack is transactionnal, we add a one-shot exception handler.
			if (commandStack instanceof AbstractTransactionalCommandStack) {
				AbstractTransactionalCommandStack transactionnalCommandStack = (AbstractTransactionalCommandStack)commandStack;
				transactionnalCommandStack.setExceptionHandler(new ExceptionHandler() {

					@Override
					public void handleException(Exception e) {
						// TODO Auto-generated method stub

						String repString = representations.stream().map(r -> r.getName())
								.collect(Collectors.joining(", "));

						PermadelerModelBundle.getDefault().getLog()
								.log(new Status(IStatus.WARNING, PermadelerModelBundle.PLUGIN_ID,
										"Failed to refresh Sirius representation(s)[" + repString
												+ "], we hope to be able to do it later",
										e));

						// Self-remove from the command stack.
						transactionnalCommandStack.setExceptionHandler(null);

					}
				});
			}

			commandStack.execute(refresh);

		}
	}

	/**
	 * Select a plantation in the plantation view
	 * 
	 * @param plantation
	 *            a plantation
	 */
	public void showInPlantationView(Plantation plantation) {
		new FocusOnElementAction("", Collections.singletonList(plantation), PlantationsViewerPart.ID).run();
	}

	private Stream<Node> getAllDisplayedTree(View gmfView) {
		return ((List<?>)gmfView.getDiagram().getChildren()).stream()//
				.filter(e -> e instanceof Node)//
				.map(n -> (Node)n)//
				.filter(n -> {
					Plantation plantation = viewToPlantation(n);
					return plantation != null
							&& plantation.getRepresentationKind() == RepresentationKind.TREE_CROWN;
				})//
				.sorted(Comparator.comparingInt(n -> getZOrder(n)));
	}

	private int getZOrder(Node n) {
		Plantation viewToPlantation = viewToPlantation(n);
		if (viewToPlantation == null) {
			return 0;
		}
		return viewToPlantation.getCurrentLayer().ordinal();
	}

	private Plantation viewToPlantation(Node n) {
		EObject element = n.getElement();
		if (element instanceof DNode) {
			EObject semanticTarget = ((DNode)element).getTarget();
			if (semanticTarget instanceof Plantation) {
				return (Plantation)semanticTarget;
			}
		}

		return null;
	}

	public void deActivateTopLayerWireFrameMode(DSemanticDiagram diagram) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagram).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagram, session);
			((List<?>)gmfView.getDiagram().getChildren()).stream()//
					.filter(e -> e instanceof Node)//
					.map(n -> (Node)n)//
					.filter(n -> {
						Plantation plantation = viewToPlantation(n);
						if (plantation == null) {
							return false;
						}
						Layer layer = plantation.getCurrentLayer();
						return layer != Layer.CANOPY && layer != Layer.UNDERSTORY;
					})//
					.sorted(Comparator.comparingInt(n -> -getZOrder(n))).forEach(n -> {
						ViewUtil.repositionChildAt(gmfView, n, 0);
					});

			getAllDisplayedTree(gmfView).forEach(n -> {
				viewToPlantation(n).setWireframe(false);
			});

		}

	}

	public String getSVGPath(final EObject p) {
		return ImageProvider.INSTANCE.getRepresentation(p);
	}

	public int getLabelSize(Plantation p) {
		if (p.getRepresentationKind() == RepresentationKind.ICON) {
			return 6;
		} else {
			return switch (p.getCurrentLayer()) {
				case CANOPY -> 10;
				case UNDERSTORY -> 8;
				case SHRUB -> 6;
				case VINE -> 4;
				case HERB -> 4;
				case GROUND_COVER -> 4;
				case ROOT -> 4;
				default -> 4;
			};
		}

	}

	public LabelPosition getLabelPosition(Plantation p) {
		if (p.getRepresentationKind() == RepresentationKind.TREE_CROWN) {
			return LabelPosition.NODE_LITERAL;
		} else {
			return LabelPosition.BORDER_LITERAL;
		}
	}

	/**
	 * Service used to calibrate the background image of a Planting representation
	 * 
	 * @param planting
	 *            a planting
	 * @param diagram
	 *            a Diagram
	 */
	public static void calibrateBackgroundImage(final Zone zone, DDiagram diagram) {
		IGraphicalEditPart editPart = getEditPath(diagram);
		BackgroundImage backgroundImage = zone.getBackgroundImage();
		if (editPart != null && backgroundImage != null) {
			BackConfigurationDialog dialog = new BackConfigurationDialog(getShell(), backgroundImage,
					editPart);
			dialog.open();
		}
	}

	/**
	 * Service used to define the background image of a planting representation
	 * 
	 * @param planting
	 *            a planting
	 * @param diagram
	 *            a Diagram
	 * @throws IOException
	 */
	public static void defineBackGroundImage(final Zone planting, DDiagram diagram) throws IOException {

		FileDialog fileDialog = new FileDialog(getShell());
		fileDialog.setFilterExtensions(new String[] {"*.svg;*.jpg;*.png" }); //$NON-NLS-1$
		String targetFileString = fileDialog.open();

		if (targetFileString != null) {
			Path targetFilePath = Path.of(targetFileString);
			if (targetFilePath.toFile().exists()) {
				// Copy
				Path imageFolder = FillService.getSessionImageFolder(Session.of(planting).get());
				Path bgImgFolder = imageFolder.resolve(BACKGROUND_IMAGE_FOLDER);
				if (!bgImgFolder.toFile().exists()) {
					bgImgFolder.toFile().mkdirs();
				}
				String fileExtension = com.google.common.io.Files.getFileExtension(targetFileString);
				String name = MessageFormat.format("{0}_{1}." + fileExtension, planting.getName(), //$NON-NLS-1$
						System.currentTimeMillis());
				Path targetLocation = bgImgFolder.resolve(name);
				Files.copy(targetFilePath, targetLocation);

				Path rootFolder = FillService.toPath(planting.eResource().getURI()).getParent();
				Path relPath = rootFolder.relativize(targetLocation);

				BackgroundImage bgImage = PermadelerFactory.eINSTANCE.createBackgroundImage();
				bgImage.setRelativePath(relPath.toString());
				bgImage.setScaling(1);
				planting.setBackgroundImage(bgImage);
				IGraphicalEditPart editPath = getEditPath(diagram);
				if (editPath != null) {
					editPath.refresh();
				}
			}
		}
	}

	public static IGraphicalEditPart getEditPath(DDiagram diagram) {
		IWorkbenchPage page = org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil.getActivePage();
		IEditorPart activeEditor = page.getActiveEditor();
		if (activeEditor instanceof DiagramEditor) {
			DiagramEditor dialectEditor = (DiagramEditor)activeEditor;
			Diagram gmfDiagram = SiriusGMFHelper.getGmfDiagram(diagram);
			final EditPartViewer graphicalViewer = dialectEditor.getDiagramGraphicalViewer();
			Map editPartRegistry = graphicalViewer.getEditPartRegistry();
			if (editPartRegistry != null) {

				Object editPart = editPartRegistry.get(gmfDiagram);
				if (editPart instanceof IGraphicalEditPart) {
					return (IGraphicalEditPart)editPart;
				}
			}
		}

		return null;
	}

	public static String getBackgroundSVGPath(final BackgroundImage image) {
		if (image != null) {
			String path = image.getRelativePath();
			Path semanticFilePath = FillService.toPath(image.eResource().getURI()).getParent();
			Path imgPath = semanticFilePath.resolve(path);
			if (imgPath.toFile().exists()) {
				return imgPath.toString();
			}
		}

		return null;
	}

	/**
	 * For compatibility reasons we need to keep this method to compute the default size for a plantation
	 * depending on their layer
	 * 
	 * @param plantation
	 *            a plantation
	 * @return a size
	 */
	public static int getSVGSize(Plantation plantation) {
		return getSVGSize(plantation.getCurrentLayer());
	}

	/**
	 * Gets the default SVG size of an image representing a given layer
	 * 
	 * @param phase
	 *            a plantation
	 * @return a size
	 */
	public static int getSVGSize(Layer currentLayer) {
		return switch (currentLayer) {
			case CANOPY -> 9;
			case UNDERSTORY -> 7;
			case SHRUB -> 5;
			case VINE -> 3;
			case HERB -> 3;
			case GROUND_COVER -> 3;
			case ROOT -> 3;
			default -> 3;
		};
	}

	/**
	 * Gets a list of cells that need to be connected to a given species.
	 * <p>
	 * The current implementation add a link to the first and the last cell of the type by {@link Tray}
	 * </p>
	 * 
	 * @param s
	 *            a species
	 * @param diagram
	 *            the diagram
	 * @return a list of cell
	 */
	public static List<Cell> getOneCellOfTypeByTray(Plant s, DSemanticDiagram diagram) {
		List<Cell> allCells = ModelQueryService.getLinkedCells(s);

		// Select only one cell for each try
		Set<Cell> displayedCell = getDisplayedCell(diagram);
		Map<Tray, List<Cell>> trayMap = new HashMap<>();
		for (Cell c : allCells) {
			if (displayedCell.contains(c)) {
				Tray tray = (Tray)c.eContainer().eContainer();
				List<Cell> linkedCells = trayMap.computeIfAbsent(tray, t -> {
					List<Cell> result = new ArrayList<>();
					return result;
				});
				linkedCells.add(c);
			}
		}
		List<Cell> result = new ArrayList<>();

		for (List<Cell> cellInTray : trayMap.values()) {
			result.add(cellInTray.get(0));
			if (cellInTray.size() > 1) {
				result.add(cellInTray.get(cellInTray.size() - 1));
			}
		}

		return result;
	}

	/**
	 * Gets all the {@link Cell} displayed in the given diagram
	 * 
	 * @param diagram
	 *            a diagram
	 * @return a set if {@link Cell}
	 */
	private static Set<Cell> getDisplayedCell(DSemanticDiagram diagram) {
		Set<Cell> result = new HashSet<>();
		Iterator<DDiagramElement> it = Iterators
				.filter(new DDiagramInternalQuery(diagram).getContainers().iterator(), DDiagramElement.class);
		while (it.hasNext()) {
			DDiagramElement dec = it.next();
			if (dec.getTarget() instanceof Cell && dec.isVisible()) {
				result.add((Cell)dec.getTarget());
			}
		}
		return result;
	}

	public static int getTraySVGSize(final Tray tray) {
		return Math.max(tray.getRows().stream().mapToInt(r -> r.getCells().size()).max().orElse(0),
				tray.getRows().size());

	}

	public static int getRowTraySVGSize(final Row row) {
		return row.getCells().size();

	}

	/**
	 * Creates a new plantation in an Area. This opens a dialog to select a species and it also set the
	 * plantation date to now
	 * 
	 * @param container
	 *            the container area
	 * @return a new plantation or <code>null</code> if the user has canceled
	 */
	public static Plantation createPlantation(final Zone container) {
		return createPlantation(container, null, true);
	}

	public static Plantation createPlantation(final Plantation plantation, Plant initialSelection) {
		return createPlantation((Zone)plantation.eContainer(), initialSelection, false);
	}

	public static Plantation createPlantation(final Zone container, Plant initialSelection,
			boolean useDialog) {
		if (useDialog || initialSelection == null) {
			Shell shell = getShell();
			PlantationDialog dialog = new PlantationDialog(shell, null,
					container.eResource().getContents().get(0));
			if (initialSelection != null) {
				dialog.setInitialSelection(List.of(initialSelection));
			}
			if (dialog.open() == Dialog.OK) {
				final List<Plant> selection = dialog.getSelection();
				if (selection.size() == 1) {
					Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
					Date date = dialog.getDate();
					if (date != null) {
						plantation.setPlantationDate(date.toInstant());
					}
					plantation.setCurrentLayer(dialog.getLayer());
					plantation.setRepresentationKind(dialog.getRepresentationKind());
					container.getPlantations().add(plantation);
					Plant value = selection.get(0);
					plantation.setType(value);
					plantation.setId(IDUtils.generateId(plantation));
					return plantation;
				}
			}
		} else {
			Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
			plantation.setCurrentLayer(initialSelection.getDefaultLayer());
			plantation.setRepresentationKind(initialSelection.getDefaultRepresentationKind());
			container.getPlantations().add(plantation);
			plantation.setType(initialSelection);
			plantation.setId(IDUtils.generateId(plantation));
			return plantation;
		}
		return null;
	}

	public Variety createDefaultVariety(Zone phase) {
		KnowledgeBase knowledgeBase = EMFUtils.getAncestor(Root.class, phase).getKnowledgeBase();
		ObjectSelectionDialog<Species> dialog = new ObjectSelectionDialog<>(getShell(), Species.class,
				s -> true, knowledgeBase);
		if (dialog.open() == IDialogConstants.OK_ID) {
			List<Species> species = dialog.getSelection();
			if (species.size() == 1) {
				Variety variety = PermadelerFactory.eINSTANCE.createVariety();
				species.get(0).getVarieties().add(variety);
				return variety;
			}
		}
		return null;
	}

	public Plant createDefaultSpecies(EObject self) {
		Species species = PermadelerFactory.eINSTANCE.createSpecies();
		EMFUtils.getAncestor(Root.class, self).getKnowledgeBase().getSpecies().add(species);
		return species;
	}

	/**
	 * Creates a new plantation from a cell
	 * 
	 * @param container
	 *            the target container
	 * @param cell
	 *            the input cell
	 * @return a new plantation
	 */
	public static Plantation createPlantationFromSow(final Zone container, final Cell cell) {
		if (cell.getPlant() == null) {
			PermadelerModelBundle.getDefault().logInfo("Can't create a new plantation from empty cell"); //$NON-NLS-1$
			return null;
		}
		Event event = PermadelerFactory.eINSTANCE.createEvent();
		event.setDate(new Date().toInstant());

		Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
		plantation.setPlantationDate(Instant.now());
		container.getPlantations().add(plantation);
		plantation.setType(cell.getPlant());

		cell.setDate(null);
		cell.setPlant(null);
		return plantation;

	}

	/**
	 * Creates a plantation from a {@link SowPlanfication}
	 * 
	 * @param container
	 *            the target container
	 * @param planification
	 *            the planification
	 * @return a new Plantation
	 */
	public static Plantation createPlantationFromPlanification(final Zone container,
			final SowPlanfication planification) {
		Event event = PermadelerFactory.eINSTANCE.createEvent();
		event.setDate(new Date().toInstant());

		Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
		plantation.setPlantationDate(Instant.now());
		container.getPlantations().add(plantation);
		plantation.setType(planification.getSeed().getType());

		return plantation;

	}

	public static String getPlantationLabel(Plantation p) {
		String id = p.getId();
		if (id != null && !id.isBlank()) {
			return id;
		}
		Plant type = p.getType();
		return type != null ? type.getName() + "  " /* Sirius Bug when using non default font */ : ""; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Creates fill an existing tray by asking the user its size
	 * 
	 * @param tray
	 *            an exiting {@link Tray}
	 * @return the input tray for convenience
	 */
	public static Tray createTray(Tray tray) {
		TrayDimensionCreationDialog dialog = new TrayDimensionCreationDialog(getShell(), 4, 4);
		if (dialog.open() == Dialog.OK) {
			for (int row = 0; row < dialog.getNbOfRows(); row++) {
				Row rowItem = PermadelerFactory.eINSTANCE.createRow();
				tray.getRows().add(rowItem);
				for (int cell = 0; cell < dialog.getNbOfCells(); cell++) {
					Cell cellItem = PermadelerFactory.eINSTANCE.createCell();
					rowItem.getCells().add(cellItem);
				}
			}
		}

		return tray;
	}

	/**
	 * Gets the current active shell
	 * 
	 * @return a {@link Shell}
	 */
	public static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

	public static void emptyCells(EObject o) {
		for (Cell c : EMFUtils.getChildren(o, Cell.class).collect(toList())) {
			clearCell(c);
		}
	}

	private static void clearCell(Cell c) {
		c.setDate(null);
		c.setPlant(null);
	}

}
