package com.classpath.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
	public static Department fetchDepartment(){
		
		System.out.println("Inside the service method of DepartmentService");
		
		Department department = new Department();
		Employee emp1 = new Employee(12, "Kiran");
		Employee emp2 = new Employee(13, "Vikram");
		Employee emp3 = new Employee(14, "Shalini");
		Employee emp4 = new Employee(15, "Suraj");
		Employee emp5 = new Employee(16, "Sanjay");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		department.setEmpList(employeeList);
		return department;
	}

}
