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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.EatingType;
import fr.adaussy.permadeler.rcp.internal.extractors.ExtractorFactory.SowType;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog to create a species
 * 
 * @author adaussy
 */
public class SpeciesCreationDialog extends Dialog {

	private URL url;

	private SowType sowType;

	private EatingType eatingType;

	private String initialURL;

	/**
	 * Simple constructor
	 * 
	 * @param shell
	 *            a {@link Shell}
	 * @param initialURL
	 *            inital URL
	 */
	public SpeciesCreationDialog(Shell shell, String initialURL) {
		super(shell);
		this.initialURL = initialURL;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);
		Composite container = new Composite(cc, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(2, false));

		Dialogs.createTextEntry(container, "URL", initialURL, t -> {
			try {
				url = new URL(t);
			} catch (MalformedURLException e) {
				url = null;
			}
		});

		Dialogs.createEnumEntry(container, "Sow type", SowType.values(), SowType.BOTH, e -> {
			sowType = (SowType)e;
		});

		Dialogs.createEnumEntry(container, "Type", EatingType.values(), EatingType.VEGETABLE, e -> {
			eatingType = (EatingType)e;
		});
		return cc;
	}

	/**
	 * Returns the sowType.
	 * 
	 * @return the sowType
	 */
	public SowType getSowType() {
		return sowType;
	}

	/**
	 * Returns the url.
	 * 
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * Returns the eatingType.
	 * 
	 * @return the eatingType
	 */
	public EatingType getEatingType() {
		return eatingType;
	}
}
