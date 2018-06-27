package com.classpath.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(12, "Pradeep", 32, 34_00_000.00);
		Employee emp2 = new Employee(13, "Vikram", 21, 34_00_000.00);
		Employee emp3 = new Employee(16, "Vinay", 56, 34_00_000.00);
		Employee emp4 = new Employee(23, "Rakesh", 40, 34_00_000.00);
		Employee emp5 = new Employee(56, "Sanjay", 44, 34_00_000.00);
		
		Set<Employee> employeeSet = new TreeSet<>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);
		
		//System.out.println(employeeSet);
		
		//sort by name
		Comparator<Employee> ascNameComparator = ( o1,  o2) -> o1.getName().compareTo(o2.getName());
		//sort by name
		Comparator<Employee> descNameComparator = ( o1,  o2) -> o2.getName().compareTo(o1.getName());
		Set<Employee> sortedByNameAsc = new TreeSet(descNameComparator);
		sortedByNameAsc.add(emp1);
		sortedByNameAsc.add(emp2);
		sortedByNameAsc.add(emp3);
		sortedByNameAsc.add(emp4);
		sortedByNameAsc.add(emp5);
		
		System.out.println(sortedByNameAsc);
	}

}
