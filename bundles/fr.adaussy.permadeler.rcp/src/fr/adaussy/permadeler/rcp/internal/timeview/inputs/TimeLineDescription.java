/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.timeview.inputs;

import java.util.List;
import java.util.function.Supplier;

import fr.adaussy.permadeler.model.Permadeler.TemporalItem;

/**
 * Description of a time line
 * 
 * @author Arthur Daussy
 */
public class TimeLineDescription {

	private final String color;

	private Supplier<String> entryLabel;

	private TemporalItem temporalItem;

	public TimeLineDescription(Supplier<String> entryLabel, String color, TemporalItem temporalItem) {
		super();
		this.entryLabel = entryLabel;
		this.color = color;
		this.temporalItem = temporalItem;
	}

	public String getColor() {
		return color;
	}

	public Supplier<List<Integer>> getWeeks() {
		return () -> temporalItem.getPeriod();
	}

	public Supplier<String> getEntryLabel() {
		return entryLabel;
	}

	public TemporalItem getTemporalItem() {
		return temporalItem;
	}

}
