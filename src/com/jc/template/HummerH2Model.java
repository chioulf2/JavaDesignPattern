package com.jc.template;

public class HummerH2Model extends HummerModel {
	@Override
	public void start() {
		System.out.println("悍馬H2發動...");
	}

	@Override
	protected void stop() {
		System.out.println("悍馬H2停止...");
	}

	@Override
	protected void alarm() {
		System.out.println("悍馬H2喇叭 bababa");
	}

	//默認是沒有喇叭的
	@Override
	protected boolean isAlarm() {
		return false;
	}
	

}
