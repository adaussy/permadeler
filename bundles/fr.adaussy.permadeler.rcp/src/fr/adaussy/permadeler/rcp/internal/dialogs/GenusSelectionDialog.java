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

import java.util.Collections;
import java.util.function.Predicate;
import java.util.regex.Matcher;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.common.BotanicNameHelper;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.rcp.services.FillService;

/**
 * Dialog used to select a genus
 * 
 * @author Arthur Daussy
 */
public class GenusSelectionDialog extends ObjectSelectionDialog<Genus> {

	/**
	 * Handler that handle the creation of a new genus
	 * 
	 * @author Arthur Daussy
	 */
	private final class NewGenusActionHandler extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			NewGenusDialog dialog = new NewGenusDialog(getShell(), base);
			if (dialog.open() == Dialog.OK) {
				if (dialog.getMatch() != null) {
					setSelection(Collections.singletonList(dialog.getMatch()));
				} else {

					String latinName = dialog.getLatinName();
					if (!Strings.isNullOrEmpty(latinName)) {
						Genus result = searchMatch(latinName);
						String commonName = dialog.getCommonName();
						if (!Strings.isNullOrEmpty(commonName)) {
							result.setName(commonName);
						}
						resetInputs();
						setSelection(Collections.singletonList(result));

					}
				}
			}
		}

		/**
		 * Search a {@link Genus} matching the given latin name
		 * 
		 * @param latinName
		 *            a latin name
		 * @return a Genus
		 */
		private Genus searchMatch(String latinName) {
			Matcher matcher = BotanicNameHelper.LATIN_NAME.matcher(latinName.trim().toLowerCase());
			Genus result = null;
			if (matcher.matches()) {
				String genusName = matcher.group(1);
				result = FillService.getOrCreateGenus(base, genusName);
				if (matcher.groupCount() > 2) {
					String subGenusName = matcher.group(2);
					if (!Strings.isNullOrEmpty(subGenusName)) {
						result = FillService.getOrCreateSubGenus(result, genusName + ' ' + subGenusName);
					}
				}
			}
			return result;
		}
	}

	private KnowledgeBase base;

	public GenusSelectionDialog(Shell parentShell, Predicate<Genus> filter, KnowledgeBase root) {
		super(parentShell, Genus.class, filter, root);
		this.base = root;
	}

	@Override
	protected void fillCustomContent(Composite parent) {
		Button createNewButton = new Button(parent, SWT.PUSH);
		createNewButton.setText("New genus");
		createNewButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		createNewButton.addSelectionListener(new NewGenusActionHandler());
	}

	@Override
	protected boolean hasCustomContent() {
		return true;
	}

}
