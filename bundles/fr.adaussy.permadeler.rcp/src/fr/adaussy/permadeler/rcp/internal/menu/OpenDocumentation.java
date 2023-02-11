
package fr.adaussy.permadeler.rcp.internal.menu;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.e4.core.di.annotations.Execute;

public class OpenDocumentation {
	@Execute
	public void execute() throws URISyntaxException, IOException {
		Desktop.getDesktop().open(new File(
				URIUtil.toURI(Platform.getInstallLocation().getURL()).resolve("documentation/README.html"))); //$NON-NLS-1$
	}

}
