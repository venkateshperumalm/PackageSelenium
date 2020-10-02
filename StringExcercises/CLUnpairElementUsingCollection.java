package StringExcercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Codility Java exercises
public class CLUnpairElementUsingCollection {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("enter an odd number");
		int n = a.nextInt();
		List<Integer> toA = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){
			int nextElement = a.nextInt();
			toA.add(nextElement);
		}
		findNoPairElement(toA);
	}
	public static void findNoPairElement(List<Integer> ele){
		Set<Integer> tempSet = new HashSet<Integer>();
		for(Integer i : ele )
			if(!tempSet.add(i)){
				tempSet.remove(i);
			}
		System.out.println("Unpaired element is: " +tempSet);
	}
}