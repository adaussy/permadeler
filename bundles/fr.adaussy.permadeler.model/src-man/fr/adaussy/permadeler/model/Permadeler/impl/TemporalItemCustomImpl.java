package fr.adaussy.permadeler.model.Permadeler.impl;

import java.util.List;

public class TemporalItemCustomImpl extends TemporalItemImpl {

	@Override
	public List<Integer> getPeriod() {
		if (period == null) {
			return List.of();
		}
		return super.getPeriod();
	}
}
