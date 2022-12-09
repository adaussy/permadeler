package fr.adaussy.permadeler.model.Permadeler;

import org.eclipse.osgi.util.NLS;

public class EditMessages extends NLS {
	private static final String BUNDLE_NAME = EditMessages.class.getPackageName() + ".edit-messages"; //$NON-NLS-1$

	public static String PlantationItemProviderCustomImpl_0;

	public static String SowPlanficationItemProviderCustomImpl_0;

	public static String SowPlanficationItemProviderCustomImpl_1;

	public static String SowPlanficationItemProviderCustomImpl_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, EditMessages.class);
	}

	private EditMessages() {
	}
}
