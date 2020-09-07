package StringExcercises;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputStr;
		inputStr=s.nextLine();
		if(isStringPalindrorme(inputStr).equals(inputStr)){
			System.out.println("Palindrome");
		}
		else	
			System.out.println("Not Palindrome");
	}
	public static String isStringPalindrorme(String inputStr){
		int len =inputStr.length();
		String reverse = "";
		for(int o=len-1;o>=0;o--){
			reverse+=inputStr.charAt(o);
		}
		return reverse;
	}
}
