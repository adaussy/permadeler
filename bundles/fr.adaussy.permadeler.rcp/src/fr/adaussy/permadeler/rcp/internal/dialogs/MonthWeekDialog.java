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

import static java.util.stream.Collectors.toList;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.services.MonthService;

/**
 * Dialog used to select month in a year
 * 
 * @author Arthur Daussy
 */
@SuppressWarnings("all")
public class MonthWeekDialog extends MessageDialog {
	// TODO :
	private final List<Integer> monthWeeks;

	private Composite cc;

	public MonthWeekDialog(final Shell parentShell, final String message, final List<Integer> monthWeeks) {
		super(parentShell, "Weeks by month", null, "Update week month", MessageDialog.INFORMATION,
				new String[] {"Ok", "Cancel" }, 0);
		this.monthWeeks = new ArrayList<Integer>(monthWeeks);
	}

	// TODO: This code was generated using Xtend
	// Rewrite it using proper Java
	// CHECKSTYLE:OFF See above
	@Override
	protected Control createCustomArea(final Composite parent) {
		this.cc = new Composite(parent, SWT.NONE);
		this.cc.setLayout(new GridLayout(13, true));
		final Label monthWeekHeaderLabel = new Label(this.cc, SWT.NONE);
		monthWeekHeaderLabel.setText("Week\\Months");
		monthWeekHeaderLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
		Month[] values = Month.values();
		for (final Month m : values) {
			final int monthNb = m.ordinal() + 1;
			final Button monthLabel = new Button(this.cc, SWT.TOGGLE);
			monthLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
			monthLabel.setText(m.toString());

			List<Integer> matchingWeek = MonthService.getMonthWeeks(monthNb).boxed().collect(toList());
			monthLabel.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					boolean selection = monthLabel.getSelection();
					if (selection) {
						MonthWeekDialog.this.monthWeeks.addAll(matchingWeek);
					} else {
						MonthWeekDialog.this.monthWeeks.removeAll(matchingWeek);
					}
					MonthWeekDialog.this.updateButtons();
				}
			});
			monthLabel.setData(matchingWeek);
		}
		for (int i = 1; (i <= 4); i++) {
			final Label weekHeader = new Label(this.cc, SWT.NONE);
			weekHeader.setText(("Week " + Integer.valueOf(i)));
			weekHeader.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
			for (final Month month : Month.values()) {
				{
					final int monthNb = month.ordinal() + 1;
					final int yearWeak = MonthService.toYearMonthlyQuarter(i, monthNb);
					final Button button = new Button(this.cc, SWT.CHECK);
					button.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
					button.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(final SelectionEvent e) {
							if (button.getSelection()) {
								MonthWeekDialog.this.monthWeeks.add(Integer.valueOf(yearWeak));
							} else {
								MonthWeekDialog.this.monthWeeks.remove(Integer.valueOf(yearWeak));
							}
							MonthWeekDialog.this.updateButtons();
						}
					});
					button.setData(Collections.singletonList(Integer.valueOf(yearWeak)));
				}
			}
		}
		this.updateButtons();
		return this.cc;
	}

	private void updateButtons() {
		final Predicate<Control> _function = (Control it) -> {
			return (it instanceof Button);
		};
		final Function<Control, Button> _function_1 = (Control it) -> {
			return ((Button)it);
		};
		final Consumer<Button> _function_2 = (Button it) -> {
			Object _data = it.getData();
			final List<Integer> data = ((List<Integer>)_data);
			boolean _containsAll = this.monthWeeks.containsAll(data);
			if (_containsAll) {
				it.setSelection(true);
			} else {
				it.setSelection(false);
			}
		};
		Stream.<Control> of(this.cc.getChildren()).filter(_function).<Button> map(_function_1)
				.forEach(_function_2);
	}
	// CHECKSTYLE:ON

	public List<Integer> getMonths() {
		return this.monthWeeks.stream().sorted().collect(Collectors.<Integer> toList());
	}
}
