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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.Root;

/**
 * Views that display the knowledge base of the project
 * 
 * @author Arthur Daussy
 */
public class KnowledgeViewerPart extends AbstractModelViewerPart {

	/**
	 * View ID
	 */
	public static final String ID = "fr.adaussy.permadeler.rcp.part.knowledgebase"; //$NON-NLS-1$

	@Override
	protected String getViewId() {
		return ID;
	}

	@Override
	protected EObject getViewerRoot(Root root) {
		return root.getKnowledgeBase();
	}

	@Override
	protected ModelContentProvider createContentProvider(Session session) {
		return new KnwoledgePartContentProvider(session,
				new AdapterFactoryContentProvider(createAdapterFactory()));
	}

}
