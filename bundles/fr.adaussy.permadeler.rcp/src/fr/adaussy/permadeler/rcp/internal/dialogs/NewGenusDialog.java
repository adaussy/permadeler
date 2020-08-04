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

import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.ext.emf.edit.EditingDomainServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog to create a new genus
 * 
 * @author Arthur Daussy
 */
public class NewGenusDialog extends Dialog {

	private final KnowledgeBase base;

	private String genusLatinName;

	private String commonName;

	private Genus match;

	private GenusFilter filter;

	private AdapterFactoryLabelProvider labelProvider;

	private Label matchingLabel;

	private Label matchingImage;

	private Consumer<String> commonNameSetter = sg -> {
		this.commonName = sg;
		filter.setCommonNameFilter(commonName);
		updateMatchingLabel();
	};

	private Consumer<String> genusSetter = sg -> {
		this.genusLatinName = sg;
		filter.setGenusNameFilter(genusLatinName);
		updateMatchingLabel();
	};

	/**
	 * Simple constructor
	 * 
	 * @param parentShell
	 *            a parent {@link Shell}
	 * @param base
	 *            the knowledge base
	 */
	public NewGenusDialog(Shell parentShell, KnowledgeBase base) {
		super(parentShell);
		this.base = base;
		this.filter = new GenusFilter(EMFUtils.getChildren(base, Genus.class).collect(toList()));
	}

	/**
	 * Updates the matching filed (label and image)
	 */
	private void updateMatchingLabel() {
		List<Genus> matchings = filter.getMatchingGenus();
		final String labelText;
		final Image labelImage;
		if (matchings.size() == 1) {
			match = matchings.get(0);
			labelText = "Selection of '" + match.getName() + "'";
			labelImage = labelProvider.getImage(match);

		} else if (matchings.size() > 0) {
			labelText = "Found " + matchings.size() + " matches";
			labelImage = null;
		} else {
			labelText = "Creation of a new genus " + genusLatinName;
			labelImage = null;
		}

		if (matchingLabel != null && matchingImage != null) {
			matchingLabel.setText(labelText);
			matchingImage.setImage(labelImage);
			matchingLabel.getParent().layout();
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Composite owner = new Composite(cc, SWT.NONE);
		owner.setLayout(new GridLayout(2, false));
		owner.setLayoutData(new GridData(GridData.FILL_BOTH));

		Dialogs.createTextEntry(parent, "Common name", "", commonNameSetter);

		Dialogs.createTextEntry(parent, "Latin name", "", genusSetter);

		this.labelProvider = new AdapterFactoryLabelProvider(
				new EditingDomainServices().getAdapterFactory(base.eContainer()));

		Composite labelCmp = new Composite(owner, SWT.BORDER);
		labelCmp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		labelCmp.setLayout(new GridLayout(2, false));

		matchingImage = new Label(labelCmp, SWT.NONE);
		matchingImage.setLayoutData(new GridData(GridData.BEGINNING));

		matchingLabel = new Label(labelCmp, SWT.NONE);
		matchingLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		return cc;
	}

	@Override
	public int open() {
		int result = super.open();
		labelProvider.dispose();
		return result;
	}

	public Genus getMatch() {
		return match;
	}

	public String getLatinName() {
		return genusLatinName;
	}

	public String getCommonName() {
		return commonName;
	}

}
