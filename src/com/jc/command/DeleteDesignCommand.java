package com.jc.command;

public class DeleteDesignCommand extends Command {
	// 叫設計組刪除頁面的command

	@Override
	public void execute() {
		super.designGroup.find(); //先找到設計組
		super.designGroup.delete(); //刪除頁面
	}
}
