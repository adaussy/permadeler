/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.dialogs;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryGroupRenderer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.nebula.widgets.gallery.GalleryItem;
import org.eclipse.nebula.widgets.gallery.ListItemRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.adaussy.permadeler.model.edit.ImageProvider;
import fr.adaussy.permadeler.rcp.RcpMessages;

/**
 * Dialog used to select on image
 * 
 * @author Arthur Daussy
 */
public class ImageSelectionDialog extends Dialog {

	private static final String ALL_CHAR_REGEX = ".*"; //$NON-NLS-1$

	private static final int SIZE = 50;

	private String selection;

	private Text selectionText;

	private Text filterText;

	private GalleryItem matchingGroup;

	private GalleryItem allGroup;

	private Map<String, String> nameToImagePath;

	public ImageSelectionDialog(Shell shell, String initialSelection, Map<String, String> nameToImagePath) {
		super(shell);
		this.selection = initialSelection;
		this.nameToImagePath = nameToImagePath;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Point getInitialSize() {
		Rectangle bounds = getDisplayBounds();
		return new Point((int)(bounds.width * 0.6), (int)(bounds.height * 0.8));
	}

	protected Rectangle getDisplayBounds() {
		Display display = Display.getCurrent();
		if (display == null) {
			display = Display.getCurrent();
		}
		Rectangle bounds = display.getBounds();
		return bounds;
	}

	@Override
	protected Point getInitialLocation(Point initialSize) {
		Rectangle bounds = getDisplayBounds();
		int x = (bounds.width - initialSize.x) / 2;
		int y = (bounds.height - initialSize.y) / 2;
		return new Point(x, y);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		filterText = new Text(cc, SWT.BORDER);
		filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		filterText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				String text = filterText.getText();
				final Predicate<String> filter;
				if (text != null) {
					String replacement = "\\E.*\\Q"; //$NON-NLS-1$
					String regex = ALL_CHAR_REGEX
							+ ("\\Q" + text.toLowerCase() + "\\E").replace("*", replacement) + ALL_CHAR_REGEX; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
																												// //$NON-NLS-4$
					filter = label -> label.toLowerCase().matches(regex);
				} else {
					filter = label -> true;
				}
				for (int i = matchingGroup.getItemCount(); i > 0; i--) {
					matchingGroup.remove(i - 1);
				}
				matchingGroup.setText(MessageFormat.format(RcpMessages.ImageSelectionDialog_0, text));
				ImageProvider.INSTANCE.getPreviews().entrySet().stream().filter(l -> filter.test(l.getKey()))
						.sorted(Comparator.comparing(Entry::getKey)).forEach(path -> {
							addItem(matchingGroup, path);
						});
				matchingGroup.getParent().redraw();
			}
		});

		Gallery gallery = new Gallery(cc, SWT.V_SCROLL);
		gallery.setLayoutData(new GridData(GridData.FILL_BOTH));

		DefaultGalleryGroupRenderer gr = new DefaultGalleryGroupRenderer();
		gr.setMinMargin(2);
		gr.setItemHeight(SIZE);
		gr.setItemWidth(SIZE);
		gr.setAutoMargin(true);
		gallery.setGroupRenderer(gr);

		ListItemRenderer ir = new ListItemRenderer();
		gallery.setItemRenderer(ir);

		matchingGroup = new GalleryItem(gallery, SWT.NONE);
		matchingGroup.setText(RcpMessages.ImageSelectionDialog_1);
		matchingGroup.setExpanded(true);

		allGroup = new GalleryItem(gallery, SWT.NONE);
		allGroup.setText(RcpMessages.ImageSelectionDialog_2);
		allGroup.setExpanded(true);

		nameToImagePath.entrySet().stream().sorted(Comparator.comparing(Entry::getKey)).forEach(path -> {
			addItem(allGroup, path);
		});

		gallery.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GalleryItem[] gSelection = gallery.getSelection();
				if (gSelection != null && gSelection.length > 0) {
					selection = (String)gSelection[0].getData();
					selectionText.setText(selection);
				}
			}
		});

		selectionText = new Text(cc, SWT.READ_ONLY | SWT.BORDER);
		selectionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if (selection != null) {
			selectionText.setText(selection);
		}

		return cc;
	}

	/**
	 * Adds an item into the gallery
	 * 
	 * @param group
	 *            the owning group
	 * @param path
	 *            the path of the image
	 */
	private void addItem(GalleryItem group, Entry<String, String> path) {
		GalleryItem item = new GalleryItem(group, SWT.NONE);
		Image image = ImageProvider.INSTANCE.getImage(path.getValue());
		if (image != null) {
			item.setImage(image);
		}
		item.setText("Item " + path); //$NON-NLS-1$
		item.setData(path.getKey());
	}

	public String getSelection() {
		return selection;
	}

}
