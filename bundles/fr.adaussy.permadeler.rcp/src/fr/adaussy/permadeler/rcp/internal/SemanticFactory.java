/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Root;

/**
 * Factory used for creation of complex model element
 * 
 * @author Arthur Daussy
 */
public class SemanticFactory {

	private static PermadelerFactory factory = PermadelerFactory.eINSTANCE;

	/**
	 * Creates the default stub for an empty project
	 * 
	 * @param name
	 *            the name of the project
	 * @return the {@link Root} element
	 */
	public Root createEmptyProject(String name) {
		Root root = factory.createRoot();
		root.setName(name);

		root.setNursary(factory.createNursary());
		root.setPlanifier(factory.createPlanifier());
		root.setSeedbank(factory.createSeedBank());
		KnowledgeBase createKnowledgeBase = factory.createKnowledgeBase();
		createKnowledgeBase.setCompatibilityMatrix(factory.createCompatibilityMatrix());
		root.setSeedLib(createKnowledgeBase);

		return root;
	}
}
