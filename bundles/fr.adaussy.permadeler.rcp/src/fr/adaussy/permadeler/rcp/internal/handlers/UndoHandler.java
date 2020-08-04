/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.e4.core.di.annotations.CanExecute;

/**
 * Handle for redo
 * 
 * @author Arthur Daussy
 */
public class UndoHandler {
	@Execute
	public void execute(Session session) {
		session.getTransactionalEditingDomain().getCommandStack().undo();
	}

	@CanExecute
	public boolean canExecute(@Optional Session session) {
		return session != null && session.getTransactionalEditingDomain().getCommandStack().canUndo();
	}

}
