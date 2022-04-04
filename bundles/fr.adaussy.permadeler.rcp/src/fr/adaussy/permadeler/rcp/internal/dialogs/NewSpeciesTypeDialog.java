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

import java.util.regex.Matcher;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.adaussy.permadeler.common.BotanicNameHelper;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

/**
 * Dialog used to create a new species
 * 
 * @author Arthur Daussy
 */
public class NewSpeciesTypeDialog extends Dialog {

	private String genus;

	private String subGenus;

	private String plantName;

	private Text genusText;

	private Text subGenusText;

	private Text plantNameText;

	private Button isTreeCheck;

	private boolean isTree;

	public NewSpeciesTypeDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		String initialValue = Dialogs.getStringFromClipboard(getShell().getDisplay());
		Text qualifiedName = Dialogs.createTextEntry(parent, "Qualified name of the species", initialValue,
				v -> {
					Matcher matcher = BotanicNameHelper.LATIN_NAME.matcher(v);
					if (matcher.matches()) {
						String genusGroup = matcher.group(1);
						if (genusGroup != null) {
							if (genusText != null) {
								genusText.setText(genusGroup);
							}
							this.genus = genusGroup;
						}
						String subFamilly = matcher.group(2);
						if (subFamilly != null) {
							if (subGenusText != null) {
								subGenusText.setText(subFamilly);
							}
							this.subGenus = subFamilly;
						}
						if (matcher.groupCount() > 3) {
							String plantNameGroup = matcher.group(4);
							if (plantNameGroup != null) {
								if (plantNameText != null) {
									plantNameText.setText(plantNameGroup);
								}
								this.plantName = plantNameGroup;
							}
						}
					}
				});

		this.genusText = Dialogs.createTextEntry(parent, "Genus", "", g -> {
			this.genus = g;
		});
		this.subGenusText = Dialogs.createTextEntry(parent, "Sub Genus", "", sg -> {
			this.subGenus = sg;
		});
		this.plantNameText = Dialogs.createTextEntry(parent, "Plant name", "", n -> {
			this.plantName = n;
		});

		this.isTreeCheck = Dialogs.createCheckEntry(parent, "Is a tree?", resizeHasOccurred, n -> {
			this.isTree = n;
		});
		// Need to reset so the derived fields are filled
		qualifiedName.setText(initialValue);

		return cc;
	}

	public String getPlantName() {
		return plantName;
	}

	public String getGenus() {
		return genus;
	}

	public String getSubGenus() {
		return subGenus;
	}

	public boolean isTree() {
		return isTree;
	}
}
