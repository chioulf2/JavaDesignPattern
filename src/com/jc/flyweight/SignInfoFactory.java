package com.jc.flyweight;

import java.util.HashMap;

public class SignInfoFactory {
	private static HashMap<String, SignInfo> pool = new  HashMap<String, SignInfo>();
	
	public static SignInfo getSignInfo(String key){
		SignInfo result = null;
		if(!pool.containsKey(key)){
			System.out.println(key+"---建立對象，並放入池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}
		else {
			result = pool.get(key);
			System.out.println(key+"---直接從池中得到");
		}
		return result;
	}
}
