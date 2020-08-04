/**
 *  Copyright (c) 2020 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.model.edit;

import static fr.adaussy.permadeler.model.edit.PermadelerIcons.LEAF_ICON;
import static fr.adaussy.permadeler.model.edit.PermadelerIcons.LEAF_SVG;
import static fr.adaussy.permadeler.model.edit.PermadelerIcons.PLANT_SVG;
import static fr.adaussy.permadeler.model.edit.PermadelerIcons.TREE_SVG;
import static java.util.stream.Collectors.joining;

import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.GridBed;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.model.Permadeler.RowBedRow;
import fr.adaussy.permadeler.model.Permadeler.RowBedType;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.Tree;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.Permadeler.provider.PermadelerEditPlugin;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerSwitch;

/**
 * Instance in charge of providing all images for this app
 * 
 * @author Arthur Daussy
 */
public final class ImageProvider {

	/**
	 * Singleton instance
	 */
	public static final ImageProvider INSTANCE = new ImageProvider();

	private static final String SVG = "svg"; //$NON-NLS-1$

	private static final String PREVIEW_FOLDER = "preview"; //$NON-NLS-1$

	private static final String PATH_SEP = "/"; //$NON-NLS-1$

	private static final String SVG_EXT_FILE = "." + SVG; //$NON-NLS-1$

	private static final String PNG_EXT_FILE = ".png"; //$NON-NLS-1$

	private ImageRegistry imageRegistry = new ImageRegistry();

	private ImageProviderSwitch imageSwitch = new ImageProviderSwitch();

	/**
	 * Set of svgs
	 */
	private Set<String> svgs = new HashSet<>();

	/**
	 * Map SVG paths to icons paths (16x16)
	 */
	private Map<String, String> icons = new HashMap<>();

	/**
	 * Map SVG path to previous path (bigger icons 50x50)
	 */
	private Map<String, String> previews = new HashMap<>();

	private Bundle bundle;

	/**
	 * Simple constructor
	 */
	private ImageProvider() {
		if (PermadelerEditPlugin.getPlugin() != null
				&& PermadelerEditPlugin.getPlugin().getBundle() != null) {
			this.bundle = PermadelerEditPlugin.getPlugin().getBundle();
			// Fill the registry by looking for images in the icon/bank folder
			Enumeration<URL> findEntries = bundle.findEntries(PermadelerIcons.ICONS_BANK_PREFIX, "*", true); //$NON-NLS-1$
			Iterator<URL> listIte = findEntries.asIterator();
			init(listIte);
		}
	}

	/**
	 * Fill the registry with icons, SVG and preview
	 * 
	 * @param listIte
	 *            list of entry to analyze
	 */
	private void init(Iterator<URL> listIte) {
		while (listIte.hasNext()) {
			URL url = listIte.next();
			String fullPath = url.getFile();
			String[] segments = fullPath.split(PATH_SEP); // $NON-NLS-1$
			String fileName = segments[segments.length - 1];
			String[] parts = fileName.split("\\."); //$NON-NLS-1$
			if (parts.length >= 2) {
				String extension = parts[1];
				if (SVG.equalsIgnoreCase(extension)) {
					String svgPath = Stream.of(segments).collect(joining(PATH_SEP)); // $NON-NLS-1$
					String iconPath = getPath(segments, PermadelerIcons.ICON_FOLDER);
					String previewPath = getPath(segments, PREVIEW_FOLDER);
					URL iconEntry = bundle.getEntry(iconPath);
					URL previewEntry = bundle.getEntry(previewPath);
					if (iconEntry != null && previewEntry != null) {
						svgs.add(svgPath);
						icons.put(svgPath, iconPath);
						previews.put(svgPath, previewPath);
					}
				}
			}
		}
	}

	/**
	 * Gets an SWT image matching the given path in this plugin
	 * 
	 * @param path
	 *            relative path to the root of this plugin
	 * @return a image or <code>null</code>
	 */
	public org.eclipse.swt.graphics.Image getImage(String path) {
		org.eclipse.swt.graphics.Image img = imageRegistry.get(path);
		if (img == null) {
			ImageDescriptor myImage = ImageDescriptor
					.createFromURL(FileLocator.find(bundle, new Path(path), null));

			imageRegistry.put(path, myImage);
		}
		return imageRegistry.get(path);
	}

	/**
	 * Gets an image descriptor that match the given path
	 * 
	 * @param path
	 *            a path
	 * @return an {@link ImageDescriptor} or <code>null</code>
	 */
	public ImageDescriptor getImageDescriptor(String path) {
		ImageDescriptor img = imageRegistry.getDescriptor(path);
		if (img == null) {
			ImageDescriptor myImage = ImageDescriptor
					.createFromURL(FileLocator.find(bundle, new Path(path), null));

			imageRegistry.put(path, myImage);
		}
		return imageRegistry.getDescriptor(path);
	}

	/**
	 * Gets the path of an image from its relative path and its nature
	 * 
	 * @param segments
	 *            the path of the icon
	 * @param nature
	 *            the nature of the icon
	 * @return a complete path
	 */
	private String getPath(String[] segments, String nature) {
		String[] newPath = new String[segments.length + 1];
		for (int i = 0; i < segments.length - 1; i++) {
			newPath[i] = segments[i];
		}
		newPath[segments.length - 1] = nature;
		String fileName = segments[segments.length - 1];
		int index = fileName.lastIndexOf('.');
		newPath[segments.length] = fileName.substring(0, index) + PNG_EXT_FILE;

		return Stream.of(newPath).collect(joining(PATH_SEP)); // $NON-NLS-1$
	}

	/**
	 * Gets the image to be used for the given object
	 * 
	 * @param o
	 *            an {@link EObject}
	 * @return an Image
	 */
	public Object getIconEMFIcon(EObject o) {
		String path = imageSwitch.doSwitch(o);
		if (path != null) {
			if (path.endsWith(SVG_EXT_FILE)) {
				path = icons.get(path);
			}

			if (path != null && path.startsWith(PATH_SEP)) {
				path = path.substring(1);
			}

			return PermadelerEditPlugin.INSTANCE.getImage(PermadelerIcons.removeIconPart(path));
		} else {
			PermadelerEditPlugin.INSTANCE.log("Missing icon for " + o.eClass().getName());
			return null;
		}
	}

	/**
	 * Gets the path to an SVG to be used for a representation for the given {@link EObject}
	 * 
	 * @param o
	 *            a {@link EObject}
	 * @return a path or an empty string
	 */
	public String getSVG(EObject o) {
		final String result;
		if (o instanceof Genus) {
			result = getSpeciesSVG((Genus)o, PermadelerIcons.PLANT_SVG);
		} else if (o instanceof Plantation) {
			result = getSpeciesSVGWithDefault(((Plantation)o).getType(), PermadelerIcons.SHOVEL_SVG);
		} else if (o instanceof Cell) {
			result = getSpeciesSVGWithDefault(((Cell)o).getSpecies(), PermadelerIcons.AREA_SVG);
		} else if (o instanceof Species) {
			result = getSpeciesSVGWithDefault((Species)o, PermadelerIcons.PLANT_SVG);
		} else {
			result = "";
		}
		return result;
	}

	/**
	 * Gets the path to an SVG to be used for a representation for the given {@link Species}
	 * 
	 * @param species
	 *            a {@link Species}
	 * @param defaultPath
	 *            relative path of the default SVG
	 * @return a path or the full path of the given default path
	 */
	private String getSpeciesSVGWithDefault(Species species, String defaultPath) {
		if (species == null) {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
		String localPath = getSpeciesSVGPath(species);
		if (localPath != null) {
			return PermadelerIcons.iconsRelativeToFullPath(localPath);
		} else {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
	}

	/**
	 * Gets the path to an SVG to be used for a representation for the given {@link Genus}
	 * 
	 * @param genus
	 *            a {@link Genus}
	 * @param defaultPath
	 *            relative path of the default SVG
	 * @return a path or the full path of the given default path
	 */
	private String getSpeciesSVG(Genus genus, String defaultPath) {
		if (genus == null) {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
		String localPath = geGenustSVGPath(genus);
		if (localPath != null) {
			return PermadelerIcons.iconsRelativeToFullPath(localPath);
		} else {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
	}

	/**
	 * Gets the representation key the given species (defined either by {@link Species#getRepresentationKey()}
	 * or by one of its ancestor genus)
	 * 
	 * @param species
	 *            a {@link Species}
	 * @return a key (or <code>null</code>)
	 */
	private String getRepKey(Species species) {
		String iconKey = species.getRepresentationKey();
		if (iconKey == null && species.getType() != null) {
			Genus type = species.getType();
			iconKey = getRepKey(type);
		}
		return iconKey;
	}

	/**
	 * Gets the representation key of a genus (or its parent if null)
	 * 
	 * @param type
	 *            a {@link Genus}
	 * @return a representation key
	 */
	private String getRepKey(Genus type) {
		String iconKey;
		iconKey = type.getRepresentationKey();
		if (iconKey == null) {
			// Look for super genus
			EObject container = type.eContainer();
			if (container instanceof Genus) {
				Genus superGenus = (Genus)container;
				iconKey = superGenus.getRepresentationKey();
			}
		}
		return iconKey;
	}

	/**
	 * Gets all the path mapped to a previes image
	 * 
	 * @return a map
	 */
	public Map<String, String> getPreviews() {
		return previews;
	}

	/**
	 * Gets the path of SVG representing the given species
	 * 
	 * @param type
	 *            a {@link Species}
	 * @return a path or <code>null</code>
	 */
	private String getSpeciesSVGPath(Species type) {
		if (type != null) {
			String repKey = getRepKey(type);

			if (svgs.contains(repKey)) {
				return repKey;
			} else if (type instanceof Tree) {
				return PermadelerIcons.buildIconsFolderReltivePath(TREE_SVG);
			} else {
				return PermadelerIcons.buildIconsFolderReltivePath(PLANT_SVG);
			}
		}
		return PermadelerIcons.buildIconsFolderReltivePath(LEAF_SVG);
	}

	/**
	 * Gets the path of SVG representing the given {@link Genus}
	 * 
	 * @param type
	 *            a {@link Genus}
	 * @return a path or <code>null</code>
	 */
	private String geGenustSVGPath(Genus type) {
		if (type != null) {
			String repKey = getRepKey(type);

			if (svgs.contains(repKey)) {
				return repKey;
			}
		}
		return PermadelerIcons.buildIconsFolderReltivePath(LEAF_SVG);
	}

	/**
	 * Switch used to provides icons path from an EObject
	 * 
	 * @author Arthur Daussy
	 */
	private class ImageProviderSwitch extends PermadelerSwitch<String> {
		private static final String SOW_EVENT = "sow";

		private static final String REMOVAL_FEATURE = "removal"; //$NON-NLS-1$

		private static final String PLANTATION_FEATURE = "plantation"; //$NON-NLS-1$

		@Override
		public String caseRoot(Root object) {
			return "icons/custo/commons/plant2.png"; //$NON-NLS-1$
		}

		@Override
		public String caseKnowledgeBase(KnowledgeBase object) {
			return "icons/custo/commons/knowledge.png"; //$NON-NLS-1$
		}

		@Override
		public String caseImage(Image object) {
			return "icons/custo/commons/image.gif"; //$NON-NLS-1$
		}

		@Override
		public String caseSeedItem(SeedItem object) {
			return "icons/bank/icons/072-seed.png"; //$NON-NLS-1$
		}

		@Override
		public String caseRowBed(RowBed object) {
			if (object.getType() == RowBedType.HORIZONTAL) {
				return "icons/bank/icons/HorizontalBed.png"; //$NON-NLS-1$
			} else {
				return "icons/bank/icons/VerticalBed.png"; //$NON-NLS-1$
			}
		}

		@Override
		public String caseGridBed(GridBed object) {
			return "icons/bank/icons/GridBed.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSeedBank(SeedBank object) {
			return "icons/bank/icons/083-seed-1.png"; //$NON-NLS-1$
		}

		@Override
		public String caseEvent(Event object) {
			EStructuralFeature containerFeature = object.eContainingFeature();
			if (containerFeature != null) {
				if (containerFeature.getName().contains(PLANTATION_FEATURE)) {
					return "icons/custo/commons/planting.png"; //$NON-NLS-1$
				} else if (containerFeature.getName().contains(REMOVAL_FEATURE)) {
					return "icons/custo/commons/knife.png"; //$NON-NLS-1$
				} else if (containerFeature.getName().contains(SOW_EVENT)) {
					return "icons/bank/icons/072-seed.png"; //$NON-NLS-1$
				}
			}
			return "icons/custo/commons/post-it.png"; //$NON-NLS-1$
		}

		@Override
		public String casePlanifier(Planifier object) {
			return "icons/bank/icons/calendar-sow.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSowPlanfication(SowPlanfication object) {
			if (object.getType() == SowType.INDOOR) {
				return "icons/bank/icons/greenhouse.png"; //$NON-NLS-1$
			} else if (object.getType() == SowType.OUTDOOR) {
				return "icons/bank/icons/sow.png"; //$NON-NLS-1$
			}
			return super.caseSowPlanfication(object);
		}

		@Override
		public String caseArea(Area object) {
			return "icons/custo/commons/area.png"; //$NON-NLS-1$
		}

		@Override
		public String caseZone(Zone object) {
			return "icons/custo/commons/zone.png"; //$NON-NLS-1$
		}

		@Override
		public String casePlantation(Plantation object) {
			Species type = object.getType();
			if (type != null) {
				return doSwitch(type);
			}
			return "icons/custo/commons/plant.png"; //$NON-NLS-1$
		}

		@Override
		public String caseCell(Cell cell) {
			if (cell.getSpecies() != null) {
				return caseSpecies(cell.getSpecies());
			} else {
				return "icons/bank/icons/area.png"; //$NON-NLS-1$
			}
		}

		@Override
		public String caseTray(Tray object) {
			return "icons/bank/icons/tray.png"; //$NON-NLS-1$
		}

		@Override
		public String caseRow(Row object) {
			return "icons/bank/icons/row.png"; //$NON-NLS-1$
		}

		@Override
		public String caseRowBedRow(RowBedRow object) {
			return "icons/bank/icons/row.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSpecies(Species object) {
			String path = getRepKey(object);
			if (path != null) {
				return icons.get(path);
			}
			return null;
		}

		@Override
		public String casePlant(Plant object) {

			String path = caseSpecies(object);
			if (path != null) {
				return path;
			} else {
				return "icons/custo/commons/plant.png"; //$NON-NLS-1$
			}
		}

		@Override
		public String caseTree(Tree object) {

			String path = caseSpecies(object);
			if (path != null) {
				return path;
			} else {

				return "icons/custo/commons/tree.png"; //$NON-NLS-1$
			}
		}

		@Override
		public String caseGenus(Genus object) {

			String key = object.getRepresentationKey();

			if (key == null) {
				// Look for super genus
				EObject container = object.eContainer();
				if (container instanceof Genus) {
					Genus superGenus = (Genus)container;
					key = superGenus.getRepresentationKey();
				}
			}

			String path = null;
			if (key != null) {
				path = icons.get(key);
			}

			if (path != null) {
				return path;
			} else {
				return LEAF_ICON;
			}
		}

	}

}
