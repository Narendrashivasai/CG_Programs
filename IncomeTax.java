package com.codegnan.fundamentals;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter Amount:");
				int n = sc.nextInt();
				double tax = (n<300000) ? n*0.05 :
		              (n < 1000000)&& (n>300000) ? n*0.1 :
		              (n > 1000000) ? n*0.15 :
		              (n>2000000)?n*0.01:n;
				System.out.println("collect tax:" +tax);
				sc.close();
			}
}
