package com.jc.state;
/**
 * 
 * @author Jimmy
 *	狀態模式 State pattern
 *	http://openhome.cc/Gossip/DesignPattern/StatePattern.htm
 * 	
 * pdf講的例子比較深比較好
 * 簡單來說狀態模式是避免太多的if else句子讓程式變得冗長 可維護低
 * 	不同情況下 如果有不同的發展方向 就適合使用狀態模式
 * 譬如電梯開門、關門、移動中 不同情況下 他能延伸的事件不同 就適合用狀態模式(if else會變太複雜)
 * 	舉例 開門時 可以關門 不能移動；移動時 不能開門...
 * 
 */
public abstract class LiftState {
	protected Context context;
	
	public void setContext(Context _context){
		this.context = _context;
	}
	
	//首先電梯門開啟動作
	public abstract void open();
	//電梯門有開啟,那當然也就有關閉了 
	public abstract void close();
	//電梯要能上能下,跑起來 
	public abstract void run();
	//電梯還要能停下來,停不下來那就扯淡了 
	public abstract void stop();
}
