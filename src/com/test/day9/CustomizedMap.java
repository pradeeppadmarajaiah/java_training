package com.test.day9;

public class CustomizedMap extends BaseMap {
	public CustomizedMap() {
		System.out.println("This is CustomizedMap");
	}
	public CustomizedMap(int i) {
		super(i);
		System.out.println("This is CustomizedMap with int argument" +i);
	}
	@Override
	public int sum(int input1, int input2) {
		return input1 * input2;
	}

	public static void main(String[] args) {

		CustomizedMap customizedMap = new CustomizedMap();

		String[] st = customizedMap.createST();
		for (int i = 0; i < st.length; i++) {
			System.out.println("ST[" + i + "] :" + st[i]);
		}

		System.out.println("Base Mp Id :" + customizedMap.baseMapId);

		System.out.println(customizedMap.sum(3, 3));
	}

}