/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import static java.util.stream.Collectors.joining;

import java.awt.Desktop;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.text.DateFormatSymbols;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.poi.util.StringUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ProductionType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.TemporalItem;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.services.MonthService;

public class CreateSignAction extends AbstractModelAction {

	private List<Plantation> plantations;

	private Map<String, Node> idToNode = new HashMap<>();

	public CreateSignAction(Session session, List<Plantation> plantations) {
		super("Créer un panneau", RcpPlugin.imageDescriptorFromPlugin(RcpPlugin.PLUGIN_ID, "/icons/sign.png"),
				session);
		this.plantations = plantations;
	}

	private void readAllIds(Node node) {
		System.out.println(node.getNodeName());

		NodeList nodeList = node.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node currentNode = nodeList.item(i);
			if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
				Node idAttr = currentNode.getAttributes().getNamedItem("id");
				if (idAttr != null) {
					String value = idAttr.getNodeValue();
					idToNode.put(value, currentNode);
				}
				readAllIds(currentNode);
			}
		}
	}

	@Override
	public void runWithEvent(Event event) {

		for (Plantation plantation : plantations) {

			try (InputStream baseSignFile = getClass().getResourceAsStream("./BaseSign.svg")) {
				String parser = XMLResourceDescriptor.getXMLParserClassName();
				SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
				Document doc = f.createDocument("", baseSignFile);
				readAllIds(doc);
				Plant type = plantation.getType();
				Species targetSpecies = null;
				Variety targetVariety = null;
				SignBuilder builder = new SignBuilder(doc, idToNode);
				if (type instanceof Variety variety) {
					targetSpecies = variety.getSpecies();
					builder.withMainName(variety.getSpecies().getName());
					builder.withSecondName(variety.getVariety());
					targetVariety = variety;
				} else if (type instanceof Species species) {
					builder.withMainName(species.getName());
					targetSpecies = species;
				}

				Instant plantationDate = plantation.getPlantationDate();
				if (plantationDate != null) {
					LocalDateTime date = LocalDateTime.ofInstant(plantationDate, ZoneOffset.UTC);
					builder.withThirdName(String.valueOf(date.getYear()));
				}
				EList<SpecialUses> specialUses = targetSpecies.getAllSpecialUses();
				builder.withAttrackWildLife(specialUses.contains(SpecialUses.ATTRACTS_WILDLIFE));
				builder.withDynamicAccumulator(specialUses.contains(SpecialUses.DYNAMIC_ACCUMULATOR));
				builder.withIsNitrogenFixer(specialUses.contains(SpecialUses.NITROGEN_FIXER));
				builder.withIsHonerPlant(specialUses.contains(SpecialUses.HONEY_PLANT));
				builder.withIsSmelly(specialUses.contains(SpecialUses.SCENTED_PLANTS));

				Production edibleProduction = getHarvestProduction(targetVariety, targetSpecies);
				if (edibleProduction != null) {
					builder.withHarvestPeriod(buildPeriodLabel(edibleProduction, false));
					builder.withIsEdible(true);
				}

				Production flowerProduction = getBloomingProduction(targetVariety, targetSpecies);
				if (flowerProduction != null) {
					builder.withBloomingPeriode(buildPeriodLabel(flowerProduction, false));
				}

				String pg = plantation.getRootstock();
				if (pg != null) {
					builder.withFourthName(pg);
				}

				saveDoc(builder.build(), plantation);

			} catch (IOException | TransformerFactoryConfigurationError | TransformerException ex) {
				RcpPlugin.logError("Unable to save SVG file " + ex.getMessage(), ex);
			}
		}

		super.runWithEvent(event);
	}

	private String buildPeriodLabel(TemporalItem item, boolean useShortName) {
		String[] months = new DateFormatSymbols().getMonths();
		MonthService monthService = new MonthService();
		List<String> b = new ArrayList<String>();
		for (int i = 1; i <= 12; i++) {
			if (monthService.hasMonth(i, item.getPeriod())) {
				String monthName = months[i - 1];
				if (useShortName) {

					String month = monthName.substring(0, Math.min(4, monthName.length()));
					month = StringUtil.toUpperCase(month.charAt(0)) + month.substring(1);
					b.add(month);
				} else {
					b.add(monthName);

				}
			}
		}

		String result = b.stream().collect(joining(", "));
		if (result.length() > 20 && !useShortName) {
			return buildPeriodLabel(item, true);
		} else {
			return result;
		}
	}

	private Production getHarvestProduction(Variety targetVariety, Species species) {
		List<Production> edibleProductions;
		if (targetVariety != null) {
			edibleProductions = targetVariety.getAllProductions().stream().filter(p -> p.isEatable())
					.toList();
		} else if (species != null) {
			edibleProductions = species.getAllProductions().stream().filter(p -> p.isEatable()).toList();
		} else {
			edibleProductions = Collections.emptyList();
		}

		Production edibleProduction = null;
		if (edibleProductions.size() > 1) {
			edibleProduction = edibleProductions.stream().filter(p -> p.getType() == ProductionType.FRUIT)
					.findFirst().orElse(edibleProductions.get(0));
		} else if (edibleProductions.size() == 1) {
			edibleProduction = edibleProductions.get(0);
		} else {
			edibleProduction = null;
		}
		return edibleProduction;
	}

	private Production getBloomingProduction(Variety targetVariety, Species species) {
		Production FlowerProduction = null;
		if (targetVariety != null) {
			FlowerProduction = targetVariety.getAllProductions().stream()
					.filter(p -> p.getType() == ProductionType.FLOWER).findFirst().orElse(null);
		} else if (species != null) {
			FlowerProduction = species.getAllProductions().stream()
					.filter(p -> p.getType() == ProductionType.FLOWER).findFirst().orElse(null);
		} else {
			FlowerProduction = null;
		}

		return FlowerProduction;
	}

	private void saveDoc(Document doc, Plantation p)
			throws TransformerFactoryConfigurationError, TransformerException {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();

		Path folderPath = PermadelerSession.of(getSession()).getRootFolder().resolve("sings");
		if (!folderPath.toFile().exists()) {
			folderPath.toFile().mkdirs();
		}
		Path targetFile = folderPath.resolve(p.getType().getName() + "-" + p.getId() + ".svg");
		Result output = new StreamResult(targetFile.toFile());
		Source input = new DOMSource(doc);
		transformer.transform(input, output);

		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(targetFile.toUri());
			} catch (IOException e) {
				RcpPlugin.logError("Unable to open image " + e.getMessage(), e);
			}
		}

	}

	private static class SignBuilder {

		private boolean mineralAccumulator;

		private boolean isEdible;

		private boolean isNitrogenFixer;

		private boolean isBeeFriendly;

		private boolean isSmelly;

		private boolean attrackWildLife;

		private String mainName = "";

		private String secondName = "";

		private String thirdName = "";

		private String bloomingPeriode;

		private String harvestPeriod;

		private final Document doc;

		private Map<String, Node> idToNode;

		private String fourthName;

		public SignBuilder(Document doc, Map<String, Node> idToNode) {
			super();
			this.doc = doc;
			this.idToNode = idToNode;
		}

		public SignBuilder withDynamicAccumulator(boolean mineralAccumulator) {
			this.mineralAccumulator = mineralAccumulator;
			return this;
		}

		public SignBuilder withIsEdible(boolean isEdible) {
			this.isEdible = isEdible;
			return this;
		}

		public SignBuilder withIsNitrogenFixer(boolean isNitrogenFixer) {
			this.isNitrogenFixer = isNitrogenFixer;
			return this;
		}

		public SignBuilder withIsHonerPlant(boolean isBeeFriendly) {
			this.isBeeFriendly = isBeeFriendly;
			return this;
		}

		public SignBuilder withIsSmelly(boolean isSmelly) {
			this.isSmelly = isSmelly;
			return this;
		}

		public SignBuilder withAttrackWildLife(boolean attrackWildLife) {
			this.attrackWildLife = attrackWildLife;
			return this;
		}

		public SignBuilder withMainName(String mainName) {
			this.mainName = mainName;
			return this;
		}

		public SignBuilder withSecondName(String secondName) {
			this.secondName = secondName;
			return this;
		}

		public SignBuilder withThirdName(String thirName) {
			this.thirdName = thirName;
			return this;
		}

		public SignBuilder withFourthName(String fourthName) {
			this.fourthName = fourthName;
			return this;
		}

		public SignBuilder withBloomingPeriode(String bloomingPeriode) {
			this.bloomingPeriode = bloomingPeriode;
			return this;
		}

		public SignBuilder withHarvestPeriod(String harvestPeriod) {
			this.harvestPeriod = harvestPeriod;
			return this;
		}

		public Document build() {
			Node mainLabel = idToNode.get("mainLabelTextSpan");
			mainLabel.setTextContent(mainName);

			if (Strings.isNullOrEmpty(secondName) && !Strings.isNullOrEmpty(thirdName)) {
				// invert second and thirs
				secondName = thirdName;
				thirdName = "";
			}
			Node secondLabel = idToNode.get("latinLabelTextSpan");
			secondLabel.setTextContent(secondName);

			Node thirdLabel = idToNode.get("yearLabelTextSpan");
			thirdLabel.setTextContent(thirdName);

			Node fourthLabel = idToNode.get("pgLabelText");
			fourthLabel.setTextContent(fourthName);

			Node bloomingIcon = idToNode.get("bloomingIcon");
			Node bloomingText = idToNode.get("bloomingTextSpan");
			if (bloomingPeriode == null) {
				bloomingText.setTextContent("");
				bloomingIcon.getParentNode().removeChild(bloomingIcon);
			} else {
				bloomingText.setTextContent(bloomingPeriode);
			}

			Node harvestIcon = idToNode.get("harvestIcon");
			Node harvestText = idToNode.get("harvestLabelText");
			if (harvestPeriod == null) {
				harvestText.setTextContent("");
				harvestIcon.getParentNode().removeChild(harvestIcon);
			} else {
				harvestText.setTextContent(harvestPeriod);
			}

			hideIcon(mineralAccumulator, "mineralAccIcon");
			hideIcon(isEdible, "edibleIcon");
			hideIcon(isNitrogenFixer, "nitrogenFixerIcon");
			hideIcon(isBeeFriendly, "beeIcon");
			hideIcon(isSmelly, "smellIcon");
			hideIcon(attrackWildLife, "bugIcon");
			return doc;
		}

		private void hideIcon(boolean value, String iconName) {
			if (!value) {
				Node hide = idToNode.get(iconName);
				hide.getParentNode().removeChild(hide);
			}
		}

	}
}
