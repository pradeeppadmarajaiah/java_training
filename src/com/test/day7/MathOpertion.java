/**
 * 
 */
package com.test.day7;

/**
 * @author pradeep
 *
 */
public class MathOpertion {

	/**
	 * Default constructor.
	 */
	public MathOpertion() {
		System.out.println("Default Constructor ");
	}

	String name;

	/**
	 * Parameterized constructor.
	 */
	public MathOpertion(String name) {
		System.out.println("Inside Constructor 2 : Name is : " + this.name);
		this.name = name;
		System.out.println("Inside Constructor 2: Name is : " + this.name);
	}

	int empId;

	public MathOpertion(int empId) {
		System.out.println("Inside Constructor 3 : Emp Id is : " + this.empId);
		this.empId = empId;
		System.out.println("Inside Constructor 2: Emp Id is : " + this.empId);
	}

	public MathOpertion(String name, int empId) {

		this.name = name;
		this.empId = empId;

		System.out.println("Inside Constructor 3: Emp Id is : " + this.empId + " . Name is : " + name);
	}

	public MathOpertion(int empId, String name) {
		this.name = name;
		this.empId = empId;
		System.out.println("Inside Constructor 3: Emp Id is : " + this.empId + " . Name is : " + name);
	}

	public int squareEmpId() {
		return empId * empId;
	}

	public void displayName() {
		System.out.println("Employee Name : " + name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MathOpertion mathOpertion = new MathOpertion();
		System.out.println("Before initialization : " + mathOpertion.name);
		mathOpertion.displayName();

		MathOpertion mathOpertion1 = new MathOpertion("Pradeep");
		System.out.println("After initialization : " + mathOpertion1.name);
		mathOpertion1.displayName();

		MathOpertion mathOpertion2 = new MathOpertion(23);
		System.out.println("After initialization : " + mathOpertion2.empId);
		mathOpertion2.displayName();
		int square = mathOpertion2.squareEmpId();
		System.out.println(square);

		MathOpertion mathOpertion3 = new MathOpertion("Kumar", 456);

		MathOpertion mathOpertion4 = new MathOpertion(4, "Raj");
		int squareEmpId = mathOpertion4.squareEmpId();
		System.out.println(squareEmpId);

		System.out.println(mathOpertion.name);
		System.out.println(mathOpertion1.name);
		System.out.println(mathOpertion3.name);
		System.out.println(mathOpertion.name);
		System.out.println(mathOpertion1.name);
		System.out.println(mathOpertion4.name);

	}

}