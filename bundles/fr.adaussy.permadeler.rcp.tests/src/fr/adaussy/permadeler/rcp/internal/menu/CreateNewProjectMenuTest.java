/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import fr.adaussy.permadeler.model.Permadeler.Root;

/**
 * @author Arthur Daussy
 */
public class CreateNewProjectMenuTest {
	@Rule
	public TemporaryFolder tmp = new TemporaryFolder();

	private File tmpFolder;

	@Before
	public void setUp() throws IOException {
		tmpFolder = tmp.newFolder("a path with space/and/acc�nt/");
	}

	/**
	 * Basic test that create and load a new session
	 * 
	 * @throws CoreException
	 * @throws IOException
	 * @throws InvocationTargetException
	 */
	@Test
	public void basicCreateAndLoad() throws InvocationTargetException, IOException, CoreException {
		URI sessionURI = new CreateNewProjectMenu().createNewProject(tmpFolder, "A new with spaces and acc�nt", false);

		assertNotNull(sessionURI);

		Session session = SessionManager.INSTANCE.getSession(sessionURI, new NullProgressMonitor());

		Collection<Resource> semanticResources = session.getSemanticResources();
		assertEquals(1, semanticResources.size());
		Resource semanticResource = semanticResources.iterator().next();

		EObject rootObject = semanticResource.getContents().get(0);
		assertTrue(rootObject instanceof Root);

		Root root = (Root) rootObject;

		assertNotNull(root.getKnowledgeBase());
		assertNotNull(root.getNursary());
		assertNotNull(root.getSeedbank());
		assertNotNull(root.getPlanifier());

	}

}
