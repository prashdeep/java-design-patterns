package com.classpath.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Department implements Cloneable {

	private List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public void addEmployee(Employee employee) {
		this.empList.add(employee);
	}

	@Override
	public Department clone() {
		Department department = new Department();
		List<Employee> empList = new ArrayList<>();
		

		this.empList.forEach((employee) -> {
			empList.add(employee);
		});
		department.setEmpList(empList);
		return department;
	}

}
