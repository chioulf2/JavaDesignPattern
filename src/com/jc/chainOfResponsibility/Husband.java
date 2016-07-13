package com.jc.chainOfResponsibility;

public class Husband extends Handler {

	public Husband() {
		super(2);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------妻子向丈夫請示-------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答復是:同意\n");
	}

}
