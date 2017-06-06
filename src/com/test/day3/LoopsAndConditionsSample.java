package com.test.day3;

public class LoopsAndConditionsSample {
	public static void main(String[] args) {

		String name = "Hello World";
		name = new String("Pradeep");
		int id = 23;
		System.out.println(name);
		System.out.println(id);

		// For loop sample
		System.out.println("==============For loop=========");
		for (int i = 0; i < 10; i++) {
			// if sample
			if (i == 4) {
				System.out.println("Pradeep");
				System.out.println("Raj");
			} else if (i == 2) {
				System.out.println("value is 2");
			}
			// if else
			else {
				// Nested if else
				if (i == 3) {
					System.out.println("I has a value 3");
				} else {
					System.out.println(i);
				}
			}
		}

		// While loop
		System.out.println("==============While loop=========");
		int count = 25;
		while (count > 1) {
			System.out.print(count + " ");
			count--;
		}

		// continue and break example
		System.out.println("\n==============continue break=========");
		for (int i = 0; i < 10; i++) {
			if (i == 1) {
				continue;
			} else {
				if (i == 8) {
					break;
				} else {
					System.out.print(i + " ");
				}
			}
		}

		// Sum of first ten number
		System.out.println("\n==============sum of first ten numbers using for loop =========");
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total = total + i;
		}
		System.out.println(total);

		System.out.println("\n==============sum of first ten numbers using while loop =========");
		int countForWhile = 9;
		int totalUsingwhile = 0;
		while (countForWhile > 0) {
			totalUsingwhile = totalUsingwhile + countForWhile;
			countForWhile--;
		}
		System.out.println(totalUsingwhile);

		// Average of ten number
		int average = total / 10;
		System.out.println("Average of first ten number : " + average);

		// ternary operator
		int a = 20;
		int b = 35;
		int c = 40;
		int greaterValue = a > b ? a : b;
		System.out.println("Greater value is " + greaterValue);

		// Nested ternary
		int nestedTernary = a > b ? (a > c ? a : c) : b;
		
		

	}
}
