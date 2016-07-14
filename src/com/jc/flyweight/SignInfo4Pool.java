package com.jc.flyweight;
/**
 * 
 * @author Jimmy
 * Flyweight模式
 * http://openhome.cc/Gossip/DesignPattern/FlyweightPattern.htm
 * 
 * 參考pdf版-->設計模式之禪
 *	避免大量擁有相同內容的小類別的開銷(如耗費記憶體),使大家共用一個類別(元類別)。
 *	把會重複使用的屬性抽出來 不同屬性在另外處理
 *
 */
public class SignInfo4Pool extends SignInfo {
	private String key;

	public SignInfo4Pool(String _key) {
		key = _key;
	}
	public String getKey(){
		return key;
	}
	public void setKey(String key){
		this.key = key;
	}
}
