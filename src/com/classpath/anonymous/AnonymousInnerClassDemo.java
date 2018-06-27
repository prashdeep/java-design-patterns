package com.classpath.anonymous;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		
		Fly aeroplane = ()->  "Aeroplane flying";
		Fly helicopter = ()->  "Helicopter flying";
		System.out.println(helicopter.fly());
	}

}
