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

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Variety;

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
	protected void handleDrop(Object target, Object[] dropedElements) {
		if (target instanceof Species) {
			Species species = (Species)target;
			List<Variety> varieties = Stream.of(dropedElements).filter(e -> e instanceof Variety)
					.map(e -> (Variety)e).toList();

			if (!varieties.isEmpty()) {
				TransactionalEditingDomain transactionalEditingDomain = getSession()
						.getTransactionalEditingDomain();
				transactionalEditingDomain.getCommandStack()
						.execute(new RecordingCommand(transactionalEditingDomain) {

							@Override
							protected void doExecute() {
								species.getVarieties().addAll(varieties);

							}
						});
			}

		} else if (target instanceof PlantGroup) {
			PlantGroup targetGroup = (PlantGroup)target;
			List<Species> droppedSpecies = Stream.of(dropedElements)//
					.filter(e -> e instanceof Species).map(e -> ((Species)e))//
					.toList();

			if (!droppedSpecies.isEmpty()) {
				TransactionalEditingDomain transactionalEditingDomain = getSession()
						.getTransactionalEditingDomain();
				transactionalEditingDomain.getCommandStack()
						.execute(new RecordingCommand(transactionalEditingDomain) {

							@Override
							protected void doExecute() {
								targetGroup.getSpecies().addAll(droppedSpecies);

							}
						});
			}

		}
		super.handleDrop(target, dropedElements);
	}

}
