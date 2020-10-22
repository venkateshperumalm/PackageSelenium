package StringExcercises;

public class ToggleCharacters {

	public static void main(String[] args) {
		String sb = "ahjsdhfjajsdh fjahsdfhl fCCCCCChjhj";
		System.out.println(toggleSb(sb));
	}
	public static String toggleSb(String sb){
		if(sb == null || sb == " "){
			return "Please enter a string!! and run again";
		}
		char[] toC = sb.toCharArray();
		int len = toC.length;
		for(int index = 0;index < len;index++){
			if(toC[index] >= 'a' && toC[index] <= 'z'){//A=65
				toC[index] = (char)((int)toC[index] - 32);
			}else if(toC[index] >= 'A' && toC[index] <= 'Z'){
				toC[index] = (char)((int)toC[index] + 32);
			}
		}
		return String.valueOf(toC);
	}
}
