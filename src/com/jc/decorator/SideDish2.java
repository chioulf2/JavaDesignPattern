package com.jc.decorator;

public class SideDish2 extends SideDishDecorator{
	
	public SideDish2(Meal meal) {
		super(meal);
	}

	@Override
	public String getContent() {
		return super.meal.getContent() + "+大可樂+大薯";
	}

	@Override
	public double getPrice() {
		return super.meal.getPrice()+25+50;
	}

}
