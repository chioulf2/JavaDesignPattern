package com.jc.proxy;

public class XiMenQing {
	public static void main(String[] args){
		System.out.println("西門慶找王婆代理");
		WanPo wanpo = new WanPo(new PanJinLian());
		wanpo.makeEyesWithMan();
		wanpo.happyWithMan();
	}
}
