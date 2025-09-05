package com.codegnan.patternexamples;

public class pattern_03 {

	public static void main(String[] args) {
		
		//outer for loop talks about rows here i as a row
		for(int i=1;i<=5;i++) {
			//inner for loop talks about inner for loop
			for(int j=1;j<5;j++) {
				System.out.print(i+" ");
			}
				System.out.println();
			
		}
	}

}
