package StringExcercises;

import java.util.Scanner;

public class SmallestPositiveInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int no = s.nextInt();
		int intArr[] = new int[no];
		for(int i = 0;i < no;i++){
			intArr[i] = s.nextInt();
		}
		System.out.println(findMissingElement(intArr));
	}

	private static int findMissingElement(int[] intArr) {
		int length = intArr.length + 1;
		int index = 1;
		for(; index <= length;index++){
			if(!isElementPresent(intArr,index)){
				break;
			}
		}
		return index;
	}
	public static boolean isElementPresent(int intArr[],int noToBeChecked){
		int length = intArr.length;
		boolean isElementExist = false;
		for(int j = 0;j < length;j++){
			if(noToBeChecked == intArr[j]){
				isElementExist = true;
				break;
			}
		}
		return isElementExist;
	}
}