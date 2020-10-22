package com.packageselenium.collectionexcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionNoOfWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//String[] sss = str.split("\\s");
		char a[] = str.toCharArray();
		int len = a.length;
		for(int ind = 0;ind< len;ind++){
			System.out.print(a[ind]);
		}
		List<Character> strList = new ArrayList<Character>();
		for(int index=0;index<len;index++){
			if(a[index] != ' '){
				strList.add(a[index]);
			}
		}
		System.out.println(strList);
	}

}
