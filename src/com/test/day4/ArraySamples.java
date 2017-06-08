package com.test.day4;

/**
 * Array samples
 * 
 * @author pradeep
 *
 */
public class ArraySamples {

	/**
	 * 
	 * Java Main method.
	 * 
	 * @param args
	 *            Array of Strings.
	 */
	public static void main(String[] args) {

		int[] array = new int[5];

		// Array length
		System.out.println("Array length is : " + array.length);

		// Initial values
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		// assigning values
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}

		// java.lang.ArrayIndexOutOfBoundsException
		// System.out.println("\n" + array[5]);
		System.out.println();
		// access array individually
		int array1 = array[1];
		int array2 = array[2];
		System.out.println("Array 1 value : " + array1);
		System.out.println("Array 2 value : " + array2);

		// Overriding the existing values.
		array[1] = 23;

		System.out.println("Overriding the Array 1  value : " + array[1]);

		// Another type of initialization
		int[] arraySecond = { 12, 23, 34 };
		System.out.println("arraySecond length : " + arraySecond.length);
		System.out.println("arraySecond first value : " + arraySecond[0]);

		// sum of first ten numbers;
		int size = 10;
		int[] arrayThird = new int[size];
		for (int i = 0; i < arrayThird.length; i++) {
			arrayThird[i] = i;
		}
		int totalOfarrayThird = 0;
		for (int i = 0; i < arrayThird.length; i++) {
			totalOfarrayThird += arrayThird[i];

			// similar to
			// totalOfarrayThird = totalOfarrayThird + arrayThird[i];
		}
		System.out.println(totalOfarrayThird);

		// Sum of an array
		int[] arrayFourth = { 23, 34, 45, 48, 34, 45, 45, 46, 34 };
		int totalOfArrayFourth = 0;
		for (int i = 0; i < arrayFourth.length; i++) {
			totalOfArrayFourth = totalOfArrayFourth + arrayFourth[i];
		}
		System.out.println(totalOfArrayFourth);

		// For loop for an array.
		int[] arrayFifth = { 23, 34, 45, 48, 34, 45, 45, 46, 34 };
		int totalArrayFifth = 0;
		for (int arrayValue : arrayFifth) {
			totalArrayFifth += arrayValue;
		}
		System.out.println(totalArrayFifth);

		// String array
		String[] names = { "Pradeep", "Amar", "Sandeep", "Sarath", "Abida", "Archita", "Gayathri" };
		for (String name : names) {
			System.out.println(name);
		}

	}

}
