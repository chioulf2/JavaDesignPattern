package com.jc.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUserInfo {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "这个外部员工叫混世魔王....");
		baseInfoMap.put("mobileNumber", "这个外部员工电话是....");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "這個外部员工的家庭电话是....");
		homeInfo.put("homeAddress", "這個外部员工的家庭地址是....");
		return homeInfo;
	}

}
