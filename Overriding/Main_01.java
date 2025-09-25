package com.codegnan.overriding;

public class Main_01 {
	public static void main(String[] args) {
		Emp emp1=new FullTimeEmp("bro",50000);
		System.out.println("Salary:"+emp1.CalculateSalary());
		Emp emp2=new PartlyEmp("mani",50001,4);
		System.out.println("Salary:"+emp2.CalculateSalary());
		Emp emp3=new FullTimeEmp("bhai",50000);
		System.out.println("Salary:"+emp3.CalculateSalary());
	}

}
