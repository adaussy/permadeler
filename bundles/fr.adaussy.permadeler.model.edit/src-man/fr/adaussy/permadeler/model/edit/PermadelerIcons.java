/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.edit;

/**
 * Registry of icons
 * 
 * @author Arthur Daussy
 */
public class PermadelerIcons {

	// CHECKSTYLE:OFF Needs private first since used in public key
	private static final String EMPTY = ""; //$NON-NLS-1$

	private static final String PATH_SEP = "/"; //$NON-NLS-1$

	/**
	 * Main icon folder
	 */
	public static final String ICON_FOLDER = "icons"; //$NON-NLS-1$

	/**
	 * Icon folder path
	 */
	public static final String ICON_FOLDER_PATH = ICON_FOLDER + PATH_SEP; // $NON-NLS-1$

	/**
	 * Bank folder name
	 */
	public static final String BANK = "bank"; //$NON-NLS-1$

	/**
	 * Bank folder path
	 */
	public static final String ICONS_BANK_PREFIX = ICON_FOLDER + PATH_SEP + BANK + PATH_SEP;

	public static final String LEAF_SVG = "leaf.svg"; //$NON-NLS-1$

	public static final String TREE_SVG = "tree.svg"; //$NON-NLS-1$

	public static final String PLANT_SVG = "plant.svg"; //$NON-NLS-1$

	public static final String LEAF_ICON = "icons/custo/commons/leaf.png"; //$NON-NLS-1$

	public static final String AREA_SVG = "area.svg"; //$NON-NLS-1$

	public static final String SHOVEL_SVG = "084-shovel.svg"; //$NON-NLS-1$

	// CHECKSTYLE:ON

	private static final String PLUGIN_ID = "fr.adaussy.permadeler.model.edit"; //$NON-NLS-1$

	private static final String PLUGIN_PATH = PATH_SEP + PLUGIN_ID; // $NON-NLS-1$

	public static String buildFullPath(String svgFileName) {
		return PLUGIN_PATH + PATH_SEP + ICON_FOLDER + PATH_SEP + BANK + PATH_SEP + svgFileName;
	}

	public static String buildIconsFolderReltivePath(String svgFileName) {
		return PATH_SEP + ICON_FOLDER + PATH_SEP + BANK + PATH_SEP + svgFileName;
	}

	/**
	 * Gets the icon relative pas "icons/x/y" to "/pluginId/icons/x/y"
	 * 
	 * @param iconRelativePath
	 *            see {@link #buildIconsFolderReltivePath(String)}
	 * @return a path
	 */
	public static String iconsRelativeToFullPath(String iconRelativePath) {
		return PermadelerIcons.PLUGIN_PATH + iconRelativePath;
	}

	/**
	 * If the path start starts with {@value #ICON_FOLDER_PATH} then removes it
	 * 
	 * @param path
	 *            a path
	 * @return a new path or itself
	 */
	public static String removeIconPart(String path) {
		if (path != null && path.startsWith(PermadelerIcons.ICON_FOLDER_PATH)) {
			return path.replaceFirst(PermadelerIcons.ICON_FOLDER_PATH, EMPTY);
		} else {
			return path;
		}
	}

}
