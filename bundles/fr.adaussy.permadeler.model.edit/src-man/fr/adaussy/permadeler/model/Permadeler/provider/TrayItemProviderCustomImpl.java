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

import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.utils.EMFUtils;

/**
 * {@link TrayItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class TrayItemProviderCustomImpl extends TrayItemProvider {

	public TrayItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Tray tray = (Tray)object;
		String name = tray.getName();

		int[] counts = new int[] {0, 0 };
		EMFUtils.getChildren(tray, Cell.class).forEach(c -> {
			if (c.getSpecies() != null) {
				counts[0]++;
			}
			counts[1]++;
		});
		String countLabel = " [" + counts[0] + "/" + counts[1] + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		String label = name == null ? "" : name; //$NON-NLS-1$
		return label + countLabel;
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}
}
