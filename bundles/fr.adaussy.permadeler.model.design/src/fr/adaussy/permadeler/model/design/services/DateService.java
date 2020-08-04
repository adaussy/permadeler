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
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
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

	/**
	 * Set the date feature of an event from a String. The string should respect
	 * {@link DateUtils#DATE_FORMAT_PATTERN}
	 * 
	 * @param owner
	 *            the event owner
	 * @param dateString
	 *            the string representation of the date
	 */
	public void setDateFeature(final Event owner, final String dateString) {
		if (owner != null) {
			owner.setDate(DateUtils.dateStringToInstant(dateString));
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
			Event event = owner.getPlantationEvent();
			if (event == null) {
				event = PermadelerFactory.eINSTANCE.createEvent();
				owner.setPlantationEvent(event);
			}
			this.setDateFeature(event, dateString);
		}
	}

	/**
	 * Set the removal date of a {@link Plantation}
	 * 
	 * @param owner
	 *            the plantation
	 * @param dateString
	 *            the date
	 * @see DateUtils#DATE_FORMAT_PATTERN
	 */
	public void setRemovalDate(final Plantation owner, final String dateString) {
		Event event = owner.getRemovalEvent();
		if (event == null) {
			event = PermadelerFactory.eINSTANCE.createEvent();
			owner.setRemovalEvent(event);
		}
		this.setDateFeature(event, dateString);
	}
}
