package com.codegnan.methods;

public class OverloadDemo {
	public void test() {
		System.out.println("no parameter");
	}
	public void test(int a) {
		System.out.println("a:"+a);
	}
	public void test(int a,int b) {
		System.out.println("A and B is :"+a+":"+b);
	}
	public double test(double a) {
		System.out.println("Double a:"+a);
		return a*a;
	}
	
}
