package com.jc.abstractFactory.copy;

public class BeverageStore {
	private IAbstractBeverageFactory beverageFactory;
	
	public BeverageStore(IAbstractBeverageFactory beverageFactory){
		this.beverageFactory = beverageFactory;
	}
	
	public IBeverage BeverageOrders(){
		IBeverage beverage = beverageFactory.createBeverage();
		beverage.addIce();
		beverage.addSugar();
		return beverage;
	}
}
