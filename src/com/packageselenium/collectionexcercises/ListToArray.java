package com.packageselenium.collectionexcercises;

import java.util.ArrayList;

public class ListToArray {
	
	/*
	 * Write a program to convert List to Array. 
	 */

	public void convertListToArray(){
		ArrayList<String> toArr = new ArrayList<String>();
		toArr.add("One");
		toArr.add("One1");
		toArr.add("Two");
		toArr.add("Two2");
		toArr.add("Three");
		toArr.add("Three1");

		//Creating same size of string array as ArrayList
//		String [] listToArr = new String[toArr.size()];
//		
//		System.out.println("Using for loop");
//		for(int i=0;i<toArr.size();i++){
//			listToArr[i] = toArr.get(i);
//		}
//
//		for (String s:listToArr){
//			System.out.println(s);
//		}
		
		System.out.println("Using ArraryList.toArray() method");
		String [] ltoA = toArr.toArray(new String[toArr.size()]);
		
		for(String s:ltoA){
			System.out.println(s);
		}
	}

}
