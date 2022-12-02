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

import java.time.Instant;

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.Plantation;

/**
 * Service used to handle date
 * 
 * @author Arthur Daussy
 */
public class DateService {

	/**
	 * Gets a String representation of a date of an {@link Event}
	 * 
	 * @param owner
	 *            the event owner
	 * @return the date or ""
	 */
	public String getDateFeature(final Event owner) {
		if (owner != null) {
			final Instant date = owner.getDate();
			if (date != null) {
				return DateUtils.instantToDateString(date);
			}
		}
		return ""; //$NON-NLS-1$
	}

	public String toLocalDate(Instant instant) {
		if (instant == null) {
			return "";
		} else {
			return DateUtils.instantToDateString(instant);
		}
	}

	/**
	 * Set the plantation date of a {@link Plantation}
	 * 
	 * @param owner
	 *            the plantation
	 * @param dateString
	 *            the date
	 * @see DateUtils#DATE_FORMAT_PATTERN
	 */
	public void setPlantationDate(final Plantation owner, final String dateString) {
		if (owner != null) {
			owner.setPlantationDate(DateUtils.dateStringToInstant(dateString));
		}
	}

}
