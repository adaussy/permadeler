/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.spreadsheet;

import java.util.function.Function;

public class ColumnExtractor<T> {

	private final String name;

	private final Function<T, String> valueExtractor;

	public static <U> ColumnExtractor<U> build(String name, Function<U, String> valueExtractor) {
		return new ColumnExtractor<U>(name, valueExtractor);
	}

	public ColumnExtractor(String name, Function<T, String> valueExtractor) {
		super();
		this.name = name;
		this.valueExtractor = valueExtractor;
	}

	public String getName() {
		return name;
	}

	public String extract(T value) {
		return valueExtractor.apply(value);
	}

}
