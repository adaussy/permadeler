/**
 *  Copyright (c) 2023 Arthur Daussy.
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.Permadeler.provider.PermadelerEditPlugin;

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

	private static final String PNG_EXT_FILE = ".png"; //$NON-NLS-1$

	private ImageRegistry imageRegistry = new ImageRegistry();

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

	public Map<String, String> getIcons() {
		return icons;
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
				return PermadelerIcons.iconsRelativeToFullPath(getWireframeimage(type.getRepresentation()));
			} else {
				return PermadelerIcons.iconsRelativeToFullPath(type.getRepresentation());
			}
		} else {
			String localPath = getPlantIconSVGPath(type);
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
	private String getPlantSVGWithDefault(Plant plant, String defaultPath) {
		if (plant == null) {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
		String localPath = getPlantIconSVGPath(plant);
		if (localPath != null) {
			return PermadelerIcons.iconsRelativeToFullPath(localPath);
		} else {
			return PermadelerIcons.buildFullPath(defaultPath);
		}
	}

	/**
	 * Gets all the path mapped to a previes image
	 * 
	 * @return a map
	 */
	public Map<String, String> getPreviews() {
		return previews;
	}

	private String getPlantIconSVGPath(Plant type) {
		if (type != null) {
			String repKey = type.getEffectiveIconKey();
			if (svgs.contains(repKey)) {
				return repKey;
			}
		}

		return null;
	}

}
