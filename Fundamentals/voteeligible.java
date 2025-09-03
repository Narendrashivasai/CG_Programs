package com.codegnan.fundamentals;

import java.util.Scanner;

public class voteeligible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		String result=age>=18?"Eligible to vote":"not Eligible to vote";
		System.out.println(result);
		sc.close();

	}

}
