package com.packageselenium.collectionexcercises;

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
		coloursList.add(0, "element");
				try{
					System.out.println(coloursList.get(-1));
				}
				catch(Exception ex){
					System.out.println(ex.getMessage() + "\n");
					System.out.println(ex.getClass() + "\n");
					ex.printStackTrace();
				}
		displayIterator(coloursList);
		System.out.println("Colours are ");
		System.out.println(coloursList);
	}
	public static void displayIterator(List<String> cList){
		Iterator<String> l = cList.listIterator();
		while(l.hasNext()){
			System.out.println(l.next());
		}
	}
}
