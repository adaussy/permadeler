/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.projects.Project;
import fr.adaussy.permadeler.rcp.internal.projects.Projects;

public class RecentProjectMenu {

	@Inject
	private EModelService modelService;

	@Inject
	private MApplication application;

	@AboutToShow
	public void aboutToShow(List<MMenuElement> items) {

		for (Project project : Projects.loadProjects()) {
			MHandledMenuItem dynamicItem = MMenuFactory.INSTANCE.createHandledMenuItem();
			dynamicItem.setLabel(project.getName());
			dynamicItem.setContributorURI("platform:/" + RcpPlugin.PLUGIN_ID + "/" //$NON-NLS-1$ //$NON-NLS-2$
					+ RecentProjectMenu.class.getName());
			MCommand loadProjectCommand = modelService.findElements(application,
					"fr.adaussy.permadeler.rcp.command.open.recent.project", MCommand.class).get(0); //$NON-NLS-1$

			dynamicItem.setCommand(loadProjectCommand);
			MParameter param = MCommandsFactory.INSTANCE.createParameter();
			param.setName("fr.adaussy.permadeler.rcp.commandparameter.session.uri"); //$NON-NLS-1$
			param.setValue(project.getUri());
			dynamicItem.getParameters().add(param);
			items.add(dynamicItem);
		}

	}

}
