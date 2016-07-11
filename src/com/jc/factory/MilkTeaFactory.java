package com.jc.factory;

public class MilkTeaFactory implements IBeverageFactory{
	@Override
	public IBeverage createBeverage(){
		return new MilkTea();
	}
}
