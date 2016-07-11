package com.jc.builder;

import java.util.ArrayList;

public class BmwBuilder extends CarBuilder {
	private BmwModel bmw = new BmwModel();

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}
}