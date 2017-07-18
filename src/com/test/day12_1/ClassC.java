package com.test.day12_1;

import com.test.day12.ClassA;

/**
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class ClassC {

	public static void main(String[] args) {

		System.out.println(ClassA.country);

		ClassA classA = new ClassA();
		System.out.println(classA.empId);
		classA.displayName();

	}
}
