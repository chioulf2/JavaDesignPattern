package com.jc.factory;

public class MilkTea implements IBeverage{

	@Override
	public void addSugar() {
		System.out.println("加糖到奶茶裡");
	}

	@Override
	public void addIce() {
		System.out.println("加冰到奶茶裡");
	}
	
}
