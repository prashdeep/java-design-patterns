package com.classpath.structural.adapter;

public class PlatinumAccount extends AbstractAccount {

	public PlatinumAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(true);
	}
}