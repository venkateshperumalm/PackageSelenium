package com.packageselenium.collectionexcercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOperations {

	public void getKeyFromMap(){

		Map<String,String> kV = new HashMap<String,String>();
		kV.put("k1", "puma");
		kV.put("k3", "adidas");
		kV.put("k2", null);
		kV.put("k15", "allensolly");
		kV.put("k4", "woodland");
		kV.put("k9", "nike");

		boolean isPresent = kV.containsKey("k15");

		if(isPresent){
			System.out.println("Key exists");
		}else{
			System.out.println("Key does not exist");
		}
		if(!kV.isEmpty()){
			Iterator<Map.Entry<String, String>> iMap = kV.entrySet().iterator();
			while(iMap.hasNext()){
				Map.Entry<String, String> iEntry = iMap.next();
				System.out.println(" " + iEntry.getKey() + " " + iEntry.getValue());
			}
		}
	}
}
