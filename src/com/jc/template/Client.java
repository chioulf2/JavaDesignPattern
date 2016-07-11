package com.jc.template;

public class Client {
	public static void main(String[] args) {
		//H1默認會響鈴的情況
		HummerH1Model h1 = new HummerH1Model();
		h1.run();
		System.out.println();
		
		//H1手動設定不響鈴的情況
		h1.setAlarm(false);
		h1.run();
		System.out.println();
		
		//H2的默認是不響鈴
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}
