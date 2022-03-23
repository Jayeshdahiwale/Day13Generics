package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxTest test1 = new MaxTest();
		String[] inputArray = {"Apple","Peach","Banana"};
	    test1.maxElement(inputArray);
		String[] inputArray1 = {"Peach","Banana","Apple"};
		test1.maxElement(inputArray1);
		String[] inputArray2 = {"Banana","Peach","Apple"};
		test1.maxElement(inputArray2);
	}
	

}
