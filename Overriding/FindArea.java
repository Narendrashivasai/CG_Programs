package com.codegnan.overriding;

public class FindArea {
	public static void main(String[] args) {
		Figure f1=new Figure(10,10);
		f1.area();
		Rectangle r1=new Rectangle(9,5);
		Triangle t1=new Triangle(10, 8);
		
		f1=r1;
		System.out.println("a:"+f1.area());
		f1=t1;
		System.out.println("a:"+f1.area());
		}
}
