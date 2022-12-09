package fr.adaussy.permadeler.rcp.internal.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;
import fr.adaussy.permadeler.rcp.services.LabelService;

public class NewSpeciesDialog extends Dialog {

	private String latinName;

	private String commonName;

	private Enum<?> layer;

	public NewSpeciesDialog(Shell parentShell, String initialLatinName) {
		super(parentShell);
		this.latinName = initialLatinName == null ? "" : initialLatinName; //$NON-NLS-1$
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Dialogs.createTextEntry(cc, RcpMessages.NewSpeciesDialog_0, latinName, v -> {
			this.latinName = v;
		});
		Dialogs.createTextEntry(cc, RcpMessages.NewSpeciesDialog_1, latinName, v -> {
			this.commonName = v;
		});

		Dialogs.createEnumEntry(parent, RcpMessages.NewSpeciesDialog_2, Layer.values(), Layer.UNDERSTORY,
				v -> {
					this.layer = v;
				}, LabelService::getEditLabel);

		return cc;
	}

	public Enum<?> getLayer() {
		return layer;
	}

	public String getLatinName() {
		return latinName;
	}

	public String getCommonName() {
		return commonName;
	}

}
