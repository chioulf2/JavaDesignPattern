package com.jc.decorator;

/**
 * 
 * @author Jimmy
 *	裝飾模式
 *	http://openhome.cc/Gossip/DesignPattern/DecoratorPattern.htm
 *
 *	Decorator模式的實現，其不採取繼承的方式，而以組合的方式動態地為物 件添加功能
 */
public interface Meal {
	public String getContent();
	public double getPrice();
}
