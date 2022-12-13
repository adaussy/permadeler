/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.time.Instant;
import java.util.ArrayList;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Iterators;

import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.design.PermadelerModelBundle;
import fr.adaussy.permadeler.model.design.utils.BackConfigurationDialog;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.dialogs.PlantationDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.TrayDimensionCreationDialog;
import fr.adaussy.permadeler.rcp.services.FillService;
import fr.adaussy.permadeler.rcp.services.ModelQueryService;

/**
 * Service class that gather services used in diagrams
 * 
 * @author Arthur Daussy
 */
public class DiagramService {

	private Comparator<Object> TOP_LAYER_FIRST = new Comparator<Object>() {

		@Override
		public int compare(Object o1, Object o2) {
			if (o1 instanceof Node && o2 instanceof Node) {
				Node n1 = (Node)o1;
				Node n2 = (Node)o2;
				EObject dn1 = n1.getElement();
				EObject dn2 = n2.getElement();
				if (dn2 instanceof DNode && dn2 instanceof DNode) {

					EObject t1 = ((DNode)dn1).getTarget();
					EObject t2 = ((DNode)dn2).getTarget();
					if (t1 instanceof Plantation && t2 instanceof Plantation) {
						Plantation p1 = (Plantation)t1;
						Plantation p2 = (Plantation)t2;
						return p1.getCurrentLayer().ordinal() - p2.getCurrentLayer().ordinal();
					}
				}

			}
			return 0;
		}
	};

	private static final String UNSERSCORE = "_"; //$NON-NLS-1$

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

	private Stream<Node> getAllDisplayedTree(View gmfView) {
		return ((List<?>)gmfView.getDiagram().getChildren()).stream()//
				.filter(e -> e instanceof Node)//
				.map(n -> (Node)n)//
				.filter(n -> {
					Plantation plantation = viewToPlantation(n);
					Layer layer = plantation.getCurrentLayer();
					return layer == Layer.CANOPY || layer == Layer.UNDERSTORY;
				})//
				.sorted(Comparator.comparingInt(n -> viewToPlantation(n).getCurrentLayer().ordinal()));
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
						Layer layer = plantation.getCurrentLayer();
						return layer != Layer.CANOPY && layer != Layer.UNDERSTORY;
					})//
					.sorted(Comparator.comparingInt(n -> -viewToPlantation(n).getCurrentLayer().ordinal()))
					.forEach(n -> {
						ViewUtil.repositionChildAt(gmfView, n, 0);
					});

			getAllDisplayedTree(gmfView).forEach(n -> {
				viewToPlantation(n).setWireframe(false);
			});

		}

	}

	public String getSVGPath(final EObject p) {
		return ImageProvider.INSTANCE.getSVG(p);
	}

	public int getLabelSize(Plantation p) {
		return switch (p.getCurrentLayer()) {
			case CANOPY -> 12;
			case UNDERSTORY -> 10;
			case SHRUB -> 6;
			case VINE -> 6;
			case HERB -> 6;
			case GROUND_COVER -> 6;
			case ROOT -> 6;
			default -> 6;
		};

	}

	public LabelPosition getLabelPosition(Plantation p) {
		switch (p.getCurrentLayer()) {
			case CANOPY:
			case UNDERSTORY:
				return LabelPosition.NODE_LITERAL;
			default:
				return LabelPosition.BORDER_LITERAL;
		}
	}

	public boolean showIcon(Plantation p) {
		return p.getType() != null //
				&& isLayerRequieringIcon(p.getCurrentLayer()) //
				&& p.getType().getRepresentationKey() != null //
				&& !p.getType().getRepresentationKey().isBlank();
	}

	private boolean isLayerRequieringIcon(Layer layer) {
		return switch (layer) {
			case CANOPY -> true;
			case UNDERSTORY -> true;
			case SHRUB -> true;
			default -> false;
		};
	}

	/**
	 * Service used to calibrate the background image of a Planting representation
	 * 
	 * @param planting
	 *            a planting
	 * @param diagram
	 *            a Diagram
	 */
	public static void calibrateBackgroundImage(final PlantationPhase planting, DDiagram diagram) {
		IGraphicalEditPart editPart = getEditPath(diagram);
		BackgroundImage backgroundImage = planting.getBackgroundImage();
		if (editPart != null && backgroundImage != null) {
			BackConfigurationDialog dialog = new BackConfigurationDialog(getShell(), backgroundImage,
					editPart);
			dialog.open();
		}
	}

	public List<Plantation> getTopLayerPlantation(PlantationPhase plantationPhase) {
		return plantationPhase.getPlantations().stream().filter(this::belongTopLayer).collect(toList());
	}

	public List<Plantation> getBottomLayerPlantation(PlantationPhase plantationPhase) {
		return plantationPhase.getPlantations().stream().filter(this::belongBottomLayer).collect(toList());
	}

	public List<Plantation> getMiddleLayerPlantation(PlantationPhase plantationPhase) {
		return plantationPhase.getPlantations().stream().filter(this::belongMiddleLayer).collect(toList());
	}

	private boolean belongTopLayer(Plantation p) {
		Layer layer = p.getCurrentLayer();
		return p.getType() != null && (layer == Layer.CANOPY || layer == Layer.UNDERSTORY);
	}

	private boolean belongMiddleLayer(Plantation p) {
		Layer layer = p.getCurrentLayer();
		return p.getType() != null && (layer == Layer.VINE || layer == Layer.SHRUB);
	}

	private boolean belongBottomLayer(Plantation p) {
		Layer layer = p.getCurrentLayer();
		return p.getType() != null
				&& (layer == Layer.HERB || layer == Layer.GROUND_COVER || layer == Layer.ROOT);
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
	public static void defineBackGroundImage(final PlantationPhase planting, DDiagram diagram)
			throws IOException {

		FileDialog fileDialog = new FileDialog(getShell());
		fileDialog.setFilterExtensions(new String[] {"*.svg" }); //$NON-NLS-1$
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
				String name = MessageFormat.format("{0}_{1}.svg", planting.getName(), //$NON-NLS-1$
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
	 * Gets SVG size of a plantation. The size depends of the nature of the plantation
	 * 
	 * @param plantation
	 *            a plantation
	 * @return a size
	 */
	public static int getSVGSize(final Plantation plantation) {
		return switch (plantation.getCurrentLayer()) {
			case CANOPY -> 10;
			case UNDERSTORY -> 8;
			case SHRUB -> 3;
			case HERB -> 2;
			case VINE -> 2;
			case GROUND_COVER -> 2;
			case ROOT -> 2;
			case OTHER -> 2;
			default -> 2;
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
	public static Plantation createPlantation(final PlantationPhase container) {
		Shell shell = getShell();
		PlantationDialog dialog = new PlantationDialog(shell, new Date(),
				container.eResource().getContents().get(0));
		if (dialog.open() == Dialog.OK) {
			final List<Plant> selection = dialog.getSelection();
			if (selection.size() == 1) {
				Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
				plantation.setPlantationDate(dialog.getDate().toInstant());
				plantation.setCurrentLayer(dialog.getLayer());
				container.getPlantations().add(plantation);
				Plant value = selection.get(0);
				plantation.setType(value);
				plantation.setId(generateId(plantation));
				return plantation;
			}
		}
		return createPlantation(container, null);
	}

	public Plant createDefaultPlant(EObject self) {
		Plant plant = PermadelerFactory.eINSTANCE.createPlant();
		EMFUtils.getAncestor(Root.class, self).getKnowledgeBase().getPlantTypes().add(plant);
		return plant;
	}

	public static Plantation createPlantation(final PlantationPhase container, Plant initialSelection) {
		Shell shell = getShell();
		PlantationDialog dialog = new PlantationDialog(shell, new Date(),
				container.eResource().getContents().get(0));
		if (initialSelection != null) {
			dialog.setInitialSelection(List.of(initialSelection));
		}
		if (dialog.open() == Dialog.OK) {
			final List<Plant> selection = dialog.getSelection();
			if (selection.size() == 1) {
				Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
				plantation.setPlantationDate(dialog.getDate().toInstant());
				plantation.setCurrentLayer(dialog.getLayer());
				container.getPlantations().add(plantation);
				Plant value = selection.get(0);
				plantation.setType(value);
				plantation.setId(generateId(plantation));
				return plantation;
			}
		}
		return null;
	}

	private static String generateId(Plantation plantation) {
		Plant type = plantation.getType();
		if (type != null) {
			String name = type.getName();
			String trigram = computeTrigram(name);

			Set<String> candiates = EMFUtils.getAncestor(Root.class, plantation).getZones().stream()//
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getId() != null && p.getId().startsWith(trigram))//
					.map(p -> p.getId()).collect(Collectors.toSet());
			int i = 1;
			String id = trigram + UNSERSCORE + i;
			while (candiates.contains(id)) {
				i++;
				id = trigram + UNSERSCORE + i;
			}

			return id;
		}
		return null;
	}

	private static String computeTrigram(String name) {
		String trigram = ""; //$NON-NLS-1$
		for (int i = 0; i < name.length(); i++) {
			if (trigram.length() == 3) {
				break;
			}
			char l = name.charAt(i);
			if (Character.isUpperCase(l)) {
				trigram += l;
			}
		}
		return trigram;
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
	public static Plantation createPlantationFromSow(final PlantationPhase container, final Cell cell) {
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
	public static Plantation createPlantationFromPlanification(final PlantationPhase container,
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
	private static Shell getShell() {
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
