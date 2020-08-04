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

import static java.util.stream.Collectors.toSet;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Sets;

import fr.adaussy.permadeler.common.date.DateUtils;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.dialogs.MonthWeekDialog;

/**
 * Class gathering month services. In this service we that a quarter-monthly is one fourth of a month. There
 * is (12 * 4) = 48 quarter-monthly in a year numbered from 1 to 48
 */
@SuppressWarnings("all")
public class MonthService {

	private static final String FULL_MONTH_LABEL = "X";

	/**
	 * Opens a dialog that propose to the user to select weeks
	 * 
	 * @param sourceObject
	 *            the semantic object
	 * @param featureName
	 *            the name of the feature that returns a list of {@link Integer}
	 * @param message
	 *            the message to display to the user
	 */
	public void editMonthQuarter(final EObject sourceObject, final String featureName, final String message) {
		final List<Integer> montWeeks = this.getMonthsWeek(sourceObject, featureName);
		final MonthWeekDialog dialog = new MonthWeekDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), message, montWeeks);
		if (dialog.open() == Dialog.OK) {
			montWeeks.clear();
			montWeeks.addAll(dialog.getMonths());
		}
	}

	/**
	 * Gets the list of month labels that represent the value of the given feature (which return a list of
	 * monthly-quarter). The label can either be the name of the month or ( w1,w2... quarter)
	 * 
	 * @param eObject
	 *            the source {@link EObject}
	 * @param featureName
	 *            a feature which return a list of quarter monthly
	 * @return a list of label
	 */
	public List<String> getMonths(final EObject eObject, final String featureName) {
		final List<Integer> monthsWeeks = this.getMonthsWeek(eObject, featureName);
		final List<String> result = new ArrayList<String>();
		for (final Month m : Month.values()) {
			final int monthNumber = m.ordinal() + 1;
			final String currentLabel = this.getMonthLabel(monthNumber, monthsWeeks);
			if ((currentLabel != null) && (!currentLabel.isEmpty())) {
				String label = m.toString();
				if (!FULL_MONTH_LABEL.equals(currentLabel)) {
					label = label + ((" (" + currentLabel) + " quarter)");
				}
				result.add(label);
			}
		}
		return result;
	}

	/**
	 * Gets the label to be used for the given month. It either returns:
	 * <p>
	 * <ul>
	 * <li>X = if all quarter of the selected month belong to monthsWeeks</li>
	 * <li>w1,w2.. = if only some quarter of the selected month belong to monthsWeeks where wX belong to
	 * [1,4]</li>
	 * <li>"" = if no quarter of the selected month belong to monthsWeeks</li>
	 * </ul>
	 * </p>
	 * 
	 * @param monthNum
	 *            the number of the selected month[1,12]
	 * @param quaterMonthlys
	 *            numbers of quarter-monthly
	 * @return a label
	 */
	public String getMonthLabel(final int monthNum, final List<Integer> quaterMonthlys) {
		final int start = monthFirstWeek(monthNum);
		final int end = monthLastQuater(monthNum);
		List<Integer> weeks = new ArrayList<Integer>();
		for (final Integer i : quaterMonthlys) {
			if (i.intValue() >= start && i.intValue() <= end) {
				weeks.add(i);
			}
		}
		if (weeks.isEmpty()) {
			return "";
		} else {
			if (weeks.size() == 4) {
				return FULL_MONTH_LABEL;
			} else {
				return weeks.stream().<String> map(it -> {
					return this.toQuarterNumber((it.intValue() % 4) + 1);
				}).collect(Collectors.joining(","));
			}
		}
	}

	/**
	 * Gets a label for the given quarter number
	 * 
	 * @param i
	 *            a number in range [1,4]
	 * @return a label or "??" if invalid value
	 */
	// CHECKSTYLE:OFF basic switch pattern
	private String toQuarterNumber(final int i) {
		switch (i) {
			case 1:
				return "1st";
			case 2:
				return "2nd";
			case 3:
				return "3rd";
			case 4:
				return "4th";
			default:
				return "??";
		}
	}
	// CHECKSTYLE:ON basic switch pattern

	/**
	 * Get the label of a cell in a Table representing tree information
	 * 
	 * @param eObject
	 *            the feature owner
	 * @param featureName
	 *            the name of the month feature (feature of type MonthWeek of cardinality *)
	 * @param monthNum
	 *            the month number (1 -> January ... 12 -> December)
	 * @return "" : If the feature does not have week of the specified month "X" : If the feature have all
	 *         weeks of the specified month "[x1,x2,x3,x4]" : The number of week match (x � [1...4])
	 */
	public String getMonthLabel(final EObject eObject, final String featureName, final int monthNum) {
		final List<Integer> monthsWeeks = this.getMonthsWeek(eObject, featureName);
		return this.getMonthLabel(monthNum, monthsWeeks);
	}

	/**
	 * Modify a months feature from a given string
	 * 
	 * @param eObject
	 *            the feature owner
	 * @param featureName
	 *            the name of the month feature (feature of type MonthWeek of cardinality *)
	 * @param monthNb
	 *            the month number (1 -> January ... 12 -> December)
	 * @param value
	 *            The value can have the following value "" : If the feature does not have week of the
	 *            specified month "X" : If the feature have all weeks of the specified month "[x1,x2,x3,x4]" :
	 *            The number of week match (x in [1...4])
	 */
	public void setMonthLabel(final EObject eObject, final String featureName, final int monthNb,
			final String value) {
		if ((monthNb <= 0) || (monthNb > DateUtils.NB_OF_MONTHS)) {
			RcpPlugin.getDefault().logError("Expecting month range 1 -> 12");
			return;
		}
		final List<Integer> monthsWeeks = this.getMonthsWeek(eObject, featureName);
		final Set<Integer> valueWeek;
		if ((value == null) || value.isBlank()) {
			valueWeek = Collections.<Integer> emptySet();
		} else {
			if (value.equalsIgnoreCase(FULL_MONTH_LABEL)) {
				valueWeek = Sets.newHashSet(getMonthWeeks(monthNb).boxed().collect(toSet()));
			} else {
				valueWeek = Stream.of(value.trim().split(","))//
						.mapToInt(it -> (Integer.valueOf(it)).intValue())//
						.filter(it -> (it > 0) && (it <= DateUtils.NB_OF_QUARTER))//
						.map(it -> MonthService.toYearMonthlyQuarter(it, monthNb)).boxed()
						.collect(Collectors.<Integer> toSet());
			}
		}

		getMonthWeeks(monthNb).boxed().forEach(w -> {
			if (valueWeek.contains(w) && (!monthsWeeks.contains(w))) {
				monthsWeeks.add(w);
			} else {
				if ((!valueWeek.contains(w)) && monthsWeeks.contains(w)) {
					monthsWeeks.remove(w);
				}
			}
		});
	}

	/**
	 * Transform a week year (x in [1..4*12]) to a month week (x in [1..4])
	 * 
	 * @param monthyQuarter
	 *            int in range [1,4]
	 * @param monthNb
	 *            number of the month [1,12]
	 * @return the monthly quarter number relative to the a year [1,48]
	 */
	public static int toYearMonthlyQuarter(final int monthyQuarter, final int monthNb) {
		return monthyQuarter + ((monthNb - 1) * 4);
	}

	/**
	 * Gets the fist week of a given month in a year week (January -> 1, February -> 5,March -> 9 etc...)
	 * 
	 * @param monthNb
	 *            the month number (Jan = 1, Feb = 2 etc..)
	 * @return the number of the first week of the selected month
	 */
	public static int monthFirstWeek(final int monthNb) {
		return (monthNb - 1) * 4 + 1;
	}

	public static IntStream getMonthWeeks(final int monthNB) {
		return IntStream.rangeClosed(monthFirstWeek(monthNB), monthLastQuater(monthNB));
	}

	/**
	 * Get the last monthly quarter of a given month in a year week (January -> 4, February -> 8,March -> 12
	 * etc...)
	 * 
	 * @param monthNb
	 *            number of the month
	 * @return the monthly quarter number [1,48]
	 */
	public static int monthLastQuater(final int monthNb) {
		return monthNb * 4;
	}

	/**
	 * Returns <code>true</code> if the month feature has at least one quarter of the given month
	 * 
	 * @param eObject
	 *            the feature owner
	 * @param featureName
	 *            the name of the month feature (feature of type MonthWeek of cardinality *)
	 * @param monthNb
	 *            the month number (1 -> January ... 12 -> December)
	 * @return <code>true</code> if one of the monthly quarter belong to the selected month
	 */
	public boolean hasMonth(final EObject eObject, final String featureName, final int monthNb) {
		if ((monthNb <= 0) || (monthNb > DateUtils.NB_OF_MONTHS)) {
			RcpPlugin.getDefault().logError("Expecting month range 1 -> 12");
			return false;
		}
		final List<Integer> monthsWeeks = this.getMonthsWeek(eObject, featureName);
		final int start = this.monthFirstWeek(monthNb);
		final int end = this.monthLastQuater(monthNb);
		for (final Integer i : monthsWeeks) {
			if ((i.intValue() >= start) && (i.intValue() <= end)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the list of monthly quarter from a given feature
	 * 
	 * @param eObject
	 *            the feature owner
	 * @param featureName
	 *            the name of the month feature (feature of type MonthWeek of cardinality *)
	 * @return list of weeks ( [4,5,6,7] -> All week of February)
	 */
	protected List<Integer> getMonthsWeek(final EObject eObject, final String featureName) {
		final EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
		if (feature == null) {
			RcpPlugin.getDefault().logError("Unknwon feature " + feature);
		}
		if (!PermadelerPackage.eINSTANCE.getMonthWeek().equals(feature.getEType())) {
			RcpPlugin.getDefault().logError("Expecting feature of type Month");
			return Collections.emptyList();
		}
		return (List<Integer>)eObject.eGet(feature);
	}
}
