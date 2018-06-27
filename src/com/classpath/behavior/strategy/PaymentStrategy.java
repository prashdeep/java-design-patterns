package com.classpath.behavior.strategy;

public interface PaymentStrategy {

	public Status processPayment(double amount);
}