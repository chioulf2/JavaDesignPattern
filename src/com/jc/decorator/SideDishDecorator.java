package com.jc.decorator;

/*
 * 附餐的部分 搭配主餐來選用 此為decorator
 * 設定為abstract 所以這邊不用implement Meal的東西 延到他下面繼承的東西在implement
 */
public abstract class SideDishDecorator  implements Meal{
	//除了Meal的功能外 新增一些自己額外的定義供後續使用
	
	protected Meal meal; //注意這裡用protected
	protected SideDishDecorator(Meal meal) {
		this.meal = meal;
	}
}
