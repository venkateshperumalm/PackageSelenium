package com.packageselenium.collectionexcercises.w3resource.ArrayProblems;

import java.util.Scanner;

public class ArmstrongNumberWithinRange {

	public static void main(String[] args) {
		//		Scanner s = new Scanner(System.in);
		//		s.nextInt();
		for(int index = 1;index <= 1000;index++){
			int result = checkArms(index);
			if(result == index){
				System.out.println(result);
			}
		}
	}

	private static int checkArms(int index) {
		int result = 0;
		int temp = 0;
		while(index != 0){
			temp = index % 10;
			result += temp * temp * temp;
			index = index / 10;
		}
		return result;
	}
}
