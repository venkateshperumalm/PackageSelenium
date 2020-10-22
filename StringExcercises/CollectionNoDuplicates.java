package StringExcercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollectionNoDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Count of elements : ");
		int n = s.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Form a list of numbers from 0-9.
		for (int i = n; i > 0; i--) {
			list.add(i);
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < n/2; i++) {
			list.add(i);		
		}
		System.out.println("Input list : " + list);
		System.out.println("\nSum of unique elements : " +sumOfUniques(list));
	}

	public static int sumOfUniques(List<Integer> listContainingDuplicates) {

		Set<Integer> resultSet = new HashSet<Integer>();
		Set<Integer> tempSet = new HashSet<Integer>();

		for (Integer yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		tempSet.removeAll(resultSet);
		System.out.println("\nUnique elements : " +tempSet);

		return findSum(tempSet);
	}
	public static int findSum(Set<Integer> tempSet){
		List<Integer> setToList = new ArrayList<Integer>();
		setToList.addAll(tempSet);
		int sumOfUniques = 0;
		for(Integer i: setToList){
			sumOfUniques+=i;
		}
		return sumOfUniques;
	}
}
