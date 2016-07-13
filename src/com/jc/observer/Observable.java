package com.jc.observer;

/**
 * 
 * @author Jimmy
 *	Observer觀察者模式
 *	
 *	觀察者模式在實際項目的應用中非常常見,比如你到ATM 機器上取錢,多次輸錯密碼,卡就會被ATM 吞掉
 *	吞卡動作發生的時候,會觸發哪些事件呢?
 *	第一攝像頭連續快拍,第二,通知監控系統,吞卡發生; 第三,初始化ATM 機屏幕,返回最初狀態
 *	你不能因為就吞了一張卡,整個ATM 都不能用了吧,一般前兩個動作都是通過觀察者模式來完成的。
 */
public interface Observable {
	public void addObserver(Observer observer);
	public void deleteObserver(Observer observer);
	
	//既然要觀察,我發生改變了他也應該用所動作——通知觀察者
	public void notifyObservers(String context); 
}
