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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import fr.adaussy.permadeler.rcp.internal.extractors.ExtractorFactory.SowType;
import fr.adaussy.permadeler.rcp.services.MonthService;

/**
 * Extractor that parse a Saint marth web page of collect information
 * 
 * @author adaussy
 */
public class SaintMartheExtractor extends AbstractInformationExtractor {

	private static final String VARIETE2 = "Variete"; //$NON-NLS-1$

	private static final String CARACTERISTIQUE = "Caracteristique"; //$NON-NLS-1$

	private static final String EMPTY = ""; //$NON-NLS-1$

	private static final String NOM_LATIN_CARAC = "Nom Latin "; //$NON-NLS-1$

	private static final String EXTRACTOR_NAME = "SaintMarthe"; //$NON-NLS-1$

	private SowType sowType;

	/**
	 * Simple constructor
	 * 
	 * @param doc
	 *            a {@link Document}
	 * @param url
	 *            an {@link URL}
	 * @param sowType
	 *            the expected type of sow
	 */
	public SaintMartheExtractor(Document doc, URL url, SowType sowType) {
		super(doc, url, EXTRACTOR_NAME);
		this.sowType = sowType;
	}

	@Override
	public String fetchLatinName() {
		String latinName = getCarac(NOM_LATIN_CARAC);
		String variete = getCarac(VARIETE2);
		if (variete == null) {
			variete = ""; //$NON-NLS-1$
		} else {
			variete = variete.trim();
		}
		return latinName + " '" + variete + "'"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Gets the characteristic in the document
	 * 
	 * @param caracPrefix
	 *            prefix of the type of carac
	 * @return a value or <code>null</code>
	 */
	private String getCarac(String caracPrefix) {
		for (Element e : getDoc().getElementsByClass(CARACTERISTIQUE)) {
			String text = e.text().trim();
			if (text.startsWith(caracPrefix)) {
				return text.replace(caracPrefix, EMPTY);
			}
		}
		return null;
	}

	@Override
	public String fetchCommonName() {
		for (Element e : getDoc().getElementsByClass("pageTitle")) { //$NON-NLS-1$
			return WordUtils.capitalizeFully(e.text().toLowerCase());
		}
		return null;
	}

	@Override
	public String getGenusName() {
		String latinName = getLatinName();
		if (latinName != null) {
			String[] parts = latinName.split(" "); //$NON-NLS-1$
			return parts[0];
		}
		return latinName;
	}

	@Override
	public String getId() {
		return getCarac("Reference "); //$NON-NLS-1$
	}

	/**
	 * Gets a list of weeks for the given class name
	 * 
	 * @param className
	 *            the class name
	 * @return a list f week number
	 */
	private List<Integer> getPeriod(String className) {
		for (Element e : getDoc().getElementsByClass(className)) {
			int mont = 1;
			List<Integer> weeks = new ArrayList<Integer>();
			for (Element month : e.getElementsByTag("li")) { //$NON-NLS-1$
				if (month.hasClass("selected")) { //$NON-NLS-1$
					for (int i = MonthService.monthFirstWeek(mont); i <= MonthService
							.monthLastQuater(mont); i++) {
						weeks.add(i);
					}
				}
				mont++;
			}

			return weeks;
		}

		return Collections.emptyList();
	}

	@Override
	public List<Integer> getSowIndoorMonths() {
		if (sowType == SowType.INDOOR || sowType == SowType.BOTH) {
			return getPeriod("saison1"); //$NON-NLS-1$
		}
		return Collections.emptyList();
	}

	@Override
	public List<Integer> getSowOutdoorMonths() {
		if (sowType == SowType.OUTDOOR || sowType == SowType.BOTH) {
			return getPeriod("saison1"); //$NON-NLS-1$
		}
		return Collections.emptyList();
	}

	@Override
	public List<Integer> getHarvestPeriod() {
		return getPeriod("saison2"); //$NON-NLS-1$
	}

	@Override
	public String getDescription() {
		for (Element e : getDoc().getElementsByClass("description")) { //$NON-NLS-1$
			return e.html();
		}
		return null;
	}

}
