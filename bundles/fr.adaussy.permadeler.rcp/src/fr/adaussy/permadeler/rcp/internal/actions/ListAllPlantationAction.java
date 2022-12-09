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
import fr.adaussy.permadeler.rcp.RcpMessages;

public class ListAllPlantationAction extends AbstractModelAction {

	private static final String REPORTS_FOLDER = "reports"; //$NON-NLS-1$

	private static final String SEP = ";"; //$NON-NLS-1$

	private Zone zone;

	public ListAllPlantationAction(Session session, Zone zone) {
		super(RcpMessages.ListAllPlantationAction_0, session);
		this.zone = zone;
	}

	@Override
	public void runWithEvent(Event event) {

		Map<Plant, List<Plantation>> plantations = EMFUtils.getChildren(zone, Plantation.class)
				.collect(Collectors.groupingBy(p -> p.getType()));

		StringBuilder builder = new StringBuilder();
		builder.append(RcpMessages.ListAllPlantationAction_1).append(SEP);
		builder.append(RcpMessages.ListAllPlantationAction_2).append(SEP);
		builder.append(RcpMessages.ListAllPlantationAction_3).append(SEP);
		builder.append(System.lineSeparator());

		plantations.keySet().stream().sorted(Comparators.buildComparator()).forEach(type -> {
			for (Plantation p : plantations.get(type)) {
				builder.append(getRow(p)).append(System.lineSeparator());
			}
		});

		java.nio.file.Path reportFolder = Paths.get(getSession().getSessionResource().getURI().toFileString())
				.getParent().resolve(REPORTS_FOLDER);

		if (!reportFolder.toFile().exists()) {
			reportFolder.toFile().mkdirs();
		}

		try {
			java.nio.file.Path targetFile = reportFolder
					.resolve(String.format("%s_%d.csv", zone.getName(), System.currentTimeMillis())); //$NON-NLS-1$
			Files.write(builder.toString().getBytes("UTF-8"), targetFile.toFile()); //$NON-NLS-1$

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
		builder.append(p.getDescription() != null ? p.getDescription() : "").append(SEP); //$NON-NLS-1$
		builder.append(LocalDate.ofInstant(p.getPlantationDate(), ZoneId.systemDefault())).append(SEP);
		return builder.toString();
	}

}
