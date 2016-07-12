package com.jc.decorator;

public class Hambuger implements Meal {

	@Override
	public String getContent() {
		return "主餐漢堡";
	}

	@Override
	public double getPrice() {
		return 40;
	}

}
