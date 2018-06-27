package com.classpath.structural.bridge;

public abstract class Shape {
	protected Apply color;
	
	public Shape(Apply color) {
		this.color = color;
	}
	
	public abstract void applyColor();

}
