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

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.provider.PermadelerItemProviderAdapterFactory;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class NewSpeciesWizard extends Wizard {

	private final AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			new PermadelerItemProviderAdapterFactory());

	private GenusChoiceWizardPage genusChoisePage;

	private PermadelerSession session;

	private SpeciesChoiseWizardPage speciesChoisePage;

	private CultivarInformationWizardPage cultivarInformation;

	public NewSpeciesWizard(PermadelerSession session) {
		super();
		this.session = session;
	}

	@Override
	public void addPages() {
		genusChoisePage = new GenusChoiceWizardPage(session, labelProvider);
		addPage(genusChoisePage);
		speciesChoisePage = new SpeciesChoiseWizardPage(session, labelProvider);
		addPage(speciesChoisePage);
		cultivarInformation = new CultivarInformationWizardPage();
		addPage(cultivarInformation);
		super.addPages();
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nexPage = super.getNextPage(page);
		if (nexPage == speciesChoisePage) {
			speciesChoisePage.updateParentGenus(genusChoisePage.getSelectedGenus());
		}
		return nexPage;
	}

	@Override
	public boolean canFinish() {
		return genusChoisePage.getSelectedGenus() != null //
				&& speciesChoisePage.getSelectedGenus() != null //
				&& cultivarInformation.getCommonName() != null
				&& !cultivarInformation.getCommonName().isBlank()//
				&& cultivarInformation.getCultivarName() != null
				&& !cultivarInformation.getCultivarName().isBlank();
	}

	@Override
	public boolean performFinish() {

		final Species newSpecies;
		if (cultivarInformation.isTree()) {
			newSpecies = PermadelerFactory.eINSTANCE.createTree();
		} else {
			newSpecies = PermadelerFactory.eINSTANCE.createPlant();
		}

		newSpecies.setName(cultivarInformation.getCommonName());
		newSpecies.setLatinName(speciesChoisePage.getSelectedGenus().getLatinName() + " '"
				+ cultivarInformation.getCultivarName() + "'");

		session.modifyKnowledgeBase("Add new cultivar", base -> {
			speciesChoisePage.getSelectedGenus().getSpecies().add(newSpecies);
		});

		return true;
	}

	@Override
	public void dispose() {
		super.dispose();
		labelProvider.dispose();
	}

}
