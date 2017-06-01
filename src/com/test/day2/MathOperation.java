/**
 * 
 */
package com.test.day2;

/**
 * @author pradeep
 *
 */
public class MathOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String value = "Hello World";
		String value1 = new String("Hello World");

		// employee id
		int empid = 100;

		/** Is true */
		boolean istrue = true;

		System.out.println(value);
		System.out.println(value1);

		System.out.println(empid);

		System.out.println(istrue);

		int input1 = 56;
		int input2 = 34;

		int sum = input1 + input2;

		System.out.println(sum);

		MathOperation hello = new MathOperation();

		int sum2 = hello.sum(23, 45);

		int sum3 = hello.sum(334, 34434);

		System.out.println(sum2);

		System.out.println(sum3);

		System.out.println("Sum of 2 and 5 is : " + hello.sum(2, 5));

		hello.displayName();
		hello.display("Pradeep P");

		int integerValue = 34354;
		int integerValue2 = 23;

		byte byteValue = (byte) integerValue;
		System.out.println(byteValue);

		byte byteValue2 = (byte) integerValue2;
		System.out.println(byteValue2);
		
		byte byte1=23;
		int int1=byte1;
		
		char char1='z';
		System.out.println(char1);
		System.out.println((int)char1);
				

	}

	/**
	 * Sum of two integers.
	 * 
	 * @param input1
	 *            first input.
	 * @param input2
	 *            second input.
	 * @return sum of input1 and input2.
	 */
	public int sum(int input1, int input2) {
		return input1 + input2;
	}

	/**
	 * Display it in console.
	 */
	public void displayName() {
		System.out.println("Hello Pradeep");
	}

	/**
	 * Display name.
	 * 
	 * @param name
	 *            Employee name.
	 */
	public void display(String name) {
		displayName();
		System.out.println("Hello " + name);
	}

}
