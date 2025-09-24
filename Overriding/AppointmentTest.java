package com.codegnan.overriding;

public class AppointmentTest {

	public static void main(String[] args) {
		Appointment a=new Appointment();
		a.Schedule();
		Appointment d=new DoctorAppointment();
		d.Schedule();
		Appointment d1=new DentistAppoinment();
		d1.Schedule();
	}

}
