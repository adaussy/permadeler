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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.sirius.ext.emf.edit.EditingDomainServices;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.adaussy.permadeler.model.utils.EMFUtils;

/**
 * Dialog used to select one or more object in a containment tree
 * 
 * @author Arthur Daussy
 * @param <T>
 */
public class ObjectSelectionDialog<T extends EObject> extends Dialog {

	private Class<T> type;

	private Predicate<T> elementFilter;

	private EObject root;

	private TableViewer viewer;

	private List<T> selection = Collections.emptyList();

	private boolean multi;

	private NameFilter nameFilter;

	private AdapterFactoryLabelProvider labelProvider;

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
	public ObjectSelectionDialog(Shell parentShell, Class<T> type, Predicate<T> filter, EObject root) {
		super(parentShell);
		this.type = type;
		this.elementFilter = filter;
		this.root = root;
	}

	public TableViewer getViewer() {
		return viewer;
	}

	/**
	 * Sets the multi.
	 * 
	 * @param multi
	 *            the value to set
	 */
	public void setMulti(boolean multi) {
		this.multi = multi;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		this.labelProvider = new AdapterFactoryLabelProvider(
				new EditingDomainServices().getAdapterFactory(root));
		nameFilter = new NameFilter(labelProvider);

		Text filter = new Text(cc, SWT.BORDER);
		filter.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		filter.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				nameFilter.setCurrentFilter(filter.getText());
				viewer.refresh();

			}
		});

		int style = multi ? SWT.MULTI : SWT.SINGLE;
		viewer = new TableViewer(cc, style);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setLabelProvider(labelProvider);
		viewer.setFilters(nameFilter);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = new ArrayList<>();
				for (Object o : event.getStructuredSelection().toList()) {
					if (type.isInstance(o)) {
						selection.add(type.cast(o));
					}
				}

			}
		});

		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				close();

			}
		});

		if (hasCustomContent()) {
			Composite customContentComposite = new Composite(cc, SWT.NONE);
			customContentComposite.setLayout(new GridLayout(1, true));
			customContentComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			fillCustomContent(customContentComposite);
		}
		resetInputs();
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
		Stream<T> allElement = EMFUtils.getChildren(root, type);
		if (elementFilter != null) {
			allElement = allElement.filter(elementFilter);
		}
		List<T> input = allElement.sorted(Comparator.comparing(e -> labelProvider.getText(e)))
				.collect(toList());
		viewer.setInput(input);
	}

	protected boolean hasCustomContent() {
		return false;
	}

	protected void fillCustomContent(Composite parent) {

	}

	public List<T> getSelection() {
		return selection;
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
						result = label.toLowerCase().matches(regex);
					}
				}
				return result;
			}
			return false;
		}

	}

	protected void setSelection(List<T> selection) {
		this.selection = selection.stream().filter(elementFilter).collect(toList());
		if (viewer != null && !viewer.getControl().isDisposed()) {
			viewer.setSelection(new StructuredSelection(this.selection));
		}
	}

}
