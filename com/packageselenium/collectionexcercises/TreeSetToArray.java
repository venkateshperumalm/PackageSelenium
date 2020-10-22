package com.packageselenium.collectionexcercises;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetToArray {
	/*
	 * Java Program to convert Treeset to an interger array  
	 */
	public void convertToIntArray(Set<Integer> setString){

		TreeSet<Integer> setStr = new TreeSet<Integer>(setString);
		System.out.println("Lowest of treeset elements: " +setStr.first());
		System.out.println("Highest of treeset elements: " +setStr.last());
		Object[] toInt = setStr.toArray();
		System.out.println();
		for(Object a : toInt)
			System.out.println(a);
	}
}
