package com.classpath.structural.adapter;

public class StandardAccount extends AbstractAccount {
	
	public StandardAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(false);
	}
}
