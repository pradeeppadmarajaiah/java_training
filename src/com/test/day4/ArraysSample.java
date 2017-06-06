package com.test.day4;

import java.util.stream.IntStream;

/**
 * 
 * @author pradeep
 * 
 *         Arrays sample.
 */
public class ArraysSample {

	public static void main(String[] args) {

		// Arrays
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");

		}

		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
			System.out.print(array1[i] + " ");

		}
		System.out.println("\nLength is : " + array1.length);

		int[] array2 = { 12, 43, 23, 34 };

		System.out.println("\nLength is : " + array2.length);

		System.out.println("Access fourth element of the array : " + array2[3]);

		System.out.println("\n\nEven Numbers : ");
		int[] evenNumber = produceEvenNumber(10);
		for (int i = 0; i < evenNumber.length; i++) {
			System.out.print(evenNumber[i] + " ");
		}

		System.out.println("\n\nOdd Numbers : ");
		int[] oddNumber = produceOddNumber(10);
		for (int i = 0; i < oddNumber.length; i++) {
			System.out.print(oddNumber[i] + " ");
		}

		int sum = sumOfArray(10);
		System.out.println("\n\nArray sum is : " + sum);

		System.out.println("\n\nArray sum using Java 8 : " + sum);
		System.out.println(IntStream.of(oddNumber).sum());

	}

	/**
	 * Produce even number.
	 * 
	 * @param arraylength
	 * @return
	 */
	static int[] produceEvenNumber(int arraylength) {
		int[] tempArray = new int[arraylength];
		for (int i = 0; i < arraylength; i++) {
			tempArray[i] = 2 + 2 * i;
		}
		return tempArray;
	}

	/**
	 * Produce even number.
	 * 
	 * @param arraylength
	 * @return
	 */
	static int[] produceOddNumber(int arraylength) {
		int[] tempArray = new int[arraylength];
		for (int i = 0; i < arraylength; i++) {
			tempArray[i] = 1 + 2 * i;
		}
		return tempArray;
	}

	/**
	 * Produce even number.
	 * 
	 * @param arraylength
	 * @return
	 */
	static int sumOfArray(int arraylength) {
		int sum = 0;
		for (int i = 0; i < arraylength; i++) {
			sum += i;
		}
		return sum;
	}

}
