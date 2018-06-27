package com.classpath.behavior.command;

public class Stock {

	private String name = "Oracle";
	private int quantity = 100;

	public void buy() {
		System.out.println("Operation: Buy,  Name: " + name + ", quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Operation : Sell , Name: " + name + ", quantity: " + quantity);
	}
}