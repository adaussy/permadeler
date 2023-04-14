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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;

/**
 * Abstract used to modify the model
 * 
 * @author Arthur Daussy
 */
public abstract class AbstractModelAction extends Action {

	private final Session session;

	public AbstractModelAction(Session session) {
		super();
		this.session = session;
	}

	public AbstractModelAction(String text, ImageDescriptor image, Session session) {
		super(text, image);
		this.session = session;
	}

	public AbstractModelAction(String text, int style, Session session) {
		super(text, style);
		this.session = session;
	}

	public AbstractModelAction(String text, Session session) {
		super(text);
		this.session = session;
	}

	/**
	 * Modifies the model by running the given {@link Runnable} into a recording command
	 * 
	 * @param r
	 *            a runnable to run
	 */
	protected void modifyModel(Runnable r) {
		if (r == null) {
			return;
		}
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					protected void doExecute() {
						r.run();
					}
				});

	}

	protected Session getSession() {
		return session;
	}

}
