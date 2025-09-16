package com.codegnan.oppexamples;

public class FactorialUsingRecurssion {

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);  //5*4*factorial(x)
		
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
