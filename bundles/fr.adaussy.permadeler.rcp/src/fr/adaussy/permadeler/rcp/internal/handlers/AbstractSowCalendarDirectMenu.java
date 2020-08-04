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

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.actions.TimeViewAction;
import fr.adaussy.permadeler.rcp.internal.timeview.InputFactory;

/**
 * Abstract Calendar handler
 * 
 * @author Arthur Daussy
 * @param <T>
 */
public abstract class AbstractSowCalendarDirectMenu<T extends EObject> {
	@Execute
	public void execute(PermadelerSession session, MApplication application, EModelService modelService,
			EPartService partService) {
		TimeViewAction.builder()//
				.withApplication(application)//
				.withModelService(modelService)//
				.withPartService(partService)//
				.withQuery(InputFactory.SOW_PERIOD)//
				.withTarget(getRootItem(session))//
				.withLabel("Sow times")//
				.build().openTimeView();
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

	protected abstract T getRootItem(PermadelerSession session);
}
