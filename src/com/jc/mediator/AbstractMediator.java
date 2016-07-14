package com.jc.mediator;

/**
 * 
 * @author Jimmy
 * Mediator中介者模式
 * 
 * 參考pdf
 * 降低物件間的依賴關係 中間定義一個中介者
 * 
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// 構造函數
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// 中介者最重要的方法,叫做事件方法,處理多個對象之間的關係
	public abstract void execute(String str, Object... objects);
}
