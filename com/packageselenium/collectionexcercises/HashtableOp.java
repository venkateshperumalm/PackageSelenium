package com.packageselenium.collectionexcercises;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableOp {
	//Check if a particular key exists in Java Hashtable example
	public void doIterateHash(){

		Hashtable<Integer,String> hashTable = new Hashtable<Integer,String>();
		hashTable.put(2, "Mitshubitchi");
		hashTable.put(5, "Hyundai");
		hashTable.put(1, "Honda");
		hashTable.put(6, "Yamaha");
		hashTable.put(7, "Jaguar");
		hashTable.put(12, "Tata");

		boolean keyValue = hashTable.containsKey(6);
		if(keyValue){
			System.out.println("Key is present");
		}else{
			System.out.println("Key is NOT present");
		}

		Iterator<Entry<Integer, String>> mapIterator = hashTable.entrySet().iterator();
		while(mapIterator.hasNext()){
			Map.Entry<Integer, String> iEntry = mapIterator.next();
			System.out.println("" + iEntry.getKey() + "" + iEntry.getValue());
		}

	}
}
