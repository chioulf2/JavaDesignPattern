package com.jc.command;

public abstract class Command {
	protected CodeGroup codeGroup = new CodeGroup();
	protected DesignGroup designGroup = new DesignGroup();
	
	//只要一個方法 定義全部要做什麼事情
	public abstract void execute();
}
