package com.jc.strategy;

/***
 * 
 * @author Jimmy
 * 另有參考  https://dotblogs.com.tw/joysdw12/archive/2013/03/07/95769.aspx
 * 策略模式作爲一種軟體設計模式，指對象有某個行爲，但是在不同的場景中，該行爲有不同的實現算法。
 * 比如每個人都要「交個人所得稅」，但是「在美國交個人所得稅」和「在中國交個人所得稅」就有不同的算稅方法。
 * 
 */

public interface IStrategy {
	public void operate();
}
