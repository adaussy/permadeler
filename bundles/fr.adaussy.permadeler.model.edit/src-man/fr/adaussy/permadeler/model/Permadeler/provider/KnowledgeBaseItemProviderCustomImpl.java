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

import fr.adaussy.permadeler.model.edit.ImageProvider;

/**
 * {@link KnowledgeBaseItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class KnowledgeBaseItemProviderCustomImpl extends KnowledgeBaseItemProvider {

	public KnowledgeBaseItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}

}
