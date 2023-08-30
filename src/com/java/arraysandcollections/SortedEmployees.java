package com.java.arraysandcollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortedEmployees {

	public static void main(String[] args) {

//		Using Arrays
		/*
		 * Employee[] emp = new Employee[3];
		 * 
		 * emp[0] = new Employee("shiva", 25000, "Hyderabad"); emp[1] = new
		 * Employee("shivaprasad", 30000, "Bangalore"); emp[2] = new Employee("shiva",
		 * 55000, "Pune");
		 * 
		 * // Sorting employees based on their salaries Arrays.sort(emp,
		 * Comparator.comparingDouble(Employee::getEmployeeSalary));
		 * 
		 * for (Employee employee : emp) { System.out.println(employee); }
		 */

		
		//Using List
		/*
		 * List<Employee> employee = new ArrayList<>();
		 * 
		 * employee.add(new Employee("shiva", 35000, "Hyderabad")); employee.add(new
		 * Employee("kalyan", 45000, "Hyderabad")); employee.add(new Employee("ksp",
		 * 55000, "Hyderabad"));
		 * 
		 * employee.sort(Comparator.comparing(Employee::getEmployeeSalary));
		 * 
		 * for (Employee emp : employee) {
		 * 
		 * System.out.println(emp);
		 * 
		 * }
		 */

		//Using HashMap
		
		final HashMap<String, Employee> employees = new HashMap<>();
		employees.put("sk22158", new Employee("shivaprasad", 65_000, "Hyd"));
		employees.put("sk22157", new Employee("Vinay", 85_000, "Bangalore"));

		final List<Employee> employee = new ArrayList<>(employees.values());

		employee.sort(Comparator.comparing(Employee::getEmployeeSalary));

		for (final Employee emps : employee) {
			System.out.println(emps);
		}

	}

}
