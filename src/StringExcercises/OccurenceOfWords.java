package StringExcercises;

import java.util.Scanner;

public class OccurenceOfWords {

	public static void countOccurences(String mainStr, String toBeSearched){

		String s[] = mainStr.split(" ");
		int count = 0;
		int len = s.length;
		for(int i = 0; i < len;i++){
			if(s[i].equals(toBeSearched)){
				count++;
			}
		}
		System.out.println(toBeSearched + " occurs " + count + " times");
	}

	public static void main(String args[]){
		Scanner br = new Scanner(System.in);
		System.out.println("Original string: ");
		String main = br.nextLine();
		System.out.println("String to be counted: ");
		String toSearch = br.next();
		countOccurences(main, toSearch);
	}
}
