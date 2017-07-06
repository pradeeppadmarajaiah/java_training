package com.test.day10;

public interface MathOperation1 extends MathOperation {

	public default int mean(int input1, int input2) {
		return (input1 + input2) / 2;
	}

	public int median(int[] array);
}
