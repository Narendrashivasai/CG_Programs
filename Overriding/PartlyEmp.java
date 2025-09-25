package com.codegnan.overriding;

public class PartlyEmp extends Emp {
	double hourRate;
	int hoursWorked;
	public PartlyEmp(String name,double hourRate,int hoursWorked) {
		super(name);
		this.hourRate=hourRate;
		this.hoursWorked=hoursWorked;
}

public double calculateSalary() {
	return hourRate*hoursWorked;
}
}