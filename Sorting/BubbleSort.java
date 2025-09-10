package com.codegnan.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {31,5,7,45,60,4};
		System.out.println("Before sorting ");
		printArray(arr);
		
		bubbleSort(arr);
		System.out.println("After sorting ");
		printArray(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		//outer for loop for number of passes
		//after each pass largest element moves to its correct position
		for(int i=0;i<n;i++) {                  //0<6
			//a flag to check if any swapping happens
			//after 
		boolean swapped=false;                 //{5,7,31}
			for(int j=0;j<n-i-1;j++) {           //3<5
				if(arr[j]>arr[j+1]) {           //31>45
					int temp=arr[j];            //31
					arr[j]=arr[j+1];            //5
					arr[j+1]=temp;             //31
					swapped=true;              //{5,7,31,45,4,60}
				}
			}
			
		}
		
	}
		public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.println(num+" ");
		}
		System.out.println();
		
	}
}
