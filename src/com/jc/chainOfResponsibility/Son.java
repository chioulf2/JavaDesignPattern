package com.jc.chainOfResponsibility;

public class Son extends Handler {

	public Son() {
		super(3);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------母親向兒子請示-------");
		System.out.println(women.getRequest());
		System.out.println("兒子的答復是:同意\n");
	}

}
