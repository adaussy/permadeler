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

import org.eclipse.emf.ecore.EObject;

/**
 * Input used to fill a time view
 * 
 * @author Arthur Daussy
 */
public class TimeViewEditorInput {

	private final EObject target;

	private final List<TimeLineGroupDescription> timeLines;

	private List<TimeLineHeaderDescription> headers;

	private String queryName;

	public TimeViewEditorInput(String queryName, EObject target, List<TimeLineGroupDescription> timeLines,
			List<TimeLineHeaderDescription> headers) {
		super();
		this.queryName = queryName;
		this.target = target;
		this.timeLines = timeLines;
		this.headers = headers;
	}

	public String getQueryName() {
		return queryName;
	}

	public EObject getTarget() {
		return target;
	}

	public List<TimeLineGroupDescription> getTimeLines() {
		return timeLines;
	}

	public List<TimeLineHeaderDescription> getHeaders() {
		return headers;
	}

}
