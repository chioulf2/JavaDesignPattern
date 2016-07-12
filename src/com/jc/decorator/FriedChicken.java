package com.jc.decorator;

public class FriedChicken implements Meal {

	@Override
	public String getContent() {
		return "主餐炸雞";
	}

	@Override
	public double getPrice() {
		return 50;
	}

}
