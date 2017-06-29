package com.test.day9;

public class CustomizedMap1 extends CustomizedMap {

	public CustomizedMap1() {
		System.out.println("This is CustomizedMap1");
	}

	public CustomizedMap1(int i) {
		super(i);
		System.out.println("This is CustomizedMap1 with int argument" + i);
	}

	@Override
	public int sum(int input1, int input2) {
		// TODO Auto-generated method stub
		return (input1 - input2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizedMap1 customizedMap1 = new CustomizedMap1();
		int sum = customizedMap1.sum(2, 3);
		System.out.println(sum);
		customizedMap1.createST();
		CustomizedMap1 map1 = new CustomizedMap1(20);
	}

}
