package com.test.day1;

import com.test.day2.MethodSamples;

/**
 * 
 * @author pradeep
 *
 */
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Welcome to Java world.");

		int empId = 03577;
		String empName = "Pradeep";

		System.out.println("Employee Name is : " + empName + "  and Employee id is : " + empId);

		byte byteValue = 100;

		int intByteValue = byteValue;

		System.out.println(intByteValue);

		int intValue = 10220;

		// Requires casting when converting from int to byte
		byteValue = (byte) intValue;

		// Throws some junk Value if it out of range
		System.out.println(byteValue);

		char alphabet = 'a';
		System.out.println(alphabet);
		System.out.println((int) alphabet);

	}
}
