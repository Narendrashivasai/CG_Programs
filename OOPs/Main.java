package com.codegnan.oppexamples;

public class Main {

	public static void main(String[] args) {
		// object creation for box class
		Box mybox1=new Box(2.0,3.0,5.0);

		double vol;
		vol=mybox1.height*mybox1.width*mybox1.depth;
		System.out.println(" Box 1 Volume : "+vol);
		
		
		Box mybox2=new Box(3.0,5.0,6.0);
		vol=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println(" Box 2 Volume : "+vol);
	}

}
