package com.jc.observer;

import java.util.ArrayList;

//被觀察者
public class HanFeiZi implements Observable{
	
	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for(Observer observer : observerList){
			observer.update(context);
		}
	}
	
	public void haveBreakfast(){
		System.out.println("韓非子：開始吃早餐囉");
		this.notifyObservers("通報:韓非子吃早餐");
	}
	
	public void haveFun(){
		System.out.println("韓非子：開始玩囉嘿嘿");
		this.notifyObservers("通報:韓非子開玩");
	}
	
}
