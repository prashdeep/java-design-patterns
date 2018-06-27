package com.classpath.innerclass;

class Outer {
	
	private int value;
	
	public void display() {
		System.out.println("display is called from the Inner class..");
		
	}
	
	class Inner {
		public void displayValue() {
			System.out.println("The value from the outer class is "+value);
			display();
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner innerObj1 = outer.new Inner();
		//second form
		Outer.Inner innerObj2 = new Outer().new Inner();
		innerObj1.displayValue();
		
	}
}
