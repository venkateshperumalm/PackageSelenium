package StringExcercises;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputStr;
		inputStr=s.nextLine();
		System.out.println("Reverse of a string is :" +reverseStr(inputStr));
	}

	public static String reverseStr(String inputStr){
		if(inputStr == null ||inputStr.isEmpty()){
			return inputStr;
		}
		char arr[]=inputStr.toCharArray();
		int arrLen=arr.length;
		int i=0;
		int j=arrLen-1;
		while(i<j){
			swapChar(arr,i,j);
			i++;
			j--;
		}
		return new String(arr);
	}
	public static void swapChar(char arr[],int i, int j){
		char temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
