package com.jc.abstractFactory.copy;

public class GreenTea implements IBeverage{

	@Override
	public void addSugar() {
		System.out.println("加糖到綠茶裡");
	}

	@Override
	public void addIce() {
		System.out.println("加冰到綠茶裡");
	}
	
}
