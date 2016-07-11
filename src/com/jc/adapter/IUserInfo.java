package com.jc.adapter;

/**
 * 
 * @author Jimmy
 *	Adapter模式
 *	https://dotblogs.com.tw/pin0513/2010/05/30/15497
 *	
 *	适配器模式不适合在系统设计阶段采用,没有一个系统分析师会在做详设的时候考虑使用适配器模式
 *	这个模式使用的主要场景是扩展应用中,就像我们上面的那个例子一样
 *	系统扩展了,不符合原有设计的 时候才考虑通过适配器模式减少代码修改带来的风险。
 *
 */

public interface IUserInfo {
	//获得用户姓名
	public String getUserName(); //获得家庭地址
	public String getHomeAddress();
}
