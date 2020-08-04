/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class RcpPlugin extends AbstractUIPlugin {

	/**
	 * Plugin ID
	 */
	public static final String PLUGIN_ID = "fr.adaussy.permadeler.rcp"; //$NON-NLS-1$

	// The shared instance
	private static RcpPlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static RcpPlugin getDefault() {
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
