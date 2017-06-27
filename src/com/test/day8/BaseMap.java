/**
 * 
 */
package com.test.day8;

/**
 * @author PradeepPadmarajaiah
 *
 */
public class BaseMap {

	public int baseMapId=20;
	public String[] ISA = new String[16];
	public String[] GSA = new String[8];
	public String[] ST = new String[2];

	public String[] createST() {
		ST[0] = "Transaction Set Identifier Code";
		ST[1] = "Transaction Set Control Number";
		return ST;
	}
	
	public int sum(int input1,int input2){
		return input1+input2;
	}

	public static void main(String[] args) {
		BaseMap baseMap = new BaseMap();
		String[] ST = baseMap.createST();

		
		for (int i = 0; i < ST.length; i++) {
			System.out.println("ST[" + i + "] :" + ST[i]);
		}
		
		String[]  st1=baseMap.ST;
		for (int i = 0; i < st1.length; i++) {
			System.out.println("ST[" + i + "] :" + st1[i]);
		}
		

	}

}
