package com.codegnan.patternexamples;

public class Pattern_04 {

	public static void main(String[] args) {
		
		//outer for loop talks about rows here i as a row
		for(int i=10;i>=1;i--) {
			//inner for loop talks about inner for loop
			for(int j=10;j>=1;j--) {
				System.out.print(j+" ");
			}
				System.out.println();
			
		}
	}

}
