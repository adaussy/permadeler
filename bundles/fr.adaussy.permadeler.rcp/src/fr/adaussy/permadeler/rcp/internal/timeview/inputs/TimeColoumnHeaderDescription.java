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

/**
 * Desciption of the header of a column
 * 
 * @author Arthur Daussy
 */
public class TimeColoumnHeaderDescription {

	private final String label;

	private final Object data;

	public TimeColoumnHeaderDescription(String label, Object data) {
		super();
		this.label = label;
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public Object getData() {
		return data;
	}

}
