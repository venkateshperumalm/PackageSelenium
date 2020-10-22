package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClassNoDuplicates{

	public static List<String> al = new ArrayList<String>();
	public static Set<String> alNew = new HashSet<String>();


	public static void main(String[] args){
		al.add("java");
		al.add("6");
		al.add("45");
		al.add("5656");
		al.add("java");
		al.add("45");
		al.add("6");
		al.add("oioi");
		al.add("java");
		al.add("23");

		System.out.println("Before Remove Duplicate elements:"+al);
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				//comparison == which checks whether both values are present in same memory(address comparison)
				//whereas .equals() method check whether both contents are equal
				if(!al.get(i).equals(al.get(j))){
					alNew.add(al.get(j));
					break;
				}
			}
		}
		System.out.println("After Removing duplicate elements:"+alNew);
	}
}
