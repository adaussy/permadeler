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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * {@link ITreeContentProvider} used to reprensent the content of the model with its representation
 * 
 * @author Arthur Daussy
 */
public class ModelContentProvider implements ITreeContentProvider {

	private static final Object[] EMPTY = new Object[] {};

	private Session session;

	private ITreeContentProvider semanticContentProvider;

	private Viewer viewer;

	public ModelContentProvider(Session session, ITreeContentProvider semanticContentProvider) {
		super();
		this.session = session;
		this.semanticContentProvider = semanticContentProvider;
	}

	@Override
	public void dispose() {
		semanticContentProvider.dispose();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return ((Collection<?>)inputElement).toArray();
		}
		return new Object[] {inputElement };
	}

	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		this.viewer = viewer;
		if (semanticContentProvider != null) {
			semanticContentProvider.inputChanged(viewer, oldInput, newInput);
		}
	}

	protected Viewer getViewer() {
		return viewer;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EObject) {
			Collection<DRepresentationDescriptor> representations = getRepresentationDescriptorsAssociatedToEObject(
					(EObject)parentElement);
			List<Object> result = new ArrayList<Object>();
			result.addAll(representations);
			Collections.addAll(result, getSemanticChildren(parentElement));
			return result.toArray();
		}
		return EMPTY;
	}

	protected Object[] getSemanticChildren(Object parentElement) {
		return semanticContentProvider.getChildren(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		return semanticContentProvider.getParent(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		return semanticContentProvider.hasChildren(element) || (element instanceof EObject
				&& !getRepresentationDescriptorsAssociatedToEObject((EObject)element).isEmpty());
	}

	/**
	 * Gets the representation link to a semantic object
	 * 
	 * @param eObject
	 *            a semantic object
	 * @return a collection of descriptor
	 */
	private Collection<DRepresentationDescriptor> getRepresentationDescriptorsAssociatedToEObject(
			final EObject eObject) {
		Collection<DRepresentationDescriptor> allRepDescriptors = DialectManager.INSTANCE
				.getRepresentationDescriptors(eObject, session);
		List<DRepresentationDescriptor> filteredReps = Lists.newArrayList(allRepDescriptors);
		// Sort the available representation descriptors alphabetically by
		// name
		Collections.sort(filteredReps,
				Ordering.natural().onResultOf(new Function<DRepresentationDescriptor, String>() {
					@Override
					public String apply(DRepresentationDescriptor from) {
						return from.getName();
					}
				}));
		return filteredReps;
	}

}
