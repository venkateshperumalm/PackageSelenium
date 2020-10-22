package StringExcercises;

public class ReverseStringByWord {

	public static void main(String[] args) {

		String inputString = "Today is Holiday";
		String[] strArr = inputString.split("//s");//"//s" is to denote a single whitespace
		int strLen = strArr.length;

		for (int i = strLen; i > 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}
}