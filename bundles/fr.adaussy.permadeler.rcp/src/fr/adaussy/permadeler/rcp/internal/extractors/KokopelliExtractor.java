/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.extractors;

import java.net.URL;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import fr.adaussy.permadeler.rcp.services.FillService;
import fr.adaussy.permadeler.rcp.services.MonthService;

/**
 * Extractor use ot create Plan from a Kokopelli URL
 * 
 * @author Arthur Daussy
 */
public class KokopelliExtractor extends AbstractInformationExtractor {

	private static final String EXTRACTOR_NAME = "Kokopelli"; //$NON-NLS-1$

	/**
	 * Simple constructor
	 * 
	 * @param doc
	 *            the JSoup doc
	 * @param url
	 *            the url
	 */
	public KokopelliExtractor(URL url, Document doc) {
		super(doc, url, EXTRACTOR_NAME);
	}

	@Override
	public String fetchLatinName() {
		String latinName = this.toFirstCap(getDoc().getElementById("nom_latin").html()); //$NON-NLS-1$
		latinName += " '" + getCommonName() + "'"; //$NON-NLS-1$ //$NON-NLS-2$
		return latinName; // $NON-NLS-1$
	}

	@Override
	public String fetchCommonName() {
		final Element elem = getDoc().getElementsByClass("product__description").get(0); //$NON-NLS-1$
		final Element h1 = elem.getElementsByTag("h1").get(0); //$NON-NLS-1$
		return h1.html();
	}

	@Override
	public String getGenusName() {
		return this.toFirstCap(getDoc().getElementsByClass("product__family").get(0).html()); //$NON-NLS-1$
	}

	@Override
	public List<Integer> getSowIndoorMonths() {
		return getPeriode("periode_semis_abri"); //$NON-NLS-1$
	}

	@Override
	public List<Integer> getSowOutdoorMonths() {
		return getPeriode("periode_semis_terre"); //$NON-NLS-1$
	}

	@Override
	public List<Integer> getHarvestPeriod() {
		return getPeriode("periode_recolte"); //$NON-NLS-1$
	}

	@Override
	public String getId() {
		return getDoc().getElementsByClass("product__reference") //$NON-NLS-1$
				.get(0).getElementsByIndexEquals(0).get(0).html();
	}

	/**
	 * Gets a list of week from an html element in the doc identified by the given id
	 * 
	 * @param id
	 *            the id
	 * @return a list of integer
	 */
	private List<Integer> getPeriode(final String id) {
		final String months = this.getById(id);
		if ((months == null) || months.isBlank()) {
			return Collections.<Integer> emptyList();
		}
		final ArrayList<Integer> rMonths = new ArrayList<Integer>();
		for (final Entry<String, Month> m : FillService.MONTH_MAPPER.entrySet()) {
			if (this.containsMonth(months, m.getKey())) {
				for (int i = MonthService.monthFirstWeek(m.getValue().ordinal() + 1); i <= MonthService
						.monthLastQuater(m.getValue().ordinal() + 1); i++) {
					rMonths.add(i);
				}
			}
		}
		return rMonths;
	}

	@Override
	public String getDescription() {
		return getDoc().getElementsByClass("product__description").first().text(); //$NON-NLS-1$
	}

}
