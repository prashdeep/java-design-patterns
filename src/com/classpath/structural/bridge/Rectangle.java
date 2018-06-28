package com.classpath.structural.bridge;

public class Rectangle extends Shape{
	
	public Rectangle(Apply color) {
		super(color);
	}

	@Override
	public void changeColorOfShape() {
		color.applyColor();
		
	}

}
