package com.classpath.structural.adapter;

public interface Account {
	
	public double getBalance();

	public boolean isOverdraftAvailable();

	public void credit(final double credit);
}
