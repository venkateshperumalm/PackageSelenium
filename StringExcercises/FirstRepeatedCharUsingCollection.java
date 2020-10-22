package StringExcercises;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharUsingCollection {

	public static void main(String[] args) {
		String inputString = "welcome to moolya";
		int firstRepeatedChar = findCharacter(inputString);
		if(firstRepeatedChar != -1){
			System.out.println(inputString.charAt(firstRepeatedChar));
		}else
			System.out.println("No repeated char found");
	}
	private static int findCharacter(String inputString) {
		int strLen = inputString.length();
		Set<Character> set = new HashSet<Character>();
		for(int index = 0;index < strLen;index++){
			char ch = inputString.charAt(index);
			if(!set.add(ch)){
				return index;
			}
		}
		return -1;
	}
}
