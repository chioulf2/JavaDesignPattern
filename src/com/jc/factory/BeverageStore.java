package com.jc.factory;

public class BeverageStore {
	private IBeverageFactory beverageFactory;
	
	public BeverageStore(IBeverageFactory beverageFactory){
		this.beverageFactory = beverageFactory;
	}
	
	public IBeverage BeverageOrders(){
		IBeverage beverage = beverageFactory.createBeverage();
		beverage.addIce();
		beverage.addSugar();
		return beverage;
	}
}
