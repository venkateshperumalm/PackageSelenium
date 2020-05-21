package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionIterateArray {
	
	/*
	 * Write a program to traverse (or iterate) ArrayList?
	 */

	public void iterateArray(){
		ArrayList<String> listOne = new ArrayList<String>();
		listOne.add("One");
		listOne.add("two");
		listOne.add("");
		listOne.add(2, "three");
		listOne.add("/%%%");
		listOne.add("^&7");
		listOne.add(null);
		listOne.add(null);

		//Using advanced for loop
		for(String a:listOne){
			System.out.println(a);
		}

		//setting a value at position 2 using ArrayList.set(index,element) method
		//listOne.set(2, "peru");

		//Using for loop
		System.out.println("\nUsing for loop");
		for (int i=0;i<listOne.size();i++){
			System.out.println(""+listOne.get(i));
		}

		//Using while loop
		System.out.println("\nUsing while loop");
		int count = 0;
		while(listOne.size() > count){
			System.out.println(listOne.get(count));
			count++;
		}

		//Using iterator
		System.out.println("\nUsing iterator() method in collection");
		Iterator<String> iterator = listOne.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		//Using stream()
		System.out.println("\nUsing stream() util");
		listOne.forEach(str -> {System.out.println(str);});

		System.out.println("\nUsing Collectors.toSet()");
		Set<String> listToSet = listOne.stream().collect(Collectors.toSet());
		Iterator<String> setIt = listToSet.iterator();
		while(setIt.hasNext())
			System.out.println(setIt.next());

		/*converting ArrayList to Set to avoid duplicates in ArrayList
		 * Since Set interface does not allow duplicates values
		 * Used LinkedHashSet to preserves the order of the original collection
		 */
		System.out.println("\nConverting ArrayList to set to avoid duplicates");
		Set<String> arrList_2 = new LinkedHashSet<String>(listOne);
		for(String a:arrList_2){
			System.out.println(a);
		}
	}
}
