package com.jc.command;

public class DesignGroup implements IGroup {

	@Override
	public void find() {
		System.out.println("找到disign組");
	}

	@Override
	public void add() {
		System.out.println("要求design組新增需求");
	}

	@Override
	public void delete() {
		System.out.println("要求design組刪除需求");
	}

}
