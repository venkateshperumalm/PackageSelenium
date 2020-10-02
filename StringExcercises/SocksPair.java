package StringExcercises;

import java.io.*;
import java.util.*;

public class SocksPair {

	// Complete the makeAnagram function below.
	static int doCountPairSocks(int n, int[] ar) {
		Set<Integer> socks = new HashSet<Integer>();
		int pairs=0;
		for(int i=0;i<ar.length;i++){
			if(!socks.contains(ar[i])){
				socks.add(ar[i]);
			}else{
				pairs++;
				socks.remove(ar[i]);
			}
		}
		return pairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();

		int []ar = new int[n];

		for(int no=0;no<ar.length;no++){
			ar[no] = scanner.nextInt();
		}

		int res = doCountPairSocks(n, ar);
		System.out.println(res);

		//		bufferedWriter.write(String.valueOf(res));
		//		bufferedWriter.newLine();
		//
		//		bufferedWriter.close();

		scanner.close();
	}
}

