package com.jc.template;

public class HummerH1Model extends HummerModel {
	
	boolean alarmFlag = true;
	
	@Override
	public void start() {
		System.out.println("悍馬H1發動...");
	}

	@Override
	protected void stop() {
		System.out.println("悍馬H1停止...");
	}

	@Override
	protected void alarm() {
		System.out.println("悍馬H1喇叭 bababa");
	}
	
	@Override
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}
}
