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

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Zone;

/**
 * {@link ZoneItemProvider} custom impl
 * 
 * @author Arthur Daussy
 */
public class ZoneItemProviderCustomImpl extends ZoneItemProvider {

	public ZoneItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custo/commons/zone.png")); //$NON-NLS-1$
	}

	@Override
	public String getText(Object object) {
		Zone zone = (Zone)object;
		return zone == null ? "" : zone.getName(); //$NON-NLS-1$
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index, Collection<?> collection) {
		if (feature == PermadelerPackage.eINSTANCE.getZone_SubZones() && value instanceof Zone zone) {
			PlantationPhase phase = PermadelerFactory.eINSTANCE.createPlantationPhase();
			zone.setName("Nouvelle Sous Zone");
			zone.getPhases().add(phase);
			phase.setName("Phase 1");
		}
		return super.createCreateChildCommand(domain, owner, feature, value, index, collection);
	}
}
