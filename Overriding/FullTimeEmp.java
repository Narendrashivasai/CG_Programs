package com.codegnan.overriding;

public class FullTimeEmp extends Emp{
	double monthlySalary;
	public FullTimeEmp(String name,double monthlySalary) {
		super(name);
		this.monthlySalary=monthlySalary;
		
	}
	public double CalculateSalary() {
		return monthlySalary;
	}

}
