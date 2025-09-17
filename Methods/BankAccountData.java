package com.codegnan.methods;

public class BankAccountData {
	
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(0);
		b1.deposit(2000);
		b1.deposit(5000, 98745);
		b1.deposit(3000, "ABC1234", "SBI");
		}
}
