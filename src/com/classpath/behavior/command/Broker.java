package com.classpath.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Trade> orderList = new ArrayList<Trade>();

	public void processOrder(Trade trade) {
		orderList.add(trade);
	}

	public void placeOrders() {

		for (Trade trade : orderList) {
			trade.executeOrder();
		}
		orderList.clear();
	}
}
