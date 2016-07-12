package com.js.bridge;

public class Car extends Product {

	@Override
	public void beProduced() {
		System.out.println("Car是這樣製造的");
	}

	@Override
	public void beSelled() {
		System.out.println("Car是這樣賣掉的");
	}

}
