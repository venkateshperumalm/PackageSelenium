package StringExcercises;

public class StringWordReverse {

	public static void main(String[] args) {
		String inputStr = "I am living in india";
		String[] seperatedString = inputStr.split("\\s");
	//	System.out.println("splitted strings: " + seperatedString.length);
		
		for(int index = 0;index < seperatedString.length;index++){
			String singleStr = seperatedString[index];
			int sepLen = singleStr.length();
			//System.out.println(sepLen);
			
			for(int indexY = sepLen-1; indexY >= 0 ; indexY--){
				char character = singleStr.charAt(indexY);
				System.out.print(character);
			}
			System.out.print(" ");
		}
	}
}
