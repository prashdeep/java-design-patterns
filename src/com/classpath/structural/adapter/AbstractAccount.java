package com.classpath.structural.adapter;


public class AbstractAccount implements Account {
	
	private double balance;	
	
	private boolean isOverdraftAvailable;

	public AbstractAccount(final double size) {
		this.balance = size;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public boolean isOverdraftAvailable() {
		return isOverdraftAvailable;
	}

	public void setOverdraftAvailable(boolean isOverdraftAvailable) {
		this.isOverdraftAvailable = isOverdraftAvailable;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " Balance=" + getBalance()
				+ " Overdraft:" + isOverdraftAvailable();
	}

	@Override
	public void credit(final double credit) {
		balance += credit;
	}
}