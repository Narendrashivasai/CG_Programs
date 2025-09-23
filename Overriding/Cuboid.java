package com.codegnan.overriding;

import java.util.Scanner;

public class Cuboid extends Shape {
	public void calculatevolume() {
		Scanner sc=new Scanner(System.in);
		System.out.println("length cuboid:");
		double length=sc.nextDouble();
		System.out.println("width oof cuboid:");
		double width=sc.nextDouble();
		System.out.println("height oof cuboid:");
		double height=sc.nextDouble();
		double volume=length*width*height;
		System.out.printf("vol of cuboid: %.2f ",volume);
		sc.close();
	}
}
