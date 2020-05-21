package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassNoDuplicates{

	public static List<Object> al = new ArrayList<Object>();

	public static void main(String[] args){
		al.add("java");
		al.add('a');
		al.add('b');
		al.add('a');
		al.add("java");
		al.add(10.3);
		al.add('c');
		al.add(14);
		al.add("java");
		al.add(12);

		System.out.println("Before Remove Duplicate elements:"+al);
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				//comparison == which checks whether both values are present in same memory(address comparison)
				//whereas .equals() method check whether both contents are equal
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("After Removing duplicate elements:"+al);
	}
}
