package com.jc.proxy;

/***
 * 
 * @author Jimmy
 * 另有參考 https://segmentfault.com/a/1190000002510537
 *	代理模式主要思想
 *	代理人跟被代理人要去implement同一個interface
 *	所以他們會implement同樣的方法
 *	代理人可以在執行被代理人的方法時 多做一點事情 譬如抽佣金??
 *	
 * 代理模式的一个好处就是对外部提供统一的接口方法
 * 而代理类在接口中实现对真实类的附加操作行为，从而可以在不影响外部调用情况下，进行系统扩展。
 * 也就是说，我要修改真实角色的操作的时候，尽量不要修改他，而是在外部在“包”一层进行附加行为，即代理类。
 *
 */

public interface IWoman {
	public void makeEyesWithMan();
	public void happyWithMan();
}
