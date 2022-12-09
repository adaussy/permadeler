package fr.adaussy.permadeler.model.design;

import org.eclipse.osgi.util.NLS;

public class DesignMessages extends NLS {
	private static final String BUNDLE_NAME = DesignMessages.class.getPackageName() + ".design-messages"; //$NON-NLS-1$

	public static String BackConfigurationDialog_0;

	public static String BackConfigurationDialog_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, DesignMessages.class);
	}

	private DesignMessages() {
	}
}
