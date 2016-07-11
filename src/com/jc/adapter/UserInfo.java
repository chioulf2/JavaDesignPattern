package com.jc.adapter;

public class UserInfo implements IUserInfo {
	
	@Override
	public String getHomeAddress() {
		System.out.println("這個員工的地址是....");
		return null;
	}

	@Override
	public String getUserName() {
		System.out.println("這個員工的名字叫阿珠...");
		return null;
	}
}
