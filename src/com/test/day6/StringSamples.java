/**
 * 
 */
package com.test.day6;

/**
 * @author pradeep
 *
 */
public class StringSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstName = "Pradeep";
		String lastName = new String(" P");

		System.out.println("Length of a String : " + firstName.length());
		System.out.println("Index position  : " + firstName.indexOf("e"));
		System.out.println("Index position which is not in string  : " + firstName.indexOf("z"));
		System.out.println("Last Index position : " + firstName.lastIndexOf("e"));
		System.out.println("Character at 3rd position : " + firstName.charAt(3));
		System.out.println("Character Unicode : " + firstName.codePointAt(3));

		// Convert int to String
		int intValue = 34;
		String stringIntValue = String.valueOf(intValue);

		// Immutable
		System.out.println("Immutable test");
		firstName.toUpperCase();
		System.out.println(firstName);
		firstName = firstName.toUpperCase();
		System.out.println(firstName);

		String name = firstName + lastName;
		System.out.println("First type : Concat " + name);
		name = firstName.concat(lastName);
		System.out.println("Second type : Concat " + name);

		// Concatenating the empty String
		String emptyString = null;
		String concatString1 = emptyString + firstName;
		System.out.println("Printing concatString1 " + concatString1);

		/*
		 * String concatString2 = emptyString.concat(firstName);
		 * System.out.println(concatString2);
		 */

		// String Builder
		StringBuilder builder = new StringBuilder("P ");
		builder.append("Pradeep");
		builder.append(" IBM ").append(" Bangalore").append(4);
		System.out.println("builder value : " + builder.toString());

		// String Buffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Chandan");
		System.out.println("buffer value : " + buffer);

		// Compare a string
		String compare1 = "Pradeep";
		String compare2 = "Pradeep";
		if (compare1 == compare2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}

		if (compare1.equals(compare2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}

		String compare3 = "Pradeep";
		String compare4 = new String("Pradeep");
		if (compare3 == compare4) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}

		if (compare3.equals(compare4)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}

		String compare5 = new String("Pradeep");
		String compare6 = new String("Pradeep");
		if (compare5 == compare6) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}

		if (compare5.equals(compare6)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
