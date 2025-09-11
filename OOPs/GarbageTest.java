package com.codegnan.oppexamples;

public class GarbageTest {
	
	public void finalize() {
		System.out.println("Garbage Collector called finalize()");
	}
	public static void main(String[] args) {
		GarbageTest obj=new GarbageTest();
		obj=null;
		System.out.println("Requesting Garbage Collector");
		System.gc();
		System.out.println("End of Main Method");
	}

}
