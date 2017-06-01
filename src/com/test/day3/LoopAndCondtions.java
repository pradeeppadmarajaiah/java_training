package com.test.day3;

/**
 * 
 * @author pradeep
 *
 */
public class LoopAndCondtions {

	public static void main(String[] args) {

		// For loop
		for (int i = 0; i < 12; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		// If, Nested if , Break , Continue
		for (int i = 12; i < 25; i++) {
			// If statement
			if (i == 15) {
				continue;
			} else if (i == 20) {
				break;
			} else {
				System.out.print(i + " ");
			}
		}

		int count = 15;
		System.out.println();
		// While loop
		while (count < 20) {
			System.out.print(count + " ");
			count++;
		}

		// Ternary operator
		System.out.println();
		int input1 = 12;
		int input2 = 15;
		int maxvalue = (input1 > input2) ? input1 : input2;
		System.out.println(maxvalue);
	}

}
