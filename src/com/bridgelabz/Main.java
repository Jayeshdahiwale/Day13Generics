package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i = {56,30,70};
		String[] s = {"Peach","Banana","Apple"};
		Float[] f = {56f,30f,70f};
		new MaxTest(i).maxElement();
		new MaxTest(s).maxElement();
		new MaxTest(f).maxElement();			
	}
}
