package com.jc.command;

public class CodeGroup implements IGroup {

	@Override
	public void find() {
		System.out.println("找到coding組");
	}

	@Override
	public void add() {
		System.out.println("要求coding組新增需求");
	}

	@Override
	public void delete() {
		System.out.println("要求coding組刪除需求");
	}

}
