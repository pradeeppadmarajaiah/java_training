package com.test.day12;

/**
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class ClassA {
	public static String country = "India";
	public int empId = 23;
	public String name;

	static {
		String companyName = "IBM";
	}

	/**
	 * Default construtor
	 */
	public ClassA() {

		System.out.println("Default constructor");
	}

	/**
	 * overloaded construtor
	 */
	public ClassA(String name) {
		this.name = name;
	}

	public void displayName() {

		System.out.println("Hello Pradeeep");
	}

	private String empName = "pradeep1";
	private static String companyName1 = "IBM1";

	private void displayName1() {
		System.out.println("Hello Pradeeep");
	}

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		System.out.println(ClassA.companyName1);
		System.out.println(classA.empName);
		classA.displayName1();
	}
}
