package com.packageselenium.collectionexcercises;

import java.util.Set;
import java.util.TreeSet;

public class ClassMain {

	public static void main(String[] args) {
		//		ClassOne classOne = new ClassOne();
		//		classOne.getName();
		//		classOne.getTitle(5);
		//		classOne.getDouble();

		//		CollectionIterateArray obj1 = new CollectionIterateArray();
		//		obj1.iterateArray();

		//		ListToArray liToArr = new ListToArray();
		//		liToArr.convertListToArray();

		//				ToIterateHashset citiesObj = new ToIterateHashset();
		//				citiesObj.iterateHashset();

		/*
		 * Sending a array of strings to findDuplicates(String [] args) method
		 */
		//				FindDubs fd = new FindDubs();
		//				String []a={ "i" , "ayz" , "i" , "azy" , "i", "baa" , "ayz" };	
		//				//String []a={ "i" , null , "ayz" , null, "i" , "azy" , "i", "baa" , "ayz" };	
		//				fd.findDuplicates(a);

		//		ElementPresentInCollection objEle = new ElementPresentInCollection();
		//		objEle.isElementPresent();

		//		ReverseSortingArrayList revSort = new ReverseSortingArrayList();
		//		revSort.doSort();

		//		HashSetToArray mainArray = new HashSetToArray();
		//		mainArray.convertToArray();
		//		 ListIF lif = new ListIF();
		//		 lif.addAllCollection();

		//		MapIF mapRef = new MapIF();
		//		mapRef.doCheckMap();
		
		Set<String> argsNames=  new TreeSet<String>();
		argsNames.add("varun");
		argsNames.add("tarun");
		argsNames.add("harun");
		argsNames.add("ta");
		argsNames.add("tarunss");
		
//		HashSetElementPresent classObj = new HashSetElementPresent();
//		classObj.checkElementPresent(argsNames);
		
//		Set<Integer> argsIds=  new TreeSet<Integer>();
//		argsIds.add(12);
//		argsIds.add(5);
//		argsIds.add(120);
//		argsIds.add(18);
//		argsIds.add(14);
//		argsIds.add(82);
//		TreeSetToArray intArray = new TreeSetToArray();
//		intArray.convertToIntArray(argsIds);
		
		ArrayListManipulation aList = new ArrayListManipulation();
		aList.manipulateArray();
	}
}
