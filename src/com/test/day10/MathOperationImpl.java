/**
 * 
 */
package com.test.day10;

/**
 * @author PradeepPadmarajaiah
 *
 */
public class MathOperationImpl implements MathOperation {

	@Override
	public int sum(int input1, int input2) {
		return input1 + input2;
	}

	@Override
	public int multiply(int input1, int input2) {
		return input1 * input2;
	}

	@Override
	public int subtract(int input1, int input2) {
		return input1 + input1;
	}

	public float mod(int input1, int input2) {
		return input1 % input2;
	}

	public static void main(String[] args) {

		MathOperationImpl operationImpl = new MathOperationImpl();
		System.out.println("Class level mod: " + operationImpl.mod(4, 2));
		System.out.println("Class level subtract: " + operationImpl.subtract(23, 34));
		System.out.println("Class level multiply: " + operationImpl.multiply(3, 2));

		MathOperation mathOperation = new MathOperationImpl();
		System.out.println("Interface level multiply: " + mathOperation.multiply(3, 4));
		System.out.println("Interface level subtract: " + mathOperation.subtract(3, 4));

	}

}
