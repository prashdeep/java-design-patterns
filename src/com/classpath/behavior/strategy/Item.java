package com.classpath.behavior.strategy;

public class Item {
	
	private String name;
	private double price;
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
