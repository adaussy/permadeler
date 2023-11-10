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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.emf.edit.EditingDomainServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.menu.CreateNewProjectMenu;
import fr.adaussy.permadeler.rcp.internal.menu.NewSpeciesAction;

/**
 * Dialog used to select one or more object in a containment tree
 * 
 * @author Arthur Daussy
 */
public class TemplateSelectionDialog extends Dialog {

	private TableViewer viewer;

	private Species selectedTemplate;

	private NameFilter nameFilter;

	private ILabelProvider labelProvider;

	private PermadelerSession session;

	/**
	 * Simple constructor
	 * 
	 * @param parentShell
	 *            a shell
	 * @param type
	 *            the type of element ot select
	 * @param filter
	 *            a filter
	 * @param root
	 *            the root of the tree
	 */
	public TemplateSelectionDialog(Shell parentShell, PermadelerSession session) {
		super(parentShell);
		this.session = session;
		this.labelProvider = new AdapterFactoryLabelProvider(
				new EditingDomainServices().getAdapterFactory(session.getKnowledgeBase()));
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(500, 700);
	}

	public void setInitialSelection(Species initialSelection) {
		selectedTemplate = initialSelection;
	}

	public TableViewer getViewer() {
		return viewer;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Label msgLabel = new Label(cc, SWT.None);
		msgLabel.setText("Choisir un template de création");
		msgLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite cc2 = new Composite(cc, SWT.NONE);
		cc2.setLayout(new GridLayout(2, false));
		cc2.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite treeComposite = new Composite(cc2, SWT.BORDER);
		treeComposite.setLayout(new GridLayout(1, false));
		treeComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		nameFilter = new NameFilter(labelProvider);

		Text filter = new Text(treeComposite, SWT.BORDER);
		filter.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		filter.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				nameFilter.setCurrentFilter(filter.getText());
				viewer.refresh();

			}
		});

		viewer = new TableViewer(treeComposite, SWT.SINGLE);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setLabelProvider(labelProvider);
		viewer.setFilters(nameFilter);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection structuredSelection = event.getStructuredSelection();
				if (structuredSelection.isEmpty()) {

					selectedTemplate = null;
				} else {

					selectedTemplate = (Species)structuredSelection.getFirstElement();
				}

			}
		});

		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				close();

			}
		});

		Composite buttonComposite = new Composite(cc2, SWT.None);
		buttonComposite.setLayout(new GridLayout(1, false));
		buttonComposite.setLayoutData(new GridData(GridData.FILL_VERTICAL));

		Button addTemplateButton = new Button(buttonComposite, SWT.PUSH);
		addTemplateButton.setText("Nouveau template");
		addTemplateButton.addSelectionListener(new NewTemplateBuilder());
		addTemplateButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button deleteTemplateButton = new Button(buttonComposite, SWT.PUSH);
		deleteTemplateButton.setText("Supprimer template");
		deleteTemplateButton.addSelectionListener(new TemplateDeleter());
		deleteTemplateButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button editTemplateButton = new Button(buttonComposite, SWT.PUSH);
		editTemplateButton.setText("Editer template");
		editTemplateButton.addSelectionListener(new EditTemplateBuilder());
		editTemplateButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		resetInputs();

		if (selectedTemplate != null) {
			viewer.setSelection(new StructuredSelection(selectedTemplate), true);
		}
		return cc;
	}

	@Override
	public int open() {
		int result = super.open();
		this.labelProvider.dispose();
		return result;
	}

	/**
	 * Resets inputs and apply the filters
	 */
	protected void resetInputs() {

		List<Species> candidates = new ArrayList<Species>(session.getKnowledgeBase().getTemplates());
		Species emptySpecies = PermadelerFactory.eINSTANCE.createSpecies();
		emptySpecies.setName("Nouvelle espece");
		candidates.add(emptySpecies);

		List<Species> input = candidates.stream().sorted(Comparator.comparing(e -> getLabel(e)))
				.collect(toList());
		viewer.setInput(input);
	}

	private String getLabel(Species e) {
		return Strings.nullToEmpty(labelProvider.getText(e));
	}

	public Species getSelection() {
		return selectedTemplate;
	}

	private final class TemplateDeleter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			session.modifyKnowledgeBase("Delete template", base -> extracted(base));
		}

		private void extracted(KnowledgeBase base) {
			if (selectedTemplate != null) {
				base.getTemplates().remove(selectedTemplate);
			}
			resetInputs();
		}
	}

	private final class NewTemplateBuilder extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			createNewTemplate();
		}

		private void createNewTemplate() {
			Session siriusSession = session.getSession();
			TransactionalEditingDomain editingDomain = siriusSession.getTransactionalEditingDomain();
			editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

				@Override
				protected void doExecute() {
					Species template = PermadelerFactory.eINSTANCE.createSpecies();
					session.getKnowledgeBase().getTemplates().add(template);

					SimplePropertiesFormDialog propertiesFormDialog = new SimplePropertiesFormDialog(
							getShell(), //
							template, siriusSession, CreateNewProjectMenu.DEFAULT_VIEWPOINT,
							NewSpeciesAction.NEW_SPECIES_DIALOG_PAGE);
					if (propertiesFormDialog.open() != IDialogConstants.OK_ID) {
						session.getKnowledgeBase().getTemplates().remove(template);
					} else {
						resetInputs();
					}
				}

			});

		}
	}

	private final class EditTemplateBuilder extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			createNewTemplate();
		}

		private void createNewTemplate() {
			if (selectedTemplate != null) {
				Session siriusSession = session.getSession();
				TransactionalEditingDomain editingDomain = siriusSession.getTransactionalEditingDomain();
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

					@Override
					protected void doExecute() {

						SimplePropertiesFormDialog propertiesFormDialog = new SimplePropertiesFormDialog(
								getShell(), //
								selectedTemplate, siriusSession, CreateNewProjectMenu.DEFAULT_VIEWPOINT,
								NewSpeciesAction.NEW_SPECIES_DIALOG_PAGE);
						propertiesFormDialog.open();
						resetInputs();
					}

				});
			}

		}
	}

	/**
	 * Filter use to filter element by name
	 * 
	 * @author Arthur Daussy
	 */
	private static final class NameFilter extends ViewerFilter {

		private final ILabelProvider provider;

		private String currentFilter;

		/**
		 * Simple constructor
		 * 
		 * @param provider
		 *            the label provider
		 */
		private NameFilter(ILabelProvider provider) {
			super();
			this.provider = provider;
		}

		/**
		 * Set the value to be used for the current filter
		 * 
		 * @param currentFilter
		 *            the value
		 */
		public void setCurrentFilter(String currentFilter) {
			if (currentFilter != null && currentFilter.isEmpty()) {
				this.currentFilter = null;
			} else {
				this.currentFilter = currentFilter;
			}
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element != null) {
				String label = provider.getText(element);
				final boolean result;
				if (label == null) {
					if (currentFilter == null) {
						result = true;
					} else {
						result = false;
					}
				} else {
					if (currentFilter == null) {
						result = true;
					} else {
						String regex = ("\\Q" + currentFilter.toLowerCase() + "\\E").replace("*", "\\E.*\\Q") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								+ ".*"; //$NON-NLS-1$
						result = label.toLowerCase().contains(currentFilter.toLowerCase());
					}
				}
				return result;
			}
			return false;
		}

	}

	protected void setSelection(Species selection) {
		selectedTemplate = selection;
		if (viewer != null && !viewer.getControl().isDisposed()) {
			viewer.setSelection(new StructuredSelection(selectedTemplate));
		}
	}

}
