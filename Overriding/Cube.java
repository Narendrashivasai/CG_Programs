package com.codegnan.overriding;

import java.util.Scanner;

public class Cube extends Shape{
	public void calculatevolume() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" side of cube");
		double side=sc.nextDouble();
		double volume=side*side*side;
		System.out.printf("vol od cube %.2f :",volume);
		//sc.close();
		
	}

}
