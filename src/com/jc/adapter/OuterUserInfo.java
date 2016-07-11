package com.jc.adapter;

import java.util.Map;

/*
 *	重點類 這邊利用Adapter的特性 把外部資訊轉成內部可讀的方式
 *	注意他extend跟implement的東西 繼承外部 實作成內部
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map baseInfo = super.getUserBaseInfo(); // 员工的基本信息
	private Map homeInfo = super.getUserHomeInfo(); // 员工的家庭 信息

	@Override
	public String getUserName() {
		String userName = (String) this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = (String) this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

}
