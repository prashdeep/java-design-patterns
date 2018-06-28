package com.classpath.structural.bridge;

public class BridgeClient {

	public static void main(String[] args) {
		Apply color = () -> {
			System.out.println("Applying red");
		};
		Shape circle = new Circle(color);
		Shape rectangle = new Rectangle(() -> {
			System.out.println("Applying green");
		});

		circle.changeColorOfShape();
		rectangle.changeColorOfShape();
	}

}
