/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dialogs;

import java.util.Date;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Selection dialog that offers a way to enter a date
 * 
 * @param <T>
 *            type of object that van be selected
 * @author Arthur Daussy
 */
public class ObjectSelectionDialogWithDate<T extends EObject> extends ObjectSelectionDialog<T> {

	private Date date;

	/**
	 * Simple constructor
	 * 
	 * @param parentShell
	 *            a parent {@link Shell}
	 * @param type
	 *            the type of object to be selected
	 * @param filter
	 *            a filter
	 * @param root
	 *            the root object holding all choices
	 * @param initialDate
	 *            an initial {@link Date}
	 */
	// CHECKSTYLE:OFF UI.. Not really go to be reworked
	protected ObjectSelectionDialogWithDate(Shell parentShell, Class<T> type, Predicate<T> filter,
			EObject root, Date initialDate) {
		super(parentShell, type, filter, root);
		this.date = initialDate;
	}
	// CHECKSTYLE:ON UI.. Not really go to be reworked

	@Override
	protected boolean hasCustomContent() {
		return true;
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		final CDateTime cdt = new CDateTime(parent, CDT.BORDER | CDT.SIMPLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		cdt.setLayoutData(gd);
		if (date != null) {
			cdt.setSelection(date);
		}
		cdt.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				date = cdt.getSelection();
			}
		});
	}

	public Date getDate() {
		return date;
	}

}
