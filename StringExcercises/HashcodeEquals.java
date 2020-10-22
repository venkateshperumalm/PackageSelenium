package StringExcercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashcodeEquals {

	public static void main(String[] args) {
		Students s1= new Students(1,"gurujith");
		Students s2 = new Students(2,"harijith");

		HashSet<Students> stud = new HashSet<Students>();
		stud.add(s1);
		stud.add(s2);
		
		System.out.println("size: " + stud.size());
		System.out.println("hashcode1: " +s1.hashCode());
		System.out.println("hashcode2: " +s2.hashCode());
		System.out.println("equals or not: " +s1.equals(s2));
		System.out.println("contains:" + stud.contains(new Students(2,"harijith")));
		
//		List<Students> studM = new ArrayList<Students>();
//		studM.add(s1);
//		studM.add(s2);
//		
//		System.out.println("AL size: " + studM.size());
//		System.out.println("AL hashcode1: " +s1.hashCode());
//		System.out.println("AL hashcode2: " +s2.hashCode());
//		System.out.println("AL equals or not: " +s1.equals(s2));
		
	}
}
