package com.codegnan.oppexamples;

import java.util.Scanner;

public class empInfo extends emp {
	
	double salaryPerYear;
	public empInfo() {
		super("","",0);
	}
	public void inputEmployeeDeatils() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter empName:");
		empName=sc.next();
		System.out.println("Enter empDesignation:");
		designation=sc.next();
		System.out.println("Enter years of experience:");
		yearOfExperience=sc.nextInt();
		sc.close();
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee name:"+empName);
		System.out.println("empDesignation:"+designation);
		System.out.println("years of experience:"+yearOfExperience);
	}
	public void calculateSalary() {
		double salary=salaryPerYear*yearOfExperience;
		System.out.println("Salary:"+salary);
	}
}
