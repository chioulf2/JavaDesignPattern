package com.jc.factory;

public class GreenTeaFactory implements IBeverageFactory{
	@Override
	public IBeverage createBeverage(){
		return new GreenTea();
	}
}
