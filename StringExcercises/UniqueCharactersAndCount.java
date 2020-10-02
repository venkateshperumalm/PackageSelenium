package StringExcercises;

import java.util.Scanner;

public class UniqueCharactersAndCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n=in.nextInt();
		System.out.println("No of strings : " +n);
		String []arrayOfStr =null;
		for(int i=0;i<n;i++){
			arrayOfStr[i]+=in.next();
		}
	}

}
