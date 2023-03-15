package fr.adaussy.permadeler.model.design.utils;

import java.util.List;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class TagDialog extends InputDialog {

	private List<String> candidates;

	public TagDialog(Shell parentShell, List<String> candidates) {
		super(parentShell, "Tags", "Ajouter des tags (séparés par des ;)", "", null);
		this.candidates = candidates;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite)super.createDialogArea(parent);

		Group cc = new Group(composite, SWT.NONE);
		cc.setText("Tags existant");
		cc.setLayout(new GridLayout(2, false));
		cc.setLayoutData(new GridData(GridData.FILL_BOTH));

		for (String candidate : candidates.stream().sorted().toList()) {
			Button b = new Button(cc, SWT.PUSH);
			b.setText(candidate);
			b.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			b.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {

					String currentValue = getText().getText().trim();
					if (!currentValue.endsWith(";") && !currentValue.isEmpty()) {
						currentValue += "; ";
					}
					currentValue += candidate;
					getText().setText(currentValue);
				}
			});
		}

		return composite;

	}

}
