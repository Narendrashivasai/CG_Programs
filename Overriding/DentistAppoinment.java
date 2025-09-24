package com.codegnan.overriding;

import java.util.Scanner;

public class DentistAppoinment extends Appointment{
	public void schedule() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dental procedure");
		String d=sc.next();
		System.out.println("Dentist Appointment:"+d);
	}
}
