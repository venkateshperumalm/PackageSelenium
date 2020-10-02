package com.packageselenium.collectionexcercises.w3resource.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListColors {

	public static void main(String[] args) {
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Green");
		coloursList.add("Red");
		coloursList.add("Blue");
		coloursList.add("Magenta");
		coloursList.add(0, "element");
		displayIterator(coloursList);
		System.out.println("Colours are ");
		for(String a: coloursList)
			System.out.println(a);
	}
	public static void displayIterator(List<String> cList){
		Iterator<String> l = cList.listIterator();
		while(l.hasNext()){
			System.out.println(l.next());
		}
	}
}
