/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.services;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.provider.PermadelerEditPlugin;
import fr.adaussy.permadeler.rcp.RcpPlugin;

/**
 * List of service for labels
 */
@SuppressWarnings("all")
public class LabelService {

	private static final String TUNCATED_LABEL_SUFFIX = "..."; //$NON-NLS-1$

	private static final String DATE_PATTERN = "dd-MM-yyyy"; //$NON-NLS-1$

	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

	private static final DecimalFormat DEFAULT_FORMAT = new DecimalFormat("##.###"); //$NON-NLS-1$

	/**
	 * Gets a truncated label is the label is bigger than the given maximum. In that case the label is
	 * truncated and a "..." is added
	 * 
	 * @param value
	 *            the label
	 * @param max
	 *            the maximum
	 * @return a String (or null if the input was null)
	 */
	public static String getShortLabel(final String value, final int max) {
		if ((value == null) || (value.length() <= max)) {
			return value;
		} else {
			return value.substring(0, max) + TUNCATED_LABEL_SUFFIX;
		}
	}

	public String getTextRep(float f) {
		return DEFAULT_FORMAT.format(f);
	}

	public static String getEditLabel(Object o) {

		if (o instanceof EEnumLiteral) {
			EEnumLiteral enumLiteral = (EEnumLiteral)o;

			String key = String.format("_UI_%s_%s_literal", enumLiteral.getEEnum().getName(), //$NON-NLS-1$
					enumLiteral.getLiteral());
			return PermadelerEditPlugin.getPlugin().getString(key);

		}

		return ""; //$NON-NLS-1$
	}

	public static String getCellToolTip(Cell cell) {
		String result = cell.getPlant() != null ? cell.getPlant().getName() : ""; //$NON-NLS-1$
		return result + " " + getDateLabel(cell, "date"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public String getSpeciesSowLabel(Plant species) {
		return String.format("%s[%d]", species.getName(), ModelQueryService.getLinkedCells(species).size()); //$NON-NLS-1$
	}

	/**
	 * Gets the label for the given date
	 * 
	 * @param target
	 *            the semantic target
	 * @param featureName
	 *            the name of the feature representing a {@link Date}
	 * @return a String representation
	 */
	public static String getDateLabel(EObject target, String featureName) {
		final EStructuralFeature feature = target.eClass().getEStructuralFeature(featureName);
		if ((feature == null) || feature.getEType() != PermadelerPackage.eINSTANCE.getDate()) {
			RcpPlugin.logError("Invalid feature " + feature); //$NON-NLS-1$
		}

		Instant t = (Instant)target.eGet(feature);
		if (t == null) {
			return ""; //$NON-NLS-1$
		}
		return SIMPLE_DATE_FORMAT.format(new Date(t.toEpochMilli()));
	}
}
