package StringExcercises;

import java.util.Scanner;

public class PalindromeUsingSwap {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter a string:");
		String s1 = a.nextLine();
		if(isPalindrome(s1).equals(s1)){
			System.out.println("PalindromeUsingSwap - Palindrome");
		}else{
			System.out.println("PalindromeUsingSwap - Not a palindrome");
		}
	}
	public static String isPalindrome(String s1){
		if(s1 == null || s1.equals("")){
			return s1;
		}
		int lenOfS1 = s1.length();
		char s1Arr[] = s1.toCharArray();
		int i = 0;
		int j = lenOfS1-1;
		swapString(s1Arr,i,j);
		return new String(s1Arr);
	}
	public static void swapString(char[] s1Arr, int i, int j) {
		char temp = s1Arr[i];
		s1Arr[i] = s1Arr[j];
		s1Arr[j] = temp;
	}
}
