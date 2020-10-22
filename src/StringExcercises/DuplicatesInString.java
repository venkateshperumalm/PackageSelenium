package StringExcercises;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public void countDuplicates(String dupCharString){
		char strToChar[] = new char[dupCharString.length()];
		//int count=0;
		strToChar = dupCharString.toCharArray();
		Set<Character> dupChars = new HashSet<Character>();
		for(int i = 0; i < dupCharString.length(); i++){
			for(int j=i+1;j<dupCharString.length();j++){
				if(strToChar[i] == strToChar[j] && strToChar[i] != ' '){
					dupChars.add(strToChar[i]);
					//count++;
					//break;
				}
			}
		}
		System.out.println("Duplicate characters are :");
		for(char result : dupChars)
			System.out.println(result);
	}
}
