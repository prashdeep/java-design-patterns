package com.classpath.structural.decorator;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " INR " + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " INR " + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		
		beverage3 = new Soy(new Mocha(new Whip(beverage3)));
		
		System.out.println(beverage3.getDescription() + " INR" + beverage3.cost());
	}
}
