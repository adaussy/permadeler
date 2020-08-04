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
 * Description of line in a time view
 * 
 * @author Arthur Daussy
 */
public class TimeLineGroupDescription {

	private final EObject target;

	private final List<TimeLineDescription> entries;

	/**
	 * Simple constructor
	 * 
	 * @param target
	 *            the semantic target
	 * @param entries
	 *            the entries
	 */
	public TimeLineGroupDescription(EObject target, List<TimeLineDescription> entries) {
		super();
		this.target = target;
		this.entries = entries;
	}

	public EObject getTarget() {
		return target;
	}

	public List<TimeLineDescription> getEntries() {
		return entries;
	}

}
