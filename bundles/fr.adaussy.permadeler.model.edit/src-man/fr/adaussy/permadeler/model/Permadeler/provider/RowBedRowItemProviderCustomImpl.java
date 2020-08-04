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

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.RowBedRow;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.model.edit.TextHelper;

/**
 * {@link RowBedRowItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class RowBedRowItemProviderCustomImpl extends RowBedRowItemProvider {

	public RowBedRowItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		RowBedRow row = (RowBedRow)object;
		if (row.getPlantations().isEmpty()) {
			return "Empty";
		} else if (row.getPlantations().size() == 1) {
			Plantation p = row.getPlantations().get(0);
			return TextHelper.getEditLabel(getRootAdapterFactory(), p);
		} else {
			return row.getPlantations().size() + " types";
		}
	}

	@Override
	public Object getImage(Object object) {
		return ImageProvider.INSTANCE.getIconEMFIcon((EObject)object);
	}
}
