package com.jc.command;

public class Client {
	public static void main(String[] args){
		Invoker Jimmy  = new Invoker(); //代理人Jimmy
		Jimmy.setCommand(new AddCodeCommand()); //發布增加code的命令給代理人
		Jimmy.action(); //接收命令後 執行命令
		System.out.println();
		
		Jimmy.setCommand(new DeleteDesignCommand());
		Jimmy.action();
	}
}
