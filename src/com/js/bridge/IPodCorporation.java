package com.js.bridge;

public class IPodCorporation extends Corporation {

	// 這部分重要！ 要用super來處理抽象類別上面的問題
	public IPodCorporation(IPod iPod) {
		super(iPod);
	}

	// 這裡除了繼承上面的動作外 還可以自己加動作
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("IPod賺大錢了");
	}
}
