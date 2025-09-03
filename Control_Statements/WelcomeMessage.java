package com.codegnan.controlstatements;

import java.util.Scanner;

public class WelcomeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city:");
		String city =sc.next();
		if (city.equalsIgnoreCase("hyderabad")) {
				System.out.println("hello hyderabad");
				} else {
					if (city.equalsIgnoreCase("banalore")) {
					System.out.println("hello bangalore");
				} else {
					if (city.equalsIgnoreCase("chennai")) {
						System.out.println("hello chennai");
				} else {
					System.out.println("enter valid city");
					}
				}
			}
		sc.close();
		
	}

}
