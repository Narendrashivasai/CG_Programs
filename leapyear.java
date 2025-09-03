package com.codegnan.fundamentals;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a year: ");
		        int year = sc.nextInt();
		        boolean b =(year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ;
		        String result="year is not leap";
		        System.out.println(result);
		        sc.close();

	}

}r