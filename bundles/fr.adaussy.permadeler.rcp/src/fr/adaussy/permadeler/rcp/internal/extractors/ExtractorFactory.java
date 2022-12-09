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

import org.jsoup.nodes.Document;

/**
 * Factory that define the correct extraction from the meta URL of the parsed document
 * 
 * @author adaussy
 */
public class ExtractorFactory {

	/**
	 * Type of sow
	 * 
	 * @author Arthur Daussy
	 */
	public enum SowType {
		/**
		 * Expect indoor sow
		 */
		INDOOR,
		/**
		 * Expect outdoor sow
		 */
		OUTDOOR,
		/**
		 * Expect both
		 */
		BOTH;
	}

	/**
	 * Builds and extractor for the given {@link Document}
	 * 
	 * @param doc
	 *            a document
	 * @param url
	 *            an URL
	 * @param sowType
	 *            the default sow type
	 * @return an {@link AbstractInformationExtractor} or <code>null</code> if not extractator available for
	 *         this document
	 */
	public AbstractInformationExtractor buildExtractor(Document doc, URL url, SowType sowType) {
		URL metaUrl = AbstractInformationExtractor.getMetaUrl(doc);
		if (metaUrl != null) {
			if (metaUrl.toString().contains("fermedesaintemarthe")) { //$NON-NLS-1$
				return new SaintMartheExtractor(doc, url, sowType);
			} else if (metaUrl.toString().contains("kokopelli-semences")) { //$NON-NLS-1$
				return new KokopelliExtractor(url, doc);
			}
		}

		return null;
	}

}
