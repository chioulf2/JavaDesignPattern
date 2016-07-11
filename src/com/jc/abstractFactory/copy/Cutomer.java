package com.jc.abstractFactory.copy;

public class Cutomer {
	//客人買飲料
	public static void main(String[] args){
		BeverageStore greenStore = new BeverageStore(new GreenTeaFactory());
		greenStore.BeverageOrders();
		
		BeverageStore milkStore = new BeverageStore(new MilkTeaFactory());
		milkStore.BeverageOrders();
	}
}
