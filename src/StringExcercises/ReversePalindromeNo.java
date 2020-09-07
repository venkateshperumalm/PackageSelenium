package StringExcercises;

import java.util.Scanner;

public class ReversePalindromeNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num= scan.nextInt();
		if(checkReversePalindrome(num)==num){
			System.out.println("Given num is palindrome");
		}else
			System.out.println("Given num is not a palindrome");
	}

	public static int checkReversePalindrome(int num) {
		int sumOfReverse=0;
		int rem=0;
		while(num !=0){
			rem = num % 10;
			sumOfReverse=(sumOfReverse*10)+rem;
			num=num/10;
		}
		return sumOfReverse;
	}

}
