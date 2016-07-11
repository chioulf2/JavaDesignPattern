package com.jc.factory;
/**
 * 
 * @author Jimmy
 * 
 * 網址1:https://dotblogs.com.tw/joysdw12/2013/09/12/design-pattern-factory-method-pattern
 * 網址2(三種工廠模式比較):http://blog.amowu.com/2009/08/factory-pattern.html
 * 
 *	使用簡單工廠模式雖然方便，但也是有缺點的。
 *	如果每次新增一個 Product 子類別後，都必須修改 Factory class 中 CreateProduct() 的 switch 判斷式的話
 *	這樣做不符合物件導向設計的 Open-Closeed Principle(開放-封閉原則) 精神。
 *
 *	簡單工廠方法其實與工廠方法有些相似，但是仔細看看
 *	簡單工廠是將全部的事情於簡單工廠的方法中處理完成
 *	而工廠方法卻會將要處理的事情交由實際實踐的次類別處理
 *	也就是當產品的種類增加時在簡單工廠的情況下必須要修改簡單工廠方法
 *	而在工廠方法模式下只需要多增加一個新產品工廠的次類別去實踐，如此就符合「開放封閉」原則
 *	但工廠方法有個缺點就是會產生大量的工廠次類別。
 *
 */

public interface IBeverageFactory {
	IBeverage createBeverage();
}
