package com.jc.simpleFactory;

/***
 * 
 * @author Jimmy
 *	網址1:http://phoebelin0606.pixnet.net/blog/post/385786012-java-simple-factory-pattern-%E7%B0%A1%E5%96%AE%E5%B7%A5%E5%BB%A0%E6%A8%A1%E5%BC%8F
 *	網址2:https://dotblogs.com.tw/joysdw12/archive/2013/06/23/design-pattern-simple-factory-pattern.aspx
 *
 *	簡單工程模式，這個模式的主要特色是把物件生產的細節封裝起來交給Factory生產
 *	客戶端只需要傳遞生產參數給Factory的靜態方法，進而產生相對的物件，不需要處理製造細節
 *	
 */

public interface IPet {
	public void eat();
}
