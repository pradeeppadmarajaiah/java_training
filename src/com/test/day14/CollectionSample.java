package com.test.day14;

import java.util.ArrayList;
import java.util.List;

/**
 * List sample
 * 
 * @author PradeepPadmarajaiah
 *
 */
public class CollectionSample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		// Add some elements
		names.add("Pradeep");
		names.add("Abida");
		names.add("Amar");
		names.add("Archita");

		// Displaying all the names
		System.out.println(names);

		// Display a specific name
		System.out.println("2nd index value: " + names.get(1));

		boolean removedValue = names.remove("Pradeep");
		System.out.println("Is pradeep removed : " + removedValue);
		System.out.println(names);

		String removedValue1 = names.remove(1);
		System.out.println("Removed value is :" + removedValue1);

		System.out.println(names);
		names.add(0, "Raj");

		System.out.println(names);

	}

}
