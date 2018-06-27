package com.classpath.behavior.strategy;

public class CODStrategy implements PaymentStrategy {

	@Override
	public Status processPayment(double amount) {
		System.out.println(" Amount: "+amount+" paid using COD");
		return Status.SUCCESS;
	}

}
