package com.jc.command;
/**
 * 
 * @author Jimmy
 *	Command模式
 *	http://openhome.cc/Gossip/DesignPattern/CommandPattern.htm
 *	
 * 在軟件設計中，我們經常需要向某些對象發送請求，但是並不知道請求的接收者是誰
 * 也不知道被請求的操作是哪個，我們只需在程序運行時指定具體的請求接收者即可
 * 此時，可以使用命令模式來進行設計，使得請求發送者與請求接收者消除彼此之間的耦合，讓對象之間的調用關係更加靈活。
 * 命令模式可以對發送者和接收者完全解耦，發送者與接收者之間沒有直接引用關係
 * 發送請求的對像只需要知道如何發送請求，而不必知道如何完成請求。這就是命令模式的模式動機。
 * 
 */
public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	//執行客戶的命令
	public void action(){
		this.command.execute();
	}
}
