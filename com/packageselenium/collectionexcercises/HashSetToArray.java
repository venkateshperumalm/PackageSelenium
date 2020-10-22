package com.packageselenium.collectionexcercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetToArray {

	public void convertToArray(){

		//		Set<String> toArray = new HashSet<String>();
		//		toArray.add("test");
		//		toArray.add("*&");
		//		toArray.add(null);
		//		toArray.add("78");
		//		toArray.add("vo");
		//		toArray.add("<html>");
		//		String[] strArr = new String[toArray.size()];
		//		toArray.toArray(strArr);
		//		for(String str : strArr)
		//		System.out.println(str);

		List<String> linkList = new LinkedList<String>();
		linkList.add("13");
		linkList.add("e");
		linkList.add("^&^&");
		linkList.add("<html>");
		linkList.add("e");
		linkList.add(null);
		linkList.add(null);

		String [] args = new String[linkList.size()];
		linkList.toArray(args);
		System.out.println("\nPRINTING LINKEDLIST ELEMENTS");
		for(String ll : args)
			System.out.println(ll);
//		for (Iterator<String> iterator = linkList.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
	}
}
