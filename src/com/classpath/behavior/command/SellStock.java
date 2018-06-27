package com.classpath.behavior.command;

public class SellStock implements Trade {
	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void executeOrder() {
		stock.sell();
	}

}
