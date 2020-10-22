package StringExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingArrayList {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(20);
		intList.add(40);
		intList.add(10);
		intList.add(5);
		intList.add(90);
		int[] inputArray = {20,40,10,5,90};
		int arrLen = inputArray.length;
		//System.out.println(arrLen);
		Arrays.sort(inputArray);
		//		for(int index = 0;index < arrLen;index++){
		//			if(inputArray[index] < inputArray[index+1]){
		//				int temp = inputArray[index];
		//				inputArray[index] = inputArray[index+1];
		//				inputArray[index+1] = temp;
		//			}
		//			System.out.println(inputArray[index]);
		//		}
		for(int indexY = arrLen-1;indexY >= 0 ;indexY--){
			System.out.println(inputArray[indexY]);
		}
		
		printInDescendingOrder(intList);
	}
	
	public static void printInDescendingOrder(List<Integer> list){
		 Collections.sort(list);
		 Collections.reverse(list);
		// int len = list.size();
		System.out.println("------------------------------");
		for(Integer index: list){
			System.out.println(index);
		}
	}
}
