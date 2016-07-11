package com.jc.strategy;

public class Context {
	IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public void operate(){
		strategy.operate();
	}
}
