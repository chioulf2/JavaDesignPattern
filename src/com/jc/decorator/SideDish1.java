package com.jc.decorator;

public class SideDish1 extends SideDishDecorator{
	
	public SideDish1(Meal meal) {
		super(meal);
	}

	@Override
	public String getContent() {
		return super.meal.getContent() + "+小紅茶+中薯";
	}

	@Override
	public double getPrice() {
		return super.meal.getPrice()+15+35;
	}

}
