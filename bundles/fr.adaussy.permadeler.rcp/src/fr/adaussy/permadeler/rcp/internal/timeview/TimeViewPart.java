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

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.PersistState;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.ui.NoUICallback;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeLineGroupDescription;
import fr.adaussy.permadeler.rcp.internal.timeview.inputs.TimeViewEditorInput;
import fr.adaussy.permadeler.rcp.services.FillService;

/**
 * Part that represent a time view
 * 
 * @author Arthur Daussy
 */
public class TimeViewPart {
	/**
	 * Id of the view
	 */
	public static final String ID = "fr.adaussy.permadeler.rcp.timeview";

	private static final String SEP = "->";

	private static final String INPUT_PS = "input";

	private static final int MAX_LABEL_SIZE = 20;

	private List<TimeLine> timeLines;

	private Composite cc;

	private ScrolledComposite sc;

	private GridData blankLayout;

	private Composite main;

	private Map<Month, Composite> monthMap = new HashMap<Month, Composite>();

	private Composite superParent;

	private TimeViewEditorInput input;

	@Inject
	private ESelectionService selectionService;

	private MPart part;

	/**
	 * Porst construct call
	 * 
	 * @param parentComposite
	 *            a parent composite
	 * @param aPart
	 *            the {@link MPart}
	 */
	@PostConstruct
	public void createPartControl(Composite parentComposite, MPart aPart) {

		this.superParent = parentComposite;
		this.part = aPart;
		main = new Composite(parentComposite, SWT.NONE);
		GridLayout mainLayout = new GridLayout(1, false);
		main.setLayout(mainLayout);

		input = getInput(aPart);
		if (input != null) {
			setInput(input);
		}

	}

	public boolean match(TimeViewEditorInput otherInput) {
		return input != null && input.getTarget() == otherInput.getTarget()
				&& input.getQuery().equals(otherInput.getQuery());
	}

	private void computeMinSize(Composite content) {
		int width = sc.getClientArea().width;
		sc.setMinSize(content.computeSize(width, SWT.DEFAULT));
	}

	/**
	 * Create an empty column header
	 * 
	 * @param aParent
	 *            a {@link Composite}
	 * @return a new {@link Composite}
	 */
	private Composite createEmptyHeader(Composite aParent) {
		Composite blank = new Composite(aParent, SWT.NONE);
		GridLayout gridLayout = createNoSpacingLayout(1, false);
		blank.setLayout(gridLayout);
		blankLayout = new GridData(GridData.BEGINNING);
		blankLayout.horizontalSpan = 1;
		blank.setLayoutData(blankLayout);

		return blank;
	}

	/**
	 * Creates a header holding the month information
	 * 
	 * @param month
	 *            the month name
	 * @param aParent
	 *            the parent composite
	 * @return a new Composite
	 */
	private Composite createMonthHeader(String month, Composite aParent) {
		Composite monthHeaderComposite = new Composite(aParent, SWT.BORDER);
		GridData compositeLayoutData = new GridData(GridData.CENTER);
		compositeLayoutData.horizontalAlignment = SWT.FILL;
		monthHeaderComposite.setLayoutData(compositeLayoutData);
		GridLayout gridLayout = new GridLayout(4, false);
		monthHeaderComposite.setLayout(gridLayout);

		Label monthHeader = new Label(monthHeaderComposite, SWT.CENTER);
		monthHeader.setText(month);
		GridData headerLayoutData = new GridData(GridData.FILL_BOTH);
		headerLayoutData.horizontalSpan = 4;
		monthHeader.setLayoutData(headerLayoutData);

		for (int i = 1; i <= 4; i++) {
			int style;
			if (i == 0) {
				style = SWT.BEGINNING;
			} else if (i == 4) {
				style = SWT.END;
			} else {
				style = SWT.CENTER;
			}
			Label wb = new Label(monthHeaderComposite, style);
			GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
			layoutData.minimumWidth = Layouts.CELL_WITH;
			wb.setLayoutData(layoutData);
			wb.setText(String.valueOf(i));
		}

		return monthHeaderComposite;
	}

	/**
	 * Set an input for this view
	 * 
	 * @param input
	 *            an input
	 */
	public void setInput(TimeViewEditorInput input) {

		this.input = input;
		part.setLabel(input.getQuery());
		Composite headerComposite = new Composite(main, SWT.NONE);
		headerComposite.setData("name", "Header composite");
		headerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		GridLayout headerLayout = Layouts.createNoSpacingLayout(input.getHeaders().size() + 1, false);
		headerLayout.horizontalSpacing = 0;
		headerComposite.setLayout(headerLayout);

		createEmptyHeader(headerComposite);
		for (Entry<String, Month> entry : FillService.MONTH_MAPPER.entrySet()) {
			monthMap.put(entry.getValue(), createMonthHeader(entry.getKey(), headerComposite));
		}

		sc = new ScrolledComposite(main, SWT.V_SCROLL);
		sc.setLayoutData(new GridData(GridData.FILL_BOTH));
		sc.setLayout(Layouts.createNoSpacingLayout(1, false));
		sc.setExpandVertical(true);
		sc.setExpandHorizontal(true);

		cc = new Composite(sc, SWT.NONE);
		cc.setLayout(headerLayout);
		cc.setLayoutData(new GridData(GridData.CENTER));
		sc.setContent(cc);

		sc.addListener(SWT.Resize, event -> computeMinSize(cc));

		computeMinSize(superParent);

		updateUI();
	}

	@PersistState
	public void persistSate(MPart currentParent) {
		if (input != null) {
			saveState(input.getQuery(), input.getTarget(), currentParent);
		} else {
			saveState(null, null, currentParent);
		}
	}

	/**
	 * Gets the input for the given path
	 * 
	 * @param p
	 *            a MPart
	 * @return a TimeViewEditorInput
	 */
	private TimeViewEditorInput getInput(MPart p) {
		// try {
		String targetAndQuery = p.getPersistedState().get(INPUT_PS);
		if (targetAndQuery != null) {
			String[] parts = targetAndQuery.split(SEP);
			String session = parts[0];
			String target = parts[1];
			String queryName = parts[2];
			Session siriusSession = SessionManager.INSTANCE.openSession(URI.createURI(session),
					new NullProgressMonitor(), new NoUICallback());
			if (siriusSession != null) {
				EObject targetObject = siriusSession.getTransactionalEditingDomain().getResourceSet()
						.getEObject(URI.createURI(target), true);
				return InputFactory.INSTANCE.build(queryName, targetObject);
			}
		}
		return null;
	}

	/**
	 * Save the current state of the part
	 * 
	 * @param queryName
	 *            the name of the query
	 * @param target
	 *            the main target
	 * @param p
	 *            the current part
	 */
	public void saveState(String queryName, EObject target, MPart p) {
		if (target != null) {
			Session session = SessionManager.INSTANCE.getSession(target);
			if (session != null) {
				Resource eResource = target.eResource();
				String value = session.getSessionResource().getURI() + SEP
						+ eResource.getURI().appendFragment(eResource.getURIFragment(target)) + SEP
						+ queryName;
				p.getPersistedState().put(INPUT_PS, value);
			}
		} else {
			p.getPersistedState().remove(INPUT_PS);
		}
	}

	@Focus
	public void setFocus() {

	}

	/**
	 * Updates the UI with the given input
	 */
	private void updateUI() {
		if (cc != null && !cc.isDisposed()) {

			if (timeLines != null) {

				for (TimeLine t : timeLines) {
					t.dispose();
				}
			}
			timeLines = new ArrayList<TimeLine>();

			if (!input.getTimeLines().isEmpty()) {

				AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
						new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

				int headerWidth = monthMap.get(Month.JANUARY).computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
				for (TimeLineGroupDescription ti : input.getTimeLines()) {
					TimeLine timeLine = new TimeLine(ti, cc, headerWidth, input.getHeaders().size(),
							selectionService, new ShortLabelProvider(labelProvider, MAX_LABEL_SIZE));
					timeLines.add(timeLine);
					timeLine.build();
				}
				blankLayout.minimumWidth = Layouts.LABEL_WIDTH;
				blankLayout.widthHint = Layouts.LABEL_WIDTH;
			}
			main.layout(true, true);
			computeMinSize(cc);
		}

	}
}
