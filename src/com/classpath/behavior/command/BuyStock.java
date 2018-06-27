package com.classpath.behavior.command;

public class BuyStock implements Trade {
	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void executeOrder() {
		stock.buy();

	}
}
