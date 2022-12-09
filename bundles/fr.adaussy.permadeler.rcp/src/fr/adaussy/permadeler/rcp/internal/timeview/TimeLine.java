/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.timeview;

import static fr.adaussy.permadeler.rcp.internal.timeview.Layouts.createNoSpacingLayout;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Widget;

import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.menu.MenuFiller;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineGroupDescription;
import fr.adaussy.permadeler.rcp.internal.utils.ColorHelper;
import fr.adaussy.permadeler.rcp.services.MonthService;

/**
 * UI representation of a time line
 * 
 * @author Arthur Daussy
 */
public class TimeLine {

	private static final int LINE_MIN_HEIGHT = 18;

	private final TimeLineGroupDescription target;

	private final Composite parent;

	private List<Widget> widgets = new ArrayList<Widget>();

	private Composite speciesNameComposite;

	private int monthWith;

	private int nbOfHeader;

	private ESelectionService selectionService;

	private ILabelProvider labelProvider;

	/**
	 * Simple constructor
	 * 
	 * @param target
	 *            the semantic target
	 * @param parent
	 *            a parent {@link Composite}
	 * @param monthWith
	 *            the size of a month column
	 * @param nbOfHeader
	 *            the number of column
	 * @param selectionService
	 *            the selection service
	 * @param labelProvider
	 *            the label provider
	 */
	// CHECKSTYLE:OFF This entire class need refactoring
	public TimeLine(TimeLineGroupDescription target, Composite parent, int monthWith, int nbOfHeader,
			ESelectionService selectionService, ILabelProvider labelProvider) {
		super();
		this.target = target;
		this.parent = parent;
		this.monthWith = monthWith;
		this.nbOfHeader = nbOfHeader;
		this.selectionService = selectionService;
		this.labelProvider = labelProvider;
	}
	// CHECKSTYLE:ON This entire class need refactoring

	/**
	 * Create a filled line header
	 * 
	 * @param cc
	 *            a parent
	 * @return a {@link Composite}
	 */
	private Composite createLineHeader(Composite cc) {
		Composite speciesComposite = createLineHeaderComposite(cc);

		Composite mainLabelComposite = new Composite(speciesComposite, SWT.NONE);
		GridData data0 = new GridData(SWT.END, SWT.CENTER, true, true);
		mainLabelComposite.setLayoutData(data0);

		createMainLabel(mainLabelComposite);

		// Entries labels
		Composite entriesLabelComposite = new Composite(speciesComposite, SWT.NONE);
		GridData data = new GridData();
		entriesLabelComposite.setData(data);
		GridLayout gridLayout2 = Layouts.createNoSpacingLayout(1, false);
		entriesLabelComposite.setLayout(gridLayout2);

		for (TimeLineDescription e : target.getEntries()) {
			Label labelW = new Label(entriesLabelComposite, SWT.NONE);
			labelW.setLayoutData(new GridData(GridData.END));
			String enrtyLabel = e.getEntryLabel().get();
			if (enrtyLabel != null) {
				labelW.setText(enrtyLabel);
			}
		}

		return speciesComposite;
	}

	/**
	 * Creates the main header label
	 * 
	 * @param aParent
	 *            a parent composite
	 */
	protected void createMainLabel(Composite aParent) {
		GridLayout mainLabelLayout = Layouts.createNoSpacingLayout(1, false);
		aParent.setLayout(mainLabelLayout);

		EObject semanticTarget = target.getTarget();
		Label speciesLabel = new Label(aParent, SWT.NONE | SWT.BEGINNING);
		String text = labelProvider.getText(semanticTarget);
		speciesLabel.setText(text);
		speciesLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));

		Label speciesImage = new Label(aParent, SWT.NONE | SWT.END);
		Image image = labelProvider.getImage(semanticTarget);
		speciesImage.setImage(image);
		speciesImage.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));

		createContextMenu(aParent, speciesLabel, speciesImage);
	}

	/**
	 * Creates the line header composite
	 * 
	 * @param cc
	 *            a parent composite
	 * @return a new {@link Composite}
	 */
	private Composite createLineHeaderComposite(Composite cc) {
		Composite speciesComposite = new Composite(cc, SWT.BORDER);
		GridLayout gridLayout = Layouts.createNoSpacingLayout(2, false);
		gridLayout.horizontalSpacing = 5;
		gridLayout.marginLeft = 5;
		gridLayout.marginRight = 5;
		speciesComposite.setLayout(gridLayout);
		GridData speciesLayoutData = new GridData(GridData.BEGINNING);
		speciesLayoutData.horizontalSpan = 1;
		speciesLayoutData.minimumWidth = Layouts.LABEL_WIDTH;
		speciesLayoutData.widthHint = Layouts.LABEL_WIDTH;
		speciesLayoutData.verticalSpan = target.getEntries().size();
		speciesComposite.setLayoutData(speciesLayoutData);
		return speciesComposite;
	}

	/**
	 * Creates a contextual menu on a given control
	 * 
	 * @param controls
	 *            list of control
	 */
	private void createContextMenu(Control... controls) {

		MouseAdapter selectionUpdater = new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				selectionService.setSelection(new StructuredSelection(target.getTarget()));
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				FocusOnElementAction.selectInBestView(Collections.singletonList(target.getTarget()));
			}
		};
		String id = TimeViewPart.ID + "#contextMenu"; //$NON-NLS-1$
		MenuManager contextMenu = new MenuManager(id); // $NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(new MenuFiller(() -> new StructuredSelection(target)));
		for (Control control : controls) {
			control.addMouseListener(selectionUpdater);
			Menu menu = contextMenu.createContextMenu(control);
			control.setMenu(menu);
		}

	}

	/**
	 * Builds the {@link TimeLine}
	 */
	public void build() {

		Composite lineComposite = new Composite(parent, SWT.BORDER);

		GridData data = new GridData(Layouts.LABEL_WIDTH + nbOfHeader * monthWith, -1);
		data.horizontalSpan = nbOfHeader + 1;
		lineComposite.setLayoutData(data);
		lineComposite.setLayout(Layouts.createNoSpacingLayout(nbOfHeader + 1, false));

		speciesNameComposite = createLineHeader(lineComposite);
		widgets.add(speciesNameComposite);

		for (int header = 1; header <= nbOfHeader; header++) {
			Composite monthComposite = new Composite(lineComposite, SWT.NONE);
			GridLayout gridLayout = Layouts.createNoSpacingLayout(1, false);
			monthComposite.setLayout(gridLayout);

			GridData monthLayoutData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
			monthLayoutData.minimumWidth = monthWith;
			monthLayoutData.widthHint = monthWith;
			monthComposite.setLayoutData(monthLayoutData);

			for (TimeLineDescription entry : target.getEntries()) {
				List<Integer> allWeeks = entry.getWeeks().get().stream().sorted().collect(toList());

				int size = getBarSize(header, allWeeks);
				int style;
				if (size > 0) {
					style = SWT.BORDER;
				} else {
					style = SWT.NONE;
				}

				Composite entriesComposite = new Composite(monthComposite, style);
				GridLayout layout = createNoSpacingLayout(4, true);
				entriesComposite.setLayout(layout);

				GridData headerLayoutData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
				headerLayoutData.minimumWidth = monthWith;
				headerLayoutData.minimumHeight = LINE_MIN_HEIGHT;
				headerLayoutData.heightHint = LINE_MIN_HEIGHT;
				headerLayoutData.widthHint = monthWith;
				entriesComposite.setLayoutData(headerLayoutData);
				int blankSize = getEmptySize(header, allWeeks);

				if (size > 0) {
					if (blankSize > 0) {
						createBar(entriesComposite, blankSize, null);
					}
					createBar(entriesComposite, size, entry.getColor());
					int remaining = 4 - size - blankSize;

					if (remaining > 0) {
						createBar(entriesComposite, remaining, null);
					}

				}
			}
		}

	}

	public int getLabelWidh() {
		return speciesNameComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
	}

	/**
	 * Creates a bar
	 * 
	 * @param monthComposite
	 *            the parent composite
	 * @param size
	 *            the size of the bar
	 * @param color
	 *            the color of the bar
	 */
	private void createBar(Composite monthComposite, int size, String color) {
		Label bar = new Label(monthComposite, SWT.NONE);
		bar.setData(monthComposite.getData());
		if (color != null) {
			bar.setBackground(ColorHelper.getColor(color));
		}
		GridData g = new GridData(SWT.BEGINNING, SWT.CENTER, false, true);
		g.horizontalSpan = size;
		int labelSize = monthWith * size / 4;
		g.minimumWidth = labelSize;
		g.widthHint = labelSize;
		bar.setLayoutData(g);
	}

	/**
	 * Get the size of the white composite to put before the actual bar for the given month
	 * 
	 * @param month
	 *            the number represented by the current composite
	 * @param allWeeks
	 *            all weeks impacted by the feature
	 * @return a int in [1,4]
	 */
	private int getEmptySize(int month, List<Integer> allWeeks) {
		int first = MonthService.monthFirstWeek(month);
		int last = MonthService.monthLastQuater(month);
		int min = -1;
		for (Integer i : allWeeks) {
			int intValue = i.intValue();
			if (intValue <= last && intValue >= first) {
				if (min == -1) {
					min = intValue;
				} else {
					min = Math.min(min, intValue);
				}
			}
		}
		if (min == -1) {
			return 4;
		} else {
			return min - first;
		}
	}

	/**
	 * Gets the size of the bar representing the actual value for the given week
	 * 
	 * @param month
	 *            the current month
	 * @param allWeeks
	 *            all weeks
	 * @return the size of the bar
	 */
	private int getBarSize(int month, List<Integer> allWeeks) {
		int first = MonthService.monthFirstWeek(month);
		int last = MonthService.monthLastQuater(month);
		int size = 0;
		for (Integer i : allWeeks) {
			int intValue = i.intValue();
			if (intValue <= last && intValue >= first) {
				size++;
			}
		}
		return size;
	}

	public void dispose() {
		for (Widget w : widgets) {
			w.dispose();
		}
		widgets.clear();

	}

}
