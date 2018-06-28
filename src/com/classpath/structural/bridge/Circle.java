package com.classpath.structural.bridge;

public class Circle extends Shape {

	public Circle(Apply color) {
		super(color);
	}

	@Override
	public void changeColorOfShape() {
		color.applyColor();
	}

}
