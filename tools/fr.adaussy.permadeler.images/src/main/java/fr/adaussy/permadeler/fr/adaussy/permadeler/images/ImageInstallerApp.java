/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.fr.adaussy.permadeler.images;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;

import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.transcoder.AbstractTranscoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * Small app use to prepare the image tree folder.
 * <p>
 * It browses a folder, find all SVG. Then copy them in the correct folder and create a preview using a png
 * format
 * </p>
 * 
 * @author Arthur Daussy
 */
public class ImageInstallerApp {

	private static final String PT = "pt"; //$NON-NLS-1$

	private static final String WIDTH_SVG_ATTR = "width"; //$NON-NLS-1$

	private static final String HEIGHT_SVG_ATTR = "height"; //$NON-NLS-1$

	private static final String PNG = ".png"; //$NON-NLS-1$

	private static final String PREVIEW = "preview"; //$NON-NLS-1$

	private static final String SVG = "svg"; //$NON-NLS-1$

	private static final String ICONS = "icons"; //$NON-NLS-1$

	private static final int PREVIEW_RES = 50;

	private static final int ICON_RES = 16;

	private static final PNGTranscoder T_16 = new PNGTranscoder();

	private static final PNGTranscoder T_50 = new PNGTranscoder();

	private static String parser = XMLResourceDescriptor.getXMLParserClassName();

	private static SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);

	static {
		T_16.addTranscodingHint(PNGTranscoder.KEY_HEIGHT, Float.valueOf(ICON_RES));
		T_16.addTranscodingHint(PNGTranscoder.KEY_WIDTH, Float.valueOf(ICON_RES));
		T_50.addTranscodingHint(PNGTranscoder.KEY_HEIGHT, Float.valueOf(PREVIEW_RES));
		T_50.addTranscodingHint(PNGTranscoder.KEY_WIDTH, Float.valueOf(PREVIEW_RES));
	}

	/**
	 * Prepare the image folder for the app
	 * 
	 * @param args
	 *            arg[0] source folder arg[1] target folder
	 * @throws IOException
	 *             is something goes wrong
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(args[0]);
		Path mainTarget = Paths.get(args[1]);
		final boolean override;
		if (args.length > 2) {
			override = Boolean.valueOf(args[2]);
		} else {
			override = false;
		}
		mainTarget.toFile().mkdirs();
		Files.walk(path).filter(p -> p.getFileName().toString().endsWith(SVG) && p.toFile().isFile())
				.forEach(i -> {
					try {
						Path target = mainTarget.resolve(i.getFileName());
						transformSVG(i, target, 100, override);
						transform(i, getXFileName(i.getFileName().toString(), mainTarget, ICONS), T_16,
								override);
						transform(i, getXFileName(i.getFileName().toString(), mainTarget, PREVIEW), T_50,
								override);
					} catch (IOException | TranscoderException e) {
						e.printStackTrace();
					}
				});
	}

	/**
	 * Gets the path of the target image
	 * 
	 * @param inputFile
	 *            the input file name
	 * @param mainTarget
	 *            the target folder
	 * @param folderName
	 *            the name of the subfolder
	 * @return a path
	 */
	private static Path getXFileName(String inputFile, Path mainTarget, String folderName) {

		Path png16 = mainTarget.resolve(folderName);
		if (!png16.toFile().exists()) {
			png16.toFile().mkdirs();
		}

		return png16.resolve(toPng(inputFile));

	}

	private static String toPng(String svgName) {
		int index = svgName.lastIndexOf('.');
		return svgName.substring(0, index) + PNG;
	}

	/**
	 * Transforms the input SVG into another svg with a different size
	 * 
	 * @param source
	 *            the source parth
	 * @param target
	 *            the target path
	 * @param maxSize
	 *            the size of the SCG
	 * @param override
	 *            hold <code>true</code> to override existing file
	 * @throws IOException
	 *             if something goes wrong during save
	 * @throws TranscoderException
	 *             if something goes wrong during transformation
	 */
	public static void transformSVG(Path source, Path target, int maxSize, boolean override)
			throws IOException, TranscoderException {
		if (!override && target.toFile().exists()) {
			System.out.println(MessageFormat.format("Target {0} already exist. Do not override", target)); //$NON-NLS-1$
			return;
		}
		System.out.println("Converting " + source); //$NON-NLS-1$

		File outputFile = target.toFile();

		try (FileWriter writer = new FileWriter(outputFile)) {

			try (FileReader reader = new FileReader(source.toFile())) {

				SVGDocument doc = factory.createSVGDocument(source.toUri().toASCIIString(), reader);

				Element docElement = doc.getDocumentElement();
				modifyHeightAndWidth(maxSize, docElement);
				SVGGraphics2D graphics = new SVGGraphics2D(doc);
				Element documentElement = doc.getDocumentElement();
				graphics.stream(documentElement, writer, true, false);
			}
			// CHECKSTYLE:OFF Main application can do that
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		// CHECKSTYLE:ON
	}

	/**
	 * Modify the size of the input Element
	 * 
	 * @param maxSize
	 *            the max size
	 * @param docElement
	 *            the input element
	 */
	private static void modifyHeightAndWidth(int maxSize, Element docElement) {
		String heightAttribute = docElement.getAttribute(HEIGHT_SVG_ATTR);
		String widthAttribute = docElement.getAttribute(WIDTH_SVG_ATTR);

		final float height;
		if (heightAttribute == null || heightAttribute.isBlank()) {
			height = 1;
		} else {
			height = Float.valueOf(heightAttribute.replaceFirst(PT, "")); //$NON-NLS-1$
		}

		final float width;
		if (widthAttribute == null || widthAttribute.isBlank()) {
			width = 1;
		} else {
			width = Float.valueOf(widthAttribute.replaceFirst(PT, "")); //$NON-NLS-1$
		}
		if (height > width) {
			float newWidth = width * maxSize / height;
			docElement.setAttributeNS(null, HEIGHT_SVG_ATTR, maxSize + PT);
			docElement.setAttributeNS(null, WIDTH_SVG_ATTR, newWidth + PT);
		} else {
			float newHeight = height * maxSize / width;
			docElement.setAttributeNS(null, HEIGHT_SVG_ATTR, newHeight + PT);
			docElement.setAttributeNS(null, WIDTH_SVG_ATTR, maxSize + PT);
		}
	}

	/**
	 * Transform a input svg into another format defined by the transformer
	 * 
	 * @param source
	 *            the source path
	 * @param target
	 *            the target path
	 * @param transocder
	 *            a transcoder
	 * @param override
	 *            holds <code>true</code> to override exiting file
	 * @throws IOException
	 *             if something goes wrong during save
	 * @throws TranscoderException
	 *             if something goes wrong during transformation
	 */
	public static void transform(Path source, Path target, AbstractTranscoder transocder, boolean override)
			throws IOException, TranscoderException {
		if (!override && target.toFile().exists()) {
			System.out.println(MessageFormat.format("Target {0} already exist. Do not override", target)); //$NON-NLS-1$
			return;
		}
		System.out.println("Converting " + source); //$NON-NLS-1$

		File outputFile = target.toFile();

		try (OutputStream outStream = new FileOutputStream(outputFile)) {

			SVGDocument doc = factory.createSVGDocument(source.toUri().toString());
			TranscoderInput input = new TranscoderInput(doc);

			TranscoderOutput output = new TranscoderOutput(outStream);

			transocder.transcode(input, output);
			// CHECKSTYLE:OFF Main application can do that
		} catch (Exception e) {
			e.printStackTrace(System.err);
		} // CHECKSTYLE:ON
	}

}
