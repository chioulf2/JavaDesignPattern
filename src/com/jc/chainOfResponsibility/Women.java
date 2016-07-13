package com.jc.chainOfResponsibility;

public class Women implements IWomen {

	/*
	 * 通過一個int類型的參數來描述婦女的個人狀況 1---未出嫁 2---出嫁 3---夫死
	 */
	private int type = 0; 
	// 婦女的請示
	private String request = "";

	public Women(int _type, String _request) {
		this.type = _type;
		this.request = _request;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
