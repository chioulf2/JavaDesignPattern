package com.jc.abstractFactory.copy;

public class GreenTeaFactory implements IAbstractBeverageFactory{
	@Override
	public IBeverage createBeverage(){
		return new GreenTea();
	}
}
