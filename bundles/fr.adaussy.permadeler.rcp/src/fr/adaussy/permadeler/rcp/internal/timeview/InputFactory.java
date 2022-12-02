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
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.TemporalItem;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeColoumnHeaderDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineGroupDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineHeaderDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeViewEditorInput;
import fr.adaussy.permadeler.rcp.services.MonthService;

/**
 * Factory used to create {@link TimeViewEditorInput}
 * 
 * @author Arthur Daussy
 */
public final class InputFactory {

	/**
	 * Single instance
	 */
	public static final InputFactory INSTANCE = new InputFactory();

	/**
	 * Sow period query name
	 */
	public static final String SOW_PERIOD = "SOW_PERIOD";

	private InputFactory() {
	}

	/**
	 * Builds a {@link TimeViewEditorInput} from a query name and source {@link EObject}
	 * 
	 * @param query
	 *            the name of the query
	 * @param from
	 *            the source object
	 * @return a {@link TimeViewEditorInput} or <code>null</code>
	 */
	public TimeViewEditorInput build(String query, EObject from) {
		TimeViewEditorInput result = new TimeViewEditorInput(query, from, Collections.emptyList(),
				buildMonthWeekHeader());

		Predicate<TemporalItem> predicate = buildFromQuery(query);
		TreeIterator<EObject> contentIte = from.eAllContents();
		while (contentIte.hasNext()) {
			EObject next = contentIte.next();
			if (next instanceof Plant) {
				Plant variety = (Plant)next;
				create(variety, predicate);
			} else if (next instanceof SeedItem) {
				create(((SeedItem)next).getType(), predicate);
			} else if (next instanceof Plantation) {
				create(((Plantation)next).getType(), predicate);
			}
		}
		return result;
	}

	/**
	 * Builds a month week header
	 * 
	 * @return a list of {@link TimeLineHeaderDescription}
	 */
	private List<TimeLineHeaderDescription> buildMonthWeekHeader() {
		List<TimeLineHeaderDescription> result = new ArrayList<TimeLineHeaderDescription>();
		for (Month m : Month.values()) {
			int monthNb = m.ordinal() + 1;
			List<TimeColoumnHeaderDescription> entries = new ArrayList<TimeColoumnHeaderDescription>();
			int firstWeek = MonthService.monthFirstWeek(monthNb);
			for (int i = MonthService.monthFirstWeek(monthNb); i <= MonthService
					.monthLastQuater(monthNb); i++) {
				entries.add(new TimeColoumnHeaderDescription(String.valueOf(i - firstWeek + 1), i));
			}
			result.add(new TimeLineHeaderDescription(m.getDisplayName(TextStyle.SHORT, Locale.getDefault()),
					m, entries));
		}

		return result;
	}

	private Predicate<TemporalItem> buildFromQuery(String query) {
		if (SOW_PERIOD.equals(query)) {
			return p -> p instanceof Action && ((Action)p).getType().toString().toLowerCase().contains("sow");
		} else {
			return p -> true;
		}
	}

	private TimeLineGroupDescription create(Plant s, Predicate<TemporalItem> predicate) {

		List<TimeLineDescription> entries = new ArrayList<TimeLineDescription>();
		Stream.concat(s.getActions().stream(), s.getProductions().stream()).filter(predicate).forEach(f -> {
			TimeLineDescription entry = new TimeLineDescription(() -> f.getName(), getColor(f), f);
			entries.add(entry);

		});

		return new TimeLineGroupDescription(s, entries);

	}

	private String getColor(TemporalItem tmpItem) {
		if (tmpItem instanceof Action) {
			Action action = (Action)tmpItem;
			return switch (action.getType()) {
				case SOW_INDOOR -> "#eba834";
				case SOW_OUTDOOR -> "#346beb";
				case PRUNING -> "#44c740";
				default -> "#545454";
			};
		} else if (tmpItem instanceof Production) {
			Production prod = (Production)tmpItem;
			return switch (prod.getType()) {
				case FRUIT -> "#cc731f";
				case LEAVES -> "#1fcc4d";
				case FLOWER -> "#f2ec3d";
				case OTHER -> "#969696";
				case SHOOTS -> "#80ff59";
				case MANNA -> "#ffffff";
				case SAP -> "#e0ffcf";
				case APICAL_BUD -> "#94c47a";
				case SEED -> "#a17f45";
				default -> "#545454";
			};
		} else {
			return "#000000";
		}
	}

}
