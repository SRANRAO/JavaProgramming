package coreJava.example.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coreJava.example.beans.Employee;

public class MapSort {
	
	public static void main(String args[]) {
		mapByKeyandValue(); 
		Map<Employee, Long> emp = new HashMap<Employee, Long>();
		Employee employee = new Employee();
		List<Employee> employeeList = employee.getEmployeeList();

		for (Employee employee2 : employeeList) {
			emp.put(employee2, employee2.getSalary());
		}
		
		emp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}

	private static void mapByKeyandValue() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tiger", 150);
		map.put("cat", 90);
		map.put("oxe", 80);
		map.put("ant", 1);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
