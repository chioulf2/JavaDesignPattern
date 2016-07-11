package com.jc.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		// 10辆A类型的奔驰车
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		// 20辆B类型的奔驰车
		for (int i = 0; i < 20; i++) {
			director.getBBenzModel().run();
		}
		// 30量C类型的宝马车
		for (int i = 0; i < 30; i++) {
			director.getCBMWModel().run();
		}
	}
}
