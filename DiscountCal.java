package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscountCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double pa = sc.nextDouble();
		
		double discount = (pa >= 100) ?0.2:(pa>=50)?0.1:1;
		
		double discountAmount=pa*discount;
		
		double remainingAmount=pa-discountAmount;
		
		double percentdiscount=discount*100;
		
		System.out.println("Amount for applying"+percentdiscount+"% discount"+remainingAmount);
		
		System.out.println("discount applied"+discountAmount);
		
		sc.close();
	}

}
