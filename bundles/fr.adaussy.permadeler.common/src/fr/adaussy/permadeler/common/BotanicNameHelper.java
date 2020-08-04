/**
 *  Copyright (c) 2020 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.common;

import java.util.regex.Pattern;

/***
 * Helper class for method related to botanic name
 * 
 * @author Arthur Daussy
 */
public final class BotanicNameHelper {

	/**
	 * Pattern to detect latin name
	 * <p>
	 * <ul>
	 * <li>Group 1 : Genus</li>
	 * <li>Group 2 : Sub genus</li>
	 * <li>Group 3 (optional species)</li>
	 * </ul>
	 * </p>
	 */
	public static final Pattern LATIN_NAME = Pattern.compile("([\\w-\\d]*)\\s*([^']*)?('([^']*)')?"); //$NON-NLS-1$

	private BotanicNameHelper() {
	}

}
