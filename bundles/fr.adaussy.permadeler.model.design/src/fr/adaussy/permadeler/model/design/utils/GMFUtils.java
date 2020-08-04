/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.utils;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;

import com.google.common.collect.Iterables;

/**
 * Util class used to handle GMF elements
 * 
 * @author arthur Daussy
 */
public final class GMFUtils {

	private GMFUtils() {
	}

	/**
	 * Gets the diagram from a {@link DDiagramElement}
	 * 
	 * @param element
	 *            a {@link DDiagramElement}
	 * @return a {@link DDiagram} or <code>null</code>
	 */
	public static Diagram getDiagram(DDiagramElement element) {
		DDiagram dDiagram = element.getParentDiagram();

		Collection<EObject> diagrams = new EObjectQuery(dDiagram)
				.getInverseReferences(NotationPackage.Literals.VIEW__ELEMENT);
		for (EObject o : diagrams) {
			if (o instanceof Diagram) {
				return (Diagram)o;
			}
		}

		return null;

	}

	/**
	 * Gets the Node of a {@link DDiagramElement}
	 * 
	 * @param element
	 *            an element
	 * @return a optional {@link Node}
	 */
	public static Optional<Node> getNodeInDiagram(DDiagramElement element) {

		Diagram diagram = getDiagram(element);

		if (diagram == null) {
			return Optional.empty();
		}

		Collection<EObject> gmfElement = new EObjectQuery(element)
				.getInverseReferences(NotationPackage.Literals.VIEW__ELEMENT);
		return com.google.common.base.Optional.toJavaUtil(Iterables.tryFind(gmfElement, e -> {
			if (e instanceof Node) {
				Node node = (Node)e;
				return node.getDiagram() == diagram;
			}
			return false;
		}).transform(e -> (Node)e));
	}

	public static Optional<Bounds> getGMFBounds(Node node) {
		LayoutConstraint constraint = node.getLayoutConstraint();
		if (constraint instanceof Bounds) {
			return Optional.of((Bounds)constraint);
		}
		return Optional.empty();
	}

	public static Optional<Bounds> getGMFBounds(DDiagramElement element) {
		Optional<Node> rep = getNodeInDiagram(element);
		return rep.flatMap(n -> getGMFBounds(n));
	}
}
