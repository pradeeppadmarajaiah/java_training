package com.test.day11;

public class ClassA {

	public ClassA() {
		System.out.println("Default constructor");
	}

	static {
		System.out.println("Printing static block");
	}
	static int id = 30;
	int id1 = 45;

	final int cube(int input) {
		return input * input * input;
	}

	static int square(int input) {
		return input * input;
	}

	static int meanOfSquare(int input) {
		return square(input) / 2;
	}

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		System.out.println(classA.id1);

		System.out.println(classA.id);

		System.out.println(ClassA.id);
		System.out.println(id);

		int square = square(4);
		int square1 = ClassA.square(5);

		// System.out.println(id1);

	}

}
