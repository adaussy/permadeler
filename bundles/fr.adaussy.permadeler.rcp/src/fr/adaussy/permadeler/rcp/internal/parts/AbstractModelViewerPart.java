/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.featureExtensions.FeatureExtensionsUIManager;
import org.eclipse.sirius.ui.tools.api.views.modelexplorerview.IModelExplorerView;
import org.eclipse.sirius.ui.tools.internal.views.common.ContextMenuFiller;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerResourceImpl;
import fr.adaussy.permadeler.rcp.internal.menu.MenuFiller;

/**
 * Abstract implementation of the tree views
 * 
 * @author Arthur Daussy
 */
public abstract class AbstractModelViewerPart implements ITabbedPropertySheetPageContributor, IAdaptable, ISelectionProvider, IViewerProvider {

	private TreeViewer viewer;

	private Display display;

	private Session displayedSession;

	private List<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>();

	private RefreshViewerOnChangeResourceSetListener represenationUpdater = new RefreshViewerOnChangeResourceSetListener();

	private SessionListener dirtyListener = new SessionListener() {

		@Override
		public void notify(int changeKind) {
			if (mPart != null) {

				if (SessionListener.DIRTY == changeKind) {
					mPart.setDirty(true);
				} else if (SessionListener.SYNC == changeKind) {
					mPart.setDirty(false);
				}
			}

		}
	};

	@Inject
	private ESelectionService selectionService;

	private MPart mPart;

	@Inject
	public AbstractModelViewerPart() {
	}

	@Persist
	public void persist(Shell shell) throws InvocationTargetException, InterruptedException {
		if (displayedSession != null && displayedSession.getStatus() == SessionStatus.DIRTY) {
			new ProgressMonitorDialog(shell).run(false, false, progress -> {
				displayedSession.save(progress);
			});
		}
	}

	@PostConstruct
	public void postConstruct(Composite parent, @Optional Session session, MPart mPart) {
		this.mPart = mPart;
		this.display = parent.getShell().getDisplay();
		Composite cc = new Composite(parent, SWT.None);
		cc.setLayout(new GridLayout(1, false));
		FilteredTree filteredTree = new FilteredTree(cc, SWT.MULTI, new PatternFilter(), false, false);
		filteredTree.setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer = filteredTree.getViewer();
		SiriusCommonLabelProvider labelProvider = new SiriusCommonLabelProvider();
		viewer.setLabelProvider(labelProvider);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = viewer.getSelection();
				selectionService.setSelection(selection);
				selectionService.setPostSelection(viewer.getSelection());

			}
		});
		viewer.addDoubleClickListener(new DoubleClickHandler(() -> displayedSession, viewer));
		MenuManager menuMng = new MenuManager();
		menuMng.addMenuListener(new MenuFiller(() -> viewer.getSelection()));
		menuMng.setRemoveAllWhenShown(true);

		ContextMenuFiller siriusMenuFiller = new ContextMenuFiller(viewer, labelProvider);
		menuMng.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				siriusMenuFiller.fillContextMenu(menuMng, getSelection());
			}
		});
		Menu menu = menuMng.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);

		viewer.addDragSupport(DND.DROP_LINK | DND.DROP_MOVE | DND.DROP_COPY,
				new Transfer[] {LocalSelectionTransfer.getTransfer() }, new DragSourceListener() {

					@Override
					public void dragStart(DragSourceEvent event) {
						ISelection selection = viewer.getSelection();
						if (selection != null && !selection.isEmpty()) {
							LocalSelectionTransfer.getTransfer().setSelection(selection);
						}

					}

					@Override
					public void dragSetData(DragSourceEvent event) {
						final ISelection selection = LocalSelectionTransfer.getTransfer().getSelection();
						if (LocalSelectionTransfer.getTransfer().isSupportedType(event.dataType)) {
							event.data = selection;
						}

					}

					@Override
					public void dragFinished(DragSourceEvent event) {
						LocalSelectionTransfer.getTransfer().setSelection(null);

					}
				});

		if (session != this.displayedSession) {
			updateContent(session);
		}
	}

	@Override
	public String getContributorId() {
		return IModelExplorerView.ID;
	}

	protected abstract String getViewId();

	@Inject
	@Optional
	public void newSession(Session session) {

		if (displayedSession != null) {
			displayedSession.getTransactionalEditingDomain().removeResourceSetListener(represenationUpdater);
			displayedSession.removeListener(dirtyListener);
		}

		if (session != null) {
			session.addListener(dirtyListener);
			session.getTransactionalEditingDomain().addResourceSetListener(represenationUpdater);
			updateContent(session);
		}
	}

	protected abstract EObject getViewerRoot(Root root);

	/**
	 * Update the content of the viewer
	 * 
	 * @param session
	 *            the new session
	 */
	private void updateContent(Session session) {

		if (display != null) {
			display.asyncExec(() -> {
				this.displayedSession = session;
				Collection<Resource> allSessionResources = session.getSemanticResources();
				EObject root = allSessionResources.stream().filter(r -> r instanceof PermadelerResourceImpl)
						.findFirst().map(r -> r.getContents().get(0)).orElse(null);

				IContentProvider oldContentProvider = viewer.getContentProvider();
				viewer.setContentProvider(createContentProvider(session));
				viewer.setInput(Collections.singleton(getViewerRoot((Root)root)));
				if (oldContentProvider instanceof ModelContentProvider) {
					((ModelContentProvider)oldContentProvider).dispose();
				}
			});
		}
	}

	protected ModelContentProvider createContentProvider(Session session) {
		return new ModelContentProvider(session, new AdapterFactoryContentProvider(createAdapterFactory()));
	}

	/**
	 * Creates a {@link AdapterFactory}
	 * 
	 * @return a new {@link AdapterFactory}
	 */
	protected AdapterFactory createAdapterFactory() {
		final List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(DialectUIManager.INSTANCE.createAdapterFactory());
		factories.add(FeatureExtensionsUIManager.INSTANCE.createAdapterFactory());
		factories.add(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return new ComposedAdapterFactory(factories);
	}

	@Override
	public <T> T getAdapter(Class<T> type) {
		Object result = null;
		if (type == IPropertySheetPage.class) {
			IPropertySheetPage contributedPage = SiriusEditPlugin.getPlugin().getPropertySheetPage(this,
					getContributorId());
			if (contributedPage != null) {
				result = contributedPage;
			} else {
				result = new TabbedPropertySheetPage(this);
			}
		}
		if (type.isInstance(result)) {
			return type.cast(result);
		} else {
			return null;
		}
	}

	@Override
	public Viewer getViewer() {
		return viewer;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	/**
	 * Returns the current selection for this provider.
	 *
	 * @return the current selection
	 */
	@Override
	public ISelection getSelection() {
		if (viewer != null && !viewer.getControl().isDisposed()) {
			return viewer.getSelection();
		} else {
			return StructuredSelection.EMPTY;
		}
	}

	/**
	 * Removes the given selection change listener from this selection provider. Has no effect if an identical
	 * listener is not registered.
	 *
	 * @param listener
	 *            a selection changed listener
	 */
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	/**
	 * Sets the current selection for this selection provider.
	 *
	 * @param selection
	 *            the new selection
	 */
	@Override
	public void setSelection(ISelection selection) {
		if (viewer != null && !viewer.getControl().isDisposed()) {
			viewer.setSelection(selection);
		}
	}

	/**
	 * This listener refreshes the viewer of this component when a representation is created or removed or
	 * when a model is added/removed from the session.
	 * 
	 * @author <a href=mailto:pierre.guilet@obeo.fr>Pierre Guilet</a>
	 */
	public class RefreshViewerOnChangeResourceSetListener implements ResourceSetListener {

		@Override
		public NotificationFilter getFilter() {
			return null;
		}

		@Override
		public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
			return null;
		}

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			List<Notification> notifications = event.getNotifications();
			for (Notification notification : notifications) {
				switch (notification.getEventType()) {
					case Notification.ADD:
					case Notification.REMOVE:
					case Notification.ADD_MANY:
					case Notification.REMOVE_MANY:
						if (notification.getNewValue() instanceof DRepresentation
								|| notification.getOldValue() instanceof DRepresentation) {
							// we refresh the viewer if a representation has been added or removed from the
							// session.
							PlatformUI.getWorkbench().getDisplay().asyncExec(() -> {
								if (viewer != null && viewer.getTree() != null
										&& !viewer.getTree().isDisposed()) {
									viewer.refresh();
								}
							});
						} else if (notification.getNotifier() instanceof DAnalysis) {
							// a model may have been added/removed from the model so we have to update content
							// that is
							// relative to loaded models.
							PlatformUI.getWorkbench().getDisplay().asyncExec(() -> {
								if (viewer != null && viewer.getTree() != null
										&& !viewer.getTree().isDisposed()) {
									viewer.refresh(true);
								}
							});
						}
						break;
					default:
						break;
				}
			}
		}

		@Override
		public boolean isAggregatePrecommitListener() {
			return false;
		}

		@Override
		public boolean isPrecommitOnly() {
			return false;
		}

		@Override
		public boolean isPostcommitOnly() {
			return true;
		}

	}

}
