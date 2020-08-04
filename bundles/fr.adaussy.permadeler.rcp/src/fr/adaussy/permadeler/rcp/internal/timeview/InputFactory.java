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

import static java.util.stream.Collectors.toList;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.utils.EMFUtils;
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

	/**
	 * Map that map feature to colors
	 */
	private static final Map<EStructuralFeature, String> FEATURE_TO_COLORS = new HashMap<EStructuralFeature, String>();

	static {
		FEATURE_TO_COLORS.put(PermadelerPackage.eINSTANCE.getSpecies_BloomMonths(), "#fcffe3");
		FEATURE_TO_COLORS.put(PermadelerPackage.eINSTANCE.getSpecies_PruningMonths(), "#fc00e3");
		FEATURE_TO_COLORS.put(PermadelerPackage.eINSTANCE.getPlant_SowIndoorMonths(), "#ffd154");
		FEATURE_TO_COLORS.put(PermadelerPackage.eINSTANCE.getPlant_SowOutdoorMonths(), "#6ee858");
	}

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
		if (from instanceof KnowledgeBase) {
			if (SOW_PERIOD.equals(query)) {
				result = buildSowPeriods(query, (KnowledgeBase)from);
			}
			return buildAllContent(query, from);
		} else if (from instanceof Genus) {
			result = buildAllContent(query, from);
		} else if (from instanceof SeedBank) {
			if (SOW_PERIOD.equals(query)) {
				result = buildSowPeriods(query, (SeedBank)from);
			}
		} else if (from instanceof Planifier) {
			if (SOW_PERIOD.equals(query)) {
				result = buildSowPeriods(query, (Planifier)from);
			}
		}
		return result;
	}

	/**
	 * Builds a sow perdiod from a {@link Planifier} object
	 * 
	 * @param query
	 *            the name of the query
	 * @param from
	 *            the source object
	 * @return a new {@link TimeViewEditorInput}
	 */
	private TimeViewEditorInput buildSowPeriods(String query, Planifier from) {
		List<TimeLineGroupDescription> inputs = new ArrayList<TimeLineGroupDescription>();

		from.getPlanfications().stream()//
				.filter(p -> p instanceof SowPlanfication && ((SowPlanfication)p).getType() != null)
				.map(p -> (SowPlanfication)p)//
				.sorted(Comparator.comparing(e -> e.getType().getName())).collect(toList())
				.forEach(sowPlan -> {
					List<TimeLineDescription> entries = new ArrayList<TimeLineDescription>(1);
					final TimeLineDescription entry;
					if (sowPlan.getType() == SowType.INDOOR) {
						entry = new TimeLineDescription(() -> "Indoor",
								FEATURE_TO_COLORS.get(PermadelerPackage.eINSTANCE.getPlant_SowIndoorMonths()),
								() -> sowPlan.getWeeks());
					} else {
						entry = new TimeLineDescription(() -> "Outdoor",
								FEATURE_TO_COLORS
										.get(PermadelerPackage.eINSTANCE.getPlant_SowOutdoorMonths()),
								() -> sowPlan.getWeeks());
					}
					entries.add(entry);
					inputs.add(new TimeLineGroupDescription(sowPlan.getSeed(), entries));
				});

		return new TimeViewEditorInput(query, from, inputs, buildMonthWeekHeader());
	}

	private TimeViewEditorInput buildSowPeriods(String query, KnowledgeBase from) {
		return new TimeViewEditorInput(query, from,
				EMFUtils.getChildren(from, Plant.class).map(this::createSowInput).collect(toList()),
				buildMonthWeekHeader());
	}

	/**
	 * Builds a sow perdiod from a {@link SeedBank} object
	 * 
	 * @param query
	 *            the name of the query
	 * @param from
	 *            the source object
	 * @return a new {@link TimeViewEditorInput}
	 */
	private TimeViewEditorInput buildSowPeriods(String query, SeedBank from) {
		List<TimeLineGroupDescription> inputs = new ArrayList<TimeLineGroupDescription>();
		for (SeedItem item : from.getItems()) {
			Species species = item.getType();
			if (species instanceof Plant) {
				inputs.add(createSowInput(species));
			}
		}
		return new TimeViewEditorInput(query, from, inputs, buildMonthWeekHeader());
	}

	protected TimeLineGroupDescription createSowPlanificationInput(Species species) {
		return create(species, List.of(PermadelerPackage.eINSTANCE.getPlanfication_Weeks()));
	}

	protected TimeLineGroupDescription createSowInput(Species species) {
		return create(species, List.of(PermadelerPackage.eINSTANCE.getPlant_SowIndoorMonths(),
				PermadelerPackage.eINSTANCE.getPlant_SowOutdoorMonths()));
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

	/**
	 * Builds a {@link TimeViewEditorInput} for all Species contained in a given object
	 * 
	 * @param query
	 *            the name of the query
	 * @param from
	 *            a source object
	 * @return a new {@link TimeViewEditorInput}
	 */
	private TimeViewEditorInput buildAllContent(String query, EObject from) {
		TreeIterator<EObject> contentIte = from.eAllContents();
		List<TimeLineGroupDescription> inputs = new ArrayList<TimeLineGroupDescription>();
		while (contentIte.hasNext()) {
			EObject eObject = contentIte.next();
			if (eObject instanceof Species) {
				Species species = (Species)eObject;
				inputs.add(create(species, List.of(PermadelerPackage.eINSTANCE.getSpecies_BloomMonths(),
						PermadelerPackage.eINSTANCE.getSpecies_PruningMonths())));
			}
		}

		return new TimeViewEditorInput(query, from, inputs, buildMonthWeekHeader());
	}

	/**
	 * Creates a TimeLineGroupDescription for the given {@link Species} and a list of features
	 * 
	 * @param s
	 *            a species
	 * @param features
	 *            a list of feature that return a list of integer
	 * @return a new TimeLineGroupDescription
	 */
	private TimeLineGroupDescription create(Species s, List<EStructuralFeature> features) {

		if (features.isEmpty()) {
			return new TimeLineGroupDescription(s, Collections.emptyList());
		}
		List<TimeLineDescription> entries = new ArrayList<TimeLineDescription>(features.size());
		for (EStructuralFeature f : features) {
			@SuppressWarnings("unchecked")
			TimeLineDescription entry = new TimeLineDescription(() -> f.getName(), FEATURE_TO_COLORS.get(f),
					() -> (List<Integer>)s.eGet(f));
			entries.add(entry);
		}

		return new TimeLineGroupDescription(s, entries);

	}

}
