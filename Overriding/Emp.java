package com.codegnan.overriding;

public abstract class Emp {
String name;
public Emp(String name) {
	this.name=name;
	}
    public abstract double CalculateSalary() ;
    	
    	public void dispplay() {
    		System.out.println("emp name:"+name);
    	}
    }
