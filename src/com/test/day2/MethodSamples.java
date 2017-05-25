package com.test.day2;

/**
 * 
 * @author pradeep
 *
 */
public class MethodSamples {

	// Class level variable
	public static int id;

	/**
	 * Instance variable. Default value is initialized , if the value is not
	 * assigned
	 */
	int versionNumber;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * local variables .Mandatory to initialize.
		 * 
		 * 
		 */
		int localVaribale = 23;

		// Sum of two variables
		int input1 = 23;
		int input2 = 34;
		int sum = input1 + input2;

		System.out.println(sum);

		// Creating an object
		MethodSamples methodSamples = new MethodSamples();

		// Access the variable
		System.out.println("Vesrion Number  : " + methodSamples.versionNumber);

		// Access the local variable
		System.out.println("Local variable  : " + localVaribale);

		// Access method
		int sum1 = methodSamples.sum(45, 67);
		System.out.println("Sum is : " + sum1);

		int sub = methodSamples.subtract(78, 42);
		System.out.println("Subtraction is : " + sub);

		int mean = methodSamples.mean(23, 25);
		System.out.println("Mean is : " + mean);

		methodSamples.displayName("Sharath");
		methodSamples.displayName("Sandeep");

		// Access the static method and variable.
		System.out.println("Multiply  : " + MethodSamples.multiply(2, 3));
		System.out.println("Multiply  : " + multiply(2, 3));
		System.out.println("Id is  : " + MethodSamples.id);
		System.out.println("Id is  : " + id);

	}

	/**
	 * Display a given name.
	 * 
	 * @param name
	 *            Name to display.
	 */
	public void displayName(String name) {
		System.out.println("Name is : " + name);
	}

	/**
	 * Sum of two variables.
	 * 
	 * @param input1
	 *            first input variable.
	 * @param input2
	 *            second input variable.
	 * @return sum of two integers.
	 */
	public int sum(int input1, int input2) {
		return input1 + input2;
	}

	/**
	 * Mean of two variables.
	 * 
	 * @param input1
	 *            first input variable.
	 * @param input2
	 *            second input variable.
	 * @return Mean of two integers.
	 */
	public int mean(int input1, int input2) {

		int mean = sum(input1, input2) / 2;

		return mean;
	}

	/**
	 * Subtraction of two variables.
	 * 
	 * @param input1
	 *            first input variable.
	 * @param input2
	 *            second input variable.
	 * @return Subtraction of two integers.
	 */
	public int subtract(int input1, int input2) {
		return input1 - input2;
	}

	/**
	 * Multiplication of two variables.
	 * 
	 * @param input1
	 *            first input variable.
	 * @param input2
	 *            second input variable.
	 * @return Multiplication of two integers.
	 */
	public static int multiply(int input1, int input2) {
		return input1 * input2;
	}

	public int divide(int input1, int input2) {
		return input1 / input2;
	}

}
