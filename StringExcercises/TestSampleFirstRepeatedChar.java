package StringExcercises;

public class TestSampleFirstRepeatedChar {

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
		for(int index = 0;index < strLen;index++){
			char ch = inputString.charAt(index);
			for(int indexY = index + 1;indexY < strLen;indexY++){
				if(ch == inputString.charAt(indexY))
					return indexY;
			}
		}
		return -1;
	}
}