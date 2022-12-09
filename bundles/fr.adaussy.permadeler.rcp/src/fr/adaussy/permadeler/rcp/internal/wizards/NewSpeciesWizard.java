/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.wizards;

import java.text.MessageFormat;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.wizard.Wizard;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.provider.PermadelerItemProviderAdapterFactory;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class NewSpeciesWizard extends Wizard {

	private final AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			new PermadelerItemProviderAdapterFactory());

	private PlantCreationWizardPage speciesWizardPage;

	private PermadelerSession session;

	private final Plant plant = PermadelerFactory.eINSTANCE.createPlant();

	public NewSpeciesWizard(PermadelerSession session) {
		super();
		this.session = session;
	}

	@Override
	public void addPages() {
		speciesWizardPage = new PlantCreationWizardPage(plant);
		addPage(speciesWizardPage);
		super.addPages();
	}

	@Override
	public boolean canFinish() {
		return !Strings.isNullOrEmpty(plant.getName());
	}

	@Override
	public boolean performFinish() {

		session.modifyKnowledgeBase(MessageFormat.format(RcpMessages.NewSpeciesWizard_0, plant.getName()), base -> {
			base.getPlantTypes().add(plant);
		});

		return true;
	}

	@Override
	public void dispose() {
		super.dispose();
		labelProvider.dispose();
	}

}
