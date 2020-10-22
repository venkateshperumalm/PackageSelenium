package com.packageselenium.collectionexcercises.w3resource.ArrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CLUnpairElementUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int oddNum = sc.nextInt();
		int arr[] = new int[oddNum];
		for(int i = 0;i < oddNum;i++){
			arr[i] = sc.nextInt();
		}
		solution(arr);
	}
	public static int solution(int arr[]){
		int len = arr.length;
		//boolean flag=false;
		int numberOccurence = 1;
		int unpairedElement = 0;
		//int tempArr[] = {};
		int indexFirst = 0;
		for(;indexFirst < len;indexFirst++){
			if(findOccurence(arr,indexFirst));
		}
		return unpairedElement;
	}
	private static int findOccurence(int[] arr, int noToBeChecked) {
		int len=arr.length;
		int numberOccurence=0;
		for(int indexNext = 0; indexNext < len;indexNext++){
			if(arr[noToBeChecked] == arr[indexNext]){
				numberOccurence++;//2
				break;
			}
		}
		return numberOccurence;
	}
}