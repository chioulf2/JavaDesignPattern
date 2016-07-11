package com.jc.adapter;

public class MainApplication {
	public static void main(String[] args) {
		// 使用不同的兩種資料 一種事本身的內部使用者資訊 另一種是包裝成內部使用者資訊的外部使用者資訊
		IUserInfo userInfo = new UserInfo();
		userInfo.getUserName();
		userInfo.getHomeAddress();
		
		IUserInfo outerUserInfo = new OuterUserInfo();
		outerUserInfo.getUserName();
		outerUserInfo.getHomeAddress();
	}
}
