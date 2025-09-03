package com.codegnan.controlstatements;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double balance=60000;
			int pin=1234;
			System.out.println("enter the pin:");
			int enteredpin=sc.nextInt();
			if(enteredpin!=pin) {
				System.out.println("invalidd pin");
		}
			int choice;
			do {
				System.out.println("||==========================||");
				System.out.println("||============ATM menu==============||");
				System.out.println("||============1.Check balance==============||");
				System.out.println("||==========2.deposit amount================||");
				System.out.println("||==========3.withdraw amount================||");
				System.out.println("||=========4.Exit=================||");
				System.out.println("||==========================||");
				System.out.println("Enter the choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("your balance is:"+balance);
					break;
				case 2:
					System.out.println("enter the deposit amount:");
					double deposit=sc.nextDouble();
					if(deposit%100!=0) {
						System.out.println("enter the multiples of 100");
					}else {
						balance+=deposit;
						System.out.println("deposit amount is:"+deposit+"and balance is"+balance);
					}
					break;
				case 3:
					System.out.println("enter the withdraw amount:");
					double withdrawamount=sc.nextDouble();
					if(withdrawamount%100!=0) {
						System.out.println("enter the multiples of 100");
					}
					else if(withdrawamount<500) {
						System.out.println("please enter more than 500");
					}else if(withdrawamount<=balance) {
						balance-=withdrawamount;
						System.out.println("withdraw amount is:"+withdrawamount+"and the balance is"+balance);
					}else {
						System.out.println("insufficient funds");
					}
					break;
				case 4:
					System.out.println("thaank you for visiting our ATM");
					break;
					default:
					System.out.println("enter the correct option");
					}
			}while(choice!=4);
	}

}
