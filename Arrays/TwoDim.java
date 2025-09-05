package com.codegnan.simpleprograms;

public class TwoDim {

	public static void main(String[] args) {
		int[][] n= {{1,2,3},{5,30,6},{7,8}};
		System.out.println("Elements of 2d Array:");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println("enhanced for loop");
			for(int[] row:n) {
				for (int num:row) {
					System.out.print(num+" ");
				}
				System.out.println("");
			}
		}
	}
}

