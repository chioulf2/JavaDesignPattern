package com.jc.strategy;

public class ZhaoYun {
	public static void main(String[] args) {
		Context context;
		System.out.println("執行錦囊1");
		context = new Context(new BackDoor());
		context.operate();
		System.out.println();
		
		System.out.println("執行錦囊2");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
