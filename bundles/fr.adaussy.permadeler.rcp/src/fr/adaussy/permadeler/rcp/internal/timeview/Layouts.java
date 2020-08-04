/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.timeview;

import java.time.Month;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import fr.adaussy.permadeler.rcp.internal.utils.ColorHelper;

/**
 * Utils class for layouting the time view
 * 
 * @author Arthur Daussy
 */
public final class Layouts {

	static {
		ColorHelper.setSemantiColor(Month.JANUARY.toString(), "#c2c2c2");
		ColorHelper.setSemantiColor(Month.FEBRUARY.toString(), "#9c9494");
		ColorHelper.setSemantiColor(Month.MARCH.toString(), "#756d6d");
		ColorHelper.setSemantiColor(Month.APRIL.toString(), "#e3a710");
		ColorHelper.setSemantiColor(Month.MAY.toString(), "#3a74ba");
		ColorHelper.setSemantiColor(Month.JUNE.toString(), "#47428c");
		ColorHelper.setSemantiColor(Month.JULY.toString(), "#469e3e");
		ColorHelper.setSemantiColor(Month.AUGUST.toString(), "#741f80");
		ColorHelper.setSemantiColor(Month.SEPTEMBER.toString(), "#ab0937");
		ColorHelper.setSemantiColor(Month.OCTOBER.toString(), "#36b6bf");
		ColorHelper.setSemantiColor(Month.NOVEMBER.toString(), "#1f1763");
		ColorHelper.setSemantiColor(Month.DECEMBER.toString(), "#cf874c");
	}

	/**
	 * Size of the label in line header
	 */
	public static final int LABEL_WIDTH = 300;

	/**
	 * Default size of the square representing a week
	 */
	public static final int CELL_WITH = 15;

	private Layouts() {
	}

	/**
	 * Create a no space {@link GridLayout}
	 * 
	 * @param nbColumn
	 *            nb of column for this layout
	 * @param equalSize
	 *            if the column have equal sizes
	 * @return a new {@link GridLayout}
	 */
	public static GridLayout createNoSpacingLayout(int nbColumn, boolean equalSize) {
		GridLayout layout = new GridLayout(nbColumn, equalSize);
		layout.horizontalSpacing = 0;
		layout.marginBottom = 0;
		layout.marginHeight = 0;
		layout.marginLeft = 0;
		layout.marginRight = 0;
		layout.marginTop = 0;
		layout.marginWidth = 0;
		layout.verticalSpacing = 0;
		return layout;

	}

	public static void setColor(Composite c, String rgb) {
		c.setBackground(ColorHelper.getColor(rgb));
		c.setForeground(ColorHelper.getColor(rgb));
	}

}
