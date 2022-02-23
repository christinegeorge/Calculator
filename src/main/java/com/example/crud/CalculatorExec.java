package com.example.crud;

public class CalculatorExec {

	public static void main(String []args) {
		add(2, 4);
		subtract(5, 8);
		multiply(2, 10);
	}
	
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is:"+sum);
	}
	
	public static void subtract(int a, int b) {
		int diff = a>b ? a-b:b-a;
		System.out.println("Difference is:"+diff);
	}
	
	public static void multiply(int a, int b) {
		int prod = a*b;
		System.out.println("Product is : "+prod);
	}
}
