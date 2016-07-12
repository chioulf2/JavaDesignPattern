package com.jc.decorator;

public class Main {
	public static void main(String[] args){
		
		//選擇套餐 使用decorator
		//套餐1(with漢堡) 注意這裡是用Meal來宣告
		Meal meal1 = new SideDish1(new Hambuger());
		System.out.println(meal1.getContent());
		System.out.println(meal1.getPrice());
		System.out.println();
		
		//套餐2(with炸雞)
		Meal meal2 = new SideDish2(new FriedChicken());
		System.out.println(meal2.getContent());
		System.out.println(meal2.getPrice());
	}
}
