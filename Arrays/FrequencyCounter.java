package com.codegnan.arrays;

public class FrequencyCounter {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,2,1,4,3,5,1};
		
		System.out.println(array.length);
		
		boolean[] processed=new boolean[array.length];
		
		// a boolean element to track which element has been processed already
		for(int i=0;i<array.length;i++) {
			
			// if the index i has already been processed  skip it
			if(processed[i]) {
				continue;
			}
			
			// Initialize count for the current element
			int count=1;
			
			// inner for loop to compare to the current element to the rest of elements
			for(int j=i+1;j<array.length;j++){
				
				// if the element at index j is equal to the element of index i
				if(array[j]==array[i]) {
					count++;
					processed[j]=true; // mark the element at index j as processed
				}
			}
			
			System.out.println(array[i]+"occurs"+count+"Times");
		}
	}

}
