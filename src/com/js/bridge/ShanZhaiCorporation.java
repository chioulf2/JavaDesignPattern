package com.js.bridge;

public class ShanZhaiCorporation extends Corporation {

	// 這部分重要！ 要用super來處理抽象類別上面的問題
	public ShanZhaiCorporation(Product product) {
		super(product);
	}

	// 這裡除了繼承上面的動作外 還可以自己加動作
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("山寨賺大錢了");
	}
}
