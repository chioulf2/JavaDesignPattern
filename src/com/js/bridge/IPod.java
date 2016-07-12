package com.js.bridge;

public class IPod extends Product {

	@Override
	public void beProduced() {
		System.out.println("IPod是這樣製造的");
	}

	@Override
	public void beSelled() {
		System.out.println("IPod是這樣賣掉的");
	}

}
