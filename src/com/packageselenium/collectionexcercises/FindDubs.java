package com.packageselenium.collectionexcercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDubs {

	//Run either Set of the code 
	public void findDuplicates(String args[]) {
		/*
		 * Set 1
		 * Set of string without any duplicates with the help of stream()
		 */
		Set<String> dupSet = Arrays.asList(args).stream().collect(Collectors.toSet());
		Iterator<String> ir = dupSet.iterator();
		while(ir.hasNext())
			System.out.println(ir.next());
		
		/*
		 * Set 2
		 * To separate duplicates and unique values from input
		 */
		Set<String> duplicateSet = new HashSet<String>();
		Set<String> uniqueSet = new TreeSet<String>();

		for(String str : args){
			/* If TreeSet is used which does not allow null elements in Set
			 * So execution throws NullPointerException while traversing null value
			 */
			if(!uniqueSet.add(str))
				duplicateSet.add(str);
		}
		uniqueSet.removeAll(duplicateSet);

		//to print remaining set without any duplicates
		System.out.println("Unique values Set");
		for(String unique : uniqueSet)
			System.out.println(unique);

		//to print Set only duplicates taken from input
		System.out.println("\nOnly duplicates Set");
		for(String onlyDup : duplicateSet)
			System.out.println(onlyDup);
	}
}
