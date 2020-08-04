/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.utils;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * Helper class to handle colors
 * 
 * @author Arthur Daussy
 */
public final class ColorHelper {

	private static final int RTO_BYTES = 16;

	private static final ColorRegistry COLOR_REGISTRY = new ColorRegistry();

	private ColorHelper() {
	}

	public static Color setSemantiColor(String name, String rgb) {
		Color color = getColor(rgb);
		COLOR_REGISTRY.put(name, color.getRGB());

		return color;
	}

	/**
	 * Gets a SWT color from String #RRGGBB
	 * 
	 * @param rgb
	 *            and string representation
	 * @return a color
	 */
	public static Color getColor(String rgb) {
		Color color = COLOR_REGISTRY.get(rgb);
		if (color == null) {
			String rgbValues = rgb.replace("#", "");
			COLOR_REGISTRY.put(rgb,
					new RGB(Integer.valueOf(rgbValues.substring(0, 2), RTO_BYTES),
							Integer.valueOf(rgbValues.substring(2, 4), RTO_BYTES),
							Integer.valueOf(rgbValues.substring(4, 6), RTO_BYTES)));
			color = COLOR_REGISTRY.get(rgb);
		}
		return color;
	}

}
