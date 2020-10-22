package StringExcercises;

import java.util.ArrayList;
import java.util.List;

public class States {

	public static void main(String[] args) {
		List<String> states = new ArrayList<String>();
		//
		//		states.add("Andra");
		//		states.add("Arunahal");
		//		states.add("Hima");
		String s[] = {"Arunachal", "Himachal" ,"Orissa", "Haryana"};
		int size = s.length;
		for(int i = 0;i < size;i++){
			String a = s[i];
			char[] charA = a.toCharArray();
			char ch = charA[0];
			if(ch == 'H' || ch == 'h'){
				states.add(a);
				break;
			}
		}

		for(String s1 : states){
			System.out.println(s1);
		}
	}

}
