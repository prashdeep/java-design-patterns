package com.classpath.behavior.strategy;

public class ShoppingCart {

	private double totalAmount;

	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.processPayment(totalAmount);
	}

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item one = new Item("Laptop", 1_00_000.00);
		Item two = new Item("Camera", 25_000.99);

		cart.totalAmount = one.getPrice() + two.getPrice();

		PaymentStrategy ccStrategy = (amount) -> {
			System.out.println("Paid using CreditCard > "+amount);
			return Status.SUCCESS;
		};
		cart.pay(ccStrategy);

	}

}
