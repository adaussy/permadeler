/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.services;

import static java.util.stream.Collectors.toList;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.MessageFormat;
import java.time.Month;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import fr.adaussy.permadeler.common.BotanicNameHelper;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.dialogs.ImageSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.SpeciesCreationDialog;
import fr.adaussy.permadeler.rcp.internal.extractors.AbstractInformationExtractor;
import fr.adaussy.permadeler.rcp.internal.extractors.ExtractorFactory;

/**
 * Service use to fill elements
 * 
 * @author Arthur Daussy
 */
public final class FillService {

	/**
	 * Franch to english month mapper
	 */
	public static final Map<String, Month> MONTH_MAPPER;

	private static final String IMG_FOLDER_NAME = "images"; //$NON-NLS-1$

	private static final String DOT = "."; //$NON-NLS-1$

	private static final String INVALID_FEATURE_MANY = "Invalid many feature named {0} on {1}"; //$NON-NLS-1$

	private static final String EMPTY = ""; //$NON-NLS-1$

	static {
		MONTH_MAPPER = new LinkedHashMap<String, Month>();
		MONTH_MAPPER.put("janvier", Month.JANUARY); //$NON-NLS-1$
		MONTH_MAPPER.put("février", Month.FEBRUARY); //$NON-NLS-1$
		MONTH_MAPPER.put("mars", Month.MARCH); //$NON-NLS-1$
		MONTH_MAPPER.put("avril", Month.APRIL); //$NON-NLS-1$
		MONTH_MAPPER.put("mai", Month.MAY); //$NON-NLS-1$
		MONTH_MAPPER.put("juin", Month.JUNE); //$NON-NLS-1$
		MONTH_MAPPER.put("juillet", Month.JULY); //$NON-NLS-1$
		MONTH_MAPPER.put("aout", Month.AUGUST); //$NON-NLS-1$
		MONTH_MAPPER.put("septembre", Month.SEPTEMBER); //$NON-NLS-1$
		MONTH_MAPPER.put("octobre", Month.OCTOBER); //$NON-NLS-1$
		MONTH_MAPPER.put("novembre", Month.NOVEMBER); //$NON-NLS-1$
		MONTH_MAPPER.put("decembre", Month.DECEMBER); //$NON-NLS-1$

	}

	private FillService() {
	}

	/**
	 * Gets a String from the clipboard
	 * 
	 * @return a String or ""
	 */
	private static String getStringFromClipboard() {
		Display display = getActiveShell().getDisplay();
		final Clipboard cb = new Clipboard(display);
		final TextTransfer transfer = TextTransfer.getInstance();
		final Object data = cb.getContents(transfer);
		if (data instanceof String) {
			return (String)data;
		}
		return EMPTY;
	}

	public static void modifyList(final EObject o, final String featureName, final Object value,
			final boolean add) {
		if (add) {
			eAdd(o, featureName, value);
		} else {
			eRemove(o, featureName, value);
		}
	}

	/**
	 * Select an image for the given {@link PlantNamedElement}
	 * 
	 * @param e
	 *            an element
	 */
	public static void selectImage(final PlantNamedElement e) {
		Shell shell = getActiveShell();
		String representationKey = e.getRepresentationKey();
		final ImageSelectionDialog dialog = new ImageSelectionDialog(shell, representationKey);
		if (dialog.open() == Dialog.OK) {
			e.setRepresentationKey(dialog.getSelection());
		}
	}

	/**
	 * Adds the given value in the "many" feature represented by the given name
	 * 
	 * @param objectToModify
	 *            the owner
	 * @param featureName
	 *            the name of the feature
	 * @param value
	 *            the value to add
	 */
	@SuppressWarnings("unchecked")
	public static void eAdd(final EObject objectToModify, final String featureName, final Object value) {
		EStructuralFeature eStructuralFeature = objectToModify.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null || !eStructuralFeature.isMany()) {
			RcpPlugin.logError(
					MessageFormat.format(INVALID_FEATURE_MANY, featureName, objectToModify.eClass()));
			return;
		}
		((List<Object>)objectToModify.eGet(eStructuralFeature)).add(value);
	}

	/**
	 * Removes the given value in the "many" feature represented by the given name
	 * 
	 * @param objectToModify
	 *            the owner
	 * @param featureName
	 *            the name of the feature
	 * @param value
	 *            the value to remove
	 */
	@SuppressWarnings("unchecked")
	public static void eRemove(final EObject objectToModify, final String featureName, final Object value) {
		EStructuralFeature eStructuralFeature = objectToModify.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null || !eStructuralFeature.isMany()) {
			RcpPlugin.logError(
					MessageFormat.format(INVALID_FEATURE_MANY, featureName, objectToModify.eClass()));
			return;
		}
		((List<Object>)objectToModify.eGet(eStructuralFeature)).remove(value);
	}

	/**
	 * Removes the given value in the "many" feature represented by the given name. If the given value if a
	 * collection then remove one by one all values
	 * 
	 * @param objectToModify
	 *            the owner
	 * @param featureName
	 *            the name of the feature
	 * @param toRemove
	 *            the value(s) to remove
	 */
	public static void eRemoveAll(final EObject objectToModify, final String featureName,
			final Object toRemove) {
		EStructuralFeature eStructuralFeature = objectToModify.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null || !eStructuralFeature.isMany()) {
			RcpPlugin.logError(
					MessageFormat.format(INVALID_FEATURE_MANY, featureName, objectToModify.eClass()));
			return;
		}
		final List<?> list = (List<?>)objectToModify.eGet(eStructuralFeature);
		if (toRemove instanceof Collection) {
			for (final Object o2 : (Collection<?>)toRemove) {
				list.remove(o2);
			}
		} else {
			list.remove(toRemove);
		}
	}

	/**
	 * Creates a plant by reading a HTML document located at the given {@link URL}
	 * 
	 * @param knowledge
	 *            a {@link KnowledgeBase}
	 * @param sourceURL
	 *            the source {@link URL}
	 * @return a new {@link Plant} or <code>null</code> if no creation occured
	 * @throws IOException
	 *             if something went wrong during parsing the file
	 */
	public static Plant createFromURL(final KnowledgeBase knowledge, String sourceURL) throws IOException {
		SpeciesCreationDialog dialog = new SpeciesCreationDialog(getActiveShell(), sourceURL);
		Plant result = null;
		if (dialog.open() == Dialog.OK) {

			URL url = dialog.getUrl();
			if (url != null) {
				StringBuffer sb = new StringBuffer();
				try (Scanner sc = new Scanner(url.openStream(), Charset.forName("UTF-8"))) {
					while (sc.hasNext()) {
						sb.append(sc.nextLine());
					}
				}
				final Document doc = Jsoup.parse(sb.toString());
				AbstractInformationExtractor extractor = new ExtractorFactory().buildExtractor(doc, url,
						dialog.getSowType());
				if (extractor != null) {

					result = createPlant(knowledge, extractor);
				}

			}

			if (result != null) {
				result.setEatingType(dialog.getEatingType());
			}
		}

		return result;
	}

	/**
	 * Creates a plant (and add it to the knowledge base) using te given extractor
	 * 
	 * @param knowledge
	 *            the knowledge base
	 * @param extractor
	 *            the extractor
	 * @return a plant
	 */
	private static Plant createPlant(final KnowledgeBase knowledge, AbstractInformationExtractor extractor) {

		String latinName = extractor.getLatinName();
		Matcher matcher = BotanicNameHelper.LATIN_NAME.matcher(latinName.trim().toLowerCase());
		Genus owner = null;
		if (matcher.matches()) {
			String familly = matcher.group(1);
			owner = getOrCreateGenus(knowledge, familly);

			String subFamilly = matcher.group(2);
			if (subFamilly != null) {
				owner = getOrCreateSubGenus(owner, buildSubGenusName(familly, subFamilly).trim());
			}
		}

		if (owner != null) {
			return createPlant(knowledge, extractor, latinName, owner);
		}
		return null;
	}

	/**
	 * Builds a genus qualified name
	 * 
	 * @param familly
	 *            the name of the family
	 * @param subFamilly
	 *            the name of the sub family
	 * @return a qualified name
	 */
	private static String buildSubGenusName(String familly, String subFamilly) {
		return familly + " " + subFamilly;
	}

	/**
	 * Creates a new plant using a {@link AbstractInformationExtractor}
	 * 
	 * @param knowledge
	 *            base used to find an existing plant
	 * @param extractor
	 *            the extractor
	 * @param latinName
	 *            the complete latin name of the plant
	 * @param owner
	 *            the owning genus
	 * @return a new Plant or <code>null</code>
	 */
	private static Plant createPlant(final KnowledgeBase knowledge, AbstractInformationExtractor extractor,
			String latinName, Genus owner) {
		Genus newOwner = owner;
		final Optional<Plant> existing = getMatchingPlant(knowledge, buildPlantMatchingPredicate(latinName));
		final Plant plant = existing.orElseGet(() -> {
			Plant p = PermadelerFactory.eINSTANCE.createPlant();
			p.setLatinName(extractor.getLatinName());
			p.setName(extractor.getCommonName());
			p.getCommonNames().add(extractor.getCommonName());
			p.getReferences().add(extractor.buildReference());

			newOwner.getSpecies().add(p);
			ECollections.sort(newOwner.getSpecies(), Comparators.SPECIES_CMP);
			return p;
		});
		setEList(plant.getSowIndoorMonths(), extractor.getSowIndoorMonths());
		setEList(plant.getSowOutdoorMonths(), extractor.getSowOutdoorMonths());
		setEList(plant.getProductiveMonths(), extractor.getHarvestPeriod());
		plant.setDescription(extractor.getDescription());

		if (plant.getImages().isEmpty()) {

			String imageLink = extractor.getImageLink();
			if (imageLink != null) {
				Image img = PermadelerFactory.eINSTANCE.createImage();
				img.setSource(imageLink);
				img.setTitle(plant.getName());
				downloadImage(knowledge, img);
				plant.getImages().add(img);
			}
		}
		return plant;
	}

	public static Optional<Plant> getMatchingPlant(final KnowledgeBase base,
			final Predicate<Plant> predicate) {
		return EMFUtils.<Plant> getChildren(base, Plant.class).filter(predicate).findFirst();
	}

	private static <T> void setEList(EList<T> toSet, Collection<T> toAdd) {
		toSet.clear();
		toSet.addAll(toAdd);
	}

	/**
	 * Adds several strings into the given feature that should return a EList<String>. The different string
	 * asked from the user using a input dialog. This value is then split using the given separator
	 * 
	 * @param objectToModify
	 *            the object about to be modified
	 * @param featureName
	 *            the name of the feature to modify
	 * @param message
	 *            the message to display in the dialog
	 * @param separator
	 *            the separator
	 */
	public static void addSeveralStrings(final EObject objectToModify, final String featureName,
			final String message, final String separator) {
		EStructuralFeature eStructuralFeature = objectToModify.eClass().getEStructuralFeature(featureName);
		if (eStructuralFeature == null || !eStructuralFeature.isMany()) {
			RcpPlugin.logError(
					MessageFormat.format(INVALID_FEATURE_MANY, featureName, objectToModify.eClass()));
			return;
		}

		InputDialog dialog = new InputDialog(getActiveShell(), "Input", message, getStringFromClipboard(), //$NON-NLS-1$
				null);
		if (dialog.open() == Window.OK) {
			final String value = dialog.getValue();
			if (value != null) {
				@SuppressWarnings("unchecked")
				final List<String> list = (List<String>)objectToModify.eGet(eStructuralFeature);
				if (separator != null) {
					for (final String split : value.split(separator)) {
						list.add(split.trim());
					}
				} else {
					list.add(value);
				}
			}
		}
	}

	private static Shell getActiveShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}

	/**
	 * Download an image
	 * 
	 * @param container
	 *            any eObject (used to find the current session)
	 * @param imgObject
	 *            the image object use to get the url of the image to download
	 */
	public static void downloadImage(final EObject container, final Image imgObject) {
		if ((imgObject.getSource() != null) && (imgObject.getTitle() != null)) {
			final Path airdPath = toPath(
					SessionManager.INSTANCE.getSession(container).getSessionResource().getURI());
			if (airdPath != null) {
				final Path parent = airdPath.getParent();
				final Path imageFolder = getImageFolder(parent);
				String source = imgObject.getSource();
				try {
					URL url = new URL(source);

					Iterator<ImageReader> iter;
					String urlFileExtension = "png";
					try (InputStream openStream = url.openStream()) {
						iter = ImageIO.getImageReaders(ImageIO.createImageInputStream(openStream));

						if (!iter.hasNext()) {

							throw new RuntimeException("No readers found!");

						}
						urlFileExtension = iter.next().getFormatName().toLowerCase();
					} catch (IOException e1) {
						RcpPlugin.logError("Error during image download " + e1.getMessage(), e1);
					}
					try (InputStream in = new BufferedInputStream(url.openStream())) {

						final Path imagePath = imageFolder
								.resolve(imgObject.getTitle() + DOT + urlFileExtension);
						Files.copy(in, imagePath, StandardCopyOption.REPLACE_EXISTING);
						imgObject.setPath(parent.relativize(imagePath).toString());
					} catch (IOException e) {
						RcpPlugin.logError("Error while copying image " + e.getMessage(), e); //$NON-NLS-1$
					}
				} catch (MalformedURLException e) {
					RcpPlugin.logError("Error while copying image " + e.getMessage(), e); //$NON-NLS-1$
				}
			}
		}
	}

	/**
	 * Gets the default image folder from in a given path
	 * 
	 * @param parent
	 *            a parent path
	 * @return a existing folder
	 */
	private static Path getImageFolder(final Path parent) {
		final Path imageFolder = parent.resolve(IMG_FOLDER_NAME);
		if (!imageFolder.toFile().isDirectory()) {
			imageFolder.toFile().mkdirs();
		}
		return imageFolder;
	}

	/**
	 * Transform a URI to a Path
	 * 
	 * @param uri
	 *            an UR
	 * @return a path or null
	 */
	public static Path toPath(final URI uri) {
		if (uri != null && uri.isPlatformResource()) {
			org.eclipse.core.runtime.Path path = new org.eclipse.core.runtime.Path(
					uri.toPlatformString(true));
			final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file.exists()) {
				return file.getLocation().toFile().toPath();
			}
		}
		return null;
	}

	/**
	 * Builds a predicate use to match {@link Plant}s with a given latin lname
	 * 
	 * @param latinName
	 *            a latin name
	 * @return a {@link Predicate}
	 */
	private static Predicate<Plant> buildPlantMatchingPredicate(final String latinName) {
		return p -> {
			return p.getLatinName() != null && p.getLatinName().equalsIgnoreCase(latinName);
		};
	}

	/**
	 * Gets or creates the genus with the matching name (may open a windows to ash for selection)
	 * 
	 * @param base
	 *            the knowledge base
	 * @param latinName
	 *            the latin name of the genus
	 * @return an existing genus or a new one
	 */
	public static Genus getOrCreateGenus(final KnowledgeBase base, String latinName) {
		if (latinName != null) {
			List<Genus> existingGeniuses = EMFUtils.getChildren(base, Genus.class).filter(it -> {
				return it.getLatinName() != null
						&& it.getLatinName().trim().toLowerCase().equalsIgnoreCase(latinName);
			}).collect(toList());
			if (!existingGeniuses.isEmpty()) {
				return selectExistingGenus(base, existingGeniuses);
			} else {

				final Genus genus = PermadelerFactory.eINSTANCE.createGenus();
				genus.setName(latinName);
				genus.setLatinName(latinName);

				EList<Genus> plantTypes = base.getPlantTypes();
				plantTypes.add(genus);
				ECollections.sort(plantTypes, Comparators.GENUS_CMP);

				return genus;
			}
		} else {
			RcpPlugin.logError("Unable to find genus"); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * Gets or create the genus with the given parent and the given latin name
	 * 
	 * @param parent
	 *            the parent holding the genus (or future parent)
	 * @param latinName
	 *            the latin name of the genus ("ParentGenusName SubGenusName")
	 * @return a new {@link Genus} or <code>null</code>
	 */
	public static Genus getOrCreateSubGenus(final Genus parent, String latinName) {
		if (latinName != null) {
			List<Genus> existingGeniuses = parent.getSubGenus().stream().filter(it -> {
				return it.getLatinName() != null
						&& it.getLatinName().trim().toLowerCase().equalsIgnoreCase(latinName);
			}).collect(toList());
			if (!existingGeniuses.isEmpty()) {
				return selectExistingGenus(parent, existingGeniuses);
			} else {

				final Genus genus = PermadelerFactory.eINSTANCE.createGenus();
				genus.setName(latinName);
				genus.setLatinName(latinName);

				EList<Genus> subGenus = parent.getSubGenus();
				subGenus.add(genus);
				ECollections.sort(subGenus, Comparators.GENUS_CMP);

				return genus;
			}
		} else {
			RcpPlugin.logError("Unable to find genus"); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * Ask the user (if more than one) to select a genus
	 * 
	 * @param base
	 *            the knowledge base
	 * @param existingGeniuses
	 *            the selection
	 * @return a genus or <code>null</code>
	 */
	private static Genus selectExistingGenus(final EObject base, List<Genus> existingGeniuses) {
		if (existingGeniuses.size() == 1) {
			return existingGeniuses.get(0);
		} else {
			ObjectSelectionDialog<Genus> dialog = new ObjectSelectionDialog<>(getActiveShell(), Genus.class,
					t -> {
						return existingGeniuses.contains(t);
					}, base);
			if (dialog.open() == Window.OK && !dialog.getSelection().isEmpty()) {
				return dialog.getSelection().get(0);
			} else {
				return null;
			}
		}
	}
}
