package com.packageselenium.collectionexcercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ToIterateHashset {

	/*
	 * Write a program to traverse(or iterate) HashSet?
	 */

	public void iterateHashset(){
		Set<String> citiesSet = new HashSet<>();
		//citiesSet.add(null);
		citiesSet.add("TVH");
		citiesSet.add("KVL");
		citiesSet.add("KVLH");
		citiesSet.add("RJPM");
		citiesSet.add("RJPM");
		citiesSet.add("VNR");
		//citiesSet.forEach((cities)-> System.out.println(cities));

		//Solution1
		System.out.println("Using foreach loop");
		for (String string : citiesSet)
			System.out.println(string);

		//Solution2
		System.out.println("\nUsing iterator");
		//citiesSet.clear();
		Iterator<String> it = citiesSet.iterator();
		//System.out.println("Cleared");
		while(it.hasNext()){
			System.out.println(it.next());
		}

		/*
		 * Write a program to add elements to the HashMap given the key and value data type is String?
		 * 
		 * Solution 1: 
		 * 1. Using .keySet() method to get all keys in Map
		 * 2. Using Map.Entry Interface and its methods such as
		 * entrySet(), getKey(), getValue()
		 */

		Map<String,String> keyValue = new HashMap<String,String>();
		keyValue = new TreeMap<String,String>();

		keyValue.put("1", "TESTDATA");
		keyValue.put("3", "testdata");
		keyValue.put("2", "@#@#");
		keyValue.put("6", "78964656544564");
		//keyValue.put("5", null);
		//keyValue.put(null, "/");

		//Using keySet() to display elements
		for(String val : keyValue.keySet())//Map.keySet() which helps to get all key values in Map as Collection view
			System.out.println(val + " " + keyValue.get(val));

		System.out.println("\nUsing entrySet()");
		/*
		 * Map.Entry Interface provides .entrySet() iterator method to view
		 * HashMap, TreeMap by using .getKey() and .getValue() methods 
		 */

		for(Map.Entry<String, String> entrySet : keyValue.entrySet()){
			System.out.println(entrySet);
			//System.out.println("" + entrySet.getKey() + " " + ""  + entrySet.getValue());
		}

		/*
		 * Solution 2
		 * Using both loop operations of entrySet() and Iterator
		 * 1. Get all key, value of Map using Map.Entry entrySet()
		 * 2. Create object for Map using Iterator reference of type Map.Entry
		 * 3. Display using getKey() and getValue()
		 */
		System.out.println("\nUsing Iterator and entrySet()");
		Set<Map.Entry<String,String>> solution2 = keyValue.entrySet();
		Iterator<Entry<String, String>> sol2Iterator = solution2.iterator();
		while(sol2Iterator.hasNext()){
			Map.Entry<String, String> resultMap = sol2Iterator.next();
			System.out.println(resultMap.getKey() + resultMap.getValue());
		}
		//System.out.println("Collection-view of Map:" + sol2Iterator.next());

		//		if(keyValue.isEmpty()){
		//			System.out.println("HashMap is empty");
		//		}else{
		//			System.out.println("Not empty");
		//		}
	}
}
