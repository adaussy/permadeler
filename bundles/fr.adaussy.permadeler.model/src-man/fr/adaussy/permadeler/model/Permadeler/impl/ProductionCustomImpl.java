package fr.adaussy.permadeler.model.Permadeler.impl;

public class ProductionCustomImpl extends ProductionImpl {
	@Override
	public String getName() {
		return getType().getName();
	}
}
