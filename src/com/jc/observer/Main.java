package com.jc.observer;

import java.awt.List;

public class Main {
	public static void main(String[] args){
		HanFeiZi hanFeiZi = new HanFeiZi();
		Observer liSi = new LiSi();
		Observer jimmy = new Jimmy();
		
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(jimmy);
		
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
		
	}
}
