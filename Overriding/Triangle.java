package com.codegnan.overriding;

public class Triangle extends Rectangle {
	public Triangle(double a,double b) {
		super(a,b);
	}
	public double area() {
		System.out.println("inside Triangle area");
		return 0.5*dim1*dim2;

}
}
