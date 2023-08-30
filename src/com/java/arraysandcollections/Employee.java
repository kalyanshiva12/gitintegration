package com.java.arraysandcollections;

public class Employee {

	private String employeeName;

	private double employeeSalary;

	private String employeeAddress;

	public Employee(String employeeName, double employeeSalary, String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeAddress="
				+ employeeAddress + "]";
	}

}
