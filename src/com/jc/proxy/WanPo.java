package com.jc.proxy;

public class WanPo implements IWoman {

	IWoman woman;

	public WanPo(IWoman woman) {
		this.woman = woman;
	}

	@Override
	public void makeEyesWithMan() {
		woman.makeEyesWithMan();
	}

	@Override
	public void happyWithMan() {
		woman.happyWithMan();
	}
}
