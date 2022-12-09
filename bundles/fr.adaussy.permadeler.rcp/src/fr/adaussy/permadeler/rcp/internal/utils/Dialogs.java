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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Function;

/**
 * Helper class for dialogs
 * 
 * @author Arthur Daussy
 */
public final class Dialogs {

	private Dialogs() {
	}

	/**
	 * Getgs a String from the clip board
	 * 
	 * @param display
	 *            a {@link Display}
	 * @return a String or emtpy
	 */
	public static String getStringFromClipboard(Display display) {
		final Clipboard cb = new Clipboard(display);
		final TextTransfer transfer = TextTransfer.getInstance();
		final Object data = cb.getContents(transfer);
		if (data instanceof String) {
			return (String)data;
		}
		return ""; //$NON-NLS-1$
	}

	public static Button createCheckEntry(Composite parent, String label, boolean initValue,
			Consumer<Boolean> updater) {

		Button checkWidget = new Button(parent, SWT.CHECK);
		checkWidget.setText(label);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = 2;
		checkWidget.setLayoutData(layoutData);
		checkWidget.setSelection(initValue);

		checkWidget.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				updater.accept(checkWidget.getSelection());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updater.accept(checkWidget.getSelection());

			}
		});
		updater.accept(initValue);

		return checkWidget;

	}

	/**
	 * Creates a enumeration entry
	 * 
	 * @param parent
	 *            a parent composite
	 * @param label
	 *            the label
	 * @param values
	 *            the possible values
	 * @param defaultvalue
	 *            the default valuer
	 * @param updater
	 *            value updater
	 * @return
	 */
	// CHECKSTYLE:OFF UI needs refactoring

	public static List<Button> createEnumEntry(Composite parent, String label, Enum<?>[] values,
			Enum<?> defaultvalue, Consumer<Enum<?>> updater, Function<Enum<?>, String> labelProvider) {
		createLabel(parent, label);

		Group enumGroup = new Group(parent, SWT.NONE);
		enumGroup.setLayout(new RowLayout(SWT.HORIZONTAL));

		List<Button> buttons = new ArrayList<Button>();
		for (Enum<?> e : values) {
			Button enumWidget = WidgetFactory.button(SWT.RADIO)//
					.text(labelProvider.apply(e))//
					.create(enumGroup);
			if (e == defaultvalue) {
				enumWidget.setSelection(true);
			}
			buttons.add(enumWidget);
			enumWidget.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					if (enumWidget.getSelection()) {
						updater.accept(e);
					}
				}
			});

			updater.accept(defaultvalue);
		}

		return buttons;
	}
	// CHECKSTYLE:ON UI needs refactoring

	public static List<Button> createEnumEntry(Composite parent, String label, Enum<?>[] values,
			Enum<?> defaultvalue, Consumer<Enum<?>> updater) {
		return createEnumEntry(parent, label, values, defaultvalue, updater, e -> e.name());
	}

	/**
	 * Creates a text entry
	 * 
	 * @param parent
	 *            a parent composite
	 * @param label
	 *            a label
	 * @param initValue
	 *            the initial value
	 * @param updater
	 *            the value consumer
	 * @return a {@link Text}
	 */
	public static Text createTextEntry(Composite parent, String label, String initValue,
			Consumer<String> updater) {
		createLabel(parent, label);

		Text valueWidget = WidgetFactory.text(SWT.BORDER)//
				.layoutData(new GridData(GridData.FILL_HORIZONTAL))//
				.text(initValue)//
				.create(parent);

		valueWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updater.accept(valueWidget.getText());
			}
		});
		if (initValue != null) {
			updater.accept(initValue);
		}

		return valueWidget;

	}

	/**
	 * Creates an integers entry
	 * 
	 * @param parent
	 *            the parent composite
	 * @param label
	 *            the label of the entry
	 * @param initValue
	 *            the initial value
	 * @param updater
	 *            the value consumer
	 * @return a {@link Text}
	 */
	public static Text createIntEntry(Composite parent, String label, int initValue, IntConsumer updater) {
		createLabel(parent, label);

		Text valueWidget = WidgetFactory.text(SWT.None)//
				.layoutData(new GridData(GridData.FILL_HORIZONTAL))//
				.text(String.valueOf(initValue))//
				.create(parent);

		valueWidget.addVerifyListener(new InputValidator(InputValidator.buildRegex(true, false)));

		valueWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updater.accept(Integer.valueOf(valueWidget.getText()));
			}
		});
		updater.accept(initValue);

		return valueWidget;

	}

	public static Text createDoubleEntry(Composite parent, String label, double initValue,
			DoubleConsumer updater) {

		createLabel(parent, label);

		Text valueWidget = new Text(parent, SWT.None);
		valueWidget.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if (!Double.isNaN(initValue)) {
			valueWidget.setText(String.valueOf(initValue));
		}

		valueWidget.addVerifyListener(new InputValidator(InputValidator.buildRegex(false, true)));

		valueWidget.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				String text = valueWidget.getText();
				if (text != null && !text.isEmpty()) {

					updater.accept(Double.valueOf(text));
				} else {
					updater.accept(Double.NaN);
				}
			}
		});
		updater.accept(initValue);

		return valueWidget;

	}

	public static Label createLabel(Composite parent, String label) {
		return WidgetFactory.label(SWT.None)//
				.layoutData(new GridData(GridData.BEGINNING))//
				.text(label).create(parent);
	}
}
