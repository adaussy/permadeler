package fr.adaussy.permadeler.model.design.services;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.Test;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plantation;

public class DateServiceTest {

	@Test
	public void testSetDate() {
		Plantation plantation = PermadelerFactory.eINSTANCE.createPlantation();
		new DateService().setPlantationDate(plantation, "11/12/2022"); //$NON-NLS-1$
		LocalDate date = LocalDate.ofInstant(plantation.getPlantationDate(), ZoneId.systemDefault());
		assertEquals(11, date.getDayOfMonth());
		assertEquals(12, date.getMonthValue());
		assertEquals(2022, date.getYear());
	}

}
