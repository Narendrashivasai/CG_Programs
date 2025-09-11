package com.codegnan.oppexamples;

public class Main {

	public static void main(String[] args) {
		// object creation for box class
		Box mybox1=new Box();
		mybox1.height=2.0;
		mybox1.width=3.0;
		mybox1.depth=5.0;
		double vol;
		vol=mybox1.height*mybox1.width*mybox1.depth;
		System.out.println(" Box 1 Volume : "+vol);
		
		
		Box mybox2=new Box();
		mybox2.height=2.0;
		mybox2.width=3.0;
		mybox2.depth=5.0;
		vol=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println(" Box 2 Volume : "+vol);
	}

}
