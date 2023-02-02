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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
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
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.dialogs.ImageSelectionDialog;

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
		MONTH_MAPPER.put("f�vrier", Month.FEBRUARY); //$NON-NLS-1$
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
	 * Select an image for the given {@link Plant}
	 * 
	 * @param e
	 *            an element
	 */
	public static void selectImage(final Plant e) {
		Shell shell = getActiveShell();
		String iconKey = e.getIconKey();
		final ImageSelectionDialog dialog = new ImageSelectionDialog(shell, iconKey,
				ImageProvider.INSTANCE.getPreviews());
		if (dialog.open() == Dialog.OK) {
			e.setIconKey(dialog.getSelection());
		}
	}

	/**
	 * Select an image for the given {@link Plant}
	 * 
	 * @param e
	 *            an element
	 */
	public static void selectRepresentation(final Plant e) {
		Shell shell = getActiveShell();
		String iconKey = e.getIconKey();
		final ImageSelectionDialog dialog = new ImageSelectionDialog(shell, iconKey, ImageProvider.INSTANCE
				.getRepresentations().stream().collect(Collectors.toMap(v -> v, v -> v)));
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
					String urlFileExtension = "png"; //$NON-NLS-1$
					try (InputStream openStream = url.openStream()) {
						iter = ImageIO.getImageReaders(ImageIO.createImageInputStream(openStream));

						if (!iter.hasNext()) {

							throw new RuntimeException("No readers found!"); //$NON-NLS-1$

						}
						urlFileExtension = iter.next().getFormatName().toLowerCase();
					} catch (IOException e1) {
						RcpPlugin.logError("Error during image download " + e1.getMessage(), e1); //$NON-NLS-1$
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

	public static Path getSessionImageFolder(Session session) {
		final Path airdPath = toPath(session.getSessionResource().getURI()).getParent();
		if (airdPath != null) {
			return getImageFolder(airdPath);
		}
		return null;
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
		if (uri != null) {
			if (uri.isPlatformResource()) {

				org.eclipse.core.runtime.Path path = new org.eclipse.core.runtime.Path(
						uri.toPlatformString(true));
				final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				if (file.exists()) {
					return file.getLocation().toFile().toPath();
				}
			} else if (uri.isFile()) {
				return Path.of(java.net.URI.create(uri.toString()));
			}
		}
		return null;
	}

}
