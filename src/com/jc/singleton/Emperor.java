package com.jc.singleton;

/***
 * 
 * @author Jimmy
 * 參考網址 : http://openhome.cc/Gossip/DesignPattern/SingletonPattern.htm
 *	Singleton 的英文意義是獨身，也就是只有一個人，應用在物件導向語言上，通常翻譯作單例：單一個實例（Instance）。
 *	Singleton 模式可以保證一個類別只有一個實例，並提供一個訪問（visit）這個實例的方法。
 *
 *	注意 有多種實踐Singleton的方式 可以一開始就new出來 再多執行緒的情況下就不會有問題
 *	但如果想要實現lazy的呼叫方式(要用的時候才第一次new出來)  就要小心重複new的情況  
 *	所以可能要用synchronize等方法處理 詳情見網址
 *
 */

public class Emperor {
	private static final Emperor emperor = new Emperor();
	
	//注意要給private的
	private Emperor(){
		
	}
	
	//注意要用成static
	public static Emperor getInstance(){
		return emperor;
	}
	public static void emperorInfo(){
		System.out.println("我就是那個皇帝 沒其他人");
	}
	
}
