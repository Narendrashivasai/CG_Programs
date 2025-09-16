package com.codegnan.oppexamples;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		System.out.println("Toatl memory of the heap:" +runtime.totalMemory());
		System.out.println("Free memory in heap:" +runtime.freeMemory());
		long occupiedMemory=runtime.totalMemory()-runtime.freeMemory();
		System.out.println("Occupied memory:" +occupiedMemory);
		for(int i=0;i<10;i++) {
			Date d=new Date();
			d=null;
		}
		System.out.println("Free memory of the heap:"+runtime.freeMemory());
		runtime.gc();
		System.out.println("Free memory of the heap:" +runtime.freeMemory());
	}

}
