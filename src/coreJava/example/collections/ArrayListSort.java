package coreJava.example.collections;

import java.util.List;

import coreJava.example.beans.Employee;

public class ArrayListSort {
	
	public static void main(String args[]) {
		Employee employee = new Employee();
		List<Employee> employeeList = employee.getEmployeeList();
		
		//descending order
		employeeList.stream().sorted((e1,e2) -> (int)(e2.getSalary() - e1.getSalary())).forEach(e -> System.out.println(e.getSalary()));
		//Ascending order
		employeeList.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(e-> System.out.println(e.getSalary()));
		
		// Sort by name
		employeeList.stream().sorted((e1,e2) ->e1.getName().compareToIgnoreCase(e2.getName())).forEach(e-> System.out.println(e.getName()));
		
		
	}
}

