/**
 Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 *
 */
package fr.adaussy.permadeler.model.Permadeler.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;

import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.Permadeler.Tree;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;

/**
 * {@link TreeItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class TreeItemProviderCustomImpl extends TreeItemProvider {

	public TreeItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

	@Override
	public String getText(Object object) {
		Tree tree = (Tree)object;
		String rootStock = tree.getRootstock();
		String label = TextHelper.getLabel((PlantNamedElement)object);
		if (rootStock != null && !rootStock.isEmpty()) {
			label += "[" + rootStock + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return label;
	}

}
