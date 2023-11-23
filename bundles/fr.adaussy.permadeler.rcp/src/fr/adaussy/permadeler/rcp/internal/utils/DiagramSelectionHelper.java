/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.utils;

import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

public class DiagramSelectionHelper {

	public static List<Plantation> getPlantationMapDiagramPlantations(PermadelerSession session,
			Shell shell) {

		ObjectSelectionDialog<DDiagram> selectionDialog = new ObjectSelectionDialog<DDiagram>(shell,
				DDiagram.class, diag -> "FoodForestMapDiagram".equals(diag.getDescription().getName()),
				session.getSession().getSessionResource().getContents());
		if (selectionDialog.open() == IDialogConstants.OK_ID) {
			List<DDiagram> diagrams = selectionDialog.getSelection();
			return diagrams.stream()//
					.flatMap(z -> EMFUtils.getChildren(z, DSemanticDecorator.class))//
					.map(d -> d.getTarget())//
					.filter(t -> t instanceof Plantation)//
					.map(p -> (Plantation)p)//
					.distinct()//
					.sorted(Comparator.comparing(p -> Strings.nullToEmpty(p.getId())))//
					.toList();//
		}
		return List.of();

	}

}
