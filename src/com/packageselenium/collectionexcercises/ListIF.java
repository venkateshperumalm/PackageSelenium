package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIF {

	public void addAllCollection(){

		List<String> listOfInt = new ArrayList<>();
		listOfInt.add("10");
		listOfInt.add("12");
		listOfInt.add("8");
		listOfInt.add("120");
		listOfInt.add("0");
		listOfInt.add("200");
		listOfInt.add("18");
		listOfInt.subList(0, 2).clear();
		for(Object a : listOfInt){
			System.out.println(a);
			}
		int i = listOfInt.subList(3, 6).indexOf("0");
		System.out.println("Index:" + i);

		//		for(ListIterator listIt = listOfInt.listIterator();listIt.hasNext();){
		//			System.out.println(listIt);
		//		}

		List<String> listOfStr = new ArrayList<>();
		listOfStr.add("enable");
		listOfStr.add("enabled");
		listOfStr.add("disable");
		listOfStr.add("disbled");
		listOfStr.add("disbled");
		listOfStr.remove(0);

		//List<Object> listOfAll = new ArrayList<>(listOfInt);
		listOfStr.addAll(listOfInt);

		for(Object a : listOfStr)
			System.out.println(a);
	}
}
