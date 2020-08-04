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

/**
 * Description of the header of a time line
 * 
 * @author Arthur Daussy
 */
public class TimeLineHeaderDescription {

	private final String label;

	private final Object data;

	private final List<TimeColoumnHeaderDescription> entries;

	public TimeLineHeaderDescription(String label, Object data, List<TimeColoumnHeaderDescription> entries) {
		super();
		this.label = label;
		this.data = data;
		this.entries = entries;
	}

	public String getLabel() {
		return label;
	}

	public Object getData() {
		return data;
	}

	public List<TimeColoumnHeaderDescription> getEntries() {
		return entries;
	}

}
