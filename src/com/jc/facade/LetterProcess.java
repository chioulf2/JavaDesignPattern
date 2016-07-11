package com.jc.facade;

/**
 * 
 * @author Jimmy
 * 
 *	Facade模式
 *	http://openhome.cc/Gossip/DesignPattern/FacadePattern.htm
 *	
 *	簡單來說 就是開放一個入口 在這個入口統一調用大家的方法
 * 讓比較不懂得開發人員 只要調用這個入口就可以做事情 不用了解內部複雜的事情在幹麻
 * pdf是舉例寄信 寄信有4個步驟 用facade封裝成一個入口  別人只要呼叫這個入口就可以成功寄信	
 *
 */
public interface LetterProcess {
	public void writeContext(String context);
	public void fillEnvelope(String address);
	public void sendLetter();
}
