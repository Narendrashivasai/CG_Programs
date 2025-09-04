package com.codegnan.simpleprograms;

import java.util.Scanner;

public class MulDim {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns");
		int columns=sc.nextInt();
		
		int[][] matrix=new int[rows][columns];
		
		System.out.println("enter the array from the user");
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("enter elements at row"+(i)+"'column"+(j)+":");
				matrix[i][j]=sc.nextInt();
			}
			
			}
		System.out.println("elements in 2d array");
		for(int[] rows1 :matrix) {
			for(int num: rows1) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
