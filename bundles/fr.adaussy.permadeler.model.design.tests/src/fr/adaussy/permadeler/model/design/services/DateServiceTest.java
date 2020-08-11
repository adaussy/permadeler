/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.Test;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plantation;

public class DateServiceTest {

	private static final PermadelerFactory sFactory = PermadelerFactory.eINSTANCE;

	private DateService service = new DateService();

	/**
	 * Basic test for the service {@link DateService#setPlantationDate(Plantation, String)}
	 */
	@Test
	public void testSetPlantationDate() {
		Plantation plantation = sFactory.createPlantation();
		service.setPlantationDate(plantation, "23/08/2020");
		assertTrue(plantation.getPlantationEvent() != null);
		Instant pDate = plantation.getPlantationEvent().getDate();
		assertEquals(LocalDate.of(2020, 8, 23), LocalDate.ofInstant(pDate, ZoneId.systemDefault()));
	}

}
