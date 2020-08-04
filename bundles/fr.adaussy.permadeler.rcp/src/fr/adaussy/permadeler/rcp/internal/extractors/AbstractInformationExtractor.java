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

import java.net.MalformedURLException;
import java.net.URL;
import java.text.Normalizer;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Reference;

/**
 * Abstract class used to create an Plant from an URL website
 * 
 * @author Arthur Daussy
 */
public abstract class AbstractInformationExtractor {

	private static final String META_URL = "og:url";

	private final Document doc;

	private final URL url;

	private final String extractorName;

	private String latinName;

	private String commonName;

	/**
	 * Simple constructor
	 * 
	 * @param doc
	 *            a JSoup doc
	 * @param url
	 *            an URL
	 * @param extractorName
	 *            the name of the extractor
	 */
	public AbstractInformationExtractor(Document doc, URL url, String extractorName) {
		super();
		this.doc = doc;
		this.url = url;
		this.extractorName = extractorName;
	}

	/**
	 * Returns the extractorName.
	 * 
	 * @return the extractorName
	 */
	public String getExtractorName() {
		return extractorName;
	}

	/**
	 * Returns the doc.
	 * 
	 * @return the doc
	 */
	public Document getDoc() {
		return doc;
	}

	/**
	 * Return a same string with the first char using cap letter
	 * 
	 * @param v
	 *            a string
	 * @return a string
	 */
	protected String toFirstCap(final String v) {
		if (v == null) {
			return v;
		}
		return StringUtils.capitalize(v.toLowerCase());
	}

	public String getLatinName() {
		if (latinName == null) {
			latinName = fetchLatinName();
		}
		return latinName;
	}

	public abstract String fetchLatinName();

	public String getCommonName() {
		if (commonName == null) {
			commonName = fetchCommonName();
		}
		return commonName;
	}

	public abstract String fetchCommonName();

	public abstract String getGenusName();

	public abstract String getId();

	public abstract List<Integer> getSowIndoorMonths();

	public abstract List<Integer> getSowOutdoorMonths();

	public abstract List<Integer> getHarvestPeriod();

	public abstract String getDescription();

	/**
	 * Builds the reference object matching this site URL
	 * 
	 * @return a new reference object
	 */
	public Reference buildReference() {
		Reference ref = PermadelerFactory.eINSTANCE.createReference();
		ref.setSource(extractorName);
		ref.setLink(getUrl());
		return ref;
	}

	protected String getById(final String id) {
		Element elementById = doc.getElementById(id);
		if (elementById != null) {
			return this.toFirstCap(elementById.html());
		}
		return "";
	}

	protected boolean containsMonth(final String months, final String expectedMonth) {
		return Normalizer.normalize(months.toLowerCase(), Normalizer.Form.NFD)
				.contains(Normalizer.normalize(expectedMonth.toLowerCase(), Normalizer.Form.NFD));
	}

	/**
	 * Returns the url.
	 * 
	 * @return the url
	 */
	public URL getUrl() {
		URL metaUrl = getMetaUrl(getDoc());
		if (metaUrl != null) {
			return metaUrl;
		}
		return url;
	}

	/**
	 * Gets the meta URL from the document
	 * 
	 * @param doc
	 *            a {@link Document}
	 * @return an {@link URL} or <code>null</code>
	 */
	public static URL getMetaUrl(Document doc) {
		String metaUrl = getMetaProp(doc, META_URL);
		try {
			return new URL(metaUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getImageLink() {
		return getMetaProp(getDoc(), "og:image");
	}

	/**
	 * Gets the meta property with the given name
	 * 
	 * @param doc
	 *            the doc do request
	 * @param property
	 *            the property name
	 * @return the value of the property or <code>null</code>
	 */
	public static String getMetaProp(Document doc, String property) {
		for (Element e : doc.getElementsByTag("meta")) {
			String prop = e.attr("property");
			if (property.equals(prop)) {
				return e.attr("content");
			}
		}

		return null;
	}

}
