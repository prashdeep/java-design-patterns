package com.classpath.behavior.command;

public class CommandPatternDemo {
	   public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.processOrder(buyStockOrder);
	      broker.processOrder(sellStockOrder);

	      broker.placeOrders();
	   }
	}
