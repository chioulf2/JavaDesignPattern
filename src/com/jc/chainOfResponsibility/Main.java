package com.jc.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		ArrayList<IWomen> womenList = new ArrayList<IWomen>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) { //隨機挑一些女人
			womenList.add(new Women(random.nextInt(4), "我想去跟別人玩"));
		}
		
		Father father = new Father();
		Husband husaband = new Husband();
		Son son = new Son();
		
		//設定請示順序
		father.setNext(husaband);
		husaband.setNext(son);
		
		//女人們依序請示
		for(IWomen women : womenList){
			father.handleMessage(women);
		}
	}
}
