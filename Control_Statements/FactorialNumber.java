package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		long result =1;
		for(int i=1;i<=number;i++) {
			result*=i;
			sc.close();
	}
		System.out.println("value :"+result);
	}
}
