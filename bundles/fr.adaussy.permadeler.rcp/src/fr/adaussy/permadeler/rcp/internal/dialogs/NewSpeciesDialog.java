package fr.adaussy.permadeler.rcp.internal.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.rcp.internal.utils.Dialogs;

public class NewSpeciesDialog extends Dialog {

	private String latinName;

	private String commonName;

	private Enum<?> layer;

	public NewSpeciesDialog(Shell parentShell, String initialLatinName) {
		super(parentShell);
		this.latinName = initialLatinName == null ? "" : initialLatinName;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite cc = (Composite)super.createDialogArea(parent);

		Dialogs.createTextEntry(cc, "Latin Name", latinName, v -> {
			this.latinName = v;
		});
		Dialogs.createTextEntry(cc, "Common name", latinName, v -> {
			this.commonName = v;
		});

		Dialogs.createEnumEntry(parent, "Food Forest Layer", Layer.values(), Layer.UNDERSTORY, v -> {
			this.layer = v;
		});

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
