package com.packageselenium.collectionexcercises;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetElementPresent {

	/*
	 * Program to check element is present in hashset
	 */

	public void checkElementPresent(Set<String> argsNames){
		Set<String> argsName = new TreeSet<String>(argsNames);
		argsName = new LinkedHashSet<String>(argsName);

		System.out.println("Original Set");
		for(String retrunStrings : argsName){
			System.out.println(retrunStrings);
		}
//		boolean containsValue = argsName.contains("varun");
//		System.out.println("Is element present?" + containsValue);

		/*
		 * Copy all elements of HashSet to Object Array
		 */
		System.out.println("\nObject array");
//		List<String> argsArr = new ArrayList<String>(argsName);
//		String[] arrayS = new String[argsArr.size()];
//		for(int i =0;i<argsArr.size();i++){
//			arrayS[i] = argsArr.get(i);
//			System.out.println(arrayS[i]);
//		}
//		for(String a : argsArr)
//		System.out.println(a);
		
		//Converting TreeSet to Object Array
		Object[] objA = argsName.toArray();
		for(Object a : objA)
		System.out.println(a);
		
		//Remove specified element from Java LinkedHashSet example
		System.out.println("After removal of a string");
		argsName.remove(2);
		for(String afterRemoval : argsName){
			System.out.println(afterRemoval);
		}
		
		//removing all elements from LinkedHashSet
		System.out.println("After removing all elements in LinkedHashSet");
		argsName.removeAll(argsName);
		System.out.println(argsName);
	}
}
