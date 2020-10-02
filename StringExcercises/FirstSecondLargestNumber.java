package StringExcercises;

import java.util.Scanner;

public class FirstSecondLargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of array elements: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Insert array elements: \n");
		for(int index = 0;index < n;index++){
			a[index] = s.nextInt();
		}
		findMaximums(a,n);
	}
	public static void findMaximums(int a[],int n){
		int firstL = 0;
		int secondL = 0;
		for(int index = 0;index < n;index++){
			if(a[index] > firstL){
				secondL = firstL;
				firstL = a[index];
			}
		}
		System.out.println("Maximum value: " + firstL + "\nSecond maximum value: " + secondL);
	}
}
