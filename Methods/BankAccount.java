package com.codegnan.methods;

public class BankAccount {
	    public double balance;
	    BankAccount(double openingAmount) {
	        balance = openingAmount;
	    }
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited cash:"+amount);
	    }
	   public void deposit(double amount,int chequeNumber) {
	        balance += amount;
	        System.out.println("Deposited cheque is:"+amount+"- Cheque No:"+chequeNumber);
	    }
	    public void deposit(double amount, String transactionId, String bankName) {
	        balance += amount;
	        System.out.println("Deposited :"+amount+"via"+bankName+"- Transaction ID:"+transactionId);
	    }
	    public void showBalance() {
	        System.out.println("Final Balance:"+balance);
	        return;
	    }
}
