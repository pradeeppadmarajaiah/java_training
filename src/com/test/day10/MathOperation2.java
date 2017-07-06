package com.test.day10;

public interface MathOperation2 {

	public default int mean(int input1, int input2) {
		return (input1 + input2) / 2;
	}

	public int median(int[] array);

}
