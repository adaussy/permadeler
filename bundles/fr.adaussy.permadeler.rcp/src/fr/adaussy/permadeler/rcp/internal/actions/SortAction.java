/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.Comparator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;

/**
 * Action that sorts a list of elements
 * 
 * @author Arthur Daussy
 * @param <T>
 */
public class SortAction<T extends EObject> extends AbstractModelAction {

	private EList<T> list;

	private Comparator<T> cmp;

	public SortAction(Session session, EList<T> list, Comparator<T> cmp) {
		super("Sort", session);
		this.list = list;
		this.cmp = cmp;
	}

	@Override
	public void run() {
		modifyModel(() -> {
			ECollections.sort(list, cmp);
		});
	}

}
