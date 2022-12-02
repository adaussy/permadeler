package fr.adaussy.permadeler.model.Permadeler.impl;

public class ActionCustomImpl extends ActionImpl {

	@Override
	public String getName() {
		return getType().getName();
	}

}
