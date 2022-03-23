package com.bridgelabz;

public class MaxTest {
	public void maxElement(Integer[] inputArray) {
		for(int i=0; i<inputArray.length-1; i++) {
			if(inputArray[i].compareTo(inputArray[i+1])==1) {
				inputArray[i+1] = inputArray[i];
			}
		}
		System.out.println(inputArray[inputArray.length-1]);
	}
}
