package fr.adaussy.permadeler.rcp.internal.actions;

import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import com.google.common.io.Files;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;

public class ListAllPlantationAction extends AbstractModelAction {

	private static final String SEP = ";";

	private Zone zone;

	public ListAllPlantationAction(Session session, Zone zone) {
		super("List all plantation", session);
		this.zone = zone;
	}

	@Override
	public void runWithEvent(Event event) {

		Map<Plant, List<Plantation>> plantations = EMFUtils.getChildren(zone, Plantation.class)
				.collect(Collectors.groupingBy(p -> p.getType()));

		StringBuilder builder = new StringBuilder();
		builder.append("Species name").append(SEP);
		builder.append("Plantation description").append(SEP);
		builder.append("Plantation date").append(SEP);
		builder.append(System.lineSeparator());

		plantations.keySet().stream().sorted(Comparators.buildComparator()).forEach(type -> {
			for (Plantation p : plantations.get(type)) {
				builder.append(getRow(p)).append(System.lineSeparator());
			}
		});

		java.nio.file.Path reportFolder = Paths.get(getSession().getSessionResource().getURI().toFileString())
				.getParent().resolve("reports");

		if (!reportFolder.toFile().exists()) {
			reportFolder.toFile().mkdirs();
		}

		try {
			java.nio.file.Path targetFile = reportFolder
					.resolve(zone.getName() + "_" + System.currentTimeMillis() + ".csv");
			Files.write(builder.toString().getBytes("UTF-8"), targetFile.toFile());

			Desktop.getDesktop().open(targetFile.toFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		super.runWithEvent(event);
	}

	private String getRow(Plantation p) {
		StringBuilder builder = new StringBuilder();
		builder.append(p.getType().getName()).append(SEP);
		builder.append(p.getDescription() != null ? p.getDescription() : "").append(SEP);
		builder.append(LocalDate.ofInstant(p.getPlantationDate(), ZoneId.systemDefault())).append(SEP);
		return builder.toString();
	}

}
