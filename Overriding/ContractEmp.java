package com.codegnan.overriding;

public class ContractEmp extends Emp{
	double contractAmount;
	public ContractEmp(String name,double contractAmount) {
		super(name);
		this.contractAmount=contractAmount;
		
	}
public double calculateSalary() {
	return contractAmount;
}
	
	

}
