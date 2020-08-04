package fr.adaussy.permadeler.rcp.internal.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.rcp.services.FillService;

/**
 * A a {@link SeedItem} by parsing a downloaded web site page
 * 
 * @author Arthur Daussy
 */
public class AddSeedFromWebSite extends AbstractModelAction {

	private final SeedBank bank;

	public AddSeedFromWebSite(SeedBank bank, Session session) {
		super(session);
		this.bank = bank;
	}

	@Override
	public String getText() {
		return "Add Seed from web site";
	}

	@Override
	public void runWithEvent(Event event) {

		FileDialog dialog = new FileDialog(event.display.getActiveShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] {"*.html" });
		String open = dialog.open();
		if (open == null) {
			return;
		}
		String[] parths = new String[] {open };

		for (String sSath : parths) {
			Path path = Path.of(sSath);
			File file = path.toFile();
			SeedItem[] result = new SeedItem[1];
			if (file.exists()) {
				modifyModel(() -> {
					try {
						String url = file.toURI().toURL().toString();
						Plant plant = FillService.createFromURL(((Root)bank.eContainer()).getSeedLib(), url);
						if (plant != null) {

							SeedItem seedItem = bank.getItems().stream()
									.filter(seed -> seed.getType() == plant).findFirst().orElseGet(() -> {

										SeedItem item = PermadelerFactory.eINSTANCE.createSeedItem();
										bank.getItems().add(item);
										return item;
									});

							seedItem.setQuantity(Quantity.HIGHT);
							seedItem.setByDate(new Date());
							seedItem.setType(plant);
							result[0] = seedItem;
							ECollections.sort(bank.getItems(), Comparators.SEED_ITEM_CMP);

						} else {
							MessageDialog.openError(event.display.getActiveShell(), "Error",
									"Unable to create a plant from the given file");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				});

			}
			event.display.timerExec(100, () -> {
				if (result[0] != null) {
					Stream.of(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
							.getViewReferences())
							.filter(v -> "org.eclipse.sirius.ui.tools.views.model.explorer".equals(v.getId()))
							.findFirst().ifPresent(v -> {
								IWorkbenchPart part = v.getPart(true);
								if (part instanceof CommonNavigator) {
									CommonNavigator navigator = (CommonNavigator)part;
									navigator.selectReveal(new StructuredSelection(result[0]));
								}
							});
				}
			});
		}
		super.runWithEvent(event);
	}

}
