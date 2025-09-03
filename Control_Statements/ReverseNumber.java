package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int originalNumber=n;
		int reversedNumber=0;
		while(n!=0) {
			int remainder=n%10;
		reversedNumber=reversedNumber*10+remainder;
		n/=10;
		System.out.println("value:"+originalNumber);
		sc.close();
		}
	}

}
