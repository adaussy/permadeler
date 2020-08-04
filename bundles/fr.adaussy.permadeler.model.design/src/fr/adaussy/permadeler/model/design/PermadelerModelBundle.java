/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PermadelerModelBundle extends AbstractUIPlugin {
	// The plug-in ID
	/**
	 * Plugin ID
	 */
	public static final String PLUGIN_ID = "fr.adaussy.permadeler.model.design"; //$NON-NLS-1$

	// The shared instance
	private static PermadelerModelBundle plugin;

	private static Set<Viewpoint> viewpoints;

	/**
	 * The constructor
	 */
	public PermadelerModelBundle() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework. BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(
				ViewpointRegistry.getInstance()
						.registerFromPlugin(PLUGIN_ID + "/description/permadeler.odesign")); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static PermadelerModelBundle getDefault() {
		return plugin;
	}

	public void logInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}
	public void logError(String message) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
	}

	public void logError(String string, Throwable e) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, string, e));

	}
}
