package com.classpath.structural.composite;

public abstract class Employee {

	   public abstract void add(Employee employee);
	   public abstract void remove(Employee employee);
	   public abstract Employee getChild(int i);
	   public abstract String getName();
	   public abstract double getSalary();
	   public abstract void printEmployeeDetails();
	}

