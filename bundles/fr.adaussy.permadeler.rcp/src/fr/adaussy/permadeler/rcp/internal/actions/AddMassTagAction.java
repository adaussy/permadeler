/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.TagDialog;

public class AddMassTagAction extends AbstractModelAction {

	private List<TaggedElement> taggedElement;

	public AddMassTagAction(Session session, List<TaggedElement> taggedElement) {
		super("Ajout des tags", RcpPlugin.imageDescriptorFromPlugin("org.eclipse.jdt.ui",
				"/icons/full/obj16/html_tag_obj.png"), session);
		this.taggedElement = taggedElement;
	}

	@Override
	public void runWithEvent(Event event) {
		TaggedElement first = taggedElement.get(0);

		Root root = EMFUtils.getAncestor(Root.class, first);
		List<String> existingTag = EMFUtils.allContainedObjectOfType(root, TaggedElement.class)
				.flatMap(t -> t.getTags().stream()).distinct().toList();

		TagDialog dialog = new TagDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				existingTag);
		if (dialog.open() == IDialogConstants.OK_ID) {
			String value = dialog.getValue();
			if (value != null && !value.isBlank()) {
				new PermadelerSession(getSession(), root).modifyKnowledgeBase("Add mass tag", base -> {
					for (TaggedElement element : taggedElement) {
						Stream.of(value.split(";")).map(v -> v.trim())
								.filter(v -> !element.getTags().contains(v)).forEach(v -> {
									element.getTags().add(v);
								});
						ECollections.sort(element.getTags());
					}
				});
			}
		}
	}

}
