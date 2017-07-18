package com.test.day13;

/***
 * Encapsulation
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class Employee {

	private int employeeId;
	private String employeeName;

	/**
	 * @return the employeeId
	 */
	public final int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public final void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public final String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public final void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setEmployeeId(12);
		employee.setEmployeeName("Pradeep P");

		System.out.println("Employee Id : :" + employee.getEmployeeId());
		System.out.println("Employe Name : " + employee.getEmployeeName());

	}

}
