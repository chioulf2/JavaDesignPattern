package com.jc.abstractFactory.copy;

public class MilkTeaFactory implements IAbstractBeverageFactory{
	@Override
	public IBeverage createBeverage(){
		return new MilkTea();
	}
}
