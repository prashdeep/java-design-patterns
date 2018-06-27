package com.classpath.creational.prototype;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	private long id;
	
	private String name;
	
	private int age;

	public Employee(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
