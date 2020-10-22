package com.packageselenium.collectionexcercises;

import java.util.HashMap;
import java.util.Map;

public class MapIF {
	
	public void doCheckMap(){
		
		Map<String,String> aValue = new HashMap<String,String>();
		aValue.put("1", "enabled");
		aValue.put("2", "enable");
		aValue.put("3", "disabled");
		aValue.put("4", "disable");
		aValue.put("5", "disable");
		Map<String,String> bValue = new HashMap<String,String>();
		bValue.put("1", "enabled");
		bValue.put("2", "enable");
		bValue.put("3", "disabled");
		bValue.put("4", "disable");
		
		for(String s : aValue.keySet()){
			System.out.println(s);
		}
		
		System.out.println("\n Key and Values:");
		for(Map.Entry<String, String> entry : aValue.entrySet()){
			System.out.println(entry);
		//	System.out.println("\n " + entry.getKey() + " " + entry.getValue());
		}

		if(aValue.keySet().containsAll(bValue.keySet())){
			System.out.println("Both Map has same key and value pairs");
		}else{
			System.out.println("Not equal");
		}
		
		if(aValue.keySet().equals(bValue.keySet())){
			System.out.println("Both Map has same key and value pairs!!");
		}else{
			System.out.println("Not equal!!");
		}
	}
}
