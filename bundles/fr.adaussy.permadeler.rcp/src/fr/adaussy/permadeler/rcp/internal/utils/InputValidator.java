/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.utils;

import java.util.regex.Pattern;

import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Text;

/**
 * Input validator that uses a a {@link Pattern} to validate inputs
 * 
 * @author Arthur Daussy
 */
public final class InputValidator implements VerifyListener {

	private final Pattern pattern;

	/**
	 * Simple constructor
	 * 
	 * @param pattern
	 *            a Pattern
	 */
	public InputValidator(Pattern pattern) {
		super();
		this.pattern = pattern;
	}

	/**
	 * Builds a pattern that only accept integer
	 * 
	 * @param isPositiveOnly
	 *            <code>false</code> to accept - sign
	 * @return a Pattern
	 */
	public static Pattern buildIntegerRegex(boolean isPositiveOnly) {
		StringBuilder builder = new StringBuilder();
		if (!isPositiveOnly) {
			builder.append("-?"); //$NON-NLS-1$
		}
		builder.append("\\d*"); //$NON-NLS-1$
		return Pattern.compile(builder.toString());
	}

	@Override
	public void verifyText(VerifyEvent e) {

		final Text text = (Text)e.getSource();

		// get old text and create new text by using the VerifyEvent.text
		final String oldS = text.getText();
		final String newS = oldS.substring(0, e.start) + e.text + oldS.substring(e.end);

		if (newS == null || newS.isEmpty()) {
			return;
		}
		if (!pattern.matcher(newS).matches()) {
			e.doit = false;
			return;
		}

	}

}
