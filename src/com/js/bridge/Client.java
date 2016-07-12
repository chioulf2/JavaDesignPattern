package com.js.bridge;

public class Client {
	public static void main(String[] args){
		IPodCorporation iPodCorporation = new IPodCorporation(new IPod());
		iPodCorporation.makeMoney();
		System.out.println();
		
		//山寨的 傳不同東西進去做不同事
		ShanZhaiCorporation shanZhaiIPod = new ShanZhaiCorporation(new IPod());
		shanZhaiIPod.makeMoney();
		System.out.println();
		
		ShanZhaiCorporation shanZhaiCar = new ShanZhaiCorporation(new Car());
		shanZhaiCar.makeMoney();
	}
}
