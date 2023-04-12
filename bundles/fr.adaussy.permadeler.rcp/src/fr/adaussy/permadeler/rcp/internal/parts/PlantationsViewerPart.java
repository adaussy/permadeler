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
 * View that display the current plantation of the project
 * 
 * @author Arthur Daussy
 */
public class PlantationsViewerPart extends AbstractModelViewerPart {

	/**
	 * View ID
	 */
	public static final String ID = "fr.adaussy.permadeler.rcp.part.zones"; //$NON-NLS-1$

	@Override
	protected String getViewId() {
		return ID;
	}

	@Override
	protected EObject getViewerRoot(Root root) {
		return root;
	}

	@Override
	protected ModelContentProvider createContentProvider(Session session) {
		return new PlantationContentProvider(session,
				new ModelContentProvider(session, new AdapterFactoryContentProvider(createAdapterFactory())));
	}

}
