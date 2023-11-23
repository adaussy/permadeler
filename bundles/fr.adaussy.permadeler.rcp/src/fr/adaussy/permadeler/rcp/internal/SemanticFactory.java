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
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.rcp.RcpMessages;

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
		Zone createZone = factory.createZone();
		createZone.setName(RcpMessages.SemanticFactory_0);
		root.getZones().add(createZone);
		KnowledgeBase createKnowledgeBase = factory.createKnowledgeBase();
		root.setKnowledgeBase(createKnowledgeBase);

		return root;
	}
}
