/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.imports;

import java.util.regex.Matcher;

import org.apache.commons.lang.WordUtils;

import fr.adaussy.permadeler.common.BotanicNameHelper;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.util.IDUtils;

public class LesAlveoleSpeciesImporter {

	private static final String BASSE = "basse"; //$NON-NLS-1$

	private static final String GRIMPANTE = "grimpante"; //$NON-NLS-1$

	private static final String MEDIANE = "médiane"; //$NON-NLS-1$

	private static final String ARBRISSEAU = "arbrisseau"; //$NON-NLS-1$

	private static final String ARBRE = "arbre"; //$NON-NLS-1$

	private static final String CANOPEE = "canopée"; //$NON-NLS-1$

	private String latinName;

	private String strate;

	private String port;

	private String reference;

	private String commonName;

	public LesAlveoleSpeciesImporter latinName(String latinName) {
		this.latinName = latinName;
		return this;
	}

	public LesAlveoleSpeciesImporter strate(String strate) {
		this.strate = strate;
		return this;
	}

	public LesAlveoleSpeciesImporter port(String port) {
		this.port = port;
		return this;
	}

	public LesAlveoleSpeciesImporter reference(String reference) {
		this.reference = reference;
		return this;
	}

	public LesAlveoleSpeciesImporter commonName(String commonName) {
		this.commonName = commonName;
		return this;
	}

	public Species build() {
		Matcher matcher = BotanicNameHelper.LATIN_NAME.matcher(latinName);
		if (matcher.matches()) {
			String genusName = matcher.group(1);
			String speciesName = matcher.group(2);
			Species species = PermadelerFactory.eINSTANCE.createSpecies();
			species.setGenus(WordUtils.capitalize(genusName));
			species.setSpecies(speciesName);

			species.setName(WordUtils.capitalize(commonName));
			species.setShortName(IDUtils.generateShortName(species));
			species.getReferences().add(reference);
			switch (strate) {
				case CANOPEE -> handleCanopee(species);
				case ARBRE -> handleBigUnderstory(species);
				case ARBRISSEAU -> handleShrub(species);
				case MEDIANE -> handleMedium(species);
				case GRIMPANTE -> handleVine(species);
				case BASSE -> handleHerb(species);
				default -> throw new IllegalArgumentException("Unexpected value: " + strate);
			}
			species.getTags().add("Les alvéoles");
			return species;
		}
		return null;
	}

	private void handleHerb(Species species) {
		species.setDefaultRepresentationKind(RepresentationKind.ICON);
		species.setDefaultLayer(Layer.HERB);
		setIcon(species, switch (port) {
			case "tige" -> "tige-natural_low-opt.svg";
			case "touffe" -> "touffe-natural_low-opt.svg";
			case "acaule" -> "acaule-natural_low-opt.svg";
			case "tapissant" -> "tapissant-natural_low-opt.svg";
			case "buissonnant arrondi" -> "buissonnant-elance-natural_low-opt.svg";
			case "grimpant" -> "grimpant-natural_low-opt.svg";
			default -> throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
		});
	}

	private void handleShrub(Species species) {
		species.setDefaultRepresentationKind(RepresentationKind.TREE_CROWN);
		species.setRepresentationKey("/icons/representations/svg/houpier-medium.svg");
		species.setDefaultLayer(Layer.SHRUB);
		setIcon(species, switch (port) {
			case "grimpant" -> "grimpant-natural_shrub-opt.svg";
			case "buissonnant arrondi" -> "buissonnant-arrondi-natural_shrub-opt.svg";
			case "buissonnant élancé" -> "buissonnant-elance-natural_shrub-opt.svg";
			case "arbustif arrondi" -> "arbustif-arrondi-natural_shrub-opt.svg";
			default -> throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
		});
	}

	private void handleCanopee(Species species) {

		species.setDefaultRepresentationKind(RepresentationKind.TREE_CROWN);
		species.setRepresentationKey("/icons/representations/svg/houpier-canopy.svg");
		species.setDefaultLayer(Layer.CANOPY);
		setIcon(species, switch (port) {
			case "arbustif élancé" -> "arbustif-elance-natural_canopy-opt.svg";
			case "buissonnant élancé" -> "buissonnant-elance-natural_canopy-opt.svg";
			case "arbustif arrondi" -> "arbustif-arrondi-natural_canopy-opt.svg";
			default -> throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
		});
	}

	private void handleBigUnderstory(Species species) {
		species.setDefaultRepresentationKind(RepresentationKind.TREE_CROWN);
		species.setRepresentationKey("/icons/representations/svg/houpier-understory.svg");
		species.setDefaultLayer(Layer.UNDERSTORY);
		setIcon(species, switch (port) {
			case "arbustif arrondi" -> "arbustif-arrondi-natural_tree-opt.svg";
			case "arbustif élancé" -> "arbustif-elance-natural_tree-opt.svg";
			case "buissonnant élancé" -> "buissonnant-elance-natural_tree-opt.svg";
			case "buissonnant arrondi" -> "buissonnant-arrondi-natural_tree-opt.svg";
			case "touffe" -> "touffe-natural_medium-opt.svg";
			default -> throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
		});
	}

	private void handleVine(Species species) {
		species.setDefaultRepresentationKind(RepresentationKind.ICON);
		species.setDefaultLayer(Layer.VINE);
		setIcon(species, switch (port) {
			case "grimpant" -> "grimpant-natural_climbing-opt.svg";

			default -> throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
		});
	}

	private void handleMedium(Species species) {
		species.setDefaultRepresentationKind(RepresentationKind.TREE_CROWN);
		species.setRepresentationKey("/icons/representations/svg/houpier-medium.svg");
		species.setDefaultLayer(Layer.SHRUB);

		setIcon(species, switch (port) {
			case "acaule" -> "acaule-natural_medium-opt.svg";
			case "touffe" -> "touffe-natural_medium-opt.svg";
			case "buissonnant élancé" -> "buissonnant-elance-natural_medium-opt.svg";
			case "buissonnant arrondi" -> "buissonnant-arrondi-natural_medium-opt.svg";
			case "tige" -> "tige-natural_medium-opt.svg";
			case "grimpant" -> "grimpant-natural_medium-opt.svg";
			default -> {
				throw new IllegalArgumentException("Unexpected value: " + strate + "-" + port);
			}
		});
	}

	private void setIcon(Species species, String iconName) {
		species.setIconKey("/icons/plants/" + iconName);
	}

}
