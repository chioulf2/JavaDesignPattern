package com.jc.strategy;

public class BackDoor implements IStrategy {
	@Override
	public void operate(){
		System.out.println("執行BackDoor策略");
	}
}
