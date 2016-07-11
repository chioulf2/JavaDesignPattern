package com.jc.abstractFactory.copy;

public class GreenTeaFactory_B implements IAbstractBeverageFactory{
	@Override
	public IBeverage createBeverage(){
		return new GreenTea();
	}
}
