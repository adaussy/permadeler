package fr.adaussy.permadeler.rcp.internal.dialogs;

import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EEFViewFactory;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.EEFTab;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.interpreter.api.VariableManager;
import org.eclipse.sirius.properties.PageDescription;
import org.eclipse.sirius.properties.core.api.SiriusDomainClassTester;
import org.eclipse.sirius.properties.core.api.SiriusInputDescriptor;
import org.eclipse.sirius.properties.core.api.ViewDescriptionConverter;
import org.eclipse.sirius.ui.properties.internal.EditingContextAdapterWrapper;
import org.eclipse.sirius.ui.properties.internal.TransactionalEditingDomainContextAdapter;
import org.eclipse.sirius.ui.properties.internal.dialog.DialogFormContainer;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.FormDialog;
import org.eclipse.ui.forms.IManagedForm;

import fr.adaussy.permadeler.model.utils.EMFUtils;

public class SimplePropertiesFormDialog extends FormDialog {

	/**
	 * The interpreter.
	 */
	private org.eclipse.sirius.properties.core.api.SiriusInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The EEF Page.
	 */
	private EEFPage eefPage;

	/**
	 * The EEF Tab.
	 */
	private EEFTab eefTab;

	/**
	 * The consumer used to refresh the dialog when a change is performed.
	 */
	private Consumer<IStatus> consumer;

	public SimplePropertiesFormDialog(Shell shell, EObject semanticObject, Session session,
			String viewpointName, String pageName) {
		super(shell);
		this.interpreter = new org.eclipse.sirius.properties.core.api.SiriusInterpreter(session);
		this.variableManager = new VariableManager();

		createEEFPage(semanticObject, session, viewpointName, pageName);
	}

	private void createEEFPage(EObject semanticObject, Session session, String viewpointName,
			String pageName) {
		Viewpoint viewPoint = session.getSelectedViewpoints(true).stream()
				.filter(v -> viewpointName.equals(v.getName())).findFirst().get();
		Group group = EMFUtils.getAncestor(Group.class, viewPoint);

		SiriusDomainClassTester domainTester = new SiriusDomainClassTester(session);

		List<PageDescription> pageDescriptions = getDescriptions(group);
		SiriusInputDescriptor input = new SiriusInputDescriptor(semanticObject);
		EEFViewDescription effViewDescription = new ViewDescriptionConverter(pageDescriptions).convert(input);

		EEFView effView = new EEFViewFactory().createEEFView(effViewDescription, variableManager, interpreter,
				new EditingContextAdapterWrapper(new TransactionalEditingDomainContextAdapter(
						session.getTransactionalEditingDomain())),
				domainTester, input);

		this.eefPage = effView.getPages().stream()
				.filter(p -> pageName.equals(p.getDescription().getIdentifier())).findAny().get();
	}

	private List<PageDescription> getDescriptions(Group group) {
		return EMFUtils.allContainedObjectOfType(group, PageDescription.class).toList();
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {

		managedForm.getMessageManager().setDecorationPosition(SWT.TOP | SWT.LEFT);

		this.eefTab = new EEFTab(this.eefPage);
		DialogFormContainer container = new DialogFormContainer(this.getShell(),
				managedForm.getForm().getForm());
		Composite composite = managedForm.getForm().getForm().getBody();
		composite.setLayout(new FillLayout());
		int style = GridData.FILL_HORIZONTAL;
		GridData data = new GridData(style);
		composite.setLayoutData(data);

		eefTab.createControls(composite, container);
		eefTab.aboutToBeShown();
		eefTab.refresh();
		managedForm.getForm().reflow(true);

		this.configureModelChangeRefresh();
	}

	/**
	 * Configures a consumer executed when {@link EditingContextAdapter#performModelChange(Runnable)} is
	 * called in order to refresh the dialog.
	 */
	private void configureModelChangeRefresh() {
		EditingContextAdapter editingContextAdapter = this.eefPage.getView().getContextAdapter();
		if (editingContextAdapter instanceof EditingContextAdapterWrapper) {
			EditingContextAdapterWrapper wrapper = (EditingContextAdapterWrapper)editingContextAdapter;
			this.consumer = (status) -> this.refreshDialog();

			wrapper.addPerformedModelChangeConsumer(this.consumer);
		}
	}

	private void refreshDialog() {
		this.eefTab.refresh();

	}

	@Override
	public boolean close() {
		boolean result = super.close();

		EditingContextAdapter editingContextAdapter = this.eefPage.getView().getContextAdapter();
		if (editingContextAdapter instanceof EditingContextAdapterWrapper) {
			EditingContextAdapterWrapper wrapper = (EditingContextAdapterWrapper)editingContextAdapter;
			wrapper.removePerformedModelChangeConsumer(this.consumer);
		}

		this.eefTab.aboutToBeHidden();
		this.eefTab.dispose();

		return result;
	}
}
