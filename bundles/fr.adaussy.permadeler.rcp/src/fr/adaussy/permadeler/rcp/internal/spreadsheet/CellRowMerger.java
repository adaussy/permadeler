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

import java.util.function.BiFunction;

/**
 * Object in charge of merging cells between one or more lines
 * 
 * @author Arthur Daussy
 * @param <T>
 */
public class CellRowMerger<T> {

	private final int startColumn;

	private final int endColumn;

	private final BiFunction<T, T, Boolean> mergeTest;

	public CellRowMerger(int startColumn, int endColumn, BiFunction<T, T, Boolean> mergeTest) {
		super();
		this.startColumn = startColumn;
		this.endColumn = endColumn;
		this.mergeTest = mergeTest;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public BiFunction<T, T, Boolean> getMergeTest() {
		return mergeTest;
	}

}
