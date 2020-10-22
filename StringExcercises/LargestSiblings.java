package StringExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestSiblings {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int ab;
		System.out.println("Enter no to be checked");
		ab=a.nextInt();
		solution(ab);
	}

	public static void solution(int ab) {
		ArrayList<Integer> reminderList =new ArrayList<Integer>(); 
		String str= "";
		int tempLength = 0;
		while(ab!=0){
			reminderList.add(ab%10);
			ab=ab/10;
		}
		int sizeOfList = reminderList.size();
		Integer[] intArr = new Integer[sizeOfList];
		intArr = reminderList.toArray(intArr);
		Arrays.sort(intArr,Collections.reverseOrder());
		tempLength = intArr.length;
		for(int i=0;i<tempLength;i++){
			str+=intArr[i];
		}
		System.out.println(str);
	}
}
