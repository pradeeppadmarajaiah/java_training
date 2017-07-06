/**
 * 
 */
package com.test.day10;

/**
 * @author PradeepPadmarajaiah
 *
 */
public interface MathOperation {

	int sum(int input1, int input2);

	int multiply(int input1, int input2);

	// Java 8
	default int subtract(int input1, int input2) {
		return input1 - input2;
	}

	static int division(int input1, int input2) {
		return input1/ input2;
	}
}
