package com.codegnan.simpleprograms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
			
		}
		System.out.println("elements of array:");
		for(int i=0;i<n.length;i++){
			System.out.println("elemnt number index"+i+"+n[i]");
		}
	}

}
