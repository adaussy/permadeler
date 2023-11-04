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
package fr.adaussy.permadeler.common.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;

/**
 * Util class for dates
 * 
 * @author Arthur Daussy
 */
public final class DateUtils {

	/**
	 * Number of weeks in one month
	 */
	public static final int NB_OF_QUARTER = 4;

	/**
	 * Number of month in one year
	 */
	public static final int NB_OF_MONTHS = 12;

	/**
	 * Common data format pattern
	 */
	private static final String DATE_FORMAT_PATTERN = "dd/MM/yyyy"; //$NON-NLS-1$

	private static final String DATE_FORMAT_PATTERN2 = "dd/MM/yy"; //$NON-NLS-1$

	private static final Calendar CALENDAR = Calendar.getInstance();

	/**
	 * Common data format
	 */
	public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern(DATE_FORMAT_PATTERN);

	public static final DateTimeFormatter DATE_FORMAT2 = DateTimeFormatter.ofPattern(DATE_FORMAT_PATTERN2);

	private DateUtils() {
	}

	public static int getCurrentWeekNumber() {
		return CALENDAR.get(Calendar.WEEK_OF_YEAR);
	}

	public static String instantToDateString(Instant instant) {
		return DATE_FORMAT.format(instant.atZone(ZoneId.systemDefault()));
	}

	public static Instant dateStringToInstant(String dateString) {
		LocalDate date = null;
		try {

			date = LocalDate.parse(dateString, DATE_FORMAT);
		} catch (DateTimeParseException e) {
			date = LocalDate.parse(dateString, DATE_FORMAT2);
		}
		if (date != null) {
			return date.atStartOfDay(ZoneId.systemDefault()).toInstant();
		} else {
			return null;
		}
	}

}
