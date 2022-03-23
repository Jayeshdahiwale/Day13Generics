package com.bridgelabz;

public class MaxTest<T extends Comparable<T>> {
	private T[] inputArray;
	
	MaxTest(T[] inputArray){
		this.inputArray = inputArray;
	}	

	public void  maxElement() {
		for(int i=0; i<inputArray.length-1; i++) {
			if(inputArray[i].compareTo(inputArray[i+1]) > 0) {
				inputArray[i+1] = inputArray[i];
			}
		}
		System.out.println(inputArray[inputArray.length-1]);
	}
	
	
}
