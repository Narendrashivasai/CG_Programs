package com.codegnan.oppexamples;

public class EmployeeTeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setDetails("neha", 3000);
		System.out.println("Employee name is:"+emp.name);
		System.out.println("Employee basic salary is:"+emp.basicSalary);
		System.out.println("HRA Alloawance is:"+emp.calculateHRA());
		System.out.println("DA Allowance :"+emp.calculateDA());
		System.out.println("Employee gross Salary:"+emp.calculateGrossSalary());
	}

}
