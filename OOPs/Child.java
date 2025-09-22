package com.codegnan.oppexamples;

public class Child extends Parent{
	public Child() {
		super();
		System.out.println("child constructor");
	}
	public void display() {
		super.display();
		System.out.println("child class display");
	}
}
