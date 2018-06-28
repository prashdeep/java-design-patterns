package com.classpath.innerclass.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTransformDemo {

	public static void main(String[] args) {
		
		List<Employee> myList = new ArrayList<>();
		myList.add(new Employee(12, "Kiran", 23));
		myList.add(new Employee(31, "Vinay", 34));
		myList.add(new Employee(23, "Pradeep", 35));
		myList.add(new Employee(44, "Jeevan", 45));
		myList.add(new Employee(123, "Naveen", 22));
		myList.add(new Employee(343, "Gautham", 32));
		
		myList.stream().map((obj)-> obj.getName()).forEach((obj)->{System.out.println(obj);});
		long empCount = myList.stream().filter((emp)-> emp.getAge() >= 35).count();
		
		System.out.println("Employee with more than 35 years of age is "+empCount);
		List<Integer> newList = Arrays.asList(23, 34, 56, 67, 67,56,12,34);
		long count = newList.stream().distinct().count();
		//System.out.println("The count is "+count);
	}

}

class Employee {
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
