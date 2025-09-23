package com.codegnan.overriding;

public class Rectangle extends Figure{
	public Rectangle(double a,double b) {
		super(a,b);
	}
	public double area() {
		System.out.println("inside rectangle area");
		return dim1*dim2;
	}
}
