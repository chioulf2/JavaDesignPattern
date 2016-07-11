package com.jc.template;
/**
 * 
 * @author Jimmy
 * https://dotblogs.com.tw/pin0513/2010/10/03/18072
 *	
 *	樣板方法模式 將一個演算法的骨架定義在一個方法中，而演算法本身會用到的一些方法，則是定義在次類別中。
 *	樣板方法讓次類別在不改變演算法架構的情況下，重新定義演算法中的某些步驟
 *	因此會叫作樣板”方法”的原因就是因為是包裝了演算法(而不是平常所見的UI介面的意思)。
 *
 */

public abstract class HummerModel {
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	final public void run(){
		this.start();
		if(this.isAlarm()){
			this.alarm();
		}
		this.stop();
	}
	protected boolean isAlarm(){
		return true;
	}
	
}
