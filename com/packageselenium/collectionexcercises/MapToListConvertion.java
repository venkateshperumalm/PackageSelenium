package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapToListConvertion {
	
	public void convertKeys(){
		Map<Integer,String> mIntString = new HashMap<Integer,String>();
		mIntString.put(2, "Mitshubitchi");
		mIntString.put(5, "Hyundai");
		mIntString.put(1, "Honda");
		mIntString.put(6, "Yamaha");
		mIntString.put(7, "Jaguar");
		mIntString.put(12, "Tata");

		//Return type of .keySet() is Set<Objects>
		Set<Integer> onlyKeys = mIntString.keySet();
		//mIntString.remove(5);
		mIntString.remove(5, "Hyundai");
		List<Integer> listInt = new ArrayList<Integer>(onlyKeys);
		
		for(int keys : listInt){
			System.out.println(keys);
		}
		//Return type of .values() is Collection<Obj>
		Collection<String> onlyValues = mIntString.values();
		for(String values : onlyValues)
			System.out.println(values);
	}

}
