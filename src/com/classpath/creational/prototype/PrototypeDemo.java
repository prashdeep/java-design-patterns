package com.classpath.creational.prototype;


public class PrototypeDemo {
	
	public static void main(String[] args) {
		Department department = DepartmentService.fetchDepartment();
		Department newDepartmentObj = department.clone();
		
		newDepartmentObj.getEmpList().forEach((e)-> System.out.println(e));
	}

}
