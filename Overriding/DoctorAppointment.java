package com.codegnan.overriding;

import java.util.Scanner;

public class DoctorAppointment extends Appointment{
	public void schedule() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Specilization");
		String s=sc.next();
		System.out.println("Doctor Appoinment Scheduled:"+s);
	}
}
