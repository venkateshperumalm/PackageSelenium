package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListManipulation {
	//How to Iterate ArrayList using Java ListIterator Example
	public void manipulateArray(){
		final List<Integer> argsIds = new ArrayList<Integer>();
		argsIds.add(12);
		argsIds.add(5);
		argsIds.add(10);
		argsIds.add(18);
		argsIds.add(140);
		argsIds.add(8200);

		//Sort ArrayList in descending order
		System.out.println("Original ArrayList before sorting:");
		ListIterator<Integer> iterator = argsIds.listIterator();
		//iterator.next();
		iterator.add(45);
		System.out.println("\nPrinting..");
		//Use Collections.sort(Collection c) to sort collection of objects in ascending order 
		Collections.sort(argsIds);
		for(int i : argsIds){
			System.out.println(i);
		}

		//		System.out.println("\nArrayList After sorting in Descending order:");
		//		Comparator<Integer> comp = Collections.reverseOrder();
		//		Collections.sort(argsIds, comp);
		//		System.out.println(argsIds);
	}
}
