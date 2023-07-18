package coreJava.example.beans;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String id;
	private String name;
	private long salary;
	private String department;

	public Employee() {
	}

	public Employee(String id, String name, long salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public List<Employee> getEmployeeList(){
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("1", "Ramu", 1200, "helpdisk"));
		employee.add(new Employee("1", "kiran", 1000, "frontOffice"));
		employee.add(new Employee("1", "Teja", 200, "HR"));
		employee.add(new Employee("1", "shiva", 1800, "IT"));
		return employee;
	}

}
