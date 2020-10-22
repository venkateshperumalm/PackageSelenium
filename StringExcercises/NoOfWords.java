package StringExcercises;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		Scanner strInput = new Scanner(System.in);
		String toBeChecked = strInput.nextLine();
		System.out.println(checkCount(toBeChecked));
	}
	public static int checkCount(String input){
		if(input == " " || input == null){
			return 0;
		}
		String sentenceToString[] = input.split("\\s");
//		for(String s : sentenceToString){
//		System.out.println(s);}
		int countOfWords = 0;
		int length = sentenceToString.length;
		for(int index = 0;index < length; index++){
			if(sentenceToString[index] != null || sentenceToString[index] != " "){
				countOfWords++;
			}
		}
		return countOfWords;
	}
}
