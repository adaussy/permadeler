/*******************************************************************************
 * Copyright (c) 2022 Arthur Daussy.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * Contributors: Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.wizards;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SpeciesChoiseWizardPage extends WizardPage {

	private ILabelProvider labelProvider;

	private Genus selectedGenus;

	private String filterText;

	private TableViewer tableViewer;

	private PermadelerSession permSession;

	private Genus parentGenus;

	protected SpeciesChoiseWizardPage(PermadelerSession permSession, ILabelProvider labelProvider) {
		super("Genus choice");
		this.permSession = permSession;
		this.labelProvider = labelProvider;
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = new Composite(parent, SWT.NONE);
		setControl(cc);
		cc.setLayout(new GridLayout(2, false));

		Text filter = new Text(cc, SWT.None);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = 3;
		filter.setLayoutData(layoutData);

		filter.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				filterText = filter.getText();
				tableViewer.refresh();

			}
		});

		// viewer
		tableViewer = new TableViewer(cc);
		tableViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(labelProvider);
		updateInputs();
		tableViewer.setFilters(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (filterText == null || filterText.isBlank()) {
					return true;
				}
				String text = labelProvider.getText(element);
				if (text != null) {
					return text.toLowerCase().contains(filterText.toLowerCase());
				}
				return false;
			}
		});
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectedGenus = (Genus)tableViewer.getStructuredSelection().getFirstElement();
				getContainer().updateButtons();

			}
		});

		Button newButton = new Button(cc, SWT.PUSH);
		newButton.setImage(RcpPlugin.getDefault().getImage("icons/add.gif"));
		newButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				permSession.modifyKnowledgeBase("Add genus", base -> {
					InputDialog dialog = new InputDialog(getShell(), "Species name", "Species name",
							"New Species", s -> {
								if (s != null && !s.isBlank() && !Character.isUpperCase(s.charAt(0))) {
									return null;
								} else {
									return "Invlaid Genus name. It should start with a Capital letter";
								}
							});
					if (dialog.open() == IDialogConstants.OK_ID) {
						String name = dialog.getValue().trim();
						Genus genus = PermadelerFactory.eINSTANCE.createGenus();
						genus.setLatinName(parentGenus.getName() + " " + name);
						genus.setName(name);
						parentGenus.getSubGenus().add(genus);
						updateInputs();
						tableViewer.setSelection(new StructuredSelection(genus), true);
					}
				});

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	protected void updateInputs() {
		if (parentGenus != null) {
			tableViewer.setInput(parentGenus.getSubGenus());
		}
	}

	public Genus getSelectedGenus() {
		return selectedGenus;
	}

	@Override
	public boolean canFlipToNextPage() {
		return selectedGenus != null;
	}

	public void updateParentGenus(Genus parentGenus) {
		this.parentGenus = parentGenus;
		updateInputs();

	}

}
