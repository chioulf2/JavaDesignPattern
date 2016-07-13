package com.jc.chainOfResponsibility;

public class Father extends Handler {

	public Father() {
		super(1);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------女兒向父親請示-------");
		System.out.println(women.getRequest());
		System.out.println("父親的答復是:同意\n");
	}

}
