package com.packageselenium.collectionexcercises.w3resource.ArrayProblems;

import java.util.Arrays;

public class ArrayManipulationAndSum {
	// Function to return the required element 
	static int getElement(int a[], int n, int S) 
	{ 
		// Sort the array 
		Arrays.sort(a);
		//		//System.out.println("Array elements: ");
		//		for(int s : a){
		//			System.out.print(s+" ");
		//		}

		int sum = 0; 

		for (int i = 0; i < n; i++)  
		{ 
			// If current element 
			// satisfies the condition 
			if (sum + (a[i] * (n - i)) == S) 
				return a[i]; 
			sum += a[i]; 
		} 
		// No element found 
		return -1; 
	} 
	// Driver code 
	public static void main(String[] args) 
	{ 
		int S = 5; 
		int a[] = { 89898989, 999999, 10, 1, 8 }; 
		int n = a.length; 

		System.out.println(getElement(a, n, S)); 
	} 
}
