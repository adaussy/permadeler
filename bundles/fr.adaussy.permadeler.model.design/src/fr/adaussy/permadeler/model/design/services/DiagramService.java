/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.internal.query.DDiagramInternalQuery;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Iterators;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationOwner;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.model.Permadeler.RowBedRow;
import fr.adaussy.permadeler.model.Permadeler.RowBedType;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.design.PermadelerModelBundle;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.dialogs.GenusSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.PlantationDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.RowBedDimensionCreationDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.TrayDimensionCreationDialog;
import fr.adaussy.permadeler.rcp.services.ModelQueryService;

/**
 * Service class that gather services used in diagrams
 * 
 * @author Arthur Daussy
 */
public class DiagramService {

	private static final int SVG_DEFAULT_SIZE = 5;

	private static final int TREE_SVG_SIZE = 18;

	private static final int PLANT_SVG_SIZE = 9;

	public String getSVGPath(final EObject p) {
		return ImageProvider.INSTANCE.getSVG(p);
	}

	/**
	 * Gets SVG size of a plantation. The size depends of the nature of the plantation
	 * 
	 * @param plantation
	 *            a plantation
	 * @return a size
	 */
	public static int getSVGSize(final Plantation plantation) {
		Species type = plantation.getType();
		if (type != null) {
			if (type instanceof Plant) {
				return PLANT_SVG_SIZE;
			} else {
				return TREE_SVG_SIZE;
			}
		} else {
			return SVG_DEFAULT_SIZE;
		}
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
	public static List<Cell> getOneCellOfTypeByTray(Species s, DSemanticDiagram diagram) {
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
	public static Plantation createPlantation(final PlantationOwner container) {
		Shell shell = getShell();
		PlantationDialog dialog = new PlantationDialog(shell, new Date(),
				container.eResource().getContents().get(0));
		if (dialog.open() == Dialog.OK) {
			final List<Species> selection = dialog.getSelection();
			if (selection.size() == 1) {
				Event event = PermadelerFactory.eINSTANCE.createEvent();
				Instant currentDate = new Date().toInstant();
				event.setDate(currentDate);
				Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
				plantation.setPlantationEvent(event);
				container.getPlantations().add(plantation);
				Species value = selection.get(0);
				plantation.setType(value);

				if (value instanceof Plant) {
					Event sowEvent = PermadelerFactory.eINSTANCE.createEvent();
					sowEvent.setDate(currentDate);
					plantation.setSowEvent(sowEvent);
				}

				return plantation;
			}
		}
		return null;
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
	public static Plantation createPlantationFromSow(final PlantationOwner container, final Cell cell) {
		if (cell.getSpecies() == null) {
			PermadelerModelBundle.getDefault().logInfo("Can't create a new plantation from empty cell");
			return null;
		}
		Event event = PermadelerFactory.eINSTANCE.createEvent();
		event.setDate(new Date().toInstant());

		Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
		plantation.setPlantationEvent(event);
		container.getPlantations().add(plantation);
		plantation.setType(cell.getSpecies());

		Event sowEvent = PermadelerFactory.eINSTANCE.createEvent();
		sowEvent.setDate(cell.getDate());
		plantation.setSowEvent(sowEvent);

		cell.setDate(null);
		cell.setSpecies(null);
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
	public static Plantation createPlantationFromPlanification(final PlantationOwner container,
			final SowPlanfication planification) {
		Event event = PermadelerFactory.eINSTANCE.createEvent();
		event.setDate(new Date().toInstant());

		Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
		plantation.setPlantationEvent(event);
		container.getPlantations().add(plantation);
		plantation.setType(planification.getSeed().getType());

		Event sowEvent = PermadelerFactory.eINSTANCE.createEvent();
		sowEvent.setDate(new Date().toInstant());
		plantation.setSowEvent(sowEvent);

		return plantation;

	}

	public static String getPlantationLabel(Plantation p) {
		if (p.eContainer() instanceof Area) {
			return "";
		}
		Species type = p.getType();
		return type != null ? type.getName() : "";
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
	 * Configure a {@link RowBed} by asking the user its size
	 * 
	 * @param bed
	 *            a existing bed
	 * @param vertical
	 *            holds <code>true</code> for a vertical bed, <code>false</code> for horizontal bed
	 * @return the input bed for convenience
	 */
	public static RowBed configureRowBed(RowBed bed, boolean vertical) {
		if (vertical) {
			bed.setType(RowBedType.VERTICAL);
		} else {
			bed.setType(RowBedType.HORIZONTAL);
		}
		RowBedDimensionCreationDialog dialog = new RowBedDimensionCreationDialog(getShell(), 4);
		if (dialog.open() == Dialog.OK) {
			for (int row = 0; row < dialog.getNbOfRows(); row++) {
				RowBedRow rowItem = PermadelerFactory.eINSTANCE.createRowBedRow();
				bed.getRows().add(rowItem);
			}
		}

		return bed;
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
		c.setSpecies(null);
	}

	public static List<Genus> getGenusWithComp(CompatibilityMatrix cmpMatrix) {
		return cmpMatrix.getCompatibilties().stream().flatMap(c -> c.getSpecies().stream())
				.sorted(Comparators.GENUS_CMP).collect(toList());
	}

	/**
	 * Get all {@link Genus} conected to the given genus with a positive compatibility
	 * 
	 * @param g
	 *            a genus
	 * @return a list of genus
	 */
	public static List<Genus> getLinkedGenusPositive(Genus g) {
		List<Genus> positiveCompat = g.getCompatibilityLinks().stream().filter(c -> c.getAffinity() > 0)
				.flatMap(c -> c.getSpecies().stream()).filter(e -> e != g).collect(toList());

		System.out.println(g.getName() + "+->"
				+ positiveCompat.stream().map(g1 -> g1.getName()).sorted().collect(joining(",")));
		return positiveCompat;
	}

	public static List<Genus> getLinkedGenusNegative(Genus g) {
		return g.getCompatibilityLinks().stream().filter(c -> c.getAffinity() < 0)
				.flatMap(c -> c.getSpecies().stream()).filter(e -> e != g).collect(toList());
	}

	/**
	 * Sets the compatibility between to genuses
	 * 
	 * @param g1
	 *            a genus
	 * @param g2
	 *            another genus
	 * @param value
	 *            the value (a valid integer)
	 */
	public static void setCompatibility(Genus g1, Genus g2, String value) {
		try {
			int cmp = Integer.valueOf(value);
			EMFUtils.getAncestor(Root.class, g1).addCompatibility(g1, g2, cmp);
		} catch (NumberFormatException e) {
			PermadelerModelBundle.getDefault().logError("Invalid compat number " + value, e);
		}
	}

	public static List<Genus> getLinkedGenus0(Genus g) {
		return g.getCompatibilityLinks().stream().filter(c -> c.getAffinity() != 0)
				.flatMap(c -> c.getSpecies().stream()).filter(e -> e != g).collect(toList());
	}

	/**
	 * Gets all the geniuses which has not compatibility set with the given genus
	 * 
	 * @param g
	 *            a genus
	 * @return a list of genus
	 */
	public static List<Genus> noCompatYet(Genus g) {
		Set<Genus> genusWithAffinity = g.getCompatibilityLinks().stream().filter(c -> c.getAffinity() != 0)
				.flatMap(c -> c.getSpecies().stream()).collect(toSet());

		KnowledgeBase base = EMFUtils.getAncestor(KnowledgeBase.class, g);

		CompatibilityMatrix matrix = base.getCompatibilityMatrix();

		Set<Genus> allGenus;
		if (matrix != null) {
			allGenus = matrix.getCompatibilties().stream().flatMap(c -> c.getSpecies().stream())
					.collect(toSet());
		} else {
			allGenus = Collections.emptySet();
		}

		List<Genus> noCompatYet = allGenus.stream().filter(g1 -> !genusWithAffinity.contains(g1))
				.collect(toList());
		return noCompatYet;

	}

	/**
	 * Gets the label representing the compatibility between geniuses
	 * 
	 * @param g1
	 *            a genus
	 * @param g2
	 *            another genus
	 * @return a string (or <code>null</code>)
	 */
	public static String getCompatibilityLabel(Genus g1, Genus g2) {
		String label = g1.getCompatibilityLinks().stream()
				.filter(c -> c.getSpecies().contains(g2) && c.getAffinity() != 0)
				.map(c -> String.valueOf(c.getAffinity())).findFirst().orElseGet(() -> {
					// If same genus then X
					if (g1.eContainer() == g2.eContainer()) {
						return "X";
					} else {
						return null;
					}
					// Otherwise null
				});
		return label;
	}

	public static int getCompatibility(Genus g1, Genus g2) {
		return g1.getCompatibilityLinks().stream().filter(c -> c.getSpecies().contains(g2))
				.mapToInt(c -> c.getAffinity()).findFirst().orElse(0);
	}

	/**
	 * Creates a compatibility from the given genus to another genus selected by the user
	 * 
	 * @param g
	 *            a genus
	 * @return a {@link CompatibilityLink} (or <code>null</code>)
	 */
	public static CompatibilityLink createCompat(Genus g) {
		GenusSelectionDialog d = new GenusSelectionDialog(getShell(), e -> e != g,
				EMFUtils.getAncestor(KnowledgeBase.class, g));
		if (d.open() == Dialog.OK) {
			return EMFUtils.getAncestor(Root.class, g).addCompatibility(g, d.getSelection().get(0), 0);
		}

		return null;
	}

	/**
	 * Creates a compatibility link by asking the user 2 ge'nus
	 * 
	 * @param base
	 *            the knowledge base
	 * @return {@link CompatibilityLink} (or <code>null</code>)
	 */
	public static CompatibilityLink createCompat(KnowledgeBase base) {
		GenusSelectionDialog sourceDialog = new GenusSelectionDialog(getShell(), null, base);
		if (sourceDialog.open() == Dialog.OK) {
			GenusSelectionDialog targetDialog = new GenusSelectionDialog(getShell(),
					g -> !sourceDialog.getSelection().contains(g), base);
			if (targetDialog.open() == Dialog.OK) {
				return EMFUtils.getAncestor(Root.class, base).addCompatibility(
						sourceDialog.getSelection().get(0), targetDialog.getSelection().get(0), 0);
			}
		}

		return null;
	}

	/**
	 * Gets all the genus contained by the same parent genus
	 * 
	 * @param g
	 *            a genus
	 * @return a list of genus
	 */
	public static List<Genus> getSameFamilly(Genus g) {
		EObject container = g.eContainer();
		if (container instanceof Genus) {
			List<Genus> sameFamilly = ((Genus)container).getSubGenus().stream().filter(s -> s != g)
					.collect(toList());
			return sameFamilly;

		}
		return Collections.emptyList();
	}

	/**
	 * Gets a list of all contenected genus (a genus with a compatibility link)
	 * 
	 * @param source
	 *            a source genus
	 * @return a list of genuses
	 */
	public static List<Genus> getConnectedGenus(Genus source) {
		Root root = EMFUtils.getAncestor(Root.class, source);
		KnowledgeBase knowledgeBase = root.getSeedLib();
		if (knowledgeBase != null) {
			CompatibilityMatrix matrix = knowledgeBase.getCompatibilityMatrix();
			if (matrix != null) {
				Map<Genus, Set<Genus>> connections = new HashMap<>();
				for (CompatibilityLink link : matrix.getCompatibilties()) {
					if (link.getAffinity() != 0) {
						for (Genus g : link.getSpecies()) {
							Set<Genus> connected = connections.computeIfAbsent(g, gen -> {
								Set<Genus> linked = new HashSet<>();
								linked.addAll(getSameFamilly(gen));
								return linked;
							});
							connected.addAll(link.getSpecies());
							connected.remove(g);
						}
					}
				}
				Set<Genus> connected = connections.get(source);
				if (connected == null || connected.isEmpty()) {
					return Collections.emptyList();
				} else {
					return connected.stream().sorted(Comparator.comparing(gen -> gen.getName()))
							.collect(toList());
				}
			}
		}

		return Collections.emptyList();
	}

	/**
	 * Adds a compatibility between the given genus and genus selected by the user
	 * 
	 * @param source
	 *            a source genus
	 * @param compatibilty
	 *            the compatibility value
	 * @return a {@link Genus}
	 */
	public static Genus addCompatibility(Genus source, int compatibilty) {
		GenusSelectionDialog dialog = new GenusSelectionDialog(getShell(), g -> g != source,
				EMFUtils.getAncestor(KnowledgeBase.class, source));
		dialog.setMulti(false);
		if (dialog.open() == Dialog.OK) {
			List<Genus> selection = dialog.getSelection();
			if (!selection.isEmpty()) {
				Root root = EMFUtils.getAncestor(Root.class, source);
				root.addCompatibility(source, selection.get(0), compatibilty);
			}
		}
		return source;
	}
}
