package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementPresentInCollection {

	public void isElementPresent(){
		/*
		 * Given an element write a program to check 
		 * if element(value) exists in ArrayList?
		 */
		List<String> elementArray = new ArrayList<String>();
		elementArray.add("element1");
		elementArray.add("element4");
		elementArray.add("element2");
		elementArray.add("element3");
		elementArray.add("element1");
		elementArray.add("element9");

		if(elementArray.contains("element10")){
			System.out.println("Element is present");
		}else{
			System.out.println("Not present");
		}

		/*
		 * Given an element write a program to check if element exists in HashSet?
		 */
		Set<String> elementCheck = new HashSet<String>(elementArray);
		if(elementCheck.contains("element4")){
			System.out.println("Present in HashSet");
		}else{
			System.out.println("Not present in HashSet");
		}
	}
}
