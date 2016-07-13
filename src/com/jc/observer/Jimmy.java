package com.jc.observer;

public class Jimmy implements Observer {
	@Override
	public void update(String context) {
		System.out.println("Jimmy:觀察到韓非子活動,開始覺得好笑...");
		this.laugh(context);
		System.out.println("Jimmy笑完了XDDD \n");
	}

	private void laugh(String context) {
		System.out.println("Jimmy覺得韓非子活動很好笑--->" + context);
	}
}
