package com.jc.chainOfResponsibility;
/**
 * 
 * @author Jimmy
 * Chain of Responsibility責任鏈模式
 * http://openhome.cc/Gossip/DesignPattern/ChainofResponsibility.htm
 * 
 * Chain of Responsibility模式的一個例子，多個物件都有機會處理請求
 * 除了可以自由組合處理請求的物件之外，也可以避免請求的發送者與接收者之間的耦合關係
 * 將這些物件組合為一個鏈，並沿著這個鏈傳遞該請求，每個都可以物件處理它，決定是否傳遞給下一個處理物件
 * 
 */
public abstract class Handler {
	private int level = 0; // 能處理的類別
	private Handler nextHandler; // 責任傳遞 下一個處理人

	public Handler(int _level) {
		this.level = _level;
	}
	public final void handleMessage(IWomen women){
		if(women.getType() == level){
			this.response(women);
		}
		else {
			if(this.nextHandler != null){
				this.nextHandler.handleMessage(women);
			}
			else{
				System.out.println("沒有下一個負責人了");
			}
		}
	}
	
	//	回應 在子類實踐
	abstract void response(IWomen women);
	
	public void setNext(Handler _handler){
		this.nextHandler = _handler;
	}
}
