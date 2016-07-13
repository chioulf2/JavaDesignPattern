package com.jc.observer;

public class LiSi implements Observer {
	@Override
	public void update(String context) {
		System.out.println("李斯:觀察到韓非子活動,開始向老闆匯報了...");
		this.reportToQiShiHuang(context);
		System.out.println("李斯:匯報完畢,秦老闆賞給他兩個蘿蔔吃吃...\n");
	}

	private void reportToQiShiHuang(String reportContext) {
		System.out.println("李斯:報告,秦老闆!韓非子有活動了--->" + reportContext);
	}
}
