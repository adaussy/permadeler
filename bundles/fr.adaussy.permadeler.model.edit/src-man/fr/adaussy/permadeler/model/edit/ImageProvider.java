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

import static java.util.stream.Collectors.joining;

import java.net.URL;
import java.text.MessageFormat;
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

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.Variety;
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

	private Set<String> representations = new HashSet<>();

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

			initRepresentation(
					bundle.findEntries(PermadelerIcons.REPRESENTATION_PREFIX, "*", true).asIterator()); //$NON-NLS-1$
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

	private void initRepresentation(Iterator<URL> listIte) {
		while (listIte.hasNext()) {
			URL url = listIte.next();
			String fullPath = url.getFile();
			String[] segments = fullPath.split(PATH_SEP); // $NON-NLS-1$
			String fileName = segments[segments.length - 1];
			String[] parts = fileName.split("\\."); //$NON-NLS-1$
			if (parts.length >= 2) {
				String svgPath = Stream.of(segments).collect(joining(PATH_SEP)); // $NON-NLS-1$
				representations.add(svgPath);
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

	public Set<String> getRepresentations() {
		return representations;
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
			PermadelerEditPlugin.INSTANCE
					.log(MessageFormat.format("Missing icon for {0}", o.eClass().getName())); //$NON-NLS-1$
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
	public String getRepresentation(EObject o) {
		final String result;
		if (o instanceof Plantation) {
			result = getPlantSVGWithDefault(((Plantation)o), PermadelerIcons.SHOVEL_SVG);
		} else if (o instanceof Cell) {
			result = getPlantSVGWithDefault(((Cell)o).getPlant(), PermadelerIcons.AREA_SVG);
		} else if (o instanceof Plant) {
			result = getPlantSVGWithDefault((Plant)o, PermadelerIcons.PLANT_SVG);
		} else {
			result = ""; //$NON-NLS-1$
		}
		return result;
	}

	private String getPlantSVGWithDefault(Plantation plantation, String shovelSvg) {
		Plant type = plantation.getType();
		if (type == null) {
			return "/fr.adaussy.permadeler.model.edit/icons/custo/commons/plant.svg"; //$NON-NLS-1$
		}
		if (plantation.getRepresentationKind() == RepresentationKind.TREE_CROWN) {
			if (plantation.isWireframe()) {
				return PermadelerIcons
						.iconsRelativeToFullPath(getWireframeimage(type.getRepresentationKey()));
			} else {
				return PermadelerIcons.iconsRelativeToFullPath(type.getRepresentationKey());
			}
		} else {
			String localPath = getPlantSVGPath(type);
			if (localPath != null) {
				return PermadelerIcons.iconsRelativeToFullPath(localPath);
			} else {
				return "/fr.adaussy.permadeler.model.edit/icons/custo/commons/plant.svg"; //$NON-NLS-1$
			}
		}
	}

	private String getWireframeimage(String imagePath) {
		java.nio.file.Path path = java.nio.file.Path.of(imagePath);
		return path.getParent().resolve("wireframe.png").toString(); //$NON-NLS-1$
	}

	/**
	 * Gets the path to an SVG to be used for a representation for the given {@link Variety}
	 * 
	 * @param species
	 *            a {@link Species}
	 * @param defaultPath
	 *            relative path of the default SVG
	 * @return a path or the full path of the given default path
	 */
	private String getPlantSVGWithDefault(Plant variety, String defaultPath) {
		if (variety == null) {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
		String localPath = getPlantSVGPath(variety);
		if (localPath != null) {
			return PermadelerIcons.iconsRelativeToFullPath(localPath);
		} else {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
	}

	/**
	 * Gets the representation key the given species (defined either by {@link Species#getIconKey()} or by one
	 * of its ancestor genus)
	 * 
	 * @param plantNamedElement
	 *            a {@link Species}
	 * @return a key (or <code>null</code>)
	 */
	private String getRepKey(PlantNamedElement plantNamedElement) {
		if (plantNamedElement == null) {
			return null;
		}
		String iconKey = plantNamedElement.getIconKey();
		if (iconKey == null && plantNamedElement.eContainer() instanceof PlantNamedElement) {
			iconKey = getRepKey((PlantNamedElement)plantNamedElement.eContainer());
		}

		if (iconKey == null && plantNamedElement instanceof Variety) {
			return getRepKey(((Variety)plantNamedElement).getSpecies());
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

	private String getPlantSVGPath(Plant type) {
		if (type != null) {
			String repKey = getRepKey(type);

			if (svgs.contains(repKey)) {
				return repKey;
			}
		}

		return null;
	}

	/**
	 * Switch used to provides icons path from an EObject
	 * 
	 * @author Arthur Daussy
	 */
	private class ImageProviderSwitch extends PermadelerSwitch<String> {
		private static final String SOW_EVENT = "sow"; //$NON-NLS-1$

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
			return "icons/other/icons/072-seed.png"; //$NON-NLS-1$
		}

		@Override
		public String casePlantationPhase(fr.adaussy.permadeler.model.Permadeler.PlantationPhase object) {
			return "icons/custo/commons/growth.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSeedBank(SeedBank object) {
			return "icons/other/icons/083-seed-1.png"; //$NON-NLS-1$
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
					return "icons/other/icons/072-seed.png"; //$NON-NLS-1$
				}
			}
			return "icons/custo/commons/post-it.png"; //$NON-NLS-1$
		}

		@Override
		public String casePlanifier(Planifier object) {
			return "icons/other/icons/calendar-sow.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSowPlanfication(SowPlanfication object) {
			if (object.getType() == SowType.INDOOR) {
				return "icons/other/icons/greenhouse.png"; //$NON-NLS-1$
			} else if (object.getType() == SowType.OUTDOOR) {
				return "icons/other/icons/sow.png"; //$NON-NLS-1$
			}
			return super.caseSowPlanfication(object);
		}

		@Override
		public String caseZone(Zone object) {
			return "icons/custo/commons/zone.png"; //$NON-NLS-1$
		}

		@Override
		public String casePlantation(Plantation object) {
			Plant type = object.getType();
			if (type != null) {
				return doSwitch(type);
			}
			return "icons/custo/commons/plant.png"; //$NON-NLS-1$
		}

		@Override
		public String caseCell(Cell cell) {
			if (cell.getPlant() != null) {
				return casePlant(cell.getPlant());
			} else {
				return "icons/other/icons/area.png"; //$NON-NLS-1$
			}
		}

		@Override
		public String caseTray(Tray object) {
			return "icons/other/icons/tray.png"; //$NON-NLS-1$
		}

		@Override
		public String caseRow(Row object) {
			return "icons/other/icons/row.png"; //$NON-NLS-1$
		}

		@Override
		public String caseAction(fr.adaussy.permadeler.model.Permadeler.Action object) {
			return switch (object.getType()) {
				case SOW_INDOOR -> "icons/custo/commons/calendar-sow.png"; //$NON-NLS-1$
				case SOW_OUTDOOR -> "icons/custo/commons/calendar-sow.png"; //$NON-NLS-1$
				case MULTIPLICATION -> "icons/custo/commons/multipication.png"; //$NON-NLS-1$
				case PRUNING -> "icons/custo/commons/pruning.png"; //$NON-NLS-1$
				default -> "icons/custo/commons/action.png"; //$NON-NLS-1$
			};

		};

		@Override
		public String caseProduction(fr.adaussy.permadeler.model.Permadeler.Production object) {
			return "icons/custo/commons/production.png"; //$NON-NLS-1$
		}

		@Override
		public String caseSpecies(Species object) {
			String path = getRepKey(object);
			String iconPath = null;
			if (path != null) {
				iconPath = icons.get(path);
			} else {
				iconPath = "icons/custo/commons/plant.png"; //$NON-NLS-1$ ;
			}
			return iconPath;

		}

		@Override
		public String caseVariety(Variety object) {
			String path = getRepKey(object);
			String iconPath = null;
			if (path != null) {
				iconPath = icons.get(path);
			} else {
				iconPath = caseSpecies(object.getSpecies()); // $NON-NLS-1$ ;
			}
			return iconPath;
		}

	}

}
