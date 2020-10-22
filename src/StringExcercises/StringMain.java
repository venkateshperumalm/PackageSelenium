package StringExcercises;

import java.util.List;

public class StringMain {
	public static void main(String args[]){

//		int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 
//				7, 0, 6, 0, 9}; 
//		int n = arr.length; 
//
//		System.out.print("Original array: "); 
//		printArray(arr, n); 

//		EndsWithZeros zeroatLast = new EndsWithZeros();
//		zeroatLast.placeZeros(arr,n);
		
//		ZerosCollections coll = new ZerosCollections();
//		coll.placeZerosEnd(arr,n);
		
//		System.out.print("\nModified array: "); 
//		printArray(arr, n);
		
		DuplicatesInString dupObj = new DuplicatesInString();
		dupObj.countDuplicates("abcisabc123321");
	}

//	public static void printArray(int[] arr, int n) {
//		for(int i=0;i<n;i++){
//			System.out.print(arr[i] +" ");
//		}
//	} 
	public static void printArrayColl(List<Integer> listResult) {
		System.out.println("\nResult: ");
		for(Integer result : listResult)
			System.out.print(" " + result);
	} 
} 