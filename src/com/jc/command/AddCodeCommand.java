package com.jc.command;

public class AddCodeCommand extends Command {
	// 叫coding組增加功能的command

	@Override
	public void execute() {
		super.codeGroup.find(); //先找到code組
		super.codeGroup.add(); //增加功能
	}
}
