
package com.demo.calculator;

public class Calculator {

	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is:"+sum);
	}
	
	public void subtract(int a, int b) {
		int diff = a>b ? a-b:b-a;
		System.out.println("Difference is:"+diff);
	}
}
