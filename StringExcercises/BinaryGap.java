package StringExcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no;
		System.out.println("Enter no to find max binary gap : ");
		no = s.nextInt();
		System.out.println("\nMaximum binary gap is : " + findMaxBinaryGap(no));
	}
	private static int findMaxBinaryGap(int number) {
		List<Integer> reminderList = new ArrayList<Integer>();
		int remainder = 0;
		while(number != 0){
			remainder = number % 2;
			reminderList.add(remainder);
			number = number / 2;
		}
		int lengthOfList = reminderList.size();
		System.out.println("Binary value of given input:");
		Collections.reverse(reminderList);
		//Reversing binary form of given input
		System.out.println("Reverse" +reminderList);
		for(int ij = lengthOfList - 1;ij >= 0;ij--){
			System.out.print(reminderList.get(ij));
		}
		Map<Integer,Integer> zerosCountMap = findZerosCount(reminderList, lengthOfList);

		Map.Entry<Integer, Integer> maxEntry = null;
		if(zerosCountMap.isEmpty()){
			return 0;
		}else{

			for (Map.Entry<Integer, Integer> entry : zerosCountMap.entrySet()) {

				if (maxEntry == null
						|| entry.getValue().compareTo(maxEntry.getValue()) > 0) {
					maxEntry = entry;
				}
			}
			return maxEntry.getValue();
		}
	}
	//int max = Collections.max(zerosCountMap.values());

	/*findZerosCount() is to find consecutive zeros of the reminderList
	 */
	private static Map<Integer,Integer> findZerosCount(List<Integer> reminderList, int lengthOfList) {
		int zerosCount=0;
		int key=0;
		Map<Integer,Integer> zerosCountMap = new HashMap<Integer,Integer>();
		for(int index = 0;index < lengthOfList;index++){
			if(reminderList.get(index) == 0){
				zerosCount++;
			}else if(zerosCount != 0){
				zerosCountMap.put(key,zerosCount);
				zerosCount=0;
				key++;
			}
		}
		return zerosCountMap;	

	}
}
