package com.js.bridge;

/**
 * 
 * @author Jimmy
 *	Bridge模式
 *	http://openhome.cc/Gossip/DesignPattern/BridgePattern.htm
 *
 *	Bridge模式的目的，在於將抽象與實現分離，使兩者都可以獨立地演化。
 *	這邊所謂的抽象，指的是指應用程式行為定義的演化，而實現指的是應用程式實作時，所需使用的特定API或平台。
 */
public abstract class Corporation { //工廠的抽象類別
	private Product product;
	
	public Corporation(Product product){
		this.product = product;
	}
	
	public void makeMoney(){
		//每樣產品都會先生產
		this.product.beProduced();
		//然後再賣掉
		this.product.beSelled();
	}
}
