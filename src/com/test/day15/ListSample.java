package com.test.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<>();

		Employee employee1 = new Employee();
		employee1.setEmployeeId(1);
		employee1.setEmployeeName("Amar");
		employee1.setCompany("IBM");

		Address address = new Address();
		address.setPincode(12);
		address.setState("Hyd");
		address.setStreetName("First Cross");
		address.setCountry("India");
		employee1.setAddress(address);

		employees.add(employee1);

		Employee employee2 = new Employee();
		employee2.setEmployeeId(2);
		employee2.setEmployeeName("Naresh");
		employee2.setCompany("IBM");
		employee2.setAddress(address);

		employees.add(employee2);

		System.out.println("Total Employee count: " + employees.size());
		System.out.println("Employee 1 details : " + employees.get(0));
		System.out.println("Employee 2 name : " + employees.get(1).getEmployeeName());

		Employee nareshDetails = employees.get(1);
		System.out.println(
				"Naresh Id : " + nareshDetails.getEmployeeId() + " . Naresh Company : " + nareshDetails.getCompany());

	}

}

class Employee {

	private int employeeId;
	private String employeeName;
	private int[] phoneNumbers = new int[2];
	private String company;
	private Address address;

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

	/**
	 * @return the phoneNumbers
	 */
	public final int[] getPhoneNumbers() {
		return phoneNumbers;
	}

	/**
	 * @param phoneNumbers
	 *            the phoneNumbers to set
	 */
	public final void setPhoneNumbers(int[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	/**
	 * @return the company
	 */
	public final String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public final void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the address
	 */
	public final Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public final void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", "
				+ (employeeName != null ? "employeeName=" + employeeName + ", " : "")
				+ (phoneNumbers != null ? "phoneNumbers=" + Arrays.toString(phoneNumbers) + ", " : "")
				+ (company != null ? "company=" + company + ", " : "") + (address != null ? "address=" + address : "")
				+ "]";
	}

}

class Address {
	private String streetName;
	private int pincode;
	private String state;
	private String country;

	/**
	 * @return the streetName
	 */
	public final String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public final void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the pincode
	 */
	public final int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public final void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public final String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [" + (streetName != null ? "streetName=" + streetName + ", " : "") + "pincode=" + pincode + ", "
				+ (state != null ? "state=" + state + ", " : "") + (country != null ? "country=" + country : "") + "]";
	}

}