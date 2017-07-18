package com.test.day12;

/**
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class ClassB {

	public static void main(String[] args) {

		System.out.println(ClassA.country);
		
		ClassA classA = new ClassA();
		System.out.println(classA.empId);
		classA.displayName();
		
		

	}

}
